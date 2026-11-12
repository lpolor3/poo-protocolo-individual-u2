package taller4;

public class Coche {// 1. Todas las propiedades deben ser privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor para inicializar el coche
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidadMaxima(velocidadMaxima);
    }

    // Métodos Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    // 2. Método acelerar que incrementa velocidadMaxima solo si el incremento es positivo
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Vehículo acelerando. Nueva velocidad máxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento de velocidad debe ser positivo.");
        }
    }
}
