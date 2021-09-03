package com.example.universeapp.dataclass

import com.google.gson.annotations.SerializedName

class _group {

    data class createGroupDT (
        @SerializedName("id") var id: Int,
        @SerializedName("name") var name: String,
        @SerializedName("email") var email: String
            )
}