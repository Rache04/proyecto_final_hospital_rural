/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.ArrayList;

/**
 *
 * @author Rachel
 */
public class Sala {
    protected String nombre;
    protected ArrayList<String> enfermedades;
    protected int cantMaximaCamas;
    protected ArrayList<Paciente> pacientes;

    public Sala(String nombre, ArrayList<String> enfermedades, int cantMaximaCamas, ArrayList<Paciente> pacientes) {
        this.nombre = nombre;
        this.enfermedades = enfermedades;
        this.cantMaximaCamas = cantMaximaCamas;
        this.pacientes = pacientes;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public int getCantMaximaCamas() {
        return cantMaximaCamas;
    }

    public int getCamasOcupadas() {
        return pacientes.size();
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public void setCantMaximaCamas(int cantMaximaCamas) {
        this.cantMaximaCamas = cantMaximaCamas;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Sala [nombre=" + nombre + ", enfermedades=" + enfermedades + ", cantMaximaCamas=" + cantMaximaCamas
                + ", pacientes=" + pacientes + "]";
    }

    

}
