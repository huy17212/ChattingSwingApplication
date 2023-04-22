/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Chat_model {

    private Integer ID_chat;
    private String Username_user;
    private String Username_other_user;
    private Integer ID_type;
    private String Text;
    private String Who_send;

    public Chat_model() {
    }

    public Chat_model(Integer ID_chat, String Username_user, String Username_other_user, Integer ID_type, String Text, String Who_send) {
        this.ID_chat = ID_chat;
        this.Username_user = Username_user;
        this.Username_other_user = Username_other_user;
        this.ID_type = ID_type;
        this.Text = Text;
        this.Who_send = Who_send;
    }

    public Chat_model(String Username_user, String Username_other_user, Integer ID_type, String Text, String Who_send) {
        this.Username_user = Username_user;
        this.Username_other_user = Username_other_user;
        this.ID_type = ID_type;
        this.Text = Text;
        this.Who_send = Who_send;
    }

    public String getWho_send() {
        return Who_send;
    }

    public void setWho_send(String Who_send) {
        this.Who_send = Who_send;
    }

    public Integer getID_chat() {
        return ID_chat;
    }

    public void setID_chat(Integer ID_chat) {
        this.ID_chat = ID_chat;
    }

    public String getUsername_user() {
        return Username_user;
    }

    public void setUsername_user(String Username_user) {
        this.Username_user = Username_user;
    }

    public String getUsername_other_user() {
        return Username_other_user;
    }

    public void setUsername_other_user(String Username_other_user) {
        this.Username_other_user = Username_other_user;
    }

    public Integer getID_type() {
        return ID_type;
    }

    public void setID_type(Integer ID_type) {
        this.ID_type = ID_type;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    @Override
    public String toString() {
        return "ID_chat=" + ID_chat + "; Username_user=" + Username_user
                + "; Username_other_user=" + Username_other_user + "; ID_type=" + ID_type + "; Text=" + Text + "; Who_send=" + Who_send;
    }

}
