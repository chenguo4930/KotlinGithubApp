package com.github.app.githubapp.settings

import com.github.app.common.sharepreferences.Preference
import com.github.app.githubapp.AppContext


object Settings {
    var email: String  by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")
}