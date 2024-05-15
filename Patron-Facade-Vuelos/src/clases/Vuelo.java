package clases;

import java.util.Date;

public class Vuelo {
    public Date fechaSalida;
    public Date fechaRegreso;
    public String ciudad;

    public Vuelo(Date fechaSalida, Date fechaRegreso, String ciudad) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.ciudad = ciudad;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public String getCiudad() {
        return ciudad;
    }
}
