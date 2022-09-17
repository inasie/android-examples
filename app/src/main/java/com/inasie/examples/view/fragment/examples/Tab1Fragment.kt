package com.inasie.examples.view.fragment.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.inasie.examples.R
import com.inasie.examples.databinding.FragmentTab1Binding

class Tab1Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTab1Binding>(
            inflater,
            R.layout.fragment_tab1,
            container,
            false
        )
        return binding.root
    }

}