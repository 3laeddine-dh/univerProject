package com.example.universeapp.dataclass

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

public class _UserDataClass{

    //
    data class joinData(
        @SerializedName("name")
        private var name : String,
        @SerializedName("email")
        private var email : String,
        @SerializedName("password")
        private var password : String,
        @SerializedName("password_confirmation")
        private var password_confirmation : String)
    data class signInData(
        @SerializedName("email")
        private var email : String,
        @SerializedName("password")
        private var password : String
    )
    data class profile(
        @SerializedName("user")
        @Expose
        var user: userProfileData? = null,
        @SerializedName("token")
        @Expose
        var token: String? = null
    )
    data class userProfileData (

        @SerializedName("id")
        @Expose
        var id: Int? = null,
        @SerializedName("name")
        @Expose
        var name: String? = null,

        @SerializedName("email")
        @Expose
        var email: String? = null,

        @SerializedName("photo")
        @Expose
        var photo: Any? = null,

        @SerializedName("email_verified_at")
        @Expose
        var emailVerifiedAt: String? = null,

        @SerializedName("two_factor_secret")
        @Expose
        var twoFactorSecret: Any? = null,

        @SerializedName("two_factor_recovery_codes")
        @Expose
        var twoFactorRecoveryCodes: Any? = null,

        @SerializedName("notifications_status")
        @Expose
        var notificationsStatus: Int? = null,

        @SerializedName("language")
        @Expose
        var language: String? = null,

        @SerializedName("role_id")
        @Expose
        var roleId: Int? = null,

        @SerializedName("university_id")
        @Expose
        var universityId: Any? = null,

        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null,

        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null,
    )




    // Not Yet :
    data class userData(
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String,
    @SerializedName("email") var email: String,
    @SerializedName("photo") var photo: String,
    @SerializedName("notifications_status") var notificationsStatus: Int,
    @SerializedName("language") var language: String,
    @SerializedName("role_id") var roleId: Int,
//    @SerializedName("email_verified_at") var emailVerifiedAt: String?,
//    @SerializedName("created_at") var createdAt: String?,
//    @SerializedName("updated_at") var updatedAt: String?
)

    data class returnJoinUserData(

    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String,
    @SerializedName("email") var email: String,
    )

data class userSettings(
    @SerializedName("language")
    private var language: String,
    @SerializedName("notifications_status")
    private var notification: String,
)

    data class passwordResetData(
        @SerializedName("token") var token : String,
        @SerializedName("email") var email: String,
        @SerializedName("password") var password: String,
        @SerializedName("password_confirmation") var password_confirmation: String
    )






}