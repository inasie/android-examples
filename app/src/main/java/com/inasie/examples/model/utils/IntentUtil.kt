package com.inasie.examples.model.utils

import android.content.Context
import android.content.Intent
import com.inasie.examples.model.main.ExampleType
import com.inasie.examples.view.activity.ExampleActivity

object IntentUtil {
    fun createExampleIntent(context: Context, exampleType: ExampleType) {
        context.startActivity(Intent(context, ExampleActivity::class.java).apply {
            putExtra(ExampleActivity.KEY_EXAMPLE_TYPE, exampleType.name)
        })
    }

    fun createIntent(context: Context, cls: Class<*>) {
        context.startActivity(Intent(context, cls))
    }
}