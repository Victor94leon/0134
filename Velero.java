public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor de objetos de la clase Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFabricacion)
    {
        super(matricula,eslora,anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Devuelve el coeficiente de Bernua del Velero
     */
    @Override
    public int getCoeficienteBernua() {
        return numeroMastiles;
    }
    
    /**
     * Devuelve un String con la información
     */
    @Override
    public String toString() {
        return super.toString() + " Nº de mastiles: " + numeroMastiles;
    }
}
