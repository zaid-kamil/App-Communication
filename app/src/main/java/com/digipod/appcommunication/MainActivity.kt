package com.digipod.appcommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend: Button = findViewById(R.id.btnSend)
        val editUsername: EditText = findViewById(R.id.editUsername)
        val editEmail: EditText = findViewById(R.id.editEmail)

        btnSend.setOnClickListener {
            val username = editUsername.text.toString()
            val email = editEmail.text.toString()

            val intent = Intent(this, AboutActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("email", email)
            startActivity(intent)

        }

    }
}