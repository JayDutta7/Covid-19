package com.dcc.covidtracker.localDatabase.sharedPreference

import android.content.Context
import android.content.SharedPreferences
import com.dcc.covidtracker.localDatabase.staticValue.StaticValue.Companion.applicationName

class SharedPreference(context: Context){

    private val sharedPref: SharedPreferences = context.getSharedPreferences(applicationName,
        Context.MODE_PRIVATE)
    //Getting SharedPreference
    fun providePreferences(): SharedPreferences {
        return sharedPref
    }
}