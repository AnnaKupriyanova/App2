package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = (findViewById<EditText>(R.id.editText))
        var button_blacktext = (findViewById<Button>(R.id.button_blacktext))
        var button_redtext = (findViewById<Button>(R.id.button_redtext))

        button_blacktext.setOnClickListener{
            editText.setTextColor(Color.BLACK)
        }
        button_redtext.setOnClickListener{
            editText.setTextColor(Color.RED)
        }

        var button_size8sp = (findViewById<Button>(R.id.button_size8sp))
        var button_size24sp = (findViewById<Button>(R.id.button_size24sp))

        button_size8sp.setOnClickListener{
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }
        button_size24sp.setOnClickListener{
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        }

        var button_whiteback = (findViewById<Button>(R.id.button_whiteback))
        var button_yellowback = (findViewById<Button>(R.id.button_yellowback))

        button_whiteback.setOnClickListener{
            editText.setBackgroundColor(Color.WHITE)
        }
        button_yellowback.setOnClickListener{
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}