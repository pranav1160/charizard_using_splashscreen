package com.example.backend

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize views
        val btn = findViewById<Button>(R.id.button1)
        val img = findViewById<ImageView>(R.id.imageView2)

        // Set click listener for the button
        btn.setOnClickListener {
            Toast.makeText(this, "Charizard used FlameThrower", Toast.LENGTH_SHORT).show()
        }

        // Set click listener for the image view
        img.setOnClickListener {
            Toast.makeText(this, "Roar", Toast.LENGTH_SHORT).show()
        }
    }
}
