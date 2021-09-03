package com.example.universeapp.dataclass

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class _admin {

    data class adminData(
        @SerializedName("email")
        private var email : String,
        @SerializedName("password")
        private var password : String
    )

    data class getadminDataSignIn(
        @SerializedName("token")
        @Expose
        private var token : String,
        @SerializedName("admin")
        @Expose
        private var admin : getadminDataSignInData
    )

    data class getadminDataSignInData(
        @SerializedName("id")
        private var id : Int,
        @SerializedName("email")
        private var email : String,
        @SerializedName("roleId")
        private var roleId : Int
    )


}