/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class MessViewTemp {

    private String Image_avatar;
    private String Username_other_user;
    private String Text;

    public MessViewTemp() {
    }

    public MessViewTemp(String Image_avatar, String Username_other_user, String Text) {
        this.Image_avatar = Image_avatar;
        this.Username_other_user = Username_other_user;
        this.Text = Text;
    }
    
    public MessViewTemp(String Image_avatar, String Username_other_user) {
        this.Image_avatar = Image_avatar;
        this.Username_other_user = Username_other_user;
    }

    public String getImage_avatar() {
        return Image_avatar;
    }

    public void setImage_avatar(String Image_avatar) {
        this.Image_avatar = Image_avatar;
    }

    public String getUsername_other_user() {
        return Username_other_user;
    }

    public void setUsername_other_user(String Username_other_user) {
        this.Username_other_user = Username_other_user;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    @Override
    public String toString() {
        return "MessViewTemp{" + "Image_avatar=" + Image_avatar + ", Username_other_user=" + Username_other_user + ", Text=" + Text + '}';
    }
}
