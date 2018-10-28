package com.github.app.githubapp.settings

import com.github.app.common.log.logger
import com.github.app.githubapp.AppContext
import com.github.app.githubapp.utils.deviceId


object Configs {

    object Account{
        val SCOPES = listOf("user", "repo", "notifications", "gist", "admin:org")
        const val clientId = "ee16d83861e4ef8bb21f"
        const val clientSecret = "d41054197b6207e6c554b15aa19b16929349bd95"
        const val note = "kotliner.cn"
        const val noteUrl = "http://www.kotliner.cn"

        val fingerPrint by lazy {
            (AppContext.deviceId + clientId).also { logger.info("fingerPrint: "+it) }
        }
    }

}