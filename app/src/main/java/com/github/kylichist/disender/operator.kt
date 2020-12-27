package com.github.kylichist.disender

import android.app.Activity
import android.content.Intent

fun Activity.sendString(prefix: String) {
    Intent().apply {
        setClassName(
            "com.discord",
            "com.discord.app.AppActivity\$AppAction"
        )
        action = Intent.ACTION_SEND
        putExtra(
            Intent.EXTRA_TEXT,
            "${prefix}play ${intent.extras?.getString("android.intent.extra.TEXT")?.substringAfterLast(" ")}"
        )
        startActivity(this@apply)
        finish()
    }
}