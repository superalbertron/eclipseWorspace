public class Strings {

        public static void main(String[] args) {
                 /*
                 Reamos el array para los alumnos y su edad
                 La columna [0] ser� el �ndice
                 la columna [1] el nombre y
                 la columna [2] la edad
                 */
               
                String[][] Alumnos = {
                                                                {"Federico", "14 a�os"},
                                                                {"Rodrigo", "15 a�os"},
                                                                {"Pedro", "20 a�os"},
                                                                {"Federico", "18 a�os"},
                                                                {"Pedro", "23 a�os"},
                                                                {"Federico", "15 a�os"},
                                                                {"Pedro", "10 a�os"}
                                                        };
                /*
                 *  Creamos un bucle que recorrer� los �ndices y leer� en TODOS, la columna 1
                 *  y la compara con el par�metro que elegimos, (en este caso Pedro)
                 *          
                 */
                for (int i=0; i<Alumnos.length; i++)
                {
                        if ( Alumnos[i][0] == "Pedro")
                       
                                /*
                                 * Si dentro de la columna 1, encuentra a Pedro, nos mostrar� en la consola
                                 * El nombre del almuno y su edad
                                 */
                               
                                System.out.println(Alumnos[i][0] + " " + Alumnos[i][1]);
                }
        }        
}