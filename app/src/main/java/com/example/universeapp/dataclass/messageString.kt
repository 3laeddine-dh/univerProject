package com.example.universeapp.dataclass

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class messageString(
    @SerializedName("message")
    @Expose
    var message : String
)

data class messageData(
    private var message : String)
