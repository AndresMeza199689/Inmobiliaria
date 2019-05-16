package construcciones;

import inmobiliaria.Inmueble;

public abstract class Construcciones implements Inmueble {

    protected boolean tipoNuevaOSegunda;
    protected String ubicacion;
    protected String constructora;
    protected int espacio;

    public Construcciones(boolean tipoNuevaOSegunda, String ubicacion, String constructora, int espacio) {
        this.tipoNuevaOSegunda = tipoNuevaOSegunda;
        this.ubicacion = ubicacion;
        this.constructora = constructora;
        this.espacio = espacio;
    }

    public boolean getTipoNuevaOSegunda() {
        return tipoNuevaOSegunda;
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
