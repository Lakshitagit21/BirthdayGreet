package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {


    lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra("name")

        message = findViewById(R.id.message)

        val bundle = intent.extras
        if (bundle != null) {
            message.text = "Happy Birthday ${bundle.getString("id")}"
        }

    }
}