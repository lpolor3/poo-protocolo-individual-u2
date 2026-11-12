package taller5_ej3;

public class Persona {
    // 1. Atributo privado (solo accesible dentro de la clase Persona)
    private String nombre;

    // Atributo con modificador de paquete o default (accesible dentro del mismo paquete)
    int edad;

    // Constructor con acceso de paquete
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Getter y Setter para el atributo privado 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar la información
    void mostrarInformacion() {
        System.out.println("Nombre (privado vía método): " + nombre);
        System.out.println("Edad (default directo): " + edad);
    }
}
