package com.example.firstapp

import android.content.Context
import android.content.SharedPreferences

class MyPreferences(context: Context) {
    private val key: String = "key"

    private val sp: SharedPreferences =
        context.getSharedPreferences(this.key, Context.MODE_PRIVATE)

    fun setString(key: String, str: String) {
        sp.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        return sp.getString(key, "") ?: ""
    }
}