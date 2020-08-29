package com.github.kylichist.disender

import android.app.Activity
import android.content.Intent

@Suppress("unused")
fun Unit.send(prefix: String, activity: Activity) =
    Intent().apply {
        setClassName(
            "com.discord",
            "com.discord.app.AppActivity\$AppAction"
        )
        action = Intent.ACTION_SEND
        putExtra(
            Intent.EXTRA_TEXT,
            "${prefix}play ${activity.intent.extras?.getString("android.intent.extra.TEXT")}"
        )
        with(activity) {
            startActivity(this@apply)
            finish()
        }
    }.run { }