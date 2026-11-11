public class CuentaSecreta {
    // Atributo privado sin getters ni setters
    private String pinSecreto;

    public CuentaSecreta(String pinSecreto) {
        this.pinSecreto = pinSecreto;
    }

    /*
     * DISCUSIÓN / RESPUESTA PARA EL PUNTO 2:
     * ¿Cómo afecta la protección de datos si no se implementan get y set?
     *
     * - Desde el punto de vista de la seguridad estricta, el dato queda totalmente
     *   oculto e inaccesible desde el exterior (máxima protección).
     * - Sin embargo, desde el punto de vista funcional, si la clase no provee un
     *   método get o set controlado, los objetos de esta clase se vuelven prácticamente
     *   inútiles para el resto del sistema, ya que ni siquiera el propio propietario
     *   podrá consultar o modificar su valor de forma legítima (a menos que se use
     *   dentro de la misma clase).
     */
}
