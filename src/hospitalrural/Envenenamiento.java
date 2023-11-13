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
public class Envenenamiento {
    private String nombreSustancia;
    private boolean intencionado;
    
    public Envenenamiento(String nombreSustancia, boolean intencionado){
        this.nombreSustancia=nombreSustancia;
        this.intencionado=intencionado;
    }

    public String getNombreSustancia() {
        return nombreSustancia;
    }

    public boolean isIntencionado() {
        return intencionado;
    }

    public void setNombreSustancia(String nombreSustancia) {
        this.nombreSustancia = nombreSustancia;
    }

    public void setIntencionado(boolean intencionado) {
        this.intencionado = intencionado;
    }
    
}
