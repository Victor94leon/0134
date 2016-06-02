public class Alquiler
{
    private Cliente cliente;
    private int numeroDias;
    private Barco barco;
    private int posicion;
    static final private int VALOR_FIJO_ALQUILER = 300;
    static final private int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor de objetos de la clase Alquiler
     */
    public Alquiler(int numeroDias,Cliente cliente, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;
        posicion = -1;
    }

    /**
     * Devuelve un String con la información del objeto
     */
    public String toString() {
        return "Nº días:" + numeroDias + " " + cliente.toString() + " " + barco.toString();
    }

    /**
     * Devuelve el coste del alquiler
     */
    public float getCosteAlquiler() {
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) 
        + VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua();
    }
    
    /**
     * Devuelvela posición del alquiler
     */
    public int getPosicion() {
        return posicion;
    }
    
    /**
     * Inserta un nuevo valor en posicion
     */
    public void setPosicion(int nuevaPosicion) {
        posicion = nuevaPosicion;
    }
}