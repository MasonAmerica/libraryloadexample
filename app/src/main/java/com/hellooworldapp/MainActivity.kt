package com.hellooworldapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("DlopenTest", "Attempting to load library")
        val loaded = DlopenHelper.tryLoadLibrary()
        Log.i("DlopenTest", "Load result: $loaded")
    }
}
