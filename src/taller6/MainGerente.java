package taller6;


public class MainGerente {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 6: MODIFICADOR PROTECTED ---");

        // Instanciamos un objeto Gerente
        Gerente gerente1 = new Gerente("Laura Martínez", 5500000.0, "Desarrollo de Software");

        // Mostramos la información utilizando el método sobrescrito
        gerente1.mostrarInformacion();
    }
}
