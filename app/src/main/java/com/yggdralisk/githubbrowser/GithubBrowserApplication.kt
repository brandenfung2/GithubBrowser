package com.yggdralisk.githubbrowser

import com.yggdralisk.githubbrowser.di.component.DaggerGithubApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class GithubBrowserApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerGithubApplicationComponent.builder().create(this)
}