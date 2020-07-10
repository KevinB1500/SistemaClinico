/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actores;

/**
 *
 * @author Kevin
 */
public class AreaMedica {
    protected String especialidad;
    protected float costo;
    protected Doctor doctor;

    public AreaMedica(String especialidad, float costo, Doctor doctor) {
        this.especialidad = especialidad;
        this.costo = costo;
        this.doctor = doctor;
    }
    
    
}
