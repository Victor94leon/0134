import java.util.ArrayList;
public class Puerto
{
    private static final int NUMERO_AMARRES = 4;
    private ArrayList<Alquiler> alquileres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<Alquiler>();
    }

    /**
     * Añade un alquiler si es posible y devuelve el número de posición asignado
     * (-1 si no se añade)
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco) {
        boolean posicionLibre = false;
        int posicion = 0;
        if(alquileres.size()<NUMERO_AMARRES) {
            int i;   
            boolean posicionOcupada;
            while(posicion<=NUMERO_AMARRES && !posicionLibre) {
                i = 0;
                posicionOcupada = false;
                while(i<alquileres.size() && !posicionOcupada) {
                    if(alquileres.get(i).getPosicion()==posicion) {
                        posicionOcupada = true;
                    }
                    i++;
                }
                if(!posicionOcupada) {
                    alquileres.add(new Alquiler(numeroDias,cliente,barco));
                    alquileres.get(posicion).setPosicion(posicion);
                    posicionLibre = true;
                }
                else {
                    posicion++;
                }          
            }    
        }
        if(!posicionLibre) {
            posicion = -1;
        }
        return posicion; 
    }

    /**
     * Muestra por pantalla el estado de los amarres y el alquiler de cada uno si lo tiene
     */
    public void verEstadoAmarres() {
        System.out.println("****************************************************");
        for(int posicion = 0; posicion<NUMERO_AMARRES; posicion++) {
            int i = 0;
            boolean posicionEncontrada = false;
            while(!posicionEncontrada && i<alquileres.size()) {
                if(alquileres.get(i)!=null) {
                    if(alquileres.get(i).getPosicion()==posicion) {
                        System.out.println("Amarre ["+posicion+"] está ocupado");
                        System.out.println("Precio: " + alquileres.get(i).getCosteAlquiler());
                        posicionEncontrada = true;
                    }
                }
                i++;
            }
            if(!posicionEncontrada) {
                System.out.println("Amarre ["+posicion+"] No está ocupado");
            }
        }
        System.out.println("****************************************************");
    }

    /**
     * Acaba el alquiler de uno de los amarres
     */
    public float liquidarAlquiler(int posicion){
        float valor = -1;
        int i = 0;
        boolean posicionEncontrada = false;
        while(!posicionEncontrada && i<alquileres.size()) {
            if(alquileres.get(i)!=null) {
                if(alquileres.get(i).getPosicion()==posicion) {
                    valor = alquileres.get(i).getCosteAlquiler();
                    alquileres.remove(i);
                    posicionEncontrada = true;
                }
            }
            i++;
        }
        return valor;
    }
}
