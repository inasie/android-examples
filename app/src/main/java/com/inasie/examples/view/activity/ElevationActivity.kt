package com.inasie.examples.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.inasie.examples.R
import com.inasie.examples.databinding.ActivityElevationBinding

class ElevationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityElevationBinding>(this, R.layout.activity_elevation)
        supportActionBar?.elevation = 0f
    }
}