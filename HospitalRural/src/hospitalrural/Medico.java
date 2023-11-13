/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalrural;

import java.util.ArrayList;

/**
 *
 * @author Rachel
 */
public class Medico {
   private String nombre;
   private String ci;
   private ArrayList<String> especialidades;
   private ArrayList<String> salas;
    
    public Medico(String nombre, String ci, ArrayList<String> especialidades, ArrayList<String> salas){
        this.nombre=nombre;
        this.ci=ci;
        this.especialidades=especialidades;
        this.salas=salas;
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

    public ArrayList<String> getSalas() {
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

    public void setSalas(ArrayList<String> salas) {
        this.salas = salas;
    }
    
    
}
