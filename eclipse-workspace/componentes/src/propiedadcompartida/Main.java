package propiedadcompartida;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Obtener la conexi�n a la base de datos
        Connection connection = MySQLConnection.getConnection();
        
        // Realizar operaciones en la base de datos utilizando la conexi�n
        
        // Cerrar la conexi�n a la base de datos
        MySQLConnection.closeConnection();
    }
}
