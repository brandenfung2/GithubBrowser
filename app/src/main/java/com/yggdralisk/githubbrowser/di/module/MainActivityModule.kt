package com.yggdralisk.githubbrowser.di.module

import com.yggdralisk.githubbrowser.presenttion.main.MainActivity
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {
        @Binds
        abstract fun provideMainView(activity: MainActivity): MainActivity
}