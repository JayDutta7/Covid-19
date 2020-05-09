package com.dcc.covidtracker.networking.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class JsonValue(
    @SerializedName("question")
    @Expose
    var question: String
)