public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;

    /**
     * Constructor de objetos de la clase Yate
     */
    public Yate(int camarotes,int potencia, String matricula, float eslora, int anoFabricacion)
    {
        super(potencia,matricula,eslora,anoFabricacion);
        this.camarotes = camarotes;
    }

    /**
     * Devuelve el coeficiente de Bernua del yate
     */
    @Override
    public int getCoeficienteBernua() {
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * Devuelve un String ocn la información del objeto
     */
    @Override
    public String toString() {
        return super.toString() + " Camarotes:" + camarotes;
    }
}
