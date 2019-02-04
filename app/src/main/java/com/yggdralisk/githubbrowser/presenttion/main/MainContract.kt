package com.yggdralisk.githubbrowser.presenttion.main

import android.view.MenuItem
import com.yggdralisk.githubbrowser.presenttion.base.BaseMvpContract

interface MainContract : BaseMvpContract {
    interface View : BaseMvpContract.View {}

    interface Presenter : BaseMvpContract.Presenter<View> {
        fun onDrawerItemClick(item: MenuItem): Boolean
        fun onDrawerHeaderClick(header: android.view.View?)
    }
}