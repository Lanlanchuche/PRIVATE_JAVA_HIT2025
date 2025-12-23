/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import constraint.ErrorContraint;



/**
 *
 * @author Admin
 */
public class JdbcUtils {
    //1.Thông tin kết nối
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Lanlannguyen#123";
    
    
    public static Connection getConnection( ) {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ErrorContraint.CLOSE_ERROR);
            ex.printStackTrace();
        }
    }
}
