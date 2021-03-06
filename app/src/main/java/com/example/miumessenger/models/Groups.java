package com.example.miumessenger.models;

public class Groups {

    String groupName;
    String  profilePic, userName, email, password,userId,lastMsg,lastMsgTime;

    public Groups(String groupName, String userName, String lastMsg, String lastMsgTime) {
        this.userName = userName;
        this.lastMsg = lastMsg;
        this.lastMsgTime = lastMsgTime;
        this.groupName = groupName;
    }




    public Groups(){

    }
    public Groups(String groupName){
        this.groupName = groupName;

    }

    public Groups(String profilePic, String userName, String email, String password, String userId, String lastMsg, String lastMsgTime) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userId = userId;
        this.lastMsg = lastMsg;
        this.lastMsgTime = lastMsgTime;
    }
    //SignUp constructor
    public Groups(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public String getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(String lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

}
