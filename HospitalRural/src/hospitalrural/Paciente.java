/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalrural;

/**
 *
 * @author Rachel
 */
public class Paciente {
    private String id;
    private String nombreCompleto;
    private String fechaNacimiento;
    private String enfermedad;
    private String fechaIngreso;
    private int tiempoEstimadoPermanencia;
    
    public Paciente(String id,  String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso, int tiempoEstimadoPermanencia){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.fechaNacimiento=fechaNacimiento;
        this.enfermedad=enfermedad;
        this.fechaIngreso=fechaIngreso;
        this.tiempoEstimadoPermanencia=tiempoEstimadoPermanencia;
    }

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
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
    
    
}
