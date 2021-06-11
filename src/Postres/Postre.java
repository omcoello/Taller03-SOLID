package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author omarc
 */
public class Postre implements ManipularAderezo{

    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;

    public Postre() {
        super();
    }

    public Postre(String sabor) {
        this.sabor = sabor;
        this.precioParcial = 0;
        aderezos = new ArrayList<>();
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }

    @Override
    public void anadirAderezo(Object postre, Aderezo aderezo) {
        if(postre.getClass() == Helado.class){
            Helado helado = (Helado) postre;
            helado.getAderezos().add(aderezo);
        }else{
            Pastel pastel = (Pastel) postre;
            pastel.getAderezos().add(aderezo);
        }
    }    

    @Override
    public void quitarAderezo(Object postre, Aderezo aderezo) {
        if(postre.getClass() == Helado.class){
            Helado helado = (Helado) postre;
            helado.getAderezos().remove(aderezo);
        }else{
            Pastel pastel = (Pastel) postre;
            pastel.getAderezos().remove(aderezo);
        }
    }

}
