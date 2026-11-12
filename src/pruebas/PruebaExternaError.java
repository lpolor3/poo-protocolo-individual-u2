package pruebas;


import vehiculos.Vehiculo;

public class PruebaExternaError {
    public static void main(String[] args) {
        System.out.println("--- INTENTO DE ACCESO INVÁLIDO DESDE OTRO PAQUETE ---");

        // Intentamos instanciar o acceder a un miembro con modificador default desde el paquete 'pruebas':
        Vehiculo v = new Vehiculo("Chevrolet", 160);
        // ❌ Error 1: El constructor con acceso default no es visible desde 'pruebas'.

        System.out.println(v.marca);
        // ❌ Error 2: El atributo 'marca' tiene acceso default y no puede ser leído fuera de su paquete.
    }
}
