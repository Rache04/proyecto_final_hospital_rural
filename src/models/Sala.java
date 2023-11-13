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
    String nombre;
    ArrayList <String> enfermedades;
    int cantMaximaCamas;
    int camasOcupadas;
    ArrayList<Paciente> pacientes;
    
   public Sala(String nombre,ArrayList<String> enfermedades, int cantMaximaCamas, int camasOcupadas,  ArrayList<Paciente> pacientes){
       this.nombre=nombre;
       this.enfermedades= enfermedades;
       this.cantMaximaCamas=cantMaximaCamas;
       this.pacientes=pacientes;
       this.pacientes=pacientes;
      
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
        return camasOcupadas;
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

    public void setCamasOcupadas(int camasOcupadas) {
        this.camasOcupadas = camasOcupadas;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
   
}
