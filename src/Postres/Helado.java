
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.manipuladorValores;

/**
 *
 * @author Pedro Mendoza
 */

public class Helado extends Postre implements manipuladorValores{

    public Helado(String sabor){
        super(sabor);
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
         
}
