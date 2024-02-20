package JnitEjemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectarDbQuery {
    public static void main(String[] args) {
    	Connection conn=null;
        try {
            
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:/empresa","root", "");

            // Crear un statement
            Statement stmt = conn.createStatement();

            // Ejecutar una consulta
            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");

            // Procesar los resultados
            System.out.println("Id Nif Nombre " );
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)+" "+rs.getString(3));
            }

            // Cerrar la conexión
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}