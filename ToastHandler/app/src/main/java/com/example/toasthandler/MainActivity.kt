package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_ok = (findViewById<Button>(R.id.button_ok))

        button_ok.setOnClickListener{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_SHORT).show()
        }
    }
}