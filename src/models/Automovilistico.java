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
public class Automovilistico extends PacienteGrave {
    protected boolean chofer;

    public Automovilistico(boolean chofer, int tiempoEstimadoVida, String causa, String ci, String nombreCompleto,
            String fechaNacimiento, String enfermedad, String fechaIngreso, int tiempoEstimadoPermanencia) {
        super(tiempoEstimadoVida, causa, ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso,
                tiempoEstimadoPermanencia);
        this.chofer = chofer;
    }

    public boolean isChofer() {
        return chofer;
    }

    public void setChofer(boolean chofer) {
        this.chofer = chofer;
    }

    @Override
    public String conocerEstado() {
        // TODO Auto-generated method stub
        return "Accidente automovilìstico " + getNivelGravedad();
    }

}
