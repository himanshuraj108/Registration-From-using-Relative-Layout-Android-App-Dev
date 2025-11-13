package com.example.relativelayoutex

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class Checkbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        var btn: Button = findViewById(R.id.submitcheck)
        var java: CheckBox = findViewById(R.id.java)
        var dsa: CheckBox = findViewById(R.id.dsa)
        var os: CheckBox = findViewById(R.id.os)
        var showresult: TextView = findViewById(R.id.showresult)
        var reset: Button = findViewById(R.id.resetcheck)

        btn.setOnClickListener {
            var sCheck = StringBuilder("Selected: \n")
            if(!java.isChecked && !dsa.isChecked && !os.isChecked){
                sCheck.append("None\n")
            }
            if(java.isChecked){
                sCheck.append("Java\n")
            }
            if(dsa.isChecked){
                sCheck.append("DSA\n")
            }
            if(os.isChecked) {
                sCheck.append("Operating systems")
            }
            showresult.text = sCheck.toString()
            if(java.isChecked || dsa.isChecked || os.isChecked){
                btn.isEnabled = false
            }
        }

        reset.setOnClickListener {
            java.isChecked = false
            dsa.isChecked = false
            os.isChecked = false
            showresult.text = ""
            btn.isEnabled = true
        }
    }
}