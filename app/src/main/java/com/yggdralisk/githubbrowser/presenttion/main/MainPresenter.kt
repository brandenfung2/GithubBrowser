package com.yggdralisk.githubbrowser.presenttion.main

import com.yggdralisk.githubbrowser.data.remote.GithubBaseAuthService
import com.yggdralisk.githubbrowser.presenttion.base.BasePresenter
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val authService: GithubBaseAuthService
) : BasePresenter<MainContract.View>(), MainContract.Presenter {
    override fun onAttachView(view: MainContract.View) {
        super.onAttachView(view)
    }
}