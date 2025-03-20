package com.example.mindfulme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodTrackerButton: Button = findViewById(R.id.moodTrackerButton)
        val journalButton: Button = findViewById(R.id.journalButton)
        val dailyGoalsButton: Button = findViewById(R.id.dailyGoalsButton)
        val userProfileLogo: ImageView = findViewById(R.id.userProfileLogo)
        val meditationTrackerButton: Button =
            findViewById(R.id.meditationTrackerButton)// Adding this line

        moodTrackerButton.setOnClickListener {
            val intent = Intent(this, MoodTrackerActivity::class.java)
            startActivity(intent)
        }

        journalButton.setOnClickListener {
            val intent = Intent(this, JournalActivity::class.java)
            startActivity(intent)
        }

        dailyGoalsButton.setOnClickListener {
            val intent = Intent(this, DailyGoalsActivity::class.java)
            startActivity(intent)
        }

        userProfileLogo.setOnClickListener {
            val intent =
                Intent(this, UserProfileActivity::class.java)  // New intent for user profile
            startActivity(intent)
        }

        meditationTrackerButton.setOnClickListener {
            val intent = Intent(this, MeditationTrackerActivity::class.java)
            startActivity(intent)
        }
    }
}
