/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actores;

import java.util.Date;

/**
 *
 * @author HP WORKSTATION
 */
public class Persona {
    String usuario;
    String clave;
    String nombre;
    String apellido;
    String cedula;
    String direccion;
    Date fechaNac;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return false;
    }
}
