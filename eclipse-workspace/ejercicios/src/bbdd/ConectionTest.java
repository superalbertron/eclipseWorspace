package bbdd;

import java.sql.*;
public class ConectionTest
{
   //declaramos los diferentes objetos necesarios para nuestra conexi�n
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/empresa";
   public static void main(String[] args) throws Exception
   {
      Connection conn = null;
      try
      {
//Desde aqu� se encarga del driver JDBC    
Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url,login,password);
         if (conn != null)
         {
            System.out.println("Conexi�n a base de datos "+url+" ... Ok");
            conn.close();
         }
      }
      catch(SQLException ex)
      {
         System.out.println(ex);
      }
      catch(ClassNotFoundException ex)
      {
         System.out.println(ex);
      }
   }

}
