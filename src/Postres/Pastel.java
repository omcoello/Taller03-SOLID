/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.manipuladorValores;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel implements manipuladorValores{
    private String sabor;
    private double precioParcial;
    private ArrayList<String> aderezos;
    
    public Pastel(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<String> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}
