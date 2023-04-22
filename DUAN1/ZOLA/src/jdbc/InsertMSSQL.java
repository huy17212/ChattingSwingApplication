/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import controller.Chat_controller;
import controller.Friend_send_controller;
import controller.List_friend_controller;
import java.util.ArrayList;
import model.Chat_model;
import model.Friend_accept_model;
import model.Friend_send_model;
import model.Group_chat_model;
import model.Group_list_model;
import model.Group_model;
import model.List_friend_model;

/**
 *
 * @author Huy1721
 */
public class InsertMSSQL {

    ArrayList<Group_model> ds_Group;
    ArrayList<Chat_model> ds_Chat;
    ArrayList<Group_list_model> ds_Group_list;
    ArrayList<List_friend_model> ds_List_friend;
    ArrayList<Group_chat_model> ds_Group_chat;
    ArrayList<Friend_accept_model> ds_Friend_accept;
    ArrayList<Friend_send_model> ds_Friend_send;
    Data_User data_user;
    InsertMSSQL insertmssql;

    public void LOAD(ArrayList dsObject) {

        ds_List_friend = (ArrayList<List_friend_model>) dsObject.get(0);
        ds_Group = (ArrayList<Group_model>) dsObject.get(1);
        ds_Group_chat = (ArrayList<Group_chat_model>) dsObject.get(2);
        ds_Group_list = (ArrayList<Group_list_model>) dsObject.get(3);
        ds_Chat = (ArrayList<Chat_model>) dsObject.get(4);
        ds_Friend_accept = (ArrayList<Friend_accept_model>) dsObject.get(5);
        ds_Friend_send = (ArrayList<Friend_send_model>) dsObject.get(6);
    }

    public void INSERT_OTHER_CHAT_TEXT_TO_DB(String username) {
        try {
            data_user = new Data_User();
            insertmssql = new InsertMSSQL();
            ArrayList<ArrayList> dsObject = new ArrayList<>();

            dsObject = data_user.READ(username); // load ArrayList<Arraylist> vào ds Object
            insertmssql.LOAD(dsObject);

            Chat_controller chat_controller = new Chat_controller();

            for (Chat_model item : ds_Chat) {
                String Username_user = item.getUsername_user().substring(item.getUsername_user().indexOf("=") + 1, item.getUsername_user().length());
                String Username_other_user = item.getUsername_other_user().substring(item.getUsername_other_user().indexOf("=") + 1, item.getUsername_other_user().length());
                int ID_Type = item.getID_type();
                String Text = item.getText().substring(item.getText().indexOf("=") + 1, item.getText().length());
                String Who_send = item.getWho_send().substring(item.getWho_send().indexOf("=") + 1, item.getWho_send().length());

                Chat_model dtMau = new Chat_model(Username_user, Username_other_user, ID_Type, Text, Who_send);
                chat_controller.Insert(dtMau);
            }
        } catch (Exception e) {
            return;
        }
    }

    public void INSERT_SEND_TEMP_TO_DB(String username) {
        try {
            data_user = new Data_User();
            insertmssql = new InsertMSSQL();
            ArrayList<ArrayList> dsObject = new ArrayList<>();

            dsObject = data_user.READ(username); // load ArrayList<Arraylist> vào ds Object
            ds_Friend_send = (ArrayList<Friend_send_model>) dsObject.get(5);

            ds_Friend_send.forEach(item
                    -> {

                String Username_other_user = item.getUsername_other_user().substring(item.getUsername_other_user().indexOf("=") + 1, item.getUsername_other_user().length());
                Friend_send_model dtMau = new Friend_send_model(Username_other_user);
                String sql = "INSERT INTO [Send_temp] VALUES (?)";
                ArrayList dsProp = new ArrayList<>();
                dsProp.add(dtMau.getUsername_other_user());
                jdbc.Helper_JDBC.update(sql, dsProp);
            }
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void INSERT_ACCEPT_TEMP_TO_DB(String username) {
        try {
            data_user = new Data_User();
            insertmssql = new InsertMSSQL();
            ArrayList<ArrayList> dsObject = new ArrayList<>();

            dsObject = data_user.READ(username); // load ArrayList<Arraylist> vào ds Object
            insertmssql.LOAD(dsObject);

            ds_Friend_accept.forEach(item
                    -> {
                String Username_other_user = item.getUsername_other_user().substring(item.getUsername_other_user().indexOf("=") + 1, item.getUsername_other_user().length());
                Friend_accept_model dtMau = new Friend_accept_model(Username_other_user);
                String sql = "INSERT INTO [Accep_temp] VALUES (?)";
                ArrayList dsProp = new ArrayList<>();
                dsProp.add(dtMau.getUsername_other_user());
                jdbc.Helper_JDBC.update(sql, dsProp);
            }
            );

        } catch (Exception e) {
            return;
        }
    }

    public void INSERT_LIST_FRIEND_TEMP_TO_DB(String username) {
        try {
            data_user = new Data_User();
            insertmssql = new InsertMSSQL();
            ArrayList<ArrayList> dsObject = new ArrayList<>();

            dsObject = data_user.READ(username); // load ArrayList<Arraylist> vào ds Object

            ArrayList<ArrayList> dsObjectt = data_user.READ(username);
            ds_List_friend = dsObjectt.get(0);
            for (List_friend_model item : ds_List_friend) {
                String Username_user = item.getUsername_user().substring(item.getUsername_user().indexOf("=") + 1, item.getUsername_user().length());
                String Username_other_user = item.getUsername_other_user().substring(item.getUsername_other_user().indexOf("=") + 1, item.getUsername_other_user().length());
                List_friend_model dtMau = new List_friend_model(Username_user, Username_other_user);
                String sql = "INSERT INTO [List_friend_temp] VALUES (?,?)";
                ArrayList dsProp = new ArrayList<>();
                dsProp.add(Username_user);
                dsProp.add(Username_other_user);
                jdbc.Helper_JDBC.update(sql, dsProp);
            }

        } catch (Exception e) {
            return;
        }
    }

    public void DELETE_Other_chat() {
        String sql = "DELETE FROM Other_chat";
        jdbc.Helper_JDBC.update(sql, new ArrayList());
    }

    public void DELETE_SEND_TEMP() {
        String sql = "DELETE FROM [Send_temp]";
        jdbc.Helper_JDBC.update(sql, new ArrayList());
    }

    public void DELETE_LIST_FRIEND_TEMP() {
        String sql = "DELETE FROM [List_friend_temp]";
        jdbc.Helper_JDBC.update(sql, new ArrayList());
    }

    public void DELETE_ACCEPT_TEMP() {
        String sql = "DELETE FROM [Accept_temp]";
        jdbc.Helper_JDBC.update(sql, new ArrayList());
    }

    
    public void DELETE() {
        String sql_Chat = "DELETE FROM Chat";
        String sql_List_friend = "DELETE FROM List_friend";
        //String sql_Group = "DELETE FROM [Group]";
        String sql_Group_list = "DELETE FROM Group_list";
        String sql_Group_chat = "DELETE FROM Group_chat";
        String sql_Friend_send = "DELETE FROM Friend_send";
        String sql_Friend_accept = "DELETE FROM Friend_accept";

//        String sql_User = "DELETE FROM [USER]";
        jdbc.Helper_JDBC.update(sql_Chat, new ArrayList());
        jdbc.Helper_JDBC.update(sql_List_friend, new ArrayList());
        jdbc.Helper_JDBC.update(sql_Group_chat, new ArrayList());
        jdbc.Helper_JDBC.update(sql_Group_list, new ArrayList());
        //jdbc.Helper_JDBC.update(sql_Group, new ArrayList());
        jdbc.Helper_JDBC.update(sql_Friend_send, new ArrayList());
        jdbc.Helper_JDBC.update(sql_Friend_accept, new ArrayList());

//        jdbc.Helper_JDBC.update(sql_User, new ArrayList());
    }

    public static void main(String[] args) {
        InsertMSSQL dt = new InsertMSSQL();
//        Data_User dtMau = new Data_User();
//        ArrayList dsObject = dtMau.READ("huy1721");
//        dt.LOAD(dsObject);
//
//        dt.ds_List_friend = (ArrayList<List_friend_model>) dsObject.get(0);
//
//        for (List_friend_model item : dt.ds_List_friend) {
//            System.out.println(item.toString());
//        }
//
//        for (Chat_model item : dt.ds_Chat) {
//            System.out.println(item.toString());
//        }
        dt.DELETE();
    }

}
