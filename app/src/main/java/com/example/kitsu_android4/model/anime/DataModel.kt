package com.example.kitsu_android4.model.anime

import com.bumptech.glide.load.model.Model
import com.google.gson.annotations.SerializedName

data class DataModel(

    @SerializedName("data")
    val animeModel: Model

)
