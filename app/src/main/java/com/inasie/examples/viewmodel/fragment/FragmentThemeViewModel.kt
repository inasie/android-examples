package com.inasie.examples.viewmodel.fragment

import androidx.appcompat.app.AppCompatDelegate

class FragmentThemeViewModel {
    fun onThemeDefault() {
        setTheme(AppCompatDelegate.MODE_NIGHT_NO)
    }

    fun onThemeNight() {
        setTheme(AppCompatDelegate.MODE_NIGHT_YES)
    }

    fun onThemeSystem() {
        setTheme(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }

    private fun setTheme(mode: Int) {
        AppCompatDelegate.setDefaultNightMode(mode)
    }
}