package com.yggdralisk.githubbrowser.presenttion.base

interface BaseMvpContract {
    interface View {}

    interface Presenter<T : View> {
        fun onAttachView(view: T)

        fun onDetachView(view: T)

        fun isAttached(): Boolean
    }
}