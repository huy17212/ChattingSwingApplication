/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Huy1721
 */
public class User_controller extends Father_All_Interface<User_model, String> {

    @Override
    public void Insert(User_model dt) {
        String sql = "INSERT INTO [USER] VALUES (?,?)";
        ArrayList dsProp = new ArrayList();
        dsProp.add(dt.getUsername_user());
        dsProp.add(dt.getPassword());
        jdbc.Helper_JDBC.update(sql, dsProp);
    }

    @Override
    public boolean Update(User_model dt) {
        String sql = "UPDATE [User] set Username_user = ? and Password  =?";
        ArrayList dsProp = new ArrayList<>();
        dsProp.add(dt.getUsername_user());
        dsProp.add(dt.getPassword());
        jdbc.Helper_JDBC.update(sql, dsProp);
        return false;
    }

    @Override
    public boolean Delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ResultSet rs;

    @Override
    public ResultSet SelectAll() {
        String sql = "SELECT * FROM [USER]";
        rs = jdbc.Helper_JDBC.query(sql, new ArrayList<>());
        return rs;
    }

    @Override
    public User_model Select(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void DELETETABLE(){
        String sql = "DELETE FROM [User]";
        jdbc.Helper_JDBC.update(sql, new ArrayList());
    }

    public static void main(String[] args) {
        ResultSet rsNew;
        try {
            User_controller uc = new User_controller();
            User_model dtMau = new User_model("IDMen", "pkv");
            uc.Insert(dtMau);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
