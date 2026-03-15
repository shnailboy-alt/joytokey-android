package com.example.joytokey

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start the floating overlay service
        startService(Intent(this, OverlayService::class.java))

        // Close the main activity (we just need the overlay)
        finish()
    }

}
