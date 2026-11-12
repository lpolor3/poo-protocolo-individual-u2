package taller6;

// 2. La clase Gerente hereda de Empleado
public class Gerente extends Empleado {
    protected String departamento; // Propiedad adicional

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la clase padre
        this.departamento = departamento;
    }

    // 3. Sobrescribimos el método mostrarInformacion para incluir los detalles del gerente
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra nombre y salario gracias al acceso protected
        System.out.println("Departamento a cargo: " + departamento);
    }
}
