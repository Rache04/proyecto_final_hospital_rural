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
public class Incendio extends PacienteGrave {
    private int gradoQuemaduras;
    private String lugarAfectado;

    public Incendio(int gradoQuemaduras, String lugarAfectado, int tiempoEstimadoVida, String causa, String ci,
            String nombreCompleto, String fechaNacimiento, String enfermedad, String fechaIngreso,
            int tiempoEstimadoPermanencia) {
        super(tiempoEstimadoVida, causa, ci, nombreCompleto, fechaNacimiento, enfermedad, fechaIngreso,
                tiempoEstimadoPermanencia);
        this.gradoQuemaduras = gradoQuemaduras;
        this.lugarAfectado = lugarAfectado;
    }

    public int getGradoQuemaduras() {
        return gradoQuemaduras;
    }

    public String getLugarAfectado() {
        return lugarAfectado;
    }

    public void setGradoQuemaduras(int gradoQuemaduras) {
        this.gradoQuemaduras = gradoQuemaduras;
    }

    public void setLugarAfectado(String lugarAfectado) {
        this.lugarAfectado = lugarAfectado;
    }

    @Override
    public String conocerEstado() {
        // TODO Auto-generated method stub
        return "Quemadura de " + gradoQuemaduras + " grado " + getNivelGravedad();
    }

}
