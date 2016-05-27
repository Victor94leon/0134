public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor de objetos de la clase Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Devuelve el nombre del lciente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el dni del cliente
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Devuelve un Stringcon la información del objeto
     */
    public String toString() {
        return "Nombre:" + nombre + " DNI:" + dni;
    }
}
