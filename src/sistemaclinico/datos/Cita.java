/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.datos;
import actores.Paciente;
import java.time.LocalDateTime;
import sistemapago.Pago;
/**
 *
 * @author HP WORKSTATION
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registrado;
    protected Paciente paciente;

    public Cita(LocalDateTime fecha, boolean pagada, String registrado, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registrado = registrado;
        this.paciente = paciente;
    }
    
    public void realizarPago(Pago pago){
        
    }
}
