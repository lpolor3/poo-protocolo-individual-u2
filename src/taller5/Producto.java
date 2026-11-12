package taller5;


    public class Producto {
        // 1. Propiedades con acceso de paquete (default: sin public ni private)
        String nombre;
        double precio;
        int stock;

        // 2. Constructor con acceso de paquete que inicializa todas las propiedades
        Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        // 3. Método mostrarInfo() con acceso de paquete (default)
        void mostrarInfo() {
            System.out.println("Producto: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Stock disponible: " + stock + " unidades");
        }
    }
