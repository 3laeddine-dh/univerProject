package com.example.universeapp.networking;

 import com.example.universeapp.dataclass.Example;
 import com.example.universeapp.dataclass._UserDataClass;
 import com.example.universeapp.dataclass._admin;
 import com.example.universeapp.dataclass.get_UniversityJoinData;
  import com.example.universeapp.dataclass.joinDataUniversity;
 import com.example.universeapp.dataclass.loginDataUniversity;
 import com.example.universeapp.dataclass.messageString;
 import com.example.universeapp.dataclass.statusData;
 import com.google.gson.Gson;
 import com.google.gson.GsonBuilder;

 import java.util.Date;

 import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class NetClient {
    private static final String BASE_URL = "https://universeapi.000webhostapp.com/api/";
    private endPointsInterface endPointsInterface;
    private static NetClient INSTANCE;

    public NetClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        endPointsInterface = retrofit.create(endPointsInterface.class);
    }

    public static NetClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new NetClient();
        }
        return INSTANCE;
    }


    //User :

    /*Work*/
    public Call<Void> setMember(_UserDataClass.joinData member){ return endPointsInterface.setJoin(member); }
    /*Work*/
    public Call<_UserDataClass.profile> setSignIn(_UserDataClass.signInData s){return endPointsInterface.setSignIn(s);}


    public Call<_UserDataClass.profile> setUpdateProfile(_UserDataClass.userProfileData userProfile){
        return endPointsInterface.setUserUpdateProfile(userProfile); }

//    public Call<Example> getProfile(){ return endPointsInterface.getprofile(); }
    /**/        public Call<messageString> setPasswordReset(String email){return endPointsInterface.setPasswordReset(email);}
    public Call<Void> getVerified(String c){return endPointsInterface.getVerifyEmail(c);}


    // Group :

        public Call<Void> setCreateGroup(int userId,String groupName){return endPointsInterface.createGroupInterface(userId,groupName);}
        public Call<Void> setUnfavoriteGroup(int usid,int chid){return endPointsInterface.unfavoriteGroup(usid,chid);}
//      public Call<Void> setEditGroup(int id){return endPointsInterface.editGroupInterface(id,id);}
        public Call<Void> setDeleteGroup(int groupId,int userId){return endPointsInterface.deleteGroupInterface(groupId,userId);}
        public Call<Void> setFavoriteGroup(int grId,int usId){return endPointsInterface.favoriteGroupInterface(grId,usId);}
        public Call<Void> setCreatePostGroup(int id_user,int id_channel,messageString msg){return endPointsInterface.createPostInGroupInterface(id_user,id_channel,msg);}
        public Call<Void> setAddGroupMember(int userId,int groupId){
            return endPointsInterface.addGroupMemberInterface(userId,groupId);}
    // Channel :
        public Call<Void> setCreateChannel(int id,String name){return endPointsInterface.createChannelInterface(id,name);}
        public Call<Void> setUnfavoriteChannel(int usId,int chId){return endPointsInterface.unfavoriteChannelInterface(usId,chId);}
        public Call<Void> setFavoriteChannel(int userId,int channelId){return endPointsInterface.favoriteChannelInterface(userId,channelId);}
        public Call<Void> setCreatePostChannel(int id_user, int id_channel, statusData msg){
                                                return endPointsInterface.createPostInChannelInterface(id_user,id_channel,msg);}
        public Call<Void> setAddAdminChannel(int adminId,int channelId,int universityId){
                                                return endPointsInterface.addAdminToChannelInterface(adminId,channelId,universityId);}
        // Not Yet :
        public Call<Void> setRemoveAdminChannel(int adminId,int channelId,int universityId){
                                                return endPointsInterface.removeAdminFromChannelInterface(adminId,channelId,universityId);}

    public Call<Void> setFollowChannel(int usid , int chid){return endPointsInterface.followChannelInterface(usid,chid);}
    public Call<Void> setUnfollowChannel(int usid , int chid){return endPointsInterface.unfollowInterface(usid,chid);}




    // University

        public Call<get_UniversityJoinData> loginUniversityInterface(loginDataUniversity _university){
                                            return endPointsInterface.loginUniversityInterface(_university);}

        public Call<Void> loginVoidUniversityInterface(loginDataUniversity _university){
            return endPointsInterface.loginVoidUniversityInterface(_university);}

        public Call<Void> setUniversityMember(joinDataUniversity _university){ return endPointsInterface.setJoinUniversity(_university); }
        public Call<get_UniversityJoinData> setUniversityGetProfile(int id){return endPointsInterface.getUniversityProfile(id);}
        public Call<Void> setUniversityProfileUpdate(joinDataUniversity data){return endPointsInterface.profileUniversityUpdate(data);}
        public Call<Void> setUniversityAddProfessor(int userId,int universityId){
                                                    return endPointsInterface.addProfessorInterface(userId,universityId);}
        public Call<Void> setUniversityDeleteProfessor(int id){return endPointsInterface.deleteProfessorInterface(id);}
        public Call<Void> setUniversityAddAdminstrator(int idUser , int idUniversity){return endPointsInterface.addAdminstrativeInterface(idUser,idUniversity);}
        public Call<Void> setUniversityDeleteAdminstrator(int id){return endPointsInterface.deleteAdminstrativeInterface(id);}

    // Admin App
        public Call<_admin.getadminDataSignIn> setAdminAppSign(_admin.adminData admin){
            return endPointsInterface.adminLogInInterface(admin); }

        public Call<Void> setAdminAppRefuseUniversity(int university){
            return endPointsInterface.refuseUniversityInterface(university); }

        public Call<Void> setAdminAppAcceptUniversity(int  university){
            return endPointsInterface.acceptUniversityInterface(university); }

        public Call<Void> setAdminAppDeleteUniversity(int universityId){
            return endPointsInterface.deleteUniversityInterface(universityId); }

}

