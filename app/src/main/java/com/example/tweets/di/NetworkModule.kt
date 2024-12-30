package com.example.tweets.di

import com.example.tweets.api.TweetsyAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent :: class)
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit{
//        Base Url
        return Retrofit.Builder().baseUrl("https://api.jsonbin.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideTweetsyAPI(retrofit: Retrofit) : TweetsyAPI{
        return retrofit.create(TweetsyAPI :: class.java)
    }
}