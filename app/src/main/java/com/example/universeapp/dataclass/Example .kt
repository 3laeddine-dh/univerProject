package com.example.universeapp.dataclass

import com.google.gson.annotations.SerializedName


data class Example (
//
    @SerializedName("message") var message : String,
    @SerializedName("data") var data : _UserDataClass.userData

)
