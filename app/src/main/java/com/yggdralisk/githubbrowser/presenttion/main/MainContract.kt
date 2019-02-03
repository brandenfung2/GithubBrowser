package com.yggdralisk.githubbrowser.presenttion.main

import com.yggdralisk.githubbrowser.presenttion.base.BaseMvpContract

interface MainContract : BaseMvpContract {
    interface MainView : BaseMvpContract.BaseMvpView {}

    interface MainPresenter : BaseMvpContract.BaseMvpPresenter {}
}