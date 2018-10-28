package com.github.app.githubapp.view

import android.os.Bundle
import com.github.app.githubapp.R
import com.github.app.githubapp.presenter.LoginPresenter
import com.github.app.mvp.impl.BaseActivity

/**
 * 登录
 */
class LoginActivity : BaseActivity<LoginPresenter>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


}
