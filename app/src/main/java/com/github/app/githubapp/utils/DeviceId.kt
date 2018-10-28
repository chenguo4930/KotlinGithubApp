package com.github.app.githubapp.utils

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings

/**
 * 获取设备id
 */
val Context.deviceId: String
    @SuppressLint("HardwareIds")
    get() = Settings.Secure.getString(
            contentResolver,
            Settings.Secure.ANDROID_ID
    )