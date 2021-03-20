package com.example.dogs.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.dogs.R

class SettingFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {

        setPreferencesFromResource(R.xml.preferences, rootKey)
    }


}