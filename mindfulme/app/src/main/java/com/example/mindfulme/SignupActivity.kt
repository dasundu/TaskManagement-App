package com.example.mindfulme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnSignup = findViewById<Button>(R.id.btn_signup)

        btnSignup.setOnClickListener {
            // Navigate to the login screen
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
