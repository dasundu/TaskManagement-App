package com.example.mindfulme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val homeIcon: ImageView = findViewById(R.id.homeIcon)
        val logoutext : TextView = findViewById(R.id.logoutOption)

        homeIcon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  // New intent for user profile
            startActivity(intent)
        }
        logoutext.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)  // New intent for user profile
            startActivity(intent)
        }
    }
}