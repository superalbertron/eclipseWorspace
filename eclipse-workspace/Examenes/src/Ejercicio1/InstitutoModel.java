package Ejercicio1;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class InstitutoModel {
    private Connection conn;

    public InstitutoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    public List<Instituto> getAllInstitutos() throws SQLException {
        List<Instituto> institutos = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido1 = rs.getString("apellido1");
            String apellido2 = rs.getString("apellido2");
            String fecha_nacimiento = rs.getString("fecha_nacimiento");
            String es_repetidor = rs.getString("es_repetidor");
            int telefono = rs.getInt("telefono");
            institutos.add(new Instituto(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, telefono)); 
        }
        stmt.close(); 
        rs.close(); 
        return institutos;
    }

    public void close() throws SQLException {
        conn.close();
    }
}

