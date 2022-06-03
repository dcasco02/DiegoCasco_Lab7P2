/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7p2;

/**
 *
 * @author dcasc
 */
public class Usuarios {
    private String usuario;
    private String password;
    private int edad;
    private String tipo;

    public Usuarios() {
    }

    public Usuarios(String usuario, String password, int edad, String tipo) {
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", password=" + password + ", edad=" + edad + ", tipo=" + tipo + '}';
    }
    
}
