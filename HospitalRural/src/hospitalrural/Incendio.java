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
public class Incendio {
    private int gradoQuemaduras;
    private String lugarAfectado;
    
    public Incendio(int gradoQuemaduras, String lugarAfectado){
        this.gradoQuemaduras=gradoQuemaduras;
        this.lugarAfectado=lugarAfectado;
    }

    public int getGradoQuemaduras() {
        return gradoQuemaduras;
    }

    public String getLugarAfectado() {
        return lugarAfectado;
    }

    public void setGradoQuemaduras(int gradoQuemaduras) {
        this.gradoQuemaduras = gradoQuemaduras;
    }

    public void setLugarAfectado(String lugarAfectado) {
        this.lugarAfectado = lugarAfectado;
    }
    
    
}
