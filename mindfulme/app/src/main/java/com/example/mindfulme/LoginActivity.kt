package com.example.mindfulme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnSignup = findViewById<TextView>(R.id.btn_signup)

        btnLogin.setOnClickListener {
            // Navigate to the Main Activity or dashboard
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        btnSignup.setOnClickListener {
            // Navigate to the sign-up screen
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}
