package com.yggdralisk.githubbrowser.presenttion.base

import com.yggdralisk.githubbrowser.util.extension.isNull

abstract class BasePresenter<T : BaseMvpContract.View> : BaseMvpContract.Presenter<T> {
    protected var view: T? = null

    override fun onAttachView(view: T) {
        this.view = view
    }

    override fun onDetachView(view: T) {
        this.view = null
    }

    override fun isAttached() = this.view.isNull()
}