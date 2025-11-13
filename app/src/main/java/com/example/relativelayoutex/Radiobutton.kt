package com.example.relativelayoutex

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Radiobutton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radiobutton)

        var rGrp: RadioGroup = findViewById(R.id.rGrp)
        var btn: Button = findViewById(R.id.submitradio)
        var reset: Button = findViewById(R.id.resetradio)
        var showResult: TextView = findViewById(R.id.showResult)

        btn.setOnClickListener {
            var selId = rGrp.checkedRadioButtonId
            if(selId != -1){
                var rBtn: RadioButton = findViewById(selId)
                Toast.makeText(applicationContext,"Your selected option is ${rBtn.text}", Toast.LENGTH_LONG).show()
                showResult.text = "Your selected preference is ${rBtn.text}"
//                btn.isEnabled = false
            }

            else{
                Toast.makeText(applicationContext,"Option must be selected for submit", Toast.LENGTH_LONG).show()
            }

        }
        reset.setOnClickListener {
            var sellid = rGrp.checkedRadioButtonId
            if(sellid != 1){
                rGrp.clearCheck()
                showResult.text = ""
            }

        }
    }
}