package examenFinal1T;

import java.sql.SQLException;
import java.util.List;


public class AlumnoController {
	private AlumnoModel model; // Instancia del modelo
    private AlumnoView view;   // Instancia de la vista

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnoModel(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexión a la base de datos
        view = new AlumnoView(); // Inicializa la vista
    }

    // Método para mostrar los clientes
    public void mostrarAlumno() throws SQLException {
        List<Alumno> alumno = model.getAllProductos(); // Obtiene la lista de clientes desde el modelo
        view.mostrarA(alumno); // Muestra los clientes en la vista
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}