package com.inasie.examples.view.fragment.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.inasie.examples.R
import com.inasie.examples.databinding.FragmentTouchEffectBinding

class TouchEffectFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // https://blog.danune.co.kr/5

        val binding = DataBindingUtil.inflate<FragmentTouchEffectBinding>(
            inflater,
            R.layout.fragment_touch_effect,
            container,
            false
        )
        return binding.root
    }
}