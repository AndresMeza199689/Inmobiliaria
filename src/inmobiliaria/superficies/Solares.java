/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.superficies;

import inmobiliaria.superficies.Superficie;


public class Solares extends Superficie{

    public Solares(int precio, String constructora, String ubicacion, int espacio) {
        super(precio, constructora, ubicacion, espacio);
    }
    @Override
    public int precio(){
        return this.precio;
    }
    @Override
    public String muestra(){
        return "tipo solar :constructora "+this.getConstructora()+": precio "+this.precio+": ubicacion "+this.getUbicacion()+": espacio "+this.getEspacio(); 
    }

    @Override
    public boolean isVendible() {
        return true;
    }

    @Override
    public String getTipo() {
        return "solar";
    }

    @Override
    public boolean segundaMano() {
        return true;
    }
}
