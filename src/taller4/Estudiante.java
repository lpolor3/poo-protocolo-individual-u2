package taller4;

public class Estudiante {
    // 1. Todas las propiedades deben ser privadas (Encapsulamiento)
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor para inicializar el objeto
    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    // 2. Métodos get y set con validaciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad ingresada no es válida.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        // Validación estándar para la escala de notas (0.0 a 5.0)
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0.0 y 5.0.");
        }
    }
}

