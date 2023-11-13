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
public class PacienteGrave {
    private int tiempoEstimadoVida;
    private String causa;
    
    public PacienteGrave(int tiempoEstimadoVida, String causa){
        this.tiempoEstimadoVida=tiempoEstimadoVida;
        this.causa=causa;
    }

    public int getTiempoEstimadoVida() {
        return tiempoEstimadoVida;
    }

    public String getCausa() {
        return causa;
    }

    public void setTiempoEstimadoVida(int tiempoEstimadoVida) {
        this.tiempoEstimadoVida = tiempoEstimadoVida;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
    
}
