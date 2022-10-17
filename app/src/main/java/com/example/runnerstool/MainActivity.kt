package com.example.runnerstool

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculateButton: Button = findViewById(R.id.button)
        val mins: EditText = findViewById(R.id.minutes)
        val sec: EditText = findViewById(R.id.seconds)
        calculateButton.setOnClickListener {
            val minute = mins.text.toString().toInt()
            val second = sec.text.toString().toInt()
            val total = 3600 / ((minute * 60) + second).toDouble()
            Toast.makeText(this, total.toString(), Toast.LENGTH_LONG).show()
        }
    }
}