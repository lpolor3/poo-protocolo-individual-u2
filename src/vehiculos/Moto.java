package vehiculos;


// La clase Moto hereda de Vehículo dentro del mismo paquete
public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String marca, int velocidadMaxima, int cilindrada) {
        super(marca, velocidadMaxima);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetallesMoto() {
        // Al estar en el mismo paquete 'vehiculos', sí podemos acceder directamente a los miembros default de Vehiculo:
        System.out.println("Moto marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
