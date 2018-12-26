/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voucherms;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ammar Shah
 */
public class db_Connect {
    Connection cin  = null;
    public static Connection connectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ammar Shah\\Desktop\\Development\\Java\\VoucherMS\\main.db");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
