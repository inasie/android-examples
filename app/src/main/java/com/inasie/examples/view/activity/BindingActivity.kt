package com.inasie.examples.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.inasie.examples.R
import com.inasie.examples.databinding.ActivityBindingBinding

class BindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityBindingBinding>(this, R.layout.activity_binding)
        binding.text = "Hello data binding"
    }
}