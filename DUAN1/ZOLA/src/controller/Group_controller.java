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
public class Group_controller extends Father_All_Interface<Group_model, String> {

    @Override
    public void Insert(Group_model dt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update(Group_model dt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet SelectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Group_model dtMau;

    @Override
    public Group_model Select(String ma) {
        try {
            int number = Integer.parseInt(ma);
            String sql = "SELECT * FROM [Group] WHERE ID_group = ?";
            ArrayList dsProp = new ArrayList<>();
            dsProp.add(number);
            ResultSet rs = jdbc.Helper_JDBC.query(sql, dsProp);
            if (rs.next()) {
                dtMau = new Group_model(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return dtMau;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
