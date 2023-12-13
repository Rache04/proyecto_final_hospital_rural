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
public class Medico {
    protected String nombre;
    protected String ci;
    protected ArrayList<String> especialidades;
    protected ArrayList<Sala> salas;

    public Medico(String nombre, String ci, ArrayList<String> especialidades, ArrayList<Sala> salas) {
        this.nombre = nombre;
        this.ci = ci;
        this.especialidades = especialidades;
        this.salas = salas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + ", ci=" + ci + ", especialidades=" + especialidades + ", salas=" + salas
                + "]";
    }

    

}
