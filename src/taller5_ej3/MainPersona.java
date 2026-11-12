package taller5_ej3;

public class MainPersona {
    public static void main(String[] args) {
        System.out.println("--- COMPARACIÓN ACCESS MODIFIERS: PRIVATE VS DEFAULT ---");

        Persona p = new Persona("Carlos", 22);

        // --- VERIFICACIÓN DE ACCESO DESDE EL MISMO PAQUETE ---

        // 1. Acceso a la edad (default): Se puede acceder directamente porque estamos en el mismo paquete.
        System.out.println("Acceso directo a edad (default): " + p.edad);

        // Modificamos directamente la edad por ser default en el mismo paquete:
        p.edad = 25;
        System.out.println("Edad modificada directamente: " + p.edad);

        // 2. Acceso al nombre (private): NO se puede hacer "p.nombre" de forma directa.
        // Si intentaras escribir: System.out.println(p.nombre); -> Daría error de compilación.

        // Para acceder o modificar el atributo privado, usamos obligatoriamente los métodos públicos (get y set):
        System.out.println("Nombre obtenido con getNombre() (private): " + p.getNombre());

        p.setNombre("Lucía");
        System.out.println("Nombre actualizado con setNombre(): " + p.getNombre());

        System.out.println("\nLlamando al método mostrarInformacion():");
        p.mostrarInformacion();
    }
}
