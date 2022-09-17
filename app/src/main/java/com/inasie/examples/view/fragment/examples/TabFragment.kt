package com.inasie.examples.view.fragment.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.inasie.examples.R
import com.inasie.examples.databinding.FragmentTabBinding
import com.inasie.examples.view.binding.SampleViewPagerAdapter

class TabFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTabBinding>(
            inflater,
            R.layout.fragment_tab,
            container,
            false
        )
        initTabLayout(binding.viewPager, binding.tabLayout)
        return binding.root
    }

    private fun initTabLayout(viewPager: ViewPager2, tabLayout: TabLayout) {
        viewPager.adapter = SampleViewPagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Tab1"
                1 -> tab.text = "Tab2"
                else -> throw Exception("invalid position")
            }

        }.attach()
    }
}