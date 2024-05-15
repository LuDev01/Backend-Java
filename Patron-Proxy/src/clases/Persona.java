package clases;

import java.util.Date;

public class Persona {
    private String nombre;
    private int cedula;
    private Date fechaVacuna;
    private String nombreVacuna;

    public Persona(String nombre, int cedula, Date fechaVacuna, String nombreVacuna) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaVacuna = fechaVacuna;
        this.nombreVacuna=nombreVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Date getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }
}
