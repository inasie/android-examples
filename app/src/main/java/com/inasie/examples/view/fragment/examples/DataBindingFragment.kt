package com.inasie.examples.view.fragment.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.inasie.examples.R
import com.inasie.examples.databinding.FragmentDataBindingBinding

class DataBindingFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // https://blog.danune.co.kr/8

        val binding = DataBindingUtil.inflate<FragmentDataBindingBinding>(
            inflater,
            R.layout.fragment_data_binding,
            container,
            false
        )
        binding.text = "Hello data binding"
        return binding.root
    }
}