package com.platinum.Integracion;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class ConexionBD {
	
    private static String url = "jdbc:mysql://127.0.0.1:3307/login_bd"; //127.0.0.1 = localhost
    private static String username = "root";
    private static String password = "iplacex";
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,username,password);     
            System.out.println("Conexión establecida");
            JOptionPane.showMessageDialog(null,  "CONEXION ESTABLECIDA", "CONEXION ESTABLECIDA", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null,  "ERROR DE CONEXIÓN", "ERROR DE CONEXIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return conexion;
    }
    
    public static void desconectar() {
    	Connection conexion = null;
    	if (conexion == null) {
    		System.out.println("La variable conexión ha sido puesta en null");
    	}
    }
    	
	
}
