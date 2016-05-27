public class EmbarcacionDeportiva extends Barco
{
    private int potencia;

    /**
     * Constructor de objetos de la clase EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anoFabricacion)
    {
        super(matricula,eslora,anoFabricacion);
        this.potencia = potencia;
    }
    
    /**
     * Devuelve el coeficiente de Bernua de la embarcación deportiva
     */
    @Override
    public int getCoeficienteBernua() {
        return potencia;
    }
    
    /**
     * Devuelve un Stringcon la información del objeto
     */
    @Override
    public String toString() {
        return toString() + " Potencia:" + potencia;
    }
}
