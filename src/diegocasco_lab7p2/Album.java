/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7p2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dcasc
 */
public class Album {
    private String titulo;
    private Date fechalanzamiento;
    private int conteolikes;
    private int cantidadcanciones;
    private ArrayList <Canciones> cancionesalbum=new ArrayList();

    public Album() {
    }

    public Album(String titulo, Date fechalanzamiento, int conteolikes) {
        this.titulo = titulo;
        this.fechalanzamiento = fechalanzamiento;
        this.conteolikes = conteolikes;
        this.cantidadcanciones = cantidadcanciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public int getConteolikes() {
        return conteolikes;
    }

    public void setConteolikes(int conteolikes) {
        this.conteolikes = conteolikes;
    }

    public ArrayList<Canciones> getCancionesalbum() {
        return cancionesalbum;
    }

    public void setCancionesalbum(ArrayList<Canciones> cancionesalbum) {
        this.cancionesalbum = cancionesalbum;
    }

    public int getCantidadcanciones() {
        return cantidadcanciones;
    }

    public void setCantidadcanciones(int cantidadcanciones) {
        this.cantidadcanciones = cantidadcanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "titulo=" + titulo + ", fechalanzamiento=" + fechalanzamiento + ", conteolikes=" + conteolikes + ", cancionesalbum=" + cancionesalbum + '}';
    }
    
    
}
