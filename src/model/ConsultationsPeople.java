package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;

public class ConsultationsPeople extends Conectar {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insert(Person person) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("inser into person (key,name,direction,phone,email,dateB,gender) va(?,?,?,?,?,?,?)");
            ps.setString(1, person.getKey());
            ps.setString(2, person.getName());
            ps.setString(3, person.getDirection());
            ps.setString(4, person.getPhone());
            ps.setString(5, person.getEmail());
            ps.setDate(6, person.getDateB());
            ps.setString(7, person.getGender());

            int result = ps.executeUpdate();

            if (result > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }

    }

}
