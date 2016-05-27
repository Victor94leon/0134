public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor de objetos de la clase Barco
     */
    public Barco(String matricula, float eslora, int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * Devuelve la matrícula del barco
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Devuelve la eslora del barco
     */
    public float getEslora() {
        return eslora;
    }

    /**
     * Devuelve el año de fabricación del barco
     */
    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    /**
     * Devuelve el coeficiente de Bernua del barco (método abstracto en Barco)
     */
    public abstract int getCoeficienteBernua();

    /**
     * Devuelve un String con la información del objeto
     */
    public String toString() {
        return "Matrícula:" + matricula + " Eslora:" + eslora + " Año de fabricación" + anoFabricacion;
    }
}