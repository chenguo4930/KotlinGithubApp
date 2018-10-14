package com.github.app.mvp.impl

import android.content.res.Configuration
import android.os.Bundle
import com.github.app.mvp.IMvpView
import com.github.app.mvp.IPresenter

abstract class BasePresenter<out V : IMvpView<BasePresenter<V>>> : IPresenter<V> {

    override lateinit var view: @UnsafeVariance V

    /**
     * 复写生命周期方法
     */
    override fun onCreate(savedInstanceState: Bundle?) = Unit

    override fun onSaveInstanceState(outState: Bundle) = Unit
    override fun onViewStateRestored(savedInstanceState: Bundle?) = Unit
    override fun onConfigurationChanged(newConfig: Configuration) = Unit
    override fun onDestroy() = Unit
    override fun onStart() = Unit
    override fun onStop() = Unit
    override fun onResume() = Unit
    override fun onPause() = Unit
}