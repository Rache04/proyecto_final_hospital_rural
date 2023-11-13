/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Rachel
 */
public class PacienteEstable {
    private int tiempoDetectadaEnfermedad;
    private String tratamientoPosible;
    
    public PacienteEstable(int tiempoDetectadaEnfermedad, String tratamientoPosible){
        this.tiempoDetectadaEnfermedad=tiempoDetectadaEnfermedad;
        this.tratamientoPosible=tratamientoPosible;
    }

    public int getTiempoDetectadaEnfermedad() {
        return tiempoDetectadaEnfermedad;
    }

    public String getTratamientoPosible() {
        return tratamientoPosible;
    }

    public void setTiempoDetectadaEnfermedad(int tiempoDetectadaEnfermedad) {
        this.tiempoDetectadaEnfermedad = tiempoDetectadaEnfermedad;
    }

    public void setTratamientoPosible(String tratamientoPosible) {
        this.tratamientoPosible = tratamientoPosible;
    }
    
}
