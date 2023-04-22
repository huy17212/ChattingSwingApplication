/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import controller.Other_user_controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.sql.*;
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
public class Data_User {

    FileWriter folder_Group, folder_Group_list, folder_Group_chat, folder_List_friend, folder_chat, folder_friend_send, folder_friend_accept;
    FileReader folfer_Group, folfer_Group_list, folfer_Group_chat, folfer_List_friend, folfer_chat, folfer_friend_send, folfer_friend_accept;

    BufferedWriter BW_Group, BW_Group_list, BW_Group_chat, BW_List_friend, BW_chat, BW_friend_send, BW_friend_accept;
    BufferedReader BR_Group, BR_Group_list, BR_Group_chat, BR_List_friend, BR_chat, BR_friend_send, BR_friend_accept;

    ArrayList<Group_model> ds_Group;
    ArrayList<Chat_model> ds_Chat;
    ArrayList<Group_list_model> ds_Group_list;
    ArrayList<List_friend_model> ds_List_friend;
    ArrayList<Group_chat_model> ds_Group_chat;
    ArrayList<Friend_send_model> ds_Friend_send;
    ArrayList<Friend_accept_model> ds_Friend_accept;

    public static void main(String[] args) {
        Data_User dt = new Data_User();
        dt.CREATE("huy1721");
//        dt.CREATE_SYSTEM_FRIENDXCHAT();
//        ArrayList ds = dt.READ("huy1721");
//        dt.CLEAN("huy1721");
//        dt.WRITE_TO_OTHER_CHAT("bichthao");

    }

    ArrayList<ArrayList> dsObject = new ArrayList<ArrayList>();

    public ArrayList<ArrayList> READ(String username) {
        /*
            Đọc dữ liệu từ file text vào ArrayList Object
         */
        try {
//            ds_Group = new ArrayList();
            ds_Chat = new ArrayList<>();
            ds_Group_list = new ArrayList<>();
            ds_List_friend = new ArrayList<>();
            ds_Group_chat = new ArrayList<>();
            ds_Friend_send = new ArrayList<>();
            ds_Friend_accept = new ArrayList<>();

            //folfer_Group = new FileReader("src//data_Mess_Zola//" + username + "//Group.txt");
            folfer_Group_list = new FileReader("src//data_Mess_Zola//" + username + "//Group_list.txt");
            folfer_Group_chat = new FileReader("src//data_Mess_Zola//" + username + "//Group_chat.txt");
            folfer_List_friend = new FileReader("src//data_Mess_Zola//" + username + "//List_friend.txt");
            folfer_chat = new FileReader("src//data_Mess_Zola//" + username + "//chat.txt");
            folfer_friend_send = new FileReader("src//data_Mess_Zola//" + username + "//Friend_send.txt");
            folfer_friend_accept = new FileReader("src//data_Mess_Zola//" + username + "//Friend_accept.txt");

            //BR_Group = new BufferedReader(folfer_Group);
            BR_Group_list = new BufferedReader(folfer_Group_list);
            BR_Group_chat = new BufferedReader(folfer_Group_chat);
            BR_List_friend = new BufferedReader(folfer_List_friend);
            BR_chat = new BufferedReader(folfer_chat);
            BR_friend_accept = new BufferedReader(folfer_friend_accept);
            BR_friend_send = new BufferedReader(folfer_friend_send);

            while (true) {
                String a = BR_List_friend.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                String Username_user = split[0].toString();
                String Username_other_user = split[1].toString();

                List_friend_model dtMau = new List_friend_model(Username_user, Username_other_user);
                ds_List_friend.add(dtMau);
            }

            while (true) {
                String a = BR_chat.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                System.out.println(split[0]);
                Integer ID_chat = Integer.parseInt(split[0].toString().substring(split[0].toString().length() - 1, split[0].toString().length()));
                String Username_user = split[1].toString();
                String Username_orther_user = split[2].toString();
                Integer ID_type = Integer.parseInt(split[3].toString().substring(split[3].toString().length() - 1, split[3].toString().length()));
                String Text = split[4].toString();
                String Who_send = split[5].toString();

                Chat_model dtMau = new Chat_model(ID_chat, Username_user, Username_orther_user, ID_type, Text, Who_send);
                ds_Chat.add(dtMau);

            }
//            while (true) {
//                String a = BR_Group.readLine();
//
//                if (a == null || a.equals("")) {
//                    break;
//                }
//                String[] split = a.split(";");
//                System.out.println(split[0]);
//                Integer ID_group = Integer.parseInt(split[0].toString().substring(split[0].toString().length() - 1, split[0].toString().length()));
//                String Name_group = split[1].toString();
//                String Image_group = split[2].toString();
//
//                Group_model dtMau = new Group_model(ID_group, Name_group, Image_group);
//                ds_Group.add(dtMau);
//            }

            while (true) {
                String a = BR_Group_list.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                Integer ID_group = Integer.parseInt(split[0].toString().substring(split[0].toString().length() - 1, split[0].toString().length()));
                String Username_user = split[1].toString();

                Group_list_model dtMau = new Group_list_model(ID_group, Username_user);
                ds_Group_list.add(dtMau);
            }

            while (true) {
                String a = BR_Group_chat.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                Integer ID_group_chat = Integer.parseInt(split[0].toString().substring(split[0].toString().length() - 1, split[0].toString().length()));
                Integer ID_group = Integer.parseInt(split[1].toString().substring(split[1].toString().length() - 1, split[1].toString().length()));
                String Username_orther_user = split[2].toString();
                Integer ID_type = Integer.parseInt(split[3].toString().substring(split[3].toString().length() - 1, split[3].toString().length()));
                String text = split[4].toString();
                Group_chat_model dtMau = new Group_chat_model(ID_group_chat, ID_group, Username_orther_user, ID_type, text);
                ds_Group_chat.add(dtMau);
            }

            while (true) {
                String a = BR_friend_send.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                String Username_other_user_ = split[0].toString();

                Friend_send_model dtMau = new Friend_send_model(Username_other_user_);
                ds_Friend_send.add(dtMau);
            }

            while (true) {
                String a = BR_friend_accept.readLine();
                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                String Username_other_user_ = split[0].toString();

                Friend_accept_model dtMau = new Friend_accept_model(Username_other_user_);
                ds_Friend_accept.add(dtMau);
            }

            dsObject.add(ds_List_friend);
            //dsObject.add(ds_Group);
            dsObject.add(ds_Group_chat);
            dsObject.add(ds_Group_list);
            dsObject.add(ds_Chat);
            dsObject.add(ds_Friend_accept);
            dsObject.add(ds_Friend_send);
            return dsObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void WRITE_TO_OTHER_CHAT(String username) {
        try {
//            FileWriter folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//chat.txt");
//            BufferedWriter BW_chat = new BufferedWriter(folder_chat);
//            BW_chat.write("");

            folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//chat.txt", true);
            BW_chat = new BufferedWriter(folder_chat);

            String sql = "SELECT * FROM [Other_chat]";
            ResultSet rs = jdbc.Helper_JDBC.queryNvarchar(sql, new ArrayList<>());

            while (rs.next()) {
                Chat_model dtMau = new Chat_model(rs.getInt("ID_chat"),
                        rs.getString("Username_user"),
                        rs.getString("Username_other_user"),
                        rs.getInt("ID_type"),
                        rs.getString("Text"),
                        rs.getString("Who_send"));
                BW_chat.write(dtMau.toString());
                BW_chat.newLine();
                BW_chat.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WRITE_TO_LIST_FRIEND_TEMP(String username) {
        try {
//            FileWriter folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//List_friend.txt");
//            BufferedWriter BW_chat = new BufferedWriter(folder_chat);
//            BW_chat.write("");

            folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//List_friend.txt", true);
            BW_chat = new BufferedWriter(folder_chat);

            String sql = "SELECT * FROM [List_friend_temp]";
            ResultSet rs = jdbc.Helper_JDBC.query(sql, new ArrayList<>());

            while (rs.next()) {
                List_friend_model dtMau = new List_friend_model(
                        rs.getString(1),
                        rs.getString(2)
                );
                BW_chat.write(dtMau.toString());
                BW_chat.newLine();
                BW_chat.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WRITE_TO_SEND(String username) {
        try {
            FileWriter folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_send.txt", true);
            BufferedWriter BW_chat = new BufferedWriter(folder_chat);

            String sql = "SELECT * FROM [Send_Temp]";
            ResultSet rs = jdbc.Helper_JDBC.query(sql, new ArrayList<>());

            if (rs.next()) {
                while (rs.next()) {
                    Friend_send_model dtMau = new Friend_send_model(
                            rs.getString(1)
                    );
                    BW_chat.write(dtMau.toString());
                    BW_chat.newLine();
                    BW_chat.flush();
                }
            } else {
                folder_friend_send = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_send.txt");
                BW_chat = new BufferedWriter(folder_friend_send);
                BW_chat.write("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WRITE_TO_ACCEPT(String username) {
        try {
            FileWriter folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_accept.txt", true);
            BufferedWriter BW_chat = new BufferedWriter(folder_chat);

            String sql = "SELECT * FROM [Accept_temp]";
            ResultSet rs = jdbc.Helper_JDBC.queryNvarchar(sql, new ArrayList<>());

            while (rs.next()) {
                Friend_accept_model dtMau = new Friend_accept_model(
                        rs.getString(1)
                );

                BW_chat.write(dtMau.toString());
                BW_chat.newLine();
                BW_chat.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WRITE_TO_GROUP_CHAT(Group_list_model dtMau, String WhoLogin) {
        try {
            if (dtMau.getUsername_other_user().equals("system") || dtMau.getUsername_other_user().equals(WhoLogin)) {
                return;
            }

            String username = dtMau.getUsername_other_user().substring(dtMau.getUsername_other_user().indexOf("=") + 1, dtMau.getUsername_other_user().length());
            folder_Group_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Group_chat.txt", true);

            String sql = "SELECT * FROM Group_chat_inventory WHERE ID_group = ?";
            ArrayList dsProp = new ArrayList();
            dsProp.add(dtMau.getID_group());
            ResultSet rs = jdbc.Helper_JDBC.query(sql, dsProp);

            while (rs.next()) {
                Group_chat_model dtMau1 = new Group_chat_model(rs.getInt(1), rs.getInt(2), rs.getString(3), 1, rs.getString(5));
                BW_Group_chat = new BufferedWriter(folder_Group_chat);
                BW_Group_chat.write(dtMau1.toString());
                BW_Group_chat.newLine();
                BW_Group_chat.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ArrayList<Group_list_model> ds_joinner;

    public ArrayList<Group_list_model> READ_TO_GROUP_CHAT(String username, String WhoLogin) {
        try {
            ds_joinner = new ArrayList<>();

            if (username.equals(WhoLogin) || username.equals("system")) {
                return ds_joinner;
            }

            folfer_Group_list = new FileReader("src//data_Mess_Zola//" + username + "//Group_list.txt");

            BR_Group_list = new BufferedReader(folfer_Group_list);

            while (true) {
                String a = BR_Group_list.readLine();

                if (a == null || a.equals("")) {
                    break;
                }
                String[] split = a.split(";");
                Integer ID_group = Integer.parseInt(split[0].toString().substring(split[0].toString().length() - 1, split[0].toString().length()));
                String Username_user = split[1].toString();

                Group_list_model dtMau = new Group_list_model(ID_group, Username_user);
                ds_joinner.add(dtMau);
            }

            return ds_joinner;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void CLEAN_TO_GROUP_CHAT(String dtMau, String name) {
        try {
            if (dtMau.equals("system") || dtMau.equals(name)) {
                return;
            }
            folder_Group_chat = new FileWriter("src//data_Mess_Zola//" + dtMau + "//Group_chat.txt");
            BW_Group_chat = new BufferedWriter(folder_Group_chat);
            BW_Group_chat.write("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WRITE(String username) {
        try {

            /*
                Ghi dữ liệu từ file DB vào file text
             */
            // tao duong dan cho fileWriter --> roi moi tao dc BufferedWriter
            // 1. tao filewriter
            //folder_Group = new FileWriter("src//data_Mess_Zola//" + username + "//Group.txt", true);
            folder_Group_list = new FileWriter("src//data_Mess_Zola//" + username + "//Group_list.txt", true);
            folder_Group_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Group_chat.txt", true);
            folder_List_friend = new FileWriter("src//data_Mess_Zola//" + username + "//List_friend.txt", true);
            folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//chat.txt", true);
            folder_friend_send = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_send.txt", true);
            folder_friend_accept = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_accept.txt", true);

            // 2. tao bufferedWriter
            //BW_Group = new BufferedWriter(folder_Group);
            BW_Group_list = new BufferedWriter(folder_Group_list);
            BW_Group_chat = new BufferedWriter(folder_Group_chat);
            BW_List_friend = new BufferedWriter(folder_List_friend);
            BW_chat = new BufferedWriter(folder_chat);
            BW_friend_accept = new BufferedWriter(folder_friend_accept);
            BW_friend_send = new BufferedWriter(folder_friend_send);

            // 3. truy xuat sql de luu de lai ban ghi moi sau moi lan su dung
            // 3.1 Viet lenh sql
            //String sql_Group = "SELECT ID_group, Name_group, Image_group FROM [GROUP]";
            String sql_Group_list = "SELECT ID_group, Username_other_user FROM [GROUP_LIST]";
            String sql_Group_chat = "SELECT ID_group_chat, ID_group, Username_orther_user, ID_type, Text FROM [GROUP_CHAT]";
            String sql_List_friend = "SELECT Username_user, Username_other_user FROM [LIST_FRIEND]";
            String sql_chat = "SELECT ID_chat, Username_user, Username_other_user, ID_type, [Text], Who_send FROM [CHAT]";
            String sql_Friend_send = "SELECT * FROM Friend_send";
            String sql_Friend_accept = "SELECT * FROM Friend_accept";

            // 3.2 Truy xuat sql
            //ResultSet rs_Group = jdbc.Helper_JDBC.queryNvarchar(sql_Group, new ArrayList());
            ResultSet rs_Group_list = jdbc.Helper_JDBC.queryNvarchar(sql_Group_list, new ArrayList());
            ResultSet rs_Group_chat = jdbc.Helper_JDBC.queryNvarchar(sql_Group_chat, new ArrayList());
            ResultSet rs_List_friend = jdbc.Helper_JDBC.queryNvarchar(sql_List_friend, new ArrayList());
            ResultSet rs_chat = jdbc.Helper_JDBC.queryNvarchar(sql_chat, new ArrayList());
            ResultSet rs_Friend_send = jdbc.Helper_JDBC.queryNvarchar(sql_Friend_send, new ArrayList());
            ResultSet rs_Friend_accept = jdbc.Helper_JDBC.queryNvarchar(sql_Friend_accept, new ArrayList());

            //4. load len file txt
            //4.1 load tu DB len file List friend cua user.
            while (rs_List_friend.next()) {
                List_friend_model dtMau = new List_friend_model(rs_List_friend.getString(1), rs_List_friend.getString(2));
                BW_List_friend.write(dtMau.toString());
                BW_List_friend.newLine();
                BW_List_friend.flush();
            }

            //4.2 load len file chat cua user.
            while (rs_chat.next()) {
                Chat_model dtMau = new Chat_model(rs_chat.getInt("ID_chat"),
                        rs_chat.getString("Username_user"),
                        rs_chat.getString("Username_other_user"),
                        rs_chat.getInt("ID_type"),
                        rs_chat.getString("Text"),
                        rs_chat.getString("Who_send"));
                BW_chat.write(dtMau.toString());
                BW_chat.newLine();
                BW_chat.flush();
            }

            //4.3 load len file Group cua user.
//            while (rs_Group.next()) {
//                Group_model dtMau = new Group_model(rs_Group.getInt("ID_group"),
//                        rs_Group.getString("Name_group"),rs_Group.getString("Image_group"));
//                BW_Group.write(dtMau.toString());
//                BW_Group.newLine();
//                BW_Group.flush();
//            }
            //4.4 load len file Group_list cua user.
            while (rs_Group_list.next()) {
                Group_list_model dtMau = new Group_list_model(rs_Group_list.getInt("ID_group"),
                        rs_Group_list.getString("Username_other_user"));
                BW_Group_list.write(dtMau.toString());
                BW_Group_list.newLine();
                BW_Group_list.flush();
            }

            //4.5 load len file group chat cua user.
            while (rs_Group_chat.next()) {
                Group_chat_model dtMau = new Group_chat_model(rs_Group_chat.getInt("ID_group_chat"),
                        rs_Group_chat.getInt("ID_Group"),
                        rs_Group_chat.getString("Username_orther_user"),
                        rs_Group_chat.getInt("ID_type"),
                        rs_Group_chat.getString("Text"));
                BW_Group_chat.write(dtMau.toString());
                BW_Group_chat.newLine();
                BW_Group_chat.flush();
            }

            while (rs_Friend_send.next()) {
                Friend_send_model dtMau = new Friend_send_model(rs_Friend_send.getString("Username_other_user"));
                BW_friend_send.write(dtMau.toString());
                BW_friend_send.newLine();
                BW_friend_send.flush();
            }

            while (rs_Friend_accept.next()) {
                Friend_accept_model dtMau = new Friend_accept_model(rs_Friend_accept.getString("Username_other_user"));
                BW_friend_accept.write(dtMau.toString());
                BW_friend_accept.newLine();
                BW_friend_accept.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CLEAN(String username) {
        try {

            //folder_Group = new FileWriter("src//data_Mess_Zola//" + username + "//Group.txt");
            folder_Group_list = new FileWriter("src//data_Mess_Zola//" + username + "//Group_list.txt");
            folder_Group_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Group_chat.txt");
            folder_List_friend = new FileWriter("src//data_Mess_Zola//" + username + "//List_friend.txt");
            folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//chat.txt");
            folder_friend_accept = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_accept.txt");
            folder_friend_send = new FileWriter("src//data_Mess_Zola//" + username + "//Friend_send.txt");

            //BW_Group = new BufferedWriter(folder_Group);
            BW_Group_list = new BufferedWriter(folder_Group_list);
            BW_Group_chat = new BufferedWriter(folder_Group_chat);
            BW_List_friend = new BufferedWriter(folder_List_friend);
            BW_chat = new BufferedWriter(folder_chat);
            BW_friend_accept = new BufferedWriter(folder_friend_accept);
            BW_friend_send = new BufferedWriter(folder_friend_send);

            BW_List_friend.write("");
            BW_chat.write("");
            BW_friend_accept.write("");
            BW_friend_send.write("");
            BW_Group_chat.write("");
            BW_Group_list.write("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CREATE_SYSTEM_FRIENDXCHAT(String name) {
        try {
            Other_user_controller other_user_controller = new Other_user_controller();

            ResultSet rs = other_user_controller.SelectAll();

            while (rs.next()) {

                if (rs.getString(1).equals("system")) {
                    continue;
                }
                if (rs.getString(1).equals(name)) {
                    folder_List_friend = new FileWriter("src//data_Mess_Zola//" + rs.getString(1) + "//List_friend.txt", true);
                    folder_chat = new FileWriter("src//data_Mess_Zola//" + rs.getString(1) + "//chat.txt", true);
                    BW_List_friend = new BufferedWriter(folder_List_friend);
                    BW_chat = new BufferedWriter(folder_chat);

                    List_friend_model dtMau = new List_friend_model(rs.getString(1), "system");
                    BW_List_friend.write(dtMau.toString());
                    BW_List_friend.newLine();
                    BW_List_friend.flush();

                    Chat_model dtv = new Chat_model(0,
                            rs.getString("Username_other_user"),
                            "system",
                            1,
                            "Chào mừng bạn đến với zola (Đây là tin nhắn tự sinh).",
                            "system");
                    BW_chat.write(dtv.toString());
                    BW_chat.newLine();
                    BW_chat.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void CREATE(String username) {
        try {
            String sql = "SELECT Username_other_user FROM OTHER_USER WHERE Username_other_user = ?";
            ArrayList ds = new ArrayList();
            ds.add(username);
            ResultSet rs = jdbc.Helper_JDBC.queryNvarchar(sql, ds);
            while (rs.next()) {

                File foldle = new File("src//data_Mess_Zola//" + rs.getString(1));
                if (!foldle.exists()) {
                    foldle.mkdir();
                    folder_Group = new FileWriter("src//data_Mess_Zola//" + username + "//Group.txt", true);
                    folder_Group_list = new FileWriter("src//data_Mess_Zola//" + username + "//Group_list.txt", true);
                    folder_Group_chat = new FileWriter("src//data_Mess_Zola//" + username + "//Group_chat.txt", true);
                    folder_List_friend = new FileWriter("src//data_Mess_Zola//" + username + "//List_friend.txt", true);
                    folder_chat = new FileWriter("src//data_Mess_Zola//" + username + "//chat.txt", true);
                    folder_friend_accept = new FileWriter("src//data_Mess_Zola//" + rs.getString(1) + "//Friend_send.txt", true);
                    folder_friend_send = new FileWriter("src//data_Mess_Zola//" + rs.getString(1) + "//Friend_accept.txt", true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
