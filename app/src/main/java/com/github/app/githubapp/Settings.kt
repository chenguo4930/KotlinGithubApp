package com.github.app.githubapp

import com.github.app.common.sharepreferences.Preference


object Settings {
    var email: String  by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")
}