package model;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;


public class Conectar {
    public static final String URL = "jdbc:myslq://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String USER = "root";
    public static final String PASSWORD = "asd1";
    
    public Connection getConnection(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL,USER,PASSWORD);
            JOptionPane.showConfirmDialog(null, "Connection");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }

    PreparedStatement prepareStatement(String inser_into_person_keynamedirectionphoneem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
