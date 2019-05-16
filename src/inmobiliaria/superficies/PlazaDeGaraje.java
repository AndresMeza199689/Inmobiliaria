/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.superficies;

import inmobiliaria.superficies.Superficie;


public class PlazaDeGaraje extends Superficie{
    String tipo;
    String tipoPublicoOPrivado;

    public PlazaDeGaraje(String tipo,String tipoPublicoOPrivado, int precio, String constructora, String ubicacion, int espacio) {
        super(precio, constructora, ubicacion, espacio);
        this.tipoPublicoOPrivado = tipoPublicoOPrivado;
    }
    

    @Override
    public boolean isVendible() {
        return false;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public boolean segundaMano() {
        return false;
    }
}
