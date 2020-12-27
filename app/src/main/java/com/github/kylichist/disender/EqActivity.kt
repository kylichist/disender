package com.github.kylichist.disender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sendString("=")
    }
}