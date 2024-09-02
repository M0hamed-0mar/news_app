package com.example.myapplication.news_model

import com.google.gson.annotations.SerializedName

data class ArticleModel(
    val title:String,
    val url:String,
    @SerializedName("urlToImage")
    val imageUrl:String?,
)
