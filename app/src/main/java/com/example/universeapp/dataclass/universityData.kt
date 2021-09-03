package com.example.universeapp.dataclass
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.sql.Blob

      data class get_UniversityJoinData_Data (

            @SerializedName("name")
            @Expose
             private var name :String,
            @SerializedName("email")
            @Expose
             private var email : String,
            @SerializedName("address")
            @Expose
            private var address : String,
            @SerializedName("Credibility_document")
            @Expose
            private var credibilityDocument : String,

            @SerializedName("updated_at")
            @Expose
             private var updatedAt : String,
            @SerializedName("created_at")
            @Expose
            private var createdAt : String,
            @SerializedName("id")
            @Expose
            private var  id:Integer

      )

      data class get_UniversityJoinData (

            @SerializedName("message")
            @Expose
             private var message : String,

            @SerializedName("University")
            @Expose
             private var University : get_UniversityJoinData_Data
    )

      data class joinDataUniversity(
            @SerializedName("name")
            @Expose
            private var name: String,
            @SerializedName("email")
            @Expose
            private var email: String,
            @SerializedName("password")
            @Expose
            private var password: String,
            @SerializedName("adress")
            @Expose
            private var adress: String,
            @SerializedName("Credibility_document")
            @Expose
            private var Credibility_document: Blob?
    )

    data class loginDataUniversity(
        @SerializedName("email")
        @Expose
        private var email: String,
        @SerializedName("password")
        @Expose
        private var password: String
    )

data class settingDataUniversity(
    @SerializedName("language")
    private var language: String,
    @SerializedName("notifications_status")
    private var notification: String,
)