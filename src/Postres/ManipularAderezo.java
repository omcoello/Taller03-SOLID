package Postres;

import Adicionales.Aderezo;

/**
 *
 * @author omarc
 */
public interface ManipularAderezo {
    
    public void anadirAderezo(Object postre, Aderezo aderezo);
    public void quitarAderezo(Object postre, Aderezo aderezo);
}
