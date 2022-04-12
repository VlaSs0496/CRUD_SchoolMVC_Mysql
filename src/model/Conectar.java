package model;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;

//jdbc:mysql://localhost:3306/escuela
public class Conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/escuela";
    public static final String USER = "root";
    public static final String PASSWORD = "asd1";
    
    public Connection getConnection(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL,USER,PASSWORD);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }
}
