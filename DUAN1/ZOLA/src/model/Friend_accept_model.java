/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Friend_accept_model {

    private String Username_other_user;

    public Friend_accept_model() {
    }

    public Friend_accept_model(String Username_other_user) {
        this.Username_other_user = Username_other_user;
    }

    public String getUsername_other_user() {
        return Username_other_user;
    }

    public void setUsername_other_user(String Username_other_user) {
        this.Username_other_user = Username_other_user;
    }

    @Override
    public String toString() {
        return "Username_other_user=" + Username_other_user +";";
    }
}
