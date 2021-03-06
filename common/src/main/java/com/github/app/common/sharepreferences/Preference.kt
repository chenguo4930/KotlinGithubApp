package com.github.app.common.sharepreferences

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Preference<T>(val context: Context, val name: String, val default: T, val prefName: String = "default")
    : ReadWriteProperty<Any?, T> {

    private val prefs by lazy {
        context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreference(name)
    }

    private fun findPreference(key: String): T {
        return when (default) {
            is Long -> prefs.getLong(name, default)
            is Int -> prefs.getInt(name, default)
            is Boolean -> prefs.getBoolean(name, default)
            is String -> prefs.getString(name, default)
            else -> throw IllegalArgumentException("Unsupported type")
        } as T
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreference(name, value)
    }

    private fun putPreference(key: String, value: T) {
        with(prefs.edit()) {
            when (value) {
                is Long -> putLong(name, value)
                is Int -> putInt(name, value)
                is Boolean -> putBoolean(name, value)
                is String -> putString(name, value)
                else -> throw IllegalArgumentException("Unsupported type")
            }
        }.apply()
    }

}