/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Huy1721
 */
abstract class Father_All_Interface<Who, Code> {

    public abstract void Insert(Who dt);

    public abstract boolean Update(Who dt);

    public abstract boolean Delete(Code ma);

    public abstract ResultSet SelectAll();

    public abstract Who Select(Code ma);

}
