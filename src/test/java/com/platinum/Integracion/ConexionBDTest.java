package com.platinum.Integracion;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.platinum.Integracion.ConexionBD;
import com.platinum.Integracion.SQLmetodos;
import com.platinum.Integracion.frmLogin;
import com.platinum.Integracion.App;
import com.platinum.Integracion.Principal;

public class ConexionBDTest {

	public ConexionBDTest () {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

    @Test
    public void testConexionBD()
    {      
	    	String url = "jdbc:mysql://127.0.0.1:3307/login_bd";  
	        String username = "root";
	        String password = "iplacex";
            Connection conexion = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(url,username,password);     
                System.out.println("Conexión establecida");
                JOptionPane.showMessageDialog(null,  "CONEXION ESTABLECIDA", "CONEXION ESTABLECIDA", JOptionPane.INFORMATION_MESSAGE);
                
                assertTrue( true );
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error: " + e);
                JOptionPane.showMessageDialog(null,  "ERROR DE CONEXIÓN", "ERROR DE CONEXIÓN", JOptionPane.INFORMATION_MESSAGE);
                
                assertTrue( false );
            }
     }
        
    public static void testdesconectar() {
    	Connection conexion = null;
    	if (conexion == null) {
    		System.out.println("La variable conexión ha sido puesta en null");
    		
    		assertTrue( true );
    	}
    	
    	assertTrue( true );
    } 
}
