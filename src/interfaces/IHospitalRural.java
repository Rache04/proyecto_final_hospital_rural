package interfaces;

import java.util.ArrayList;

import models.Medico;
import models.Paciente;
import models.Sala;

public interface IHospitalRural {
    ArrayList<Medico> getMedicos();

    ArrayList<Sala> getSalas();

    // funcion
    boolean crearSala(Sala sala);

    
    boolean addPaciente(Paciente paciente);

    // funciona
    boolean addEnfermedadSala(String enfermedad, Sala sala);

    // funciona
    boolean eliminarEnfermedadSala(String enfermedad, Sala sala);

    // funciona
    boolean eliminarPaciente(String ciPaciente);

    // funciona
    boolean addMedico(Medico medico);

    // funciona
    boolean eliminarMedico(String ciMedico);

    // funciona
    boolean pacienteEstaIngr(String ciPaciente);

    // funciona
    boolean pacienteAtendMedico(String ciPaciente, String ciMedico);

    // funciona
    int cantPacientesGraves();

    // funciona
    boolean trasladarPaciente(String ciPaciente, String nombreSala);

    // funciona
    String conocerEstadoPaciente(String ciPaciente);

}
