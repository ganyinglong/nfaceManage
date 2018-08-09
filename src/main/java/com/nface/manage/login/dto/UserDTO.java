package com.nface.manage.login.dto;

public class UserDTO {
    private String userID;//用户id
    private String userName;//用户名
    private String password;//密码
    private String departMentCode;//机构编码
    private String mobile;//手机号
    private String email;//电子邮件
    private String chName;//姓名


    public String getDepartMentCode() {
        return departMentCode;
    }

    public void setDepartMentCode(String departMentCode) {
        this.departMentCode = departMentCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }
}
