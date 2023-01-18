package com.platinum.Integracion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQLmetodos {
    private Connection conexion;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;
    Principal frmMenu = new Principal();

    public boolean buscarUsuarioRegistrado(String username, String password) {
        boolean iniciarSesion = false;
        //JOptionPane.showMessageDialog(null,  "ETAPA 1", "ETAPA 1", JOptionPane.INFORMATION_MESSAGE);
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT username, password FROM usuario WHERE username = ? AND password = ?";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, username);
            sentenciaPreparada.setString(2, password);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
            	// JOptionPane.showMessageDialog(null,  "ETAPA 2 ok", "ETAPA 2 ok", JOptionPane.INFORMATION_MESSAGE);
            	username = resultado.getString("username");
            	password = resultado.getString("password");
            	frmMenu.setVisible(true);
            	iniciarSesion = true;//El usuario puede iniciar Sesion por que esta registrado en la BD
            } else {
            	JOptionPane.showMessageDialog(null,  "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
                iniciarSesion = false;//El usuario NO puede iniciar sesion por que no esta registrado en la BD
            }
            conexion.close();
        } catch (SQLException e) {
        	// JOptionPane.showMessageDialog(null,  "ETAPA 3 err", "ETAPA 3 err", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Error: " + e);
        } finally {
        	// JOptionPane.showMessageDialog(null,  "ETAPA 4 finally", "ETAPA 4 finally", JOptionPane.INFORMATION_MESSAGE);
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        // JOptionPane.showMessageDialog(null,  "ETAPA return iniciarSesion", "ETAPA return iniciarSesion", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("El valor de iniciarSesion en el metodo es: " + iniciarSesion);
        return iniciarSesion;
    }
}


