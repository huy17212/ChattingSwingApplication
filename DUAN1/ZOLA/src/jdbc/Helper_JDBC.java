/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Huy1721
 */
public class Helper_JDBC {

    static ResultSet resultSet = null;
    static int many_rows;
    static Object values;
    static ConnectJDBC dt = new ConnectJDBC();
    static Connection conn = dt.GetConn();
    static PreparedStatement ppst = null;

    public static PreparedStatement getPrepareStatement(String cauLenhSQL, ArrayList ds) {
        try {

            if (cauLenhSQL.trim().startsWith("{")) {
                ppst = conn.prepareCall(cauLenhSQL);
            } else {
                ppst = conn.prepareStatement(cauLenhSQL);
            }
            for (int i = 0; i < ds.size(); i++) {
                ppst.setString(i + 1, ds.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ppst;
    }

    public static void update(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatement(sql, ds);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet query(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatement(sql, ds);
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static Object value(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatement(sql, ds);
        try {
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getObject(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // NVARCHAR STAND LINE
    public static PreparedStatement getPrepareStatementNvarchar(String cauLenhSQL, ArrayList ds) {
        try {

            if (cauLenhSQL.trim().startsWith("{")) {
                ppst = conn.prepareCall(cauLenhSQL);
            } else {
                ppst = conn.prepareStatement(cauLenhSQL);
            }
            for (int i = 0; i < ds.size(); i++) {
                ppst.setNString(i + 1, ds.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ppst;
    }

    public static void updateNvarchar(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatementNvarchar(sql, ds);
        try {
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet queryNvarchar(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatementNvarchar(sql, ds);
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static Object valueNvarchar(String sql, ArrayList ds) {
        PreparedStatement preparedStatement = getPrepareStatementNvarchar(sql, ds);
        try {
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getObject(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            String sql = "SELECT username_user from [User] WHERE username_user = 'huy1721'";
            String values = (String) jdbc.Helper_JDBC.valueNvarchar(sql, new ArrayList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
