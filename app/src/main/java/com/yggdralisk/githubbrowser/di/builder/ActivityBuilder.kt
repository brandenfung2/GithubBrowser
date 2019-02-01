package com.yggdralisk.githubbrowser.di.builder

import com.yggdralisk.githubbrowser.di.module.MainActivityModule
import com.yggdralisk.githubbrowser.presenttion.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}