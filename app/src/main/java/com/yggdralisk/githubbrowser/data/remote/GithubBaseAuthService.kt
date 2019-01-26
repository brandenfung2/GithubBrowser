package com.yggdralisk.githubbrowser.data.remote

import retrofit2.http.GET
import retrofit2.http.Header

/**
 * Interface for github base authentication flow
 * https://developer.github.com/v3/auth/#basic-authentication
 */
interface GithubBaseAuthService {
    @GET
    fun getUser(@Header(AUTHORIZATION) basicAuthB64: String)
}