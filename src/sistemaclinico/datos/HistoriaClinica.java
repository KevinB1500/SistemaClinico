/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.datos;

import java.util.ArrayList;

/**
 *
 * @author HP WORKSTATION
 */
public class HistoriaClinica {
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;

    public HistoriaClinica(int nro) {
        this.nro = nro;
    }
    
    
}
