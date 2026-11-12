package taller4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS FINALES: TALLER 4 POO ===\n");

        // 1. Probar la clase taller4.Estudiante
        System.out.println("--- 1. Clase taller4.Estudiante ---");
        Estudiante est = new Estudiante("Luis", 20, 4.5);
        System.out.println("taller4.Estudiante: " + est.getNombre() + " | Nota: " + est.getNotaPromedio());

        System.out.println("\n-----------------------------------\n");

        // 2. Probar la clase taller4.Coche
        System.out.println("--- 2. Clase taller4.Coche ---");
        Coche miCoche = new Coche("Toyota", "Corolla", 180);
        System.out.println("taller4.Coche: " + miCoche.getMarca() + " " + miCoche.getModelo());
        miCoche.acelerar(30);

        System.out.println("\n-----------------------------------\n");

        // 3. Probar la clase taller4.CuentaSecreta (Ejercicio 3)
        System.out.println("--- 3. Clase taller4.CuentaSecreta (Uso incorrecto / Restricción) ---");
        CuentaSecreta cuenta = new CuentaSecreta("1234");
        System.out.println("Objeto taller4.CuentaSecreta creado exitosamente.");

        /*
         * ===================================================================
         * DEMOSTRACIÓN DE ERROR DE COMPILACIÓN (Punto 1 del Ejercicio 3):
         * Si intentas descomentar las siguientes líneas, Java arrojará un error
         * de compilación porque 'pinSecreto' es privado y no se puede leer
         * ni modificar directamente desde la clase taller4.Main:
         * ===================================================================
         *
         * System.out.println(cuenta.pinSecreto); // Error: pinSecreto has private access
         * cuenta.pinSecreto = "9999";           // Error: pinSecreto has private access
         */
    }
}