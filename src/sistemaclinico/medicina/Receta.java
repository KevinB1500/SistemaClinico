/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.medicina;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author HP WORKSTATION
 */
public class Receta {
    protected LocalDateTime fecha;
    protected ArrayList<PlanNutricional> planesNutricionales;
    protected ArrayList<Medicamento> medicamentos;

    public Receta(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
