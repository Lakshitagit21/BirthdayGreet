package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var nameInput: EditText
    lateinit var createbirthdaybutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameInput = findViewById(R.id.nameInput)
        createbirthdaybutton = findViewById(R.id.createbirthdaybutton)
        createbirthdaybutton.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("id", nameInput.text.toString())


            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    }



