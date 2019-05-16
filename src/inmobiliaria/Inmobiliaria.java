/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import construcciones.Locales;
import construcciones.Vivienda;
import inmobiliaria.superficies.PlazaDeGaraje;
import inmobiliaria.superficies.Solares;
import java.util.ArrayList;


public class Inmobiliaria {
    private static ArrayList<Inmueble> ventas;
    private static ArrayList<Inmueble> alquiler;

    public static boolean anadirVentaInmueble(Inmueble m){
        if(m.isVendible()){
            if(!ventas.contains(m)){
                ventas.add(m);
                return true;
            }
            return false;
        }
        return false;
    }
    public static boolean anadirAlquilerInmueble(Inmueble m){
        if(!m.isVendible()){
            if(!alquiler.contains(m)){
                alquiler.add(m);
                return true;
            }
            return false;
        }
        return false;
    }
    public static void imueblesVentas(int precio){

        for (int i = 0; i < ventas.size(); i++) {
            if(Inmobiliaria.ventas.get(i).precio()<precio)
                System.out.println(i+") "+ventas.get(i).muestra());
        }
    }
    public void localesSegundaMano(int metros){
        for (int i = 0; i < ventas.size(); i++) {
            if(ventas.get(i).getTipo().equals("local")&& ventas.get(i).getEspacio()>metros &&ventas.get(i).segundaMano()==true)
                System.out.println(i+") "+alquiler.get(i).muestra());
        }
    }
    public static void main(String[] args) {
        ventas=new ArrayList<>();
        alquiler=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ventas.add(new Vivienda("vivienda", true, i, i, i, true, "santa marta", "ideas", i));
        }
        for (int i = 0; i < 2; i++) {
            ventas.add(new Solares(i, "para cualquier lugar", "gaira", i) );
        }
        imueblesVentas(12);
        for (int i = 0; i < 2; i++) {
            alquiler.add(new Locales(true, i, true, "jose vive", "construyendo vida", i, "local"));
        }
        for (int i = 0; i < 2; i++) {
            alquiler.add(new PlazaDeGaraje("plaza", "si", i, "vive libre", "solo casa", i));
        }
    }
    
}
