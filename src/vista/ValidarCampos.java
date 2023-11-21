/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author Gabriel
 */
public class ValidarCampos {
  public static boolean comprobarCamposTexto(String a){
        if (a.matches("^(?i)[a-z]+$")) {
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean comprobarCamposNumericos(String a){
        if (a.matches("^[0-9]+$")) {
            return true;
        }else{
            return false;
        }
    }
    
}
