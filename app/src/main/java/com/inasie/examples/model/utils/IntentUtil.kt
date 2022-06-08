package com.inasie.examples.model.utils

import android.content.Context
import android.content.Intent

object IntentUtil {
    fun createIntent(context: Context, cls: Class<*>) {
        context.startActivity(Intent(context, cls))
    }
}