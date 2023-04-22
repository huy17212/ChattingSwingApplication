/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Huy1721
 */
public class Capcha_model {
    private String ID_capcha;
    private String Image_capcha;
    private String Code_capcha;

    public Capcha_model() {
    }

    public Capcha_model(String ID_capcha, String Image_capcha, String Code_capcha) {
        this.ID_capcha = ID_capcha;
        this.Image_capcha = Image_capcha;
        this.Code_capcha = Code_capcha;
    }

    public String getID_capcha() {
        return ID_capcha;
    }

    public void setID_capcha(String ID_capcha) {
        this.ID_capcha = ID_capcha;
    }

    public String getImage_capcha() {
        return Image_capcha;
    }

    public void setImage_capcha(String Image_capcha) {
        this.Image_capcha = Image_capcha;
    }

    public String getCode_capcha() {
        return Code_capcha;
    }

    public void setCode_capcha(String Code_capcha) {
        this.Code_capcha = Code_capcha;
    }

    @Override
    public String toString() {
        return "Capcha_model{" + "ID_capcha=" + ID_capcha + ", Image_capcha=" + Image_capcha + ", Code_capcha=" + Code_capcha + '}';
    }
    
    
}
