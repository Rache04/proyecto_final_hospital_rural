/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalrural;

/**
 *
 * @author Rachel
 */
public class SalaTerapia {
   private String tipoSala;
   private boolean companion;
   private String nombreDirector;
    
    public SalaTerapia (String tipoSala, boolean companion, String nombreDirector){
        this.tipoSala=tipoSala;
        this.companion=companion;
        this.nombreDirector=nombreDirector;
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
