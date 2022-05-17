package com.inasie.examples.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.inasie.examples.R
import com.inasie.examples.databinding.ActivityMainBinding
import com.inasie.examples.view.ViewType
import com.inasie.examples.viewmodel.ViewModelFactory
import com.inasie.examples.viewmodel.activity.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModelProvider(this, ViewModelFactory(ViewType.ACTIVITY_MAIN, null))[MainActivityViewModel::class.java]
    }
}