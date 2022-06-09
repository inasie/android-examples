package com.inasie.examples.view.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.inasie.examples.R
import com.inasie.examples.model.main.ExampleType
import com.inasie.examples.view.fragment.examples.*

class ExampleActivity : AppCompatActivity() {

    companion object {
        const val KEY_EXAMPLE_TYPE = "example_type"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.elevation = 0f

        setExampleFragment()
    }

    private fun setExampleFragment() {
        val name = intent.getStringExtra(KEY_EXAMPLE_TYPE) ?: return
        val fragment = when (ExampleType.fromName(name)) {
            ExampleType.ELEVATION -> ElevationFragment()
            ExampleType.SELECT_EFFECT -> TouchEffectFragment()
            ExampleType.DATA_BINDING -> DataBindingFragment()
            ExampleType.MENU -> MenuFragment()
            ExampleType.THEME -> ThemeFragment()
            ExampleType.FONT -> FontFragment()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}