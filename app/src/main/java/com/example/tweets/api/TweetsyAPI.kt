package com.example.tweets.api

import com.example.tweets.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers


interface TweetsyAPI {
//    Hit point url
    @GET("/v3/b/676fea85ad19ca34f8e21c79?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category:String) : Response<List<TweetListItem>>

    @GET("/v3/b/676fea85ad19ca34f8e21c79?meta=false")
    @Headers("X-JSON-Path:tweets..category")
    suspend fun getCategories() : Response<List<String>>
}