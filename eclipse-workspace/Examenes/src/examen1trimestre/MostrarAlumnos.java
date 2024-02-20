package examen1trimestre;

import java.sql.SQLException;

public class MostrarAlumnos {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost/instituto"; // URL de la base de datos
        String dbUser = "root"; // Usuario de la base de datos
        String dbPassword = ""; // Contraseña del usuario

        try {
            AlumnoController controller = new AlumnoController(dbURL, dbUser, dbPassword); // Crea una instancia del controlador
            controller.mostrarAlumnos(); // Llama al método del controlador para mostrar los alumnos
            controller.cerrarConexion(); // Llama al método del controlador para cerrar la conexión a la base de datos
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja las excepciones de SQL imprimiendo el error
        }

	}

}
