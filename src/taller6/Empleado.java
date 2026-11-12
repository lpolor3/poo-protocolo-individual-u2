package taller6;

public class Empleado {
    // 1. Propiedades con modificador protected
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método base para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
