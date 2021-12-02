package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView = findViewById<TextView>(R.id.ClickEvent)
        val redButton = findViewById<TextView>(R.id.ClickRedButton)
        val greenButton = findViewById<TextView>(R.id.ClickGreenButton)
        val blueButton = findViewById<TextView>(R.id.ClickBlueButton)

        redButton.setOnClickListener{
            clickCountDisplayView.text = "Red was clicked"
        }
        greenButton.setOnClickListener{
            clickCountDisplayView.text = "Green was clicked"
        }

        blueButton.setOnClickListener{
            clickCountDisplayView.text = "Blue was clicked"
        }
    }
    }
