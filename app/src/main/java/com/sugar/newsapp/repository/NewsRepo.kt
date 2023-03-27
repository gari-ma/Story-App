package com.sugar.newsapp.repository

import com.sugar.newsapp.network.api.NewsApi
import com.sugar.newsapp.network.modal.NewsModalItem
import retrofit2.Response
import javax.inject.Inject

class NewsRepo @Inject constructor(private var newsApi: NewsApi) {

    suspend fun getAllNews(): Response<List<NewsModalItem>> {
        return newsApi.getAllNews()
    }

}
