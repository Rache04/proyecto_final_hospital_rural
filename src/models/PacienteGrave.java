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
public class PacienteGrave extends Paciente {
    private int tiempoEstimadoVida;
    private String causa;

    public PacienteGrave(int tiempoEstimadoVida, String causa, String ci, String nombreCompleto, String fechaNacimiento,
            String enfermedad, String fechaIngreso, int tiempoEstimadoPermanencia) {
        super(ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso, tiempoEstimadoPermanencia);
        this.tiempoEstimadoVida = tiempoEstimadoVida;
        this.causa = causa;
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

    @Override
    public String conocerEstado() {
        // TODO Auto-generated method stub

        return "Causa: Enfermedad terminal";
    }

    protected String getNivelGravedad() {
        if (tiempoEstimadoVida > 20) {
            return "Grave";
        } else if (tiempoEstimadoVida >= 10) {
            return "Considerablemente grave";
        } else if (tiempoEstimadoVida >= 5) {
            return "Muy grave";
        } else
            return "Critico";
    }
}
