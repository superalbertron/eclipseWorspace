package misClases;

public abstract class Animal {
    //Atributos
    String nombre;
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Constructor
    public Animal(String nombre) {
            super();
        this.nombre = nombre;
    };
    //M�todos abstractos
   abstract String saludar();
}