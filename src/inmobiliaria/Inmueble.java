/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;


public interface Inmueble {
    public int precio();
    public String muestra();
    public String getConstructora();
    public String getUbicacion();
    public int getEspacio();
    public boolean isVendible();
    public String getTipo();
    public boolean segundaMano();
}
