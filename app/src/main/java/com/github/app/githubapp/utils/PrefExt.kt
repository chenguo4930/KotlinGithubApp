package com.github.app.githubapp.utils

import com.github.app.common.sharepreferences.Preference
import com.github.app.githubapp.AppContext
import kotlin.reflect.jvm.jvmName

/**
 * Created by benny on 6/23/17.
 */
inline fun <reified R, T> R.pref(default: T) = Preference(AppContext, "", default, R::class.jvmName)