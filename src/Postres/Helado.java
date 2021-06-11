
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.manipuladorValores;

/**
 *
 * @author Pedro Mendoza
 */

public class Helado extends Postre implements ManipularAderezo, manipuladorValores{

    
    public Helado(String sabor, double precioParcial, ArrayList<Aderezo> aderezos){
        super(sabor, precioParcial,aderezos);
    }
    
    public Helado(){
        super();
        setPrecioParcial(7.85);
    }
    
    @Override
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(getPrecioParcial()+(getPrecioParcial()*0.12))+(getAderezos().size()*0.50);
        return precioFinal;
    }
    

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
    
    @Override
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

    @Override
    public void anadirAderezo(Object postre, Aderezo aderezo) {
        Helado helado = (Helado) postre;
        helado.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezo(Object postre, Aderezo aderezo) {
        Helado helado = (Helado) postre;
        helado.getAderezos().remove(aderezo);
    }

      
}
