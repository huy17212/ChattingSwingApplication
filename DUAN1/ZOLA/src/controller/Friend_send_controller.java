/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Friend_send_model;

/**
 *
 * @author Huy1721
 */
public class Friend_send_controller extends Father_All_Interface<Friend_send_model, String> {
    
    @Override
    public void Insert(Friend_send_model dt) {
        String sql = "INSERT INTO Friend_send VALUES (?)";
        ArrayList dsProp = new ArrayList();
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.update(sql, dsProp);
    }
    
    @Override
    public boolean Update(Friend_send_model dt) {
        String sql = "DELETE FROM Friend_send WHERE Username_other_user = ?";
        ArrayList dsProp = new ArrayList<>();
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.query(sql, dsProp);
        return true;
    }
    
    @Override
    public boolean Delete(String ma) {
        String sql = "DELETE FROM Friend_send where Username_other_user = ?";
        ArrayList dsProp = new ArrayList();
        dsProp.add(ma);
        jdbc.Helper_JDBC.update(sql, dsProp);
        return true;
    }
    
    @Override
    public ResultSet SelectAll() {
        String sql = "SELECT * FROM Friend_send";
        return jdbc.Helper_JDBC.query(sql, new ArrayList<>());
    }
    
    @Override
    public Friend_send_model Select(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
