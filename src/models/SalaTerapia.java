/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.ArrayList;

/**
 *
 * @author Rachel
 */
public class SalaTerapia extends Sala{
   private String tipoSala;
   private boolean companion;
   private String nombreDirector;

    public SalaTerapia(String tipoSala, boolean companion, String nombreDirector, String nombre, ArrayList<String> enfermedades, int cantMaximaCamas, int camasOcupadas, ArrayList<Paciente> pacientes) {
        super(nombre, enfermedades, cantMaximaCamas, camasOcupadas, pacientes);
        this.tipoSala = tipoSala;
        this.companion = companion;
        this.nombreDirector = nombreDirector;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public boolean isCompanion() {
        return companion;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public void setCompanion(boolean companion) {
        this.companion = companion;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    
    
    
}
