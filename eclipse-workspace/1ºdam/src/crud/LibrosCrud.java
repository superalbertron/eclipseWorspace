package crud;

import java.util.ArrayList;

class LibrosCrud{
	private ArrayList<Libro> libros = new ArrayList<>();


	public void añadirLibro(Libro libro) {
		libros.add(libro);
		System.out.println("Libro agregado con éxito");
	}

	public void listarLibros() {
		for (Libro libro : libros) {
			libro.mostrarInformacion();
		}
	}

	public void modificarLibro(String nombre, Libro nuevoLibro) {
		for (Libro libro : libros) {
			if (libro.getNombre().equals(nombre)) {
				int index = libros.indexOf(libro);
				libros.set(index, nuevoLibro);
				System.out.println("Libro modificado con éxito");
				return;
			}
		}
		System.out.println("No se encontró el libro con nombre " + nombre);
	}

	public void eliminarLibro(String nombre) {
		for (Libro libro : libros) {
			if (libro.getNombre().equals(nombre)) {
				libros.remove(libro);
				System.out.println("Libro eliminado con éxito");
				return;
			}
		}
		System.out.println("No se encontró el libro con nombre " + nombre);
	}

}