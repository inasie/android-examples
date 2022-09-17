package com.inasie.examples.view.binding

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.inasie.examples.view.fragment.examples.Tab1Fragment
import com.inasie.examples.view.fragment.examples.Tab2Fragment
import java.lang.Exception

class SampleViewPagerAdapter(parent: Fragment) : FragmentStateAdapter(parent) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Tab1Fragment()
            1 -> Tab2Fragment()
            else -> throw Exception("invalid position")
        }
    }
}