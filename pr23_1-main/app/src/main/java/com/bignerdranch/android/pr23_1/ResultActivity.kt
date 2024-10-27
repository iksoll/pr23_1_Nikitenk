package com.bignerdranch.android.pr23_1

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class ResultActivity : WearableActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button = findViewById(R.id.button3)
        button.setOnClickListener { view ->
            Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()
        }
    }
}
