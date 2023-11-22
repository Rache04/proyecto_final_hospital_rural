
package Vistas;

public class ValidarCampos {
    public static boolean comprobarCamposTexto(String a){
        if (a.matches("^(?i)[a-zñ]+$")) {
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
    
    public static int convertirEntero(String a){
        int aux = Integer.parseInt(a);
        return aux;
    }
    
    public static boolean rangoNumero(int numero, int desde, int hasta){
        if (desde >= numero || numero <= hasta) {
            return true;
        }else{
            return false;
        }
    }
}
