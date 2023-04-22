/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Group_chat_model {
    private Integer ID_group_chat;
    private Integer ID_group;
    private String Username_other_user;
    private Integer ID_type;
    private String Text;

    public Group_chat_model() {
    }

    public Group_chat_model(Integer ID_group_chat, Integer ID_group, String Username_other_user, Integer ID_type, String Text) {
        this.ID_group_chat = ID_group_chat;
        this.ID_group = ID_group;
        this.Username_other_user = Username_other_user;
        this.ID_type = ID_type;
        this.Text = Text;
    }

    public Integer getID_group_chat() {
        return ID_group_chat;
    }

    public void setID_group_chat(Integer ID_group_chat) {
        this.ID_group_chat = ID_group_chat;
    }

    public Integer getID_group() {
        return ID_group;
    }

    public void setID_group(Integer ID_group) {
        this.ID_group = ID_group;
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
        return "ID_group_chat=" + ID_group_chat + "; ID_group=" + ID_group + 
                "; Username_other_user=" + Username_other_user + "; ID_type=" + ID_type + "; Text=" + Text;
    }
    
    
}
