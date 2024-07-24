package com.pratyushvkp.unfold.api

import com.pratyushvkp.unfold.models.NewsResponse
import com.pratyushvkp.unfold.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @Query("sources")
        countryCode : String = "bbc-news",

        @Query("page")
        pageNumber : Int = 1 ,

        @Query("apikey")
        apiKey : String = API_KEY
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery : String ,

        @Query("page")
        pageNumber : Int = 1,

        @Query("apikey")
        apiKey : String = API_KEY
    ) : Response<NewsResponse>
}