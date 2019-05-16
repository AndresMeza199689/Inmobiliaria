/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construcciones;




public class Vivienda extends Construcciones{
    int precio;
    int numeroDeHabitaciones;
    int piso;
    boolean sw;
    String tipo;

    public Vivienda(String tipo,boolean sw,int precio, int numeroDeHabitaciones, int piso, boolean tipoNuevaOSegunda, String ubicacion, String constructora, int espacio) {
        super(tipoNuevaOSegunda, ubicacion, constructora, espacio);
        this.precio = precio;
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.piso = piso;
        this.sw=sw;
    }
    
    
    @Override
    public int precio(){
        return this.precio;
    }
  
    @Override
    public String muestra(){
        return "tipo vivienda :constructora "+this.getConstructora()+": precio "+this.precio+": numero de pisos "+this.piso+": ubicacion "+this.ubicacion+": espacio "+this.getEspacio(); 
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
