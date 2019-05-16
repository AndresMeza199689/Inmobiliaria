/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.superficies;

import inmobiliaria.Inmueble;


public abstract class Superficie implements Inmueble{
    protected int precio;
    String constructora;
    String ubicacion;
    int espacio;

    public Superficie(int precio, String constructora, String ubicacion, int espacio) {
        this.precio = precio;
        this.constructora = constructora;
        this.ubicacion = ubicacion;
        this.espacio = espacio;
    }

   
    

    @Override
    public int precio() {
        return this.espacio;
    }

    @Override
    public String muestra() {
        return "";
    }

    @Override
    public String getConstructora() {
        return this.constructora;
    }

    @Override
    public String getUbicacion() {
        return this.ubicacion;
    }

    @Override
    public int getEspacio() {
        return this.espacio;
    }
}
