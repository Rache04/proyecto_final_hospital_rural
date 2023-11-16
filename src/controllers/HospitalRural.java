package controllers;

import java.util.ArrayList;

import interfaces.IHospitalRural;
import models.Medico;
import models.Paciente;
import models.Sala;

/**
 * HospitalRural
 */
public class HospitalRural implements IHospitalRural {
    private ArrayList<Medico> medicos;
    private ArrayList<Sala> salas;

    public HospitalRural(ArrayList<Medico> medicos, ArrayList<Sala> salas) {
        this.medicos = medicos;
        this.salas = salas;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    @Override
    public boolean addPaciente(Paciente paciente) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int cantPacientesGraves() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String conocerEstadoPaciente(String ciPaciente) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean crearSala(Sala sala) {
        return salas.add(sala);
    }

    @Override
    public boolean eliminarPaciente(String ciPaciente) {
        for (Sala sala : salas) {
            for (Paciente paciente : sala.getPacientes()) {
                if(paciente.getCi().equals(ciPaciente)){
                    return sala.getPacientes().remove(paciente);
                }
            }
        }
        return false;
    }

    @Override
    public boolean pacienteAtendMedico(String ciPaciente, String ciMedico) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean pacienteEstaIngr(String ciPaciente) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void trasladarPaciente(String ciPaciente, String nombreSala) {
        // TODO Auto-generated method stub

    }

}