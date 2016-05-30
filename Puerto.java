public class Puerto
{
    private static final int NUMERO_AMARRES = 4;
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Añade un alquiler si es posible y devuelve el número de posición asignado
     * (-1 si no se añade)
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco) {
        int i = 0;
        boolean addBarco = false;
        while(!addBarco || i<amarres.length) {
            if(amarres[i] == null) {
                amarres[i] = new Alquiler(numeroDias,cliente,barco);
                addBarco = true;
            }
            else {
                i++;
            }
        }
        if(!addBarco) {
            i = -1;
        }
        return i;    
    }

    /**
     * Muestra por pantalla el estado de los amarres y el alquiler de cada uno si lo tiene
     */
    public void verEstadoAmarres() {
        for(int i = 0; i<amarres.length; i++) {
            System.out.println("Amarre " + i + ":");
            if(amarres[i] == null) {
                System.out.println("No está ocupado");
            }
            else {
                System.out.println("Ocupado");
                System.out.println("Precio: " + amarres[i].getCosteAlquiler());
            }
        }
    }
    
    /**
     * Acaba el alquiler de uno de los amarres
     */
    public float liquidarAlquiler(int posicion){
        float precio = amarres[posicion].getCosteAlquiler();
        amarres[posicion] = null;
        return precio;
    }
}
