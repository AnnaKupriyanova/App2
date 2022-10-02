package com.example.logging
//package com.death.timberdemo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import timber.log.Timber.DebugTree

class MainActivity : AppCompatActivity() {
    private val TAG = "From EditText"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_log = (findViewById<Button>(R.id.button_log))
        var editText = (findViewById<EditText>(R.id.editText))
        button_log.setOnClickListener{
            Log.v(TAG, "" + editText.getText())
            editText.getText().clear()
        }

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
        var button_timber = (findViewById<Button>(R.id.button_timber))
        button_timber.setOnClickListener{
            Timber.v("" + editText.getText())
            editText.getText().clear()
        }
    }
}