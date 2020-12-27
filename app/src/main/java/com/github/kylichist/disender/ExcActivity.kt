package com.github.kylichist.disender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sendString("!")
    }
}