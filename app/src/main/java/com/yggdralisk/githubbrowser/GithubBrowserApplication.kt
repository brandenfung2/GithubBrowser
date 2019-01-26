package com.yggdralisk.githubbrowser

import android.app.Application
import timber.log.Timber.DebugTree
import timber.log.Timber.plant

class GithubBrowserApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            plant(DebugTree())
        }
    }
}