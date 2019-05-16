/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construcciones;


public class Locales  extends Construcciones{
    int precio;
    String  tipo;
    boolean sw;
    

    public Locales(boolean sw,int precio, boolean tipoNuevaOSegunda, String ubicacion, String constructora, int espacio,String tipo ) {
        super(tipoNuevaOSegunda, ubicacion, constructora, espacio);
        this.precio = precio;
        this.tipo=tipo;
        this.sw=sw;
    }

    
    
    

    @Override
    public int precio() {
        return this.precio;
    }

    @Override
    public String muestra() {
        return ""+this.constructora+" "+this.tipo+" "+ubicacion;
    }

    @Override
    public boolean isVendible() {
        return this.sw;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public boolean segundaMano() {
        return this.tipoNuevaOSegunda;
    }
}
