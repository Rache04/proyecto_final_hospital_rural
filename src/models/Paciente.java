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
public class Paciente {
    protected String ci;
    protected String nombreCompleto;
    protected String fechaNacimiento;
    protected String enfermedad;
    protected String fechaIngreso;
    protected int tiempoEstimadoPermanencia;

    public Paciente(String ci, String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso,
            int tiempoEstimadoPermanencia) {
        this.ci = ci;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.enfermedad = enfermedad;
        this.fechaIngreso = fechaIngreso;
        this.tiempoEstimadoPermanencia = tiempoEstimadoPermanencia;
    }

    public String getCi() {
        return ci;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public int getTiempoEstimadoPermanencia() {
        return tiempoEstimadoPermanencia;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setTiempoEstimadoPermanencia(int tiempoEstimadoPermanencia) {
        this.tiempoEstimadoPermanencia = tiempoEstimadoPermanencia;
    }

    public String conocerEstado() {
        return "";
    }

    @Override
    public String toString() {
        return "Paciente [ci=" + ci + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
                + ", enfermedad=" + enfermedad + ", fechaIngreso=" + fechaIngreso + ", tiempoEstimadoPermanencia="
                + tiempoEstimadoPermanencia + "]";
    }

    
}
