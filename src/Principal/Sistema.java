package Principal;
import Adicionales.Aderezo;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        
        /*
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        //OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
       // OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        //mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        //quitar aderezo se implementa hya eu son estativos 
        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, "crema");
        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, "frutilla");
        System.out.println(pastel_chocolate);
        //mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());
        */

        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        ArrayList<Aderezo> aderezos = new ArrayList<>();
        aderezos.add(new Aderezo("Crema") {
            @Override
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        });
        
        aderezos.add(new Aderezo("Frutilla") {
            @Override
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        });
        arrPostres.forEach(postre -> {
            //Agregando crema
            postre.anadirAderezo(postre,aderezos.get(0));
            //Agregando frutilla
            postre.anadirAderezo(postre,aderezos.get(1));
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(new LecheDescremada(), postre);  
            
            if(postre instanceof Pastel){
                Pastel pastel = (Pastel) postre;
            System.out.println(pastel.showPrecioFinal());
            }else{
                Helado helado = (Helado) postre;
            System.out.println(helado.showPrecioFinal());    
            }
        });        
        
    }
}

