package com.bignerdranch.android.pr23_1

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
//import androidx.wear.widget.WearableActivity
import android.widget.Button

class WelcomeScreen : WearableActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        button = findViewById(R.id.button_sign_in)
        button.setOnClickListener{
            var intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}