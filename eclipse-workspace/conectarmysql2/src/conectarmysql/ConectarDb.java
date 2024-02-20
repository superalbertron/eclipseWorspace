package conectarmysql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConectarDb {
	   //declaramos los diferentes objetos necesarios para nuestra conexión
	   
	   public static void main(String[] args) throws SQLException  {
	      Connection conn = null;
	     try {
	    	 //Desde aquí se encarga del driver JDBC    
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","");
	         //controlamos que la conexión ha sido ok
	         if (conn != null) {
	            System.out.println("Conexión a base de datos Ok");
	            conn.close();
	         }
	      }
	      catch(SQLException e)                   
	         {System.out.println("Error en la conexión "+e.getMessage());  
	      }
	 }
}