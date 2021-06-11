package Postres;

import Adicionales.Aderezo;
import Procesos.manipuladorValores;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre implements ManipularAderezo, manipuladorValores {

    public Pastel() {
        super();
        this.setPrecioParcial(15.55);
    }

    public Pastel(String sabor) {
        super(sabor);
        this.setPrecioParcial(15.55);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal = (getPrecioParcial() + (getPrecioParcial() * 0.12)) + (getAderezos().size() * 0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }

    @Override
    public String showPrecioFinal() {
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
