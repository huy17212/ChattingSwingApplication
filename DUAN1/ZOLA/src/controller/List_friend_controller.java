/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.text.html.parser.DTD;
import model.*;
import view.ListFriend_view;

/**
 *
 * @author Huy1721
 */
public class List_friend_controller extends Father_All_Interface<List_friend_model, String> {

    ArrayList dsProp;
    String sql;
    ResultSet rs;
    List_friend_model dtMau;

    public static void main(String[] args) {

    }

    @Override
    // thêm bạn bè
    public void Insert(List_friend_model dt) {
        sql = "INSERT INTO List_friend values (?,?)";
        dsProp = new ArrayList();
        dsProp.add(dt.getUsername_user());
        dsProp.add(dt.getUsername_other_user());
        jdbc.Helper_JDBC.update(sql, dsProp);

    }

    @Override
    // xóa bạn bè
    public boolean Delete(String Username_other_user) {
        sql = "DELETE FROM CHAT WHERE Username_other_user = ?";
        dsProp = new ArrayList<>();
        dsProp.add(Username_other_user);
        jdbc.Helper_JDBC.update(sql, dsProp);

        sql = "DELETE FROM List_friend WHERE Username_other_user = ?";
        dsProp = new ArrayList<>();
        dsProp.add(Username_other_user);
        jdbc.Helper_JDBC.update(sql, dsProp);

        return true;
    }

    @Override
    // tìm kiếm danh sách tất cả bạn bè
    public ResultSet SelectAll() {
        sql = "SELECT * FROM List_friend";
        return jdbc.Helper_JDBC.query(sql, new ArrayList());
    }

    @Override
    // tìm kiếm bạn bè
    public List_friend_model Select(String ma) {
        sql = "SELECT * FROM List_friend WHERE Username_other_user = ?";
        dsProp = new ArrayList<>();
        dsProp.add(ma);
        List_friend_model dtMau = (List_friend_model) jdbc.Helper_JDBC.value(sql, dsProp);
        return dtMau;
    }

    @Override
    public boolean Update(List_friend_model dt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    

}
