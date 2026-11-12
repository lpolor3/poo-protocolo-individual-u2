package vehiculos;



    public class Vehiculo {
        // Propiedad con acceso de paquete (default)
        String marca;
        int velocidadMaxima;

        // Constructor con acceso de paquete
        Vehiculo(String marca, int velocidadMaxima) {
            this.marca = marca;
            this.velocidadMaxima = velocidadMaxima;
        }
    }

