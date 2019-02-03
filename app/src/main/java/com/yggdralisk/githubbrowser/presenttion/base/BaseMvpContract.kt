package com.yggdralisk.githubbrowser.presenttion.base

interface BaseMvpContract {
    interface BaseMvpView {}

    interface BaseMvpPresenter {
        fun onAttachView(view: BaseMvpView)
        fun onDetachView(view: BaseMvpView)
    }
}