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

    public Postre(String sabor, double precioParcial) {
        this.sabor = sabor;
        this.precioParcial = precioParcial;        
    }
    
    public static void anadirAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    public static void anadirAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().remove(aderezo);
    }
}
