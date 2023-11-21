import java.util.ArrayList;

import controllers.HospitalRural;
import interfaces.IHospitalRural;
import models.Medico;
import models.Paciente;
import models.PacienteEstable;
import models.PacienteGrave;
import models.Sala;
import models.SalaTerapia;

public class main {
    public static void main(String[] args) {

        IHospitalRural hospital = new HospitalRural(new ArrayList<Medico>(), new ArrayList<Sala>());

        Paciente pac1 = new PacienteEstable(1, "tar", "02", "Delvis", "30-11-2002", "nana", "ayer", 5);
        Paciente pac2 = new PacienteGrave(1, "tar", "03", "Delvis", "30-11-2002", "nana", "ayer", 5);

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(pac1);
        Sala sala1 = new Sala("Sala1", new ArrayList<>(), 2, pacientes);

        ArrayList<Paciente> pacientes2 = new ArrayList<>();
        pacientes2.add(pac2);
        Sala sala2 = new SalaTerapia("null", false, null, "sala2", new ArrayList<>(), 0, pacientes2);

        ArrayList<Sala> med1 = new ArrayList<>();
        med1.add(sala1);
        ArrayList<Sala> med2 = new ArrayList<>();
        med2.add(sala2);

        hospital.addMedico(new Medico("Med1", "04", null, med1));
        hospital.addMedico(new Medico("med2", "05", null, med2));

        hospital.crearSala(sala2);
        hospital.crearSala(sala1);

        /*
         * System.out.println(hospital.cantPacientesGraves());
         * System.out.println(hospital.pacienteEstaIngr("01"));
         * System.out.println(hospital.pacienteEstaIngr("02"));
         * 
         * System.out.println(hospital.pacienteEstaIngr("03"));
         * 
         * System.out.println(hospital.pacienteAtendMedico("03", "04"));
         * 
         * 
         * System.out.println(hospital.conocerEstadoPaciente("03"));
         */

         hospital.trasladarPaciente("02", "sala2");
       for (Sala sala : hospital.getSalas()) {
        System.out.println("pacientes de la sala: " + sala.getNombre());
            for (Paciente paciente : sala.getPacientes()) {
                System.out.println(paciente);
            }
       }
    }
}
