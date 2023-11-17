package controllers;

import java.util.ArrayList;

import interfaces.IHospitalRural;
import models.Medico;
import models.Paciente;
import models.PacienteGrave;
import models.Sala;
import models.SalaTerapia;

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

        return false;
    }

    @Override
    public boolean addMedico(Medico medico) {
        return medicos.add(medico);
    }

    @Override
    public boolean eliminarMedico(String ciMedico) {
        for (Medico medico : medicos) {
            if (medico.getCi().equals(ciMedico)) {
                return medicos.remove(medico);
            }
        }
        return false;
    }

    @Override
    public int cantPacientesGraves() {
        int cant = 0;
        for (Sala sala : salas) {
            if (sala instanceof SalaTerapia) {
                cant += sala.getCamasOcupadas();
            }
        }

        return cant;
    }

    @Override
    public String conocerEstadoPaciente(String ciPaciente) {
        Paciente paciente = getPacientePorCi(ciPaciente);
        if (paciente != null) {
            return paciente.conocerEstado();
        }
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
                if (paciente.getCi().equals(ciPaciente)) {
                    return sala.getPacientes().remove(paciente);
                }
            }
        }
        return false;
    }

    @Override
    public boolean pacienteAtendMedico(String ciPaciente, String ciMedico) {
        for (Medico medico : medicos) {
            if (medico.getCi().equals(ciMedico)) {
                Sala sala = getSalaPaciente(ciPaciente);
                if (sala != null) {
                    return medico.getSalas().contains(sala);

                } else {
                    return false;
                }

            }

        }
        return false;
    }

    @Override
    public boolean pacienteEstaIngr(String ciPaciente) {
        return getPacientePorCi(ciPaciente) != null;
    }

    private Paciente getPacientePorCi(String ciPaciente) {
        for (Sala sala : salas) {
            for (Paciente paciente : sala.getPacientes()) {
                if (paciente.getCi().equals(ciPaciente)) {
                    return paciente;
                }
            }
        }
        return null;
    }

    private Sala getSalaPaciente(String ciPaciente) {
        for (Sala sala : salas) {
            for (Paciente paciente : sala.getPacientes()) {
                if (paciente.getCi().equals(ciPaciente)) {
                    return sala;
                }
            }
        }
        return null;
    }

    private Sala getSalaPorNombre(String nombreSala) {
        for (Sala sala : salas) {
            if (sala.getNombre().equals(nombreSala)) {
                return sala;
            }
        }
        return null;
    }

    @Override
    public boolean trasladarPaciente(String ciPaciente, String nombreSala) {
        Sala salaObj = getSalaPorNombre(nombreSala);
        if (salaObj != null) {
            for (Sala sala : salas) {
                for (Paciente paciente : sala.getPacientes()) {
                    if (paciente.getCi().equals(ciPaciente)) {
                        salaObj.getPacientes().add(paciente);
                        sala.getPacientes().remove(paciente);
                    }
                }
            }
        }

        return false;

    }

}