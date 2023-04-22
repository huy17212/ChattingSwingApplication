/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Huy1721
 */
public class ConnectJDBC {

    Connection conn;

    public Connection GetConn() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://localhost; database = DB_zola_fake" + ";encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String password = "songlong";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            ConnectJDBC dt = new ConnectJDBC();
            Connection conn =  dt.GetConn();

            String sql = "select username_other_user from other_user where username_other_user = 'huy1721'";
            PreparedStatement ps = conn.prepareStatement(sql);
            String rs  = (String) jdbc.Helper_JDBC.valueNvarchar(sql, new ArrayList<>());
            System.out.println(rs);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
