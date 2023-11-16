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
public class Asfixia extends PacienteGrave{
    private String causa;
    private String nombreSustancia;
    private boolean faltaOxigeno;

    public Asfixia( String nombreSustancia, boolean faltaOxigeno, int tiempoEstimadoVida, String causa, String ci, String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso, int tiempoEstimadoPermanencia) {
        super(tiempoEstimadoVida, causa, ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso, tiempoEstimadoPermanencia);
        this.causa = causa;
        this.nombreSustancia = nombreSustancia;
        this.faltaOxigeno = faltaOxigeno;
    }

    public String getCausa() {
        return causa;
    }

    public String getNombreSustancia() {
        return nombreSustancia;
    }

    public boolean isFaltaOxigeno() {
        return faltaOxigeno;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public void setNombreSustancia(String nombreSustancia) {
        this.nombreSustancia = nombreSustancia;
    }

    public void setFaltaOxigeno(boolean faltaOxigeno) {
        this.faltaOxigeno = faltaOxigeno;
    }
    
    
}
