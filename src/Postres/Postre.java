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
    
    public Postre(String sabor){
        this.sabor = sabor;
        this.precioParcial = 0;
        aderezos = new ArrayList<>();
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
    
}
