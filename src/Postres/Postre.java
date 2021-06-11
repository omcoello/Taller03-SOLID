package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author omarc
 */
public class Postre {

    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre() {
        super();
    }

    public Postre(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
        this.sabor = sabor;
        this.precioParcial = precioParcial;
        this.aderezos = aderezos;
    }


    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
/*
    
    public void anadirAderezoHelado(Object postre, Aderezo aderezo) {
        if (postre.getClass() == Pastel.class) {
            Pastel.getAderezos().add(aderezo);
        } else {
            Helado.getAderezos().add(aderezo);
        }

    }

    

    public static void quitarAderezoHelado(Helado helado, Aderezo aderezo) {
        helado.getAderezos().remove(aderezo);
    }

    public static void anadirAderezoPastel(Pastel pastel, Aderezo aderezo) {
        pastel.getAderezos().add(aderezo);
    }

    public static void quitarAderezoPastel(Pastel pastel, Aderezo aderezo) {
        pastel.getAderezos().remove(aderezo);
    }
*/
}
