/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actores;

import java.util.ArrayList;
import java.util.Date;
import sistemaclinico.datos.HistoriaClinica;
import sistemaclinico.medicina.Receta;

/**
 *
 * @author HP WORKSTATION
 */
public class Paciente extends Persona {
    String email;
    protected ArrayList<Receta> recetas;
    protected ArrayList<HistoriaClinica> historial;
    
    public Paciente(String email, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email = email;
    }
    
    public boolean solicitarCita(){
        return true;
    }
}
