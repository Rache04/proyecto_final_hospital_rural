package domain;

import controllers.HospitalRural;
import java.util.ArrayList;
import models.Medico;
import models.Paciente;
import models.PacienteGrave;
import models.Sala;
import models.SalaTerapia;
import static org.junit.Assert.*;
import org.junit.Test;

public class CantPacientesGravesTest {

    @Test
    public void testCantPacientesGraves1() {
        // Arrange (Preparación)
        HospitalRural hospital = new HospitalRural(new ArrayList<Medico>(), new ArrayList<>());
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Paciente paciente1 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente2 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente3 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente7 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente7);
        Sala sala1 = new SalaTerapia(null, true, null, null, null, 0, pacientes);
        Sala sala2 = new SalaTerapia(null, true, null, null, null, 0, pacientes);
        Sala sala3 = new Sala(null, null, 0, pacientes);
        hospital.addSala(sala1);
        hospital.addSala(sala2);
        hospital.addSala(sala3);

        // Act (Acción)
        int cantPacientesGraves = hospital.cantPacientesGraves();

        // Assert (Verificación)
        assertEquals(8, cantPacientesGraves); // 8 por 2 salas de terapia que alvergan cada una 4 pacientes
    }
    
    @Test
    public void testCantPacientesGraves2() {
        // Arrange (Preparación)
        HospitalRural hospital = new HospitalRural(new ArrayList<Medico>(), new ArrayList<>());
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Paciente paciente1 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente2 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente3 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente7 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente8 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente7);
        pacientes.add(paciente8);
        Sala sala1 = new SalaTerapia(null, true, null, null, null, 0, pacientes);
        Sala sala2 = new SalaTerapia(null, true, null, null, null, 0, pacientes);
        Sala sala3 = new Sala(null, null, 0, pacientes);
        hospital.addSala(sala1);
        hospital.addSala(sala2);
        hospital.addSala(sala3);

        // Act (Acción)
        int cantPacientesGraves = hospital.cantPacientesGraves();

        // Assert (Verificación)
        assertEquals(10, cantPacientesGraves); // 10 por 2 salas de terapia que alvergan cada una 5 pacientes
    }
    
    @Test
    public void testCantPacientesGraves3() {
        // Arrange (Preparación)
        HospitalRural hospital = new HospitalRural(new ArrayList<Medico>(), new ArrayList<>());
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Paciente paciente1 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente2 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        Paciente paciente3 = new PacienteGrave(0, null, null, null, null, null, null, 0);
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        Sala sala1 = new SalaTerapia(null, true, null, null, null, 0, pacientes);
        Sala sala2 = new Sala(null, null, 0, pacientes);
        Sala sala3 = new Sala(null, null, 0, pacientes);
        hospital.addSala(sala1);
        hospital.addSala(sala2);
        hospital.addSala(sala3);

        // Act (Acción)
        int cantPacientesGraves = hospital.cantPacientesGraves();

        // Assert (Verificación)
        assertEquals(3, cantPacientesGraves); // 3 por 1 sala de terapia que contiene solo 3 pacientes
    }
}
