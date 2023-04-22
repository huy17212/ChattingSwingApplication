/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Friend_accept_model;

/**
 *
 * @author Huy1721
 */
public class Friend_accept_controller extends Father_All_Interface<Friend_accept_model, String> {

    @Override
    public void Insert(Friend_accept_model dt) {
        String sql = "INSERT INTO Friend_accept VALUES (?)";
        ArrayList dsProp = new ArrayList();
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.update(sql, dsProp);
    }

    @Override
    public boolean Update(Friend_accept_model dt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(String ma) {
        String sql = "DELETE FROM Friend_accept WHERE Username_other_user = ?";
        ArrayList dsProp = new ArrayList();
        dsProp.add(ma);
        jdbc.Helper_JDBC.update(sql, dsProp);
        return true;
    }

    @Override
    public ResultSet SelectAll() {
        String sql = "SELECT * FROM Friend_Accept";
        return jdbc.Helper_JDBC.query(sql, new ArrayList<>());
    }

    @Override
    public Friend_accept_model Select(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
