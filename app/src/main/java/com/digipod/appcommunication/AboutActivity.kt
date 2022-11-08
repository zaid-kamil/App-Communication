package com.digipod.appcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val textUsername: TextView = findViewById(R.id.textUsername)
        val textEmail: TextView = findViewById(R.id.textEmail)

        if (intent.hasExtra("username")){
            textUsername.text = intent.getStringExtra("username")
        }
        if (intent.hasExtra("email")){
            textEmail.text = intent.getStringExtra("email")
        }
    }
}