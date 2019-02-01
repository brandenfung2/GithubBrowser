package com.yggdralisk.githubbrowser.di.component

import com.yggdralisk.githubbrowser.GithubBrowserApplication
import com.yggdralisk.githubbrowser.di.builder.ActivityBuilder
import com.yggdralisk.githubbrowser.di.module.GithubApplicationModule
import com.yggdralisk.githubbrowser.di.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        GithubApplicationModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuilder::class,
        NetworkModule::class
    ]
)
interface GithubApplicationComponent : AndroidInjector<GithubBrowserApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<GithubBrowserApplication>()
}