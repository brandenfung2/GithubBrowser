package com.yggdralisk.githubbrowser.presenttion.main

import com.yggdralisk.githubbrowser.presenttion.base.BaseMvpContract

interface MainContract : BaseMvpContract {
    interface View : BaseMvpContract.View {}

    interface Presenter : BaseMvpContract.Presenter<View> {}
}