package taller5;



    // 4. Clase de prueba dentro del mismo paquete
    public class MainTaller5 {
        public static void main(String[] args) {
            System.out.println("--- PRUEBA DEL MODIFICADOR DE PAQUETE (DEFAULT) ---");

            // Creamos un objeto usando el constructor con acceso de paquete
            Producto producto1 = new Producto("Laptop Gamer", 3500000.0, 10);

            // Verificamos que podemos acceder directamente a los miembros (por estar en el mismo paquete)
            System.out.println("Acceso directo desde MainTaller5 (mismo paquete):");
            System.out.println("Nombre: " + producto1.nombre);
            System.out.println("Precio: " + producto1.precio);
            System.out.println("Stock: " + producto1.stock);

            System.out.println("\nLlamando al método mostrarInfo():");
            producto1.mostrarInfo();
        }
    }

