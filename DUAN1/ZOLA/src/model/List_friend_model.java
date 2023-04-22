/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class List_friend_model {
    private String Username_user;
    private String Username_other_user;

    public List_friend_model() {
    }

    public List_friend_model(String Username_user, String Username_other_user) {
        this.Username_user = Username_user;
        this.Username_other_user = Username_other_user;
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

    @Override
    public String toString() {
        return "Username_user=" + Username_user + "; Username_other_user=" + Username_other_user;
    }


    
    
    
}
