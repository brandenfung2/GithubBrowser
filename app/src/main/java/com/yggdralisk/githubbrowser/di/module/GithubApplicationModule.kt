package com.yggdralisk.githubbrowser.di.module

import android.content.Context
import com.yggdralisk.githubbrowser.GithubBrowserApplication
import com.yggdralisk.githubbrowser.di.qualifier.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class GithubApplicationModule {
    @Module
    companion object {
        @Provides
        @Singleton
        @ApplicationContext
        fun provideApplicationContext(application: GithubBrowserApplication): Context = application.applicationContext

        @Provides
        @Singleton
        fun provideGithubBrowserApplication(application: GithubBrowserApplication) = application
    }
}