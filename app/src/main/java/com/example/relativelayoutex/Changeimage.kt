package com.example.relativelayoutex

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Changeimage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changeimage)
        val btn: Button = findViewById(R.id.btn)
        val image: ImageView = findViewById(R.id.image)

        btn.setOnClickListener {
            image.setImageResource(R.drawable.jerry)
        }
    }
}