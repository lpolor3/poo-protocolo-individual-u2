package vehiculos;


public class MainPruebaExterna {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE RESTRICCIÓN DE PAQUETE (DEFAULT) ---");

        Vehiculo v = new Vehiculo("Mazda", 180);
        Moto m = new Moto("Yamaha", 140, 150);

        // INTENTO 1: Acceder a un atributo con modificador default desde otro paquete.
        // DESCOMENTAR LA SIGUIENTE LÍNEA GENERARÁ UN ERROR DE COMPILACIÓN:
        // System.out.println(v.marca);
        // Error esperado: "marca is not public in Vehiculo; cannot be accessed from outside package"

        // INTENTO 2: Llamar al método de la moto que sí funciona internamente:
        m.mostrarDetallesMoto();
    }
}
