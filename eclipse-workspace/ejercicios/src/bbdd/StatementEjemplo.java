package bbdd;
import java.sql.*;
public class StatementEjemplo {

	public static void main(String[] args) throws SQLException {
		// TODO Esbozo de m�todo generado autom�ticamente
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empresa","root","");
			Statement sentencia = conexion.createStatement();
			String nombre="ENDESA";
			String consulta = "select * from clientes where nombre='"+nombre+"'";
			ResultSet rs=sentencia.executeQuery(consulta);
			} catch (SQLException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		
		
		
	}

}
