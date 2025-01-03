package com.example.tweets.repository

import com.example.tweets.api.TweetsyAPI
import com.example.tweets.models.TweetListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetRepository @Inject constructor(private val tweetsyAPI: TweetsyAPI) {

    private val _tweets = MutableStateFlow<List<TweetListItem>>(emptyList())
    val tweets : StateFlow<List<TweetListItem>>
        get() = _tweets


    private val _categories = MutableStateFlow<List<String>>(emptyList())
     val categories : StateFlow<List<String>>
         get() = _categories

    suspend fun getTweets(category: String){
        val result= tweetsyAPI.getTweets("tweets[?(@.category==\"$category\")]")
        if(result.isSuccessful && result.body() != null){
            _tweets.emit(result.body()!!)
        }
    }

    suspend fun getCategories(){
        val response = tweetsyAPI.getCategories()
        if(response.isSuccessful && response.body() != null){
         _categories.emit(response.body()!!)
        }
    }

}