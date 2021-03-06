package com.dcc.covidtracker.networking.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("status")
    @Expose
    val status:Int,
    @SerializedName("msg")
    @Expose
    val msg:String,
    @SerializedName("result")
    @Expose
    val responseResult: Any?
)
