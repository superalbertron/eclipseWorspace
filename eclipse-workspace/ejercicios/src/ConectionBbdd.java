
import java.sql.*;

public class ConectionBbdd {

	public static void main(String[] args, Connection Connection) {
		// TODO Esbozo de m�todo generado autom�ticamente
		 try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/delftstackDB","username","dbPassword");
	            Statement stmt=con.createStatement();  
	            ResultSet rs=stmt.executeQuery("show databases;");
	            System.out.println("Connected");  
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
		
	}

}
