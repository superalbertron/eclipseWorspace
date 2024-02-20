package proyectoxml;

import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import javax.xml.transform.OutputKeys;
import org.exist.xmldb.EXistResource;


public class ConectarXml {
    
    private static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/";
    private static String COLLECTION = "productosDB";
    private static String RESOURCE = "productos.xml";

    public static void main(String args[]) throws Exception {
        
        final String driver = "org.exist.xmldb.DatabaseImpl";
        
        // initialize database driver
        Class cl = Class.forName(driver);
        Database database = (Database) cl.getDeclaredConstructor().newInstance();    
        database.setProperty("create-database", "true");
        DatabaseManager.registerDatabase(database);
        
        Collection col = null;
        XMLResource res = null;
        try {    
            // get the collection
            col = DatabaseManager.getCollection(URI + COLLECTION, "admin", "");
            col.setProperty(OutputKeys.INDENT, "no");
            res = (XMLResource)col.getResource(RESOURCE);
           
            
            if(res == null) {
                System.out.println("Base de datos no encontrada!");
            } else {
                System.out.println(res.getContent());
            }
        } finally {
            //dont forget to clean up!
            
            if(res != null) {
                try { ((EXistResource)res).freeResources(); } catch(XMLDBException xe) {xe.printStackTrace();}
            }
            
            if(col != null) {
                try { col.close(); } catch(XMLDBException xe) {xe.printStackTrace();}
            }
        }
    }
}
