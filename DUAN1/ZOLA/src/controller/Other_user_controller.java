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
public class Other_user_controller extends Father_All_Interface<Other_user_model, String> {

    @Override
    public void Insert(Other_user_model dt) {
        String sql = "INSERT INTO Other_user VALUES (?,?,?,?,?,?,?)";
        ArrayList dsProp = new ArrayList();
        dsProp.add(dt.getUsername_other_user());
        dsProp.add(dt.getPassword());
        dsProp.add(dt.getBirth_day());
        dsProp.add(dt.getGender());
        dsProp.add(dt.getImage_back_ground());
        dsProp.add(dt.getImage_avatar());
        dsProp.add(dt.getHo_ten());
        jdbc.Helper_JDBC.update(sql, dsProp);
    }

    @Override
    public boolean Update(Other_user_model dt) {
        String sql = "Update other_user set [Password] = ?, Birth_day = ?, Gender = ?, Image_back_ground = ?, Image_avatar = ?, Ho_ten = ?  where Username_other_user = ?";
        ArrayList dsProp = new ArrayList<>();
        dsProp.add(dt.getPassword());
        dsProp.add(dt.getBirth_day());
        dsProp.add(dt.getGender());
        dsProp.add(dt.getImage_back_ground());
        dsProp.add(dt.getImage_avatar());
        dsProp.add(dt.getHo_ten());
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.update(sql, dsProp);
        return true;
    }

    @Override
    public boolean Delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet SelectAll() {
        String sql = "SELECT * FROM [Other_user]";
        ResultSet rs = jdbc.Helper_JDBC.queryNvarchar(sql, new ArrayList<>());
        return rs;
    }

    @Override
    public Other_user_model Select(String ma) {
        try {

            String sql = "SELECT * FROM Other_user WHERE Username_other_user = ?";
            ArrayList ds = new ArrayList();
            ds.add(ma);
            ResultSet rs = jdbc.Helper_JDBC.query(sql, ds);
            if (rs.next()) {
                Other_user_model dtMau = new Other_user_model(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
                return dtMau;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            Other_user_model dtMau = new Other_user_model();
            Other_user_controller dt = new Other_user_controller();

            ResultSet rs = dt.SelectAll();
            while (rs.next()) {
                rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
