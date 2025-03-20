package com.example.mindfulme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MeditationTrackerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation_tracker)

        val homeIcon: ImageView = findViewById(R.id.homeIcon)

        homeIcon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  // New intent for user profile
            startActivity(intent)
        }
    }
}
