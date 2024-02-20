package segundotrimestre;
import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de videojuegos
        ArrayList<String> listaVideojuegos = new ArrayList<>();

        // Agregar algunos nombres de videojuegos a la lista
        listaVideojuegos.add("The Legend of Zelda: Breath of the Wild");
        listaVideojuegos.add("The Witcher 3: Wild Hunt");
        listaVideojuegos.add("Red Dead Redemption 2");

        // Mostrar la lista de videojuegos
        System.out.println("Lista de Videojuegos:");
        for (String videojuego : listaVideojuegos) {
            System.out.println(videojuego);
        }

        // Obtener el tama�o de la lista
        int tama�oLista = listaVideojuegos.size();
        System.out.println("N�mero de videojuegos en la lista: " + tama�oLista);

        // Acceder a un elemento espec�fico por �ndice
        String videojuegoElegido = listaVideojuegos.get(2);
        System.out.println("Videojuego en la posici�n 2: " + videojuegoElegido);

        // Eliminar un videojuego de la lista
        listaVideojuegos.remove("Hollow Knight");

        // Mostrar la lista actualizada
        System.out.println("\nLista de Videojuegos Actualizada:");
        for (String videojuego : listaVideojuegos) {
            System.out.println(videojuego);
        }

        // Verificar si un videojuego espec�fico est� en la lista
        boolean contieneWitcher3 = listaVideojuegos.contains("The Witcher 3: Wild Hunt");
        System.out.println("\n�La lista contiene 'The Witcher 3: Wild Hunt'? " + contieneWitcher3);
    }
}
