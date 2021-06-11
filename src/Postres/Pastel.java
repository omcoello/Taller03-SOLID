package Postres;

import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre implements ManipularAderezo{

    public Pastel(){
        super();
        this.setPrecioParcial(15.55);
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(getPrecioParcial()+(getPrecioParcial()*0.12))+(getAderezos().size()*0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

    @Override
    public void anadirAderezo(Object postre, Aderezo aderezo) {
        Pastel pastel = (Pastel) postre;
        pastel.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezo(Object postre, Aderezo aderezo) {
        Pastel pastel = (Pastel) postre;
        pastel.getAderezos().remove(aderezo);
    }
    
}
