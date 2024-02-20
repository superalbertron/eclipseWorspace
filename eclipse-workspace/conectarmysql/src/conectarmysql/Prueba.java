package conectarmysql;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prueba {

    public static void main(String[] args) throws ParseException {
        // Obtener la fecha actual
        String fechaString = "2023/05/05";

        // Formato de fecha esperado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convertir la cadena a un objeto Date
        Date fecha = formato.parse(fechaString);

        // Imprimir la fecha
        System.out.println("Fecha sin formato: " + fecha);
        System.out.println("Fecha con formato: " + formato.format(fecha));
    }
}