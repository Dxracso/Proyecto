/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modelo.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ResourceManager {

    private static String url = "jdbc:mysql://localohost:3306/tiendaonline";
    private static String usuario = "root";
    private static String clave = "123456789";

    public static Connection conectar() throws SQLException { 
        Connection conexion =null;
               
        try {
        conexion = DriverManager.getConnection(url, usuario, clave);    
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return  conexion;
    }
    public  static void close(Connection con){
        try {
            if (con!=null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    public  static void close(PreparedStatement st){
        try {
            if (st!=null) {
                st.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    public  static void close(ResultSet rs){
        try {
            if (rs!=null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
