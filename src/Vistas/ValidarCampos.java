package Vistas;

import controllers.HospitalRural;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.Sala;

public class ValidarCampos {

    public static boolean comprobarCamposTexto(String a) throws NullPointerException{
        for (char c : a.toCharArray()) {
            if (!Character.isWhitespace(c) && !Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarCamposNumericos(String a) throws NullPointerException{
        if (a.matches("^[0-9]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertirEntero(String a) throws NumberFormatException{
        int aux = Integer.parseInt(a);
        return aux;
    }

    public static boolean rangoNumero(int numero, int desde, int hasta) throws NullPointerException, NumberFormatException{
        if (desde >= numero || numero <= hasta) {
            return true;
        } else {
            return false;
        }
    }

    public static void cleardField(JTextField txt) {
        txt.setText("");
    }

    public static void cleardField(JComboBox combo, String texto) {
        combo.setSelectedItem(texto);
    }

    public static void cleardField(JCheckBox check, boolean set) {
        check.setSelected(set);
    }

    public static void cleardField(DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public static void cleardField(List<String> str) {
        str.clear();
    }

    public static Sala buscarSalaPorNombre(String nombreSala, HospitalRural hospital) {
        for(Sala aux : hospital.getSalas()){
            if (aux.getNombre().equals(nombreSala)) {
                return aux;
            }
        }
        return null;
    }
}
