package com.example.universeapp.networking

import com.example.universeapp.dataclass.*
import retrofit2.Call
import retrofit2.http.*

interface endPointsInterface {


    // password reset
    // update profile


    //---7--------------User:

    // work
    @Headers("Content-Type: application/json")
    @POST("password/email")
    fun setPasswordReset(@Query("email") email : String) : Call<messageString>


    @GET
    fun getVerifyEmail(@Url code : String) : Call<Void>

    @GET("profile/display")
    fun getprofile() : Call<Example>

    @Headers("Content-Type: application/json")
    @POST("join")
    fun setJoin(@Body user : _UserDataClass.joinData) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("login")
    fun setSignIn(@Body signInData: _UserDataClass.signInData) : Call<_UserDataClass.profile>

    @Headers("Content-Type: application/json")
    @POST("profile/update")
    fun setUserUpdateProfile(@Body user : _UserDataClass.userProfileData) : Call<_UserDataClass.profile>


    //logout
    @Headers("Content-Type: application/json")
    @POST("logout")
    fun logOutInterface()


    //delete-account/2
    @Headers("Content-Type: application/json")
    @DELETE("delete-account/{userId}")
    fun deleteAccountInterface(@Path("userId") userId: Int)

    @Headers("Content-Type: application/json")
    @GET("search-user/x?id=4")
    fun searchUser() : Call<String>


//    fun editUserSetting(@Body university : settingDataUniversity)
//    fun passwordResetInterface()
//    @Headers("Content-Type: application/json")
//    @POST("edit_settings")
//    @Headers("Content-Type: application/json")
//    @POST("password/reset")


    // -8--------------------------- Group :

    // واش تستقبل ؟
    @Headers("Content-Type: application/json")
    @POST("create-group/{userId}")
    fun createGroupInterface(@Path("userId") id : Int,@Body name : String) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("add-member/{userId}/{groupId}")
    fun addGroupMemberInterface(@Path("userId") userId : Int,@Path("groupId")groupId:Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @DELETE("delete-member/{userId}/{group-id}")
    fun deleteGroupMemberInterface(@Path("userId") userId : Int,@Path("group-id") grId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("add-admin/{groupId}/{userId}")
    fun deleteGroupInterface(@Path("groupId")groupId : Int,@Path("userId")userId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("/favorite-group/{group_id}/{user_id}")
    fun favoriteGroupInterface(@Path("group_id")groupId: Int,
                               @Path("user_id")userId : Int) : Call<Void>

//    @Headers("Content-Type: application/json")
//    @POST("favorite-channel/{8}/{1}")
//    fun editGroupInterface(@Path("8")userId : Int,
//                           @Path("1")channelId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("unfavorite-channel/{8}/{1}")
    fun unfavoriteGroup(@Path("8")userId : Int,
                        @Path("1")channelId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("channel/{9}/create-post/{1}")
    fun createPostInGroupInterface(userId : Int,chatId : Int, post : messageString) :Call<Void>


//    @Headers("Content-Type: application/json")
//    @DELETE("channel/delete-post/3/1")
//    fun deleteGroupPostInterface(@Path("3") userId: Int, @Path("1") postId : Int)



    // -8-------------------------- Channel :

    @Headers("Content-Type: application/json")
    @POST("create-channel/{userId}")
    fun createChannelInterface(@Path("userId") id : Int,@Body name : String) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("add-admin/{5}/{8}/{2}")
    fun addAdminToChannelInterface(@Path("5")userId : Int,
                                   @Path("8")channelId : Int,
                                   @Path("2")universityId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("remove-admin/{5}/{8}/{2}")
    fun removeAdminFromChannelInterface(@Path("5")userId : Int,
                                   @Path("8")channelId : Int,
                                   @Path("2")universityId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("follow/{1}/{8}")
    fun followChannelInterface(@Path("8")userId : Int,
                               @Path("1")channelId : Int) : Call<Void>


    @Headers("Content-Type: application/json")
    @POST("favorite-channel/{8}/{1}")
    fun favoriteChannelInterface(@Path("8")userId : Int,
                                 @Path("1")channelId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @POST("unfavorite-channel/{8}/{1}")
    fun unfavoriteChannelInterface(@Path("8")userId : Int,
                                   @Path("1")channelId : Int) :Call<Void>

    @Headers("Content-Type: application/json")
    @POST("channel/{9}/create-post/{1}")
    fun createPostInChannelInterface(userId : Int,chatId : Int, post : statusData) : Call<Void>

    @Headers("Content-Type: application/json")
    @DELETE("unfollow/{userId}/{channelId}")
    fun unfollowInterface(@Path("userId") userId: Int, @Path("channelId")channelId: Int) : Call<Void>


//    @Headers("Content-Type: application/json")
//    @DELETE("channel/delete-post/3/1")
//    fun deleteChannelPostInterface(@Path("3") userId: Int, @Path("1") postId : Int)

//    @Headers("Content-Type: application/json")
//    @POST("channel/edit-post/{1}/{2}")
//    fun editChannelPostInterface(@Path("1") userId : Int, @Path("2") channelId : Int)



    //  -8----------------------- University  :

    @Headers("Content-Type: application/json")
    @POST("join-university")
    fun setJoinUniversity(@Body university :  joinDataUniversity) : Call<Void>

    @Headers("Content-Type: application/json")
    @GET("profile/get")
    fun getUniversityProfile(@Body id :Int) : Call<get_UniversityJoinData>

    @Headers("Content-Type: application/json")
    @POST("profile-unive/update")
    fun profileUniversityUpdate(@Body university : joinDataUniversity) : Call<Void>

    @Headers("Content-Type: application/json")
    @DELETE("delete-Professor/{profId}")
    fun deleteProfessorInterface(@Path("profId") profId: Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @PUT("add-administative/{user}/{universityId}")
    fun addAdminstrativeInterface(@Path("adminId") userId: Int,@Path("universityId")universityId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @PUT("delete-administative/{userId}")
    fun deleteAdminstrativeInterface(@Path("userId") userId: Int) : Call<Void>


    @Headers("Content-Type: application/json")
    @PUT("add-Professor/{userId}/{universityId}")
    fun addProfessorInterface(@Path("userId") userId : Int,@Path("universityId") universityId: Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @DELETE("delete-member/{mamberId}/{groupId}")
    fun deleteMemberInterface(@Path("memberId") memberId : Int,
                              @Path("groupId") groupId : Int)


    @Headers("Content-Type: application/json")
    @POST("add-member/{memberId}/{groupId}")
    fun addMemberInterface(email: String) : Call<Void>

//        @Headers("Content-Type: application/json")
//        @POST("edit_settings_unive")
//        fun editUniversitySetting(@Body university : settingDataUniversity)

        /*return*/
        @Headers("Content-Type: application/json")
        @POST("login-university")
        fun loginUniversityInterface(@Body university : loginDataUniversity) : Call<get_UniversityJoinData>

    @Headers("Content-Type: application/json")
    @POST("login-university")
    fun loginVoidUniversityInterface(@Body university : loginDataUniversity) : Call<Void>


//        /*All*/
//        @Headers("Content-Type: application/json")
//        @POST("logout-unive")
//        fun logoutUniversityInterface(@Body university : joinDataUniversity) : Call<get_UniversityJoinData>

// -6-----------------------------------------  Admin:

    @Headers("Content-Type: application/json")
    @POST("admin/login")
    fun adminLogInInterface(admin : _admin.adminData) : Call<_admin.getadminDataSignIn>

    @Headers("Content-Type: application/json")
    @POST("admin/logout")
    fun adminLogOutInterface(adminId: Int)

    /*return*/
    @Headers("Content-Type: application/json")
    @PUT("accept-university/{universityId}")
    fun acceptUniversityInterface(@Path("universityId") universityId : Int) : Call<Void>

    @Headers("Content-Type: application/json")
    @DELETE("refuse-university/{universityId}")
    fun refuseUniversityInterface(@Path("universityId") universityId: Int) : Call<Void>

    /*return*/
    @Headers("Content-Type: application/json")
    @DELETE("delete-university-account/{universityId}")
    fun deleteUniversityInterface(@Path("universityId") universityId : Int) : Call<Void>




    // ------------------------------------------------------------------

    // Home - Favorite:
        // Get : title - Last message - picture
        // from : groups (joined) / channel(followed)
        // where = this.user
            @GET("")
            // Accept User Id(path) return List<HomeData>
            fun getHomeList(userId : String) : Call<List<HomeData>>

    // Notification :
        // Get : title - from - (date-this.date)
        // from : notification table
        // where = this.user
            @GET("")
            fun getNotificationList(userId: String) : Call<notificationData>
    // Account :
        // Drawer : Get => User
            @GET("user")
            fun getProfileDrawer(userId: String) : Call<_UserDataClass.userData>
        // Drawer : Update = > User
            @POST("user")
            fun Updatprofile(userData: _UserDataClass.userData)

    // Room :
            @GET("")
            fun getRoom(roomId : String) : Call<RoomChatData>
            @POST("Room")
            fun setRoom(Room : RoomChatData)
            @POST("Room")
            fun updateRoom(roomId: String)
            @POST("Room")
            fun deleteRoom(roomId: String)
}