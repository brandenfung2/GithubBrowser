package com.yggdralisk.githubbrowser.di.module

import com.yggdralisk.githubbrowser.BuildConfig
import com.yggdralisk.githubbrowser.data.remote.GithubBaseAuthService
import com.yggdralisk.githubbrowser.util.consts.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {
    @Module
    companion object {
        @Provides
        @Reusable
        @JvmStatic
        fun provideBaseAuthService(retrofit: Retrofit): GithubBaseAuthService =
            retrofit.create(GithubBaseAuthService::class.java)

        @Provides
        @Reusable
        @JvmStatic
        fun provideRetrofit(client: OkHttpClient) =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        @Provides
        @Reusable
        @JvmStatic
        fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor) =
            OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()

        @Provides
        @Reusable
        @JvmStatic
        fun provideHttpLoggingInterceptor() =
            HttpLoggingInterceptor()
                .setLevel(getLoggingLevel())

        private fun getLoggingLevel(): HttpLoggingInterceptor.Level =
            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
    }
}