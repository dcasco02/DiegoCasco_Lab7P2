/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7p2;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Artista extends Usuarios{
    private String nombreartista;
    private ArrayList <Canciones> cancione=new ArrayList();
    private ArrayList <Album> albumes=new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nombreartista, String usuario, String password, int edad, String tipo) {
        super(usuario, password, edad, tipo);
        this.nombreartista = nombreartista;
    }

    public String getNombreartista() {
        return nombreartista;
    }

    public void setNombreartista(String nombreartista) {
        this.nombreartista = nombreartista;
    }

    public ArrayList<Canciones> getCancione() {
        return cancione;
    }

    public void setCancione(ArrayList<Canciones> cancione) {
        this.cancione = cancione;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombreartista=" + nombreartista + ", cancione=" + cancione + ", albumes=" + albumes + '}';
    }
    
}
