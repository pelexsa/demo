package com.ShoppingMall.demo.vo;

public class MemberVo {
    private String userid;
    private String password;
    private String email;
    private String phonenumber;
    private String nickname;

    public MemberVo() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "MemberVo [userid=" + userid + ", password=" + password + ", email=" + email + ", phonenumber="
                + phonenumber + ", nickname=" + nickname + "]";
    }

}
