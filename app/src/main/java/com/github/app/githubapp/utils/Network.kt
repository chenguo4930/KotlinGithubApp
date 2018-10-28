package com.github.app.githubapp.utils

import com.github.app.githubapp.AppContext
import org.jetbrains.anko.connectivityManager

object Network {
    fun isAvailable(): Boolean = AppContext.connectivityManager.activeNetworkInfo?.isAvailable ?: false
}