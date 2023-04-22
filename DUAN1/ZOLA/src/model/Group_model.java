/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Group_model {
    
    private Integer ID_group;
    private String Name_group;
    private String Image_group;

    public Group_model() {
    }

    public Group_model(Integer ID_group, String Name_group, String Image_group) {
        this.ID_group = ID_group;
        this.Name_group = Name_group;
        this.Image_group = Image_group;
    }

    public Group_model(String Image_group) {
        this.Image_group = Image_group;
    }
    
    

    public Integer getID_group() {
        return ID_group;
    }

    public void setID_group(Integer ID_group) {
        this.ID_group = ID_group;
    }

    public String getName_group() {
        return Name_group;
    }

    public void setName_group(String Name_group) {
        this.Name_group = Name_group;
    }

    public String getImage_group() {
        return Image_group;
    }

    public void setImage_group(String Image_group) {
        this.Image_group = Image_group;
    }

    @Override
    public String toString() {
        return "ID_group=" + ID_group + "; Name_group=" + Name_group + "; Image_group=" + Image_group;
    }  
}
