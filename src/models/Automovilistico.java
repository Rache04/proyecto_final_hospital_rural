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
public class Automovilistico {
    private boolean chofer;
    
    public Automovilistico(boolean chofer){
        this.chofer=chofer;
        
    }

    public boolean isChofer() {
        return chofer;
    }

    public void setChofer(boolean chofer) {
        this.chofer = chofer;
    }
    
}
