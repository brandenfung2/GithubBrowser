package com.yggdralisk.githubbrowser.di.module

import com.yggdralisk.githubbrowser.presenttion.main.MainActivity
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideMainView(activity: MainActivity) = activity
    }
}