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
            ps = conexion.prepareStatement("insert into persona (clave,nombre,domicilio,celular,email,fecha_nacimiento,genero) values (?,?,?,?,?,?,?)");
            ps.setString(1, person.getKey());
            ps.setString(2, person.getName());
            ps.setString(3, person.getaddress());
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
        public boolean search(Person person) {
        Connection conexion = getConnection();

        try {
              ps = conexion.prepareStatement("select * from persona where clave=?");
              ps.setString(1, person.getKey());
              rs = ps.executeQuery();
              if (rs.next()){
                  person.setIdPerson(rs.getInt("idPersona"));
                  person.setKey(rs.getString("clave"));
                  person.setName(rs.getString("nombre"));
                  person.setaddress(rs.getString("domicilio"));
                  person.setPhone(rs.getString("celular"));
                  person.setEmail(rs.getString("email"));
                  person.setDateB(rs.getDate("fecha_nacimiento"));
                  person.setGender(rs.getString("genero"));
                  return true;
              }else{
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
        
    public boolean modify(Person person) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,email=?,fecha_nacimiento=?,genero=? where idPersona=?");
            ps.setString(1, person.getKey());
            ps.setString(2, person.getName());
            ps.setString(3, person.getaddress());
            ps.setString(4, person.getPhone());
            ps.setString(5, person.getEmail());
            ps.setDate(6, person.getDateB());
            ps.setString(7, person.getGender());
            ps.setInt(8, person.getIdPerson());

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
