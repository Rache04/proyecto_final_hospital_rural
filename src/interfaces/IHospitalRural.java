package interfaces;

import java.util.ArrayList;

import models.Medico;
import models.Paciente;
import models.Sala;

public interface IHospitalRural {
    ArrayList<Medico> getMedicos();

    ArrayList<Sala> getSalas();

    boolean crearSala(Sala sala);

    boolean addPaciente(Paciente paciente);

    boolean eliminarPaciente(String ciPaciente);

    boolean addMedico(Medico medico);

    boolean eliminarMedico(String ciMedico);

    boolean pacienteEstaIngr(String ciPaciente);

    boolean pacienteAtendMedico(String ciPaciente, String ciMedico);

    int cantPacientesGraves();

    boolean trasladarPaciente(String ciPaciente, String nombreSala);

    String conocerEstadoPaciente(String ciPaciente);

}
