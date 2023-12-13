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
public class Asfixia extends PacienteGrave {
    protected boolean sustanciaToxica;
    protected String nombreSustancia;
    protected boolean faltaOxigeno;

    public Asfixia(String nombreSustancia, boolean faltaOxigeno, int tiempoEstimadoVida, boolean sustanciaToxica, String ci,
            String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso,
            int tiempoEstimadoPermanencia, String causa) {
        super(tiempoEstimadoVida, causa, ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso,
                tiempoEstimadoPermanencia);
        this.sustanciaToxica = sustanciaToxica;
        this.nombreSustancia = nombreSustancia;
        this.faltaOxigeno = faltaOxigeno;
    }

    public boolean getSustanciaToxica() {
        return sustanciaToxica;
    }

    public String getNombreSustancia() {
        return nombreSustancia;
    }

    public boolean isFaltaOxigeno() {
        return faltaOxigeno;
    }

    public void setSustanciaToxica(boolean sustanciaToxica) {
        this.sustanciaToxica = sustanciaToxica;
    }

    public void setNombreSustancia(String nombreSustancia) {
        this.nombreSustancia = nombreSustancia;
    }

    public void setFaltaOxigeno(boolean faltaOxigeno) {
        this.faltaOxigeno = faltaOxigeno;
    }

    @Override
    public String conocerEstado() {
        // TODO Auto-generated method stub
        if (isFaltaOxigeno()) {
            return "Asfixia por falta de oxìgeno " + getNivelGravedad();
        } else {
            return "Asfixia por aspirar " + nombreSustancia + " " + getNivelGravedad();
        }
    }

}
