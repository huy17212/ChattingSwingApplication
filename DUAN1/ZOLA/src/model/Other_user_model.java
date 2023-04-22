/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Other_user_model {

    private String Username_other_user;
    private String Password;
    private String Birth_day;
    private String Gender;
    private String Image_back_ground;
    private String Image_avatar;
    private String Ho_ten;

    public Other_user_model() {
    }

    public Other_user_model(String Username_other_user, String Password, String Birth_day, String Gender, String Image_back_ground, String Image_avatar, String Ho_ten) {
        this.Username_other_user = Username_other_user;
        this.Password = Password;
        this.Birth_day = Birth_day;
        this.Gender = Gender;
        this.Image_back_ground = Image_back_ground;
        this.Image_avatar = Image_avatar;
        this.Ho_ten = Ho_ten;
    }

    public String getUsername_other_user() {
        return Username_other_user;
    }

    public void setUsername_other_user(String Username_other_user) {
        this.Username_other_user = Username_other_user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getBirth_day() {
        return Birth_day;
    }

    public void setBirth_day(String Birth_day) {
        this.Birth_day = Birth_day;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getImage_back_ground() {
        return Image_back_ground;
    }

    public void setImage_back_ground(String Image_back_ground) {
        this.Image_back_ground = Image_back_ground;
    }

    public String getImage_avatar() {
        return Image_avatar;
    }

    public void setImage_avatar(String Image_avatar) {
        this.Image_avatar = Image_avatar;
    }

    public String getHo_ten() {
        return Ho_ten;
    }

    public void setHo_ten(String Ho_ten) {
        this.Ho_ten = Ho_ten;
    }

    @Override
    public String toString() {
        return "Other_user_model{" + "Username_other_user=" + Username_other_user + ", Password=" + Password + ", Birth_day=" + Birth_day + ", Gender=" + Gender + ", Image_back_ground=" + Image_back_ground + ", Image_avatar=" + Image_avatar + ", Ho_ten=" + Ho_ten + '}';
    }

}
