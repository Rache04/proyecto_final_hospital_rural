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
public class Envenenamiento extends PacienteGrave {
    private String nombreSustancia;
    private boolean intencionado;

    public Envenenamiento(String nombreSustancia, boolean intencionado, int tiempoEstimadoVida, String causa, String ci,
            String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso,
            int tiempoEstimadoPermanencia) {
        super(tiempoEstimadoVida, causa, ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso,
                tiempoEstimadoPermanencia);
        this.nombreSustancia = nombreSustancia;
        this.intencionado = intencionado;
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

    @Override
    public String conocerEstado() {
        // TODO Auto-generated method stub
        return "Ingestiòn de " + nombreSustancia + " " + getNivelGravedad();
    }

}
