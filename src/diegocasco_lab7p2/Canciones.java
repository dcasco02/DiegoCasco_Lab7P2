/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7p2;

import java.util.Date;

/**
 *
 * @author dcasc
 */
public class Canciones {
    private String nombre;
    private Date fechalanzamiento;

    public Canciones() {
    }

    public Canciones(String nombre, Date fechalanzamiento) {
        this.nombre = nombre;
        this.fechalanzamiento = fechalanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", fechalanzamiento=" + fechalanzamiento + '}';
    }
    
}