/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Huy1721
 */
public class Chat_controller extends Father_All_Interface<Chat_model, String> {

    String sql;
    ResultSet rs;
    ArrayList dsProp;

    public static void main(String[] args) {
    }

    @Override
    // Thêm Chat đối thoại
    public void Insert(Chat_model dt) {
        sql = "INSERT INTO Chat (Username_user, Username_other_user, ID_Type, Text, Who_send) VALUES (?,?,?,?,?)";
        dsProp = new ArrayList<>();
        dsProp.add(dt.getUsername_user());
        dsProp.add(dt.getUsername_other_user());
        dsProp.add(dt.getID_type());
        dsProp.add(dt.getText());
        dsProp.add(dt.getWho_send());

        jdbc.Helper_JDBC.update(sql, dsProp);

    }

    @Override
    // Xóa luôn tin nhắn đó
    public boolean Delete(String ma) {
        sql = "DELETE FROM Chat WHERE Text = ?";
        dsProp = new ArrayList<>();
        dsProp.add(ma);
        jdbc.Helper_JDBC.update(sql, dsProp);
        return true;
    }

    @Override
    public ResultSet SelectAll() {
        sql = "SELECT * FROM Chat";
        dsProp = new ArrayList<>();
        rs = jdbc.Helper_JDBC.queryNvarchar(sql, dsProp);
        return rs;
    }

    @Override
    public Chat_model Select(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    // Gỡ bỏ tin nhắn đó
    public boolean Update(Chat_model dt) {
        sql = "UPDATE chat set Text = N'Tin nhắn này đã được gỡ bỏ.' WHERE ID = ?";
        dsProp = new ArrayList<>();
        dsProp.add(dt.getID_chat());
        jdbc.Helper_JDBC.updateNvarchar(sql, dsProp);
        return true;
    }

}
