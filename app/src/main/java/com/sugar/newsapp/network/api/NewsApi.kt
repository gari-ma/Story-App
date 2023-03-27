package com.sugar.newsapp.network.api

import com.sugar.newsapp.network.modal.NewsModalItem
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {
    @GET("posts")
    suspend fun getAllNews(): Response<List<NewsModalItem>>
}