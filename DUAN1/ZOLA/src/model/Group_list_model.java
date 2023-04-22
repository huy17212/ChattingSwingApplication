/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Group_list_model {
    private Integer ID_group;
    private String Username_other_user;

    public Group_list_model() {
    }

    public Group_list_model(Integer ID_group, String Username_other_user) {
        this.ID_group = ID_group;
        this.Username_other_user = Username_other_user;
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

    @Override
    public String toString() {
        return "ID_group=" + ID_group + "; Username_other_user=" + Username_other_user;
    }
    
    
}
