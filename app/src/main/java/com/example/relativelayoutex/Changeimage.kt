package com.example.relativelayoutex

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Changeimage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changeimage)

        val btn: Button = findViewById(R.id.btn)
        val image: ImageView = findViewById(R.id.image)

        val images = arrayOf(
            R.drawable.tomimage,
            R.drawable.jerry,
        )

        var currentIndex = 0

        btn.setOnClickListener {
            image.setImageResource(images[currentIndex])
            currentIndex = (currentIndex + 1) % images.size
        }
    }
}
