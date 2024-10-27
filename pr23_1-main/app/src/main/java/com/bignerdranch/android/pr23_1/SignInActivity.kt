package com.bignerdranch.android.pr23_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class SignInActivity : WearableActivity() {
    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        button = findViewById(R.id.signIn)

        button.setOnClickListener{
            if (login.text.isNotEmpty() && password.text.isNotEmpty()) {
                var intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Обнаружены пустые поля", Toast.LENGTH_LONG).show()
            }
        }
    }
}