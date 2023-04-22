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
public class Group_list_controller extends Father_All_Interface<Group_list_model, String> {

    @Override
    public void Insert(Group_list_model dt) {
        String sql = "INSERT INTO Group_list VALUES (?,?)";
        ArrayList dsProp = new ArrayList<>();
        dsProp.add(dt.getID_group());
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.update(sql, dsProp);
    }

    @Override
    public boolean Update(Group_list_model dt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet SelectAll() {
        String sql  = "SELECT * FROM Group_List";
        return jdbc.Helper_JDBC.query(sql, new ArrayList<>());
    }

    @Override
    public Group_list_model Select(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

}
