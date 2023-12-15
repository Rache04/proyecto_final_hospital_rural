package Vistas;

import controllers.HospitalRural;
import interfaces.IHospitalRural;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Asfixia;
import models.Automovilistico;
import models.Envenenamiento;
import models.Incendio;
import models.Paciente;
import models.PacienteEstable;
import models.PacienteGrave;
import models.Sala;
import models.SalaTerapia;

public class AdicionarPaciente extends javax.swing.JDialog {

    private IHospitalRural hospital;
    private ArrayList<String> listEnfermedades = new ArrayList<String>();

    public AdicionarPaciente(java.awt.Frame parent, boolean modal, HospitalRural hospital) {
        super(parent, modal);
        initComponents();
        this.hospital = hospital;
        setResizable(false);
        setSize(700, 800);
        setLocationRelativeTo(null);
        setTitle("Agregar Paciente");

        HashSet<String> superConjuntoEnfermedades = new HashSet<>();
        for (Sala aux : this.hospital.getSalas()) {
            if (!(aux instanceof SalaTerapia)) {
                superConjuntoEnfermedades.addAll(aux.getEnfermedades());
            }
        }

        listEnfermedades.addAll(superConjuntoEnfermedades);
        Collections.sort(listEnfermedades);

        for (String aux : listEnfermedades) {
            jComboBox_Enfermedad.addItem(aux);
        }

        jRadioButton_PacienteEstable.setSelected(true);
        jRadioButton_SustanciaToxica_SI.setSelected(true);
        jRadioButton_FaltaOxigeno_SI.setSelected(true);
        jRadioButton_Envenenado_Si.setSelected(true);
        jRadioButton_Conductor_Si.setSelected(true);
        jRadioButton_Automovilistico.setSelected(true);
        jRadioButton_CausaNatural.setSelected(true);

        if (jRadioButton_PacienteEstable.isSelected()) {
            jLabel21.setVisible(false);
            txt_TiempoEstimadoVida.setVisible(false);
            jPanel_PacienteGrave.setVisible(false);
            jRadioButton_Accidente.setVisible(false);
            jRadioButton_CausaNatural.setVisible(false);
        } else {
            jPanel_PacienteGrave.setVisible(true);
        }

//      Llenar la tabla segun lo que esté selecionado por defecto
        if (jRadioButton_PacienteEstable.isSelected()) {
            DefaultTableModel model = new DefaultTableModel() {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };;
            model.addColumn("Nombre");
            model.addColumn("Cantidad de Camas");
            model.addColumn("Camas Disponibles");
            jTable_Salas.setModel(model);
            String[] datos = new String[3];
            for (Sala aux : this.hospital.getSalas()) {
                if (aux instanceof SalaTerapia) {
                } else {
                    for (String aux1 : aux.getEnfermedades()) {
                        if (aux1.equals(jComboBox_Enfermedad.getSelectedItem())) {
                            datos[0] = aux.getNombre();
                            datos[1] = String.valueOf(aux.getCantMaximaCamas());
                            if (aux.getPacientes() != null) {
                                datos[2] = String.valueOf(aux.getCantMaximaCamas() - aux.getPacientes().size());
                            } else {
                                datos[2] = String.valueOf(aux.getCantMaximaCamas());
                            }
                            model.addRow(datos);
                        }
                    }
                }
            }
        } else {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Tipo de Sala");
            model.addColumn("Cantidad de Camas");
            model.addColumn("Camas Disponibles");
            jTable_Salas.setModel(model);
            String[] datos = new String[4];
            for (Sala aux : this.hospital.getSalas()) {
                if (aux instanceof SalaTerapia) {
                    SalaTerapia salaTerapia = (SalaTerapia) aux;
                    datos[0] = salaTerapia.getNombre();
                    datos[1] = salaTerapia.getTipoSala();
                    datos[2] = String.valueOf(salaTerapia.getCantMaximaCamas());
                    if (aux.getPacientes() != null) {
                        datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas() - salaTerapia.getPacientes().size());
                    } else {
                        datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas());
                    }
                    model.addRow(datos);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup_Asfixia_SustanciaToxica = new javax.swing.ButtonGroup();
        buttonGroup_Asfixia_FaltaOxigeno = new javax.swing.ButtonGroup();
        buttonGroup_Envenenado = new javax.swing.ButtonGroup();
        buttonGroup_Accidente_Conductor = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Enfermedad = new javax.swing.JComboBox();
        txt_TiempoEnfermedad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Tratamiento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_NacimientoMes = new javax.swing.JTextField();
        txt_NacimientoYeard = new javax.swing.JTextField();
        txt_NacimientoDia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_TiempoEstimadoPermanencia = new javax.swing.JTextField();
        txt_TiempoEstimadoVida = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton_CausaNatural = new javax.swing.JRadioButton();
        jRadioButton_Accidente = new javax.swing.JRadioButton();
        jRadioButton_PacienteEstable = new javax.swing.JRadioButton();
        jRadioButton_PacienteGrave = new javax.swing.JRadioButton();
        txt_CarnetiIdentidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel_Seleccion_Tabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salas = new javax.swing.JTable();
        jPanel_PacienteGrave = new javax.swing.JPanel();
        jRadioButton_Automovilistico = new javax.swing.JRadioButton();
        jRadioButton_Envenenado = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Accidente = new javax.swing.JPanel();
        jRadioButton_Conductor_No = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton_Conductor_Si = new javax.swing.JRadioButton();
        jPanel_Envenenado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_SustanciaIngerida_Envenenamiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton_Envenenado_Si = new javax.swing.JRadioButton();
        jRadioButton_Envenenado_No = new javax.swing.JRadioButton();
        jPanel_Incendio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_GradoQuemadura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_LugarAfectado = new javax.swing.JTextField();
        jPanel_Asfixia = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_SustanciaIngerida_Asfixia = new javax.swing.JTextField();
        jRadioButton_SustanciaToxica_SI = new javax.swing.JRadioButton();
        jRadioButton_SustanciaToxica_NO = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_FaltaOxigeno_SI = new javax.swing.JRadioButton();
        jRadioButton_FaltaOxigeno_NO = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton_Asfixia = new javax.swing.JRadioButton();
        jRadioButton_Incendio = new javax.swing.JRadioButton();
        jButton_AddEnfermedad = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("C I:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enfermedad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jComboBox_Enfermedad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_EnfermedadItemStateChanged(evt);
            }
        });
        jComboBox_Enfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EnfermedadActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, -1));

        txt_TiempoEnfermedad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_TiempoEnfermedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_TiempoEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TiempoEnfermedadActionPerformed(evt);
            }
        });
        txt_TiempoEnfermedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TiempoEnfermedadKeyTyped(evt);
            }
        });
        jPanel1.add(txt_TiempoEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Días de detectada la enfermedad:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Tratamiento del Paciente:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, -1));

        txt_Tratamiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Tratamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Tratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TratamientoActionPerformed(evt);
            }
        });
        txt_Tratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TratamientoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 480, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Día");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 30, -1));

        txt_NacimientoMes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_NacimientoMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_NacimientoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NacimientoMesActionPerformed(evt);
            }
        });
        txt_NacimientoMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NacimientoMesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_NacimientoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 30, 20));

        txt_NacimientoYeard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_NacimientoYeard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_NacimientoYeard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NacimientoYeardActionPerformed(evt);
            }
        });
        txt_NacimientoYeard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NacimientoYeardKeyTyped(evt);
            }
        });
        jPanel1.add(txt_NacimientoYeard, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 40, 20));

        txt_NacimientoDia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_NacimientoDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_NacimientoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NacimientoDiaActionPerformed(evt);
            }
        });
        txt_NacimientoDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NacimientoDiaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_NacimientoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 30, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Mes");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 30, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Año");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 30, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 130, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tiempo de Permenencia:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 160, -1));

        txt_TiempoEstimadoPermanencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_TiempoEstimadoPermanencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_TiempoEstimadoPermanencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TiempoEstimadoPermanenciaActionPerformed(evt);
            }
        });
        txt_TiempoEstimadoPermanencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TiempoEstimadoPermanenciaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_TiempoEstimadoPermanencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 30, 20));

        txt_TiempoEstimadoVida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_TiempoEstimadoVida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_TiempoEstimadoVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TiempoEstimadoVidaActionPerformed(evt);
            }
        });
        txt_TiempoEstimadoVida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TiempoEstimadoVidaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_TiempoEstimadoVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 30, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Tiempo Estimado de Vida:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 160, -1));

        buttonGroup3.add(jRadioButton_CausaNatural);
        jRadioButton_CausaNatural.setText("Causa Natural");
        jRadioButton_CausaNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CausaNaturalActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_CausaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        buttonGroup3.add(jRadioButton_Accidente);
        jRadioButton_Accidente.setText("Accidente");
        jRadioButton_Accidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AccidenteActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Accidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, -1));

        buttonGroup1.add(jRadioButton_PacienteEstable);
        jRadioButton_PacienteEstable.setText("Paciente Estable");
        jRadioButton_PacienteEstable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PacienteEstableActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_PacienteEstable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 120, -1));

        buttonGroup1.add(jRadioButton_PacienteGrave);
        jRadioButton_PacienteGrave.setText("Paciente Grave");
        jRadioButton_PacienteGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PacienteGraveActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_PacienteGrave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, -1));

        txt_CarnetiIdentidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_CarnetiIdentidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_CarnetiIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CarnetiIdentidadActionPerformed(evt);
            }
        });
        txt_CarnetiIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CarnetiIdentidadKeyTyped(evt);
            }
        });
        jPanel1.add(txt_CarnetiIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Registrar Paciente");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 180, -1));

        txt_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 190));

        jLabel_Seleccion_Tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Seleccion_Tabla.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Seleccion_Tabla.setText("Salas disponibles para ingresar al paciente:");
        getContentPane().add(jLabel_Seleccion_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 660, -1));

        jTable_Salas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Salas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Salas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_SalasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Salas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 120));

        jPanel_PacienteGrave.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_PacienteGrave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel_PacienteGrave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(jRadioButton_Automovilistico);
        jRadioButton_Automovilistico.setText("Accidente Automovilistico");
        jRadioButton_Automovilistico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AutomovilisticoActionPerformed(evt);
            }
        });
        jPanel_PacienteGrave.add(jRadioButton_Automovilistico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, -1, -1));

        buttonGroup2.add(jRadioButton_Envenenado);
        jRadioButton_Envenenado.setText("Envenenamiento");
        jRadioButton_Envenenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_EnvenenadoActionPerformed(evt);
            }
        });
        jPanel_PacienteGrave.add(jRadioButton_Envenenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 4, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 10, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 10, 140));

        jPanel_Accidente.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Accidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Accidente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup_Accidente_Conductor.add(jRadioButton_Conductor_No);
        jRadioButton_Conductor_No.setText("No");
        jPanel_Accidente.add(jRadioButton_Conductor_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Paciente era el conductor:");
        jPanel_Accidente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        buttonGroup_Accidente_Conductor.add(jRadioButton_Conductor_Si);
        jRadioButton_Conductor_Si.setText("Si");
        jRadioButton_Conductor_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Conductor_SiActionPerformed(evt);
            }
        });
        jPanel_Accidente.add(jRadioButton_Conductor_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel_PacienteGrave.add(jPanel_Accidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 140));

        jPanel_Envenenado.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Envenenado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Envenenado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Intencionado:");
        jPanel_Envenenado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        txt_SustanciaIngerida_Envenenamiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_SustanciaIngerida_Envenenamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_SustanciaIngerida_Envenenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SustanciaIngerida_EnvenenamientoActionPerformed(evt);
            }
        });
        txt_SustanciaIngerida_Envenenamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SustanciaIngerida_EnvenenamientoKeyTyped(evt);
            }
        });
        jPanel_Envenenado.add(txt_SustanciaIngerida_Envenenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre de la Sustancia:");
        jPanel_Envenenado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, -1));

        buttonGroup_Envenenado.add(jRadioButton_Envenenado_Si);
        jRadioButton_Envenenado_Si.setText("Si");
        jPanel_Envenenado.add(jRadioButton_Envenenado_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        buttonGroup_Envenenado.add(jRadioButton_Envenenado_No);
        jRadioButton_Envenenado_No.setText("No");
        jPanel_Envenenado.add(jRadioButton_Envenenado_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jPanel_PacienteGrave.add(jPanel_Envenenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 220, 140));

        jPanel_Incendio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Incendio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Incendio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Grado de quemadura:");
        jPanel_Incendio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, -1));

        txt_GradoQuemadura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_GradoQuemadura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_GradoQuemadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GradoQuemaduraActionPerformed(evt);
            }
        });
        txt_GradoQuemadura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_GradoQuemaduraKeyTyped(evt);
            }
        });
        jPanel_Incendio.add(txt_GradoQuemadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Lugar Afectado:");
        jPanel_Incendio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, -1));

        txt_LugarAfectado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_LugarAfectado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_LugarAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LugarAfectadoActionPerformed(evt);
            }
        });
        txt_LugarAfectado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_LugarAfectadoKeyTyped(evt);
            }
        });
        jPanel_Incendio.add(txt_LugarAfectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 20));

        jPanel_PacienteGrave.add(jPanel_Incendio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 220, 140));

        jPanel_Asfixia.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Asfixia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Asfixia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sustancia Tóxica:");
        jPanel_Asfixia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, -1));

        txt_SustanciaIngerida_Asfixia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_SustanciaIngerida_Asfixia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_SustanciaIngerida_Asfixia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SustanciaIngerida_AsfixiaActionPerformed(evt);
            }
        });
        txt_SustanciaIngerida_Asfixia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SustanciaIngerida_AsfixiaKeyTyped(evt);
            }
        });
        jPanel_Asfixia.add(txt_SustanciaIngerida_Asfixia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 20));

        buttonGroup_Asfixia_SustanciaToxica.add(jRadioButton_SustanciaToxica_SI);
        jRadioButton_SustanciaToxica_SI.setText("Si");
        jPanel_Asfixia.add(jRadioButton_SustanciaToxica_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        buttonGroup_Asfixia_SustanciaToxica.add(jRadioButton_SustanciaToxica_NO);
        jRadioButton_SustanciaToxica_NO.setText("No");
        jRadioButton_SustanciaToxica_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SustanciaToxica_NOActionPerformed(evt);
            }
        });
        jPanel_Asfixia.add(jRadioButton_SustanciaToxica_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre de la sustancia:");
        jPanel_Asfixia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Falta de Oxigeno:");
        jPanel_Asfixia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 77, 120, 20));

        buttonGroup_Asfixia_FaltaOxigeno.add(jRadioButton_FaltaOxigeno_SI);
        jRadioButton_FaltaOxigeno_SI.setText("Si");
        jPanel_Asfixia.add(jRadioButton_FaltaOxigeno_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 103, -1, 20));

        buttonGroup_Asfixia_FaltaOxigeno.add(jRadioButton_FaltaOxigeno_NO);
        jRadioButton_FaltaOxigeno_NO.setText("No");
        jRadioButton_FaltaOxigeno_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FaltaOxigeno_NOActionPerformed(evt);
            }
        });
        jPanel_Asfixia.add(jRadioButton_FaltaOxigeno_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 103, -1, 20));

        jPanel_PacienteGrave.add(jPanel_Asfixia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 140));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(jRadioButton_Asfixia);
        jRadioButton_Asfixia.setText("Asfixia");
        jRadioButton_Asfixia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AsfixiaActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton_Asfixia, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 3, 70, 20));

        buttonGroup2.add(jRadioButton_Incendio);
        jRadioButton_Incendio.setText("Incendio");
        jRadioButton_Incendio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_IncendioActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton_Incendio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 3, 90, 20));

        jPanel_PacienteGrave.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 450, 30));

        getContentPane().add(jPanel_PacienteGrave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 450, 340));

        jButton_AddEnfermedad.setText("Agregar Paciente");
        jButton_AddEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEnfermedadActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AddEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, 170, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro formulario.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 700, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_CarnetiIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CarnetiIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CarnetiIdentidadActionPerformed

    private void jRadioButton_PacienteEstableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PacienteEstableActionPerformed
        jRadioButton_Accidente.setVisible(false);
        jRadioButton_CausaNatural.setVisible(false);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(false);
        txt_TiempoEstimadoVida.setVisible(false);
        txt_TiempoEstimadoPermanencia.setVisible(true);
        txt_TiempoEnfermedad.setVisible(true);
        txt_Tratamiento.setVisible(true);
        jPanel_PacienteGrave.setVisible(false);
        jLabel_Seleccion_Tabla.setText("");

        HashSet<String> superConjuntoEnfermedades = new HashSet<>();
        for (Sala aux : this.hospital.getSalas()) {
            if (!(aux instanceof SalaTerapia)) {
                superConjuntoEnfermedades.addAll(aux.getEnfermedades());
            }
        }
        ValidarCampos.cleardField(listEnfermedades);
        listEnfermedades.addAll(superConjuntoEnfermedades);
        Collections.sort(listEnfermedades);
        jComboBox_Enfermedad.removeAllItems();
        for (String aux : listEnfermedades) {
            jComboBox_Enfermedad.addItem(aux);
        }
        
//        Llenar la tabla si el usuario cambia el estado del paciente a estable
        DefaultTableModel model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };;
        model.addColumn("Nombre");
        model.addColumn("Cantidad de Camas");
        model.addColumn("Camas Disponibles");
        jTable_Salas.setModel(model);
        String[] datos = new String[3];
        for (Sala aux : this.hospital.getSalas()) {
            if (aux instanceof SalaTerapia) {
            } else {
                for (String aux1 : aux.getEnfermedades()) {
                    if (aux1.equals(jComboBox_Enfermedad.getSelectedItem())) {
                        datos[0] = aux.getNombre();
                        datos[1] = String.valueOf(aux.getCantMaximaCamas());
                        if (aux.getPacientes() != null) {
                            datos[2] = String.valueOf(aux.getCantMaximaCamas() - aux.getPacientes().size());
                        } else {
                            datos[2] = String.valueOf(aux.getCantMaximaCamas());
                        }
                        model.addRow(datos);
                    }
                }
            }
        }
    }//GEN-LAST:event_jRadioButton_PacienteEstableActionPerformed

    private void jRadioButton_PacienteGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PacienteGraveActionPerformed
        jRadioButton_Accidente.setVisible(true);
        jRadioButton_CausaNatural.setVisible(true);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        txt_TiempoEnfermedad.setVisible(false);
        txt_Tratamiento.setVisible(false);
        jLabel21.setVisible(true);
        txt_TiempoEstimadoVida.setVisible(true);
        if (jRadioButton_Accidente.isSelected()) {
            jPanel_PacienteGrave.setVisible(true);
        }
        jLabel_Seleccion_Tabla.setText("Salas disponibles para ingresar al paciente:");

        HashSet<String> superConjuntoEnfermedades = new HashSet<>();
        for (Sala aux : this.hospital.getSalas()) {
            if (aux instanceof SalaTerapia) {
                superConjuntoEnfermedades.addAll(aux.getEnfermedades());
            }
        }
        ValidarCampos.cleardField(listEnfermedades);
        listEnfermedades.addAll(superConjuntoEnfermedades);
        Collections.sort(listEnfermedades);
        jComboBox_Enfermedad.removeAllItems();
        for (String aux : listEnfermedades) {
            jComboBox_Enfermedad.addItem(aux);
        }
        
//        Llenar la tabla si el usuario cambia el estado del paciente a Grave
        DefaultTableModel model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };;
        model.addColumn("Nombre");
        model.addColumn("Tipo de Sala");
        model.addColumn("Cantidad de Camas");
        model.addColumn("Camas Disponibles");
        jTable_Salas.setModel(model);
        String[] datos = new String[4];
        for (Sala aux : this.hospital.getSalas()) {
            if (aux instanceof SalaTerapia && aux.getEnfermedades().contains(String.valueOf(jComboBox_Enfermedad.getSelectedItem()))) {
                SalaTerapia salaTerapia = (SalaTerapia) aux;
                datos[0] = salaTerapia.getNombre();
                datos[1] = salaTerapia.getTipoSala();
                datos[2] = String.valueOf(salaTerapia.getCantMaximaCamas());
                if (aux.getPacientes() != null) {
                    datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas() - salaTerapia.getPacientes().size());
                } else {
                    datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas());
                }
                model.addRow(datos);
            }
        }
    }//GEN-LAST:event_jRadioButton_PacienteGraveActionPerformed

    private void jRadioButton_EnvenenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_EnvenenadoActionPerformed
        jPanel_Asfixia.setVisible(false);
        jPanel_Incendio.setVisible(false);
        jPanel_Envenenado.setVisible(true);
        jPanel_Accidente.setVisible(false);
    }//GEN-LAST:event_jRadioButton_EnvenenadoActionPerformed

    private void jRadioButton_FaltaOxigeno_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FaltaOxigeno_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FaltaOxigeno_NOActionPerformed

    private void jRadioButton_SustanciaToxica_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SustanciaToxica_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_SustanciaToxica_NOActionPerformed

    private void txt_SustanciaIngerida_AsfixiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_AsfixiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SustanciaIngerida_AsfixiaActionPerformed

    private void txt_LugarAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LugarAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LugarAfectadoActionPerformed

    private void txt_GradoQuemaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GradoQuemaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GradoQuemaduraActionPerformed

    private void txt_SustanciaIngerida_EnvenenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_EnvenenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SustanciaIngerida_EnvenenamientoActionPerformed

    private void jRadioButton_Conductor_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Conductor_SiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_Conductor_SiActionPerformed

    private void jButton_AddEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEnfermedadActionPerformed
        boolean flap = true;
        String errors = "Error al ingresar paciente. Conprueve los siguientes campos:";
        String causa;
        boolean chofer;
        boolean envenenado;
        boolean sustanciaToxica;
        boolean faltaOxigeno;
        Calendar calendario = Calendar.getInstance();
        // Validación de campos
        if (jLabel_Seleccion_Tabla.getText().equals("Salas disponibles para ingresar al paciente:")) {
            flap = false;
            errors = errors + "\n-No ha selexionado una Sala adecuada para el paciente";
        }
        try {
            if (txt_Nombre.getText().equals("") || !ValidarCampos.comprobarCamposTexto(txt_Nombre.getText())) {
                flap = false;
                errors = errors + "\n-Nombre";
            }
        } catch (NullPointerException e) {
            flap = false;
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al validar el campo de Nombre Completo contacte al administrador: " + e);
        }

        try {
            if (!ValidarCampos.comprobarCamposNumericos(txt_TiempoEstimadoPermanencia.getText())) {
                flap = false;
                errors = errors + "\n-Tiempo estimado de permanencia";
            }
        } catch (NullPointerException e) {
            flap = false;
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al validar el campo de Tiempo Estimado de Permanencia contacte al administrador: " + e);
        }

        try {
            if (!ValidarCampos.comprobarCamposNumericos(txt_NacimientoYeard.getText())
                    || !ValidarCampos.comprobarCamposNumericos(txt_NacimientoMes.getText())
                    || !ValidarCampos.comprobarCamposNumericos(txt_NacimientoDia.getText())
                    || Integer.parseInt(txt_NacimientoYeard.getText()) > calendario.get(Calendar.YEAR) || Integer.parseInt(txt_NacimientoYeard.getText()) < 1900
                    || Integer.parseInt(txt_NacimientoMes.getText()) > 12
                    || Integer.parseInt(txt_NacimientoDia.getText()) > 31) {
                flap = false;
                errors = errors + "\n-Fecha de Nacimiento";
            }
        } catch (NullPointerException | NumberFormatException e) {
            flap = false;
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al validar los campos de Fecha de Nacimiento contacte al administrador: " + e);
        }

        try {
            if (!ValidarCampos.comprobarCamposNumericos(txt_CarnetiIdentidad.getText())
                    || txt_CarnetiIdentidad.getText().length() != 11) {
                flap = false;
                errors = errors + "\n-Carnet de Identidad";
            }
        } catch (NullPointerException e) {
            flap = false;
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al validar el campo de Carnet de Identidad contacte al administrador: " + e);
        }

        if (jRadioButton_PacienteEstable.isSelected()) {
            try {
                if (!ValidarCampos.comprobarCamposNumericos(txt_TiempoEnfermedad.getText())) {
                    flap = false;
                    errors = errors + "\n-Tiempo de detectada la enfermedad";
                }
            } catch (NullPointerException e) {
                flap = false;
                JOptionPane.showMessageDialog(null, "ha ocurrido un erro al validar el campo de Tiempo estimado de permanencia contacte al administradoe: " + e);
            }

            try {
                if (txt_Tratamiento.getText().equals("") || !ValidarCampos.comprobarCamposTexto(txt_Tratamiento.getText())) {
                    flap = false;
                    errors = errors + "\n-Tratamiento Posible";
                }
            } catch (Exception e) {
                flap = false;
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al validar el campo de Tratamiento Posible contacte al administrador: " + e);
            }
        }

        try {
            if (jRadioButton_PacienteGrave.isSelected()) {
                if (!ValidarCampos.comprobarCamposNumericos(txt_TiempoEstimadoVida.getText())) {
                    flap = false;
                    errors = errors + "\n-Tiempo Estimado de Vida";
                }
                if (jRadioButton_Envenenado.isSelected()) {
                    if (txt_SustanciaIngerida_Envenenamiento.getText().equals("") || !ValidarCampos.comprobarCamposTexto(txt_SustanciaIngerida_Envenenamiento.getText())) {
                        flap = false;
                        errors = errors + "\n-Nombre de la sistancia ingerida. Paciente grave por Envenenamiento";
                    }
                }
                if (jRadioButton_Asfixia.isSelected()) {
                    if (txt_SustanciaIngerida_Asfixia.getText().equals("") || !ValidarCampos.comprobarCamposTexto(txt_SustanciaIngerida_Asfixia.getText())) {
                        flap = false;
                        errors = errors + "\n-Nombre de la sustancia ingerida. Paciente grave por Asfixia";
                    }
                }
                if (jRadioButton_Incendio.isSelected()) {
                    if (!ValidarCampos.comprobarCamposNumericos(txt_GradoQuemadura.getText())
                            || !ValidarCampos.rangoNumero(ValidarCampos.convertirEntero(txt_GradoQuemadura.getText()), 1, 3)
                            || ValidarCampos.convertirEntero(txt_GradoQuemadura.getText()) <= 0) {
                        flap = false;
                        errors = errors + "\n-Grado de quemaduras debe ser un número entero entre 1 y 3";
                    }
                }
                if (jRadioButton_Incendio.isSelected()) {
                    if (txt_LugarAfectado.getText().equals("") || !ValidarCampos.comprobarCamposTexto(txt_LugarAfectado.getText())) {
                        flap = false;
                        errors = errors + "\n-Lugar afectado debe ser solamente una cadena de texto";
                    }
                }
            }
        } catch (NullPointerException | NumberFormatException e) {
            flap = false;
            JOptionPane.showMessageDialog(null, "Ha currido un erro al validar campos de Paciente Grave contacte aladministrador: " + e);
        }
        if (jLabel_Seleccion_Tabla.getText().equals("Selecione una sala para ingresar al paciente:")) {
            flap = false;
            errors = errors + "\n-No ha selexionado ningúna sala en la cual ingresar al paciente";
        } else {
            for (Sala aux : this.hospital.getSalas()) {
                if (aux.getNombre().equals(jLabel_Seleccion_Tabla.getText())) {
                    if (aux.getPacientes() != null) {
                        if ((aux.getCantMaximaCamas() - aux.getCamasOcupadas()) <= 0) {
                            flap = false;
                            errors = errors + "\n-La Sala selexionada no tiene camas disponibles";
                        }
                    }
                }
            }
        }
        // Asignar valores boolean segun la seleción en los jRadioButons
        if (jRadioButton_CausaNatural.isSelected()) {
            causa = jRadioButton_CausaNatural.getText();
        } else {
            causa = jRadioButton_Accidente.getText();
        }
        if (jRadioButton_Conductor_Si.isSelected()) {
            chofer = true;
        } else {
            chofer = false;
        }
        if (jRadioButton_Envenenado_Si.isSelected()) {
            envenenado = true;
        } else {
            envenenado = false;
        }
        if (jRadioButton_FaltaOxigeno_SI.isSelected()) {
            faltaOxigeno = true;
        } else {
            faltaOxigeno = false;
        }
        if (jRadioButton_SustanciaToxica_SI.isSelected()) {
            sustanciaToxica = true;
        } else {
            sustanciaToxica = false;
        }

        if (flap) {
            // Agregar paciente si el paciente es un paciente grave que sufrio un accidente automovilistico
            if (jRadioButton_PacienteGrave.isSelected() && jRadioButton_Automovilistico.isSelected()) {
                Paciente paciente = new Automovilistico(chofer, Integer.parseInt(txt_TiempoEstimadoVida.getText()),
                        causa, txt_CarnetiIdentidad.getText(), txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoVida.getText()));

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));

                // Agregar paciente si el paciente es un paciente grave que sufrio un accidente enevnenaniento
            } else if (jRadioButton_PacienteGrave.isSelected() && jRadioButton_Envenenado.isSelected()) {
                Paciente paciente = new Envenenamiento(txt_SustanciaIngerida_Envenenamiento.getText(), envenenado, ValidarCampos.convertirEntero(txt_TiempoEstimadoVida.getText()), causa, txt_CarnetiIdentidad.getText(), txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoVida.getText()));

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));

                // Agregagr paciente si el paciente es un pacientegrave que sufrio un accidente asfixia
            } else if (jRadioButton_PacienteGrave.isSelected() && jRadioButton_Asfixia.isSelected()) {
                Paciente paciente = new Asfixia(txt_SustanciaIngerida_Asfixia.getText(), faltaOxigeno, Integer.parseInt(txt_TiempoEstimadoVida.getText()),
                        sustanciaToxica, txt_CarnetiIdentidad.getText(), txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoPermanencia.getText()), causa);

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));
            } else if (jRadioButton_PacienteGrave.isSelected() && jRadioButton_Incendio.isSelected()) {
                Paciente paciente = new Incendio(Integer.parseInt(txt_GradoQuemadura.getText()), txt_LugarAfectado.getText(),
                        Integer.parseInt(txt_TiempoEstimadoVida.getText()), causa, txt_CarnetiIdentidad.getText(),
                        txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoPermanencia.getText()));

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));
                // Agregar pacientegrave por causas naturales
            } else if (jRadioButton_PacienteGrave.isSelected()) {
                Paciente paciente = new PacienteGrave(Integer.parseInt(txt_TiempoEstimadoPermanencia.getText()),
                        causa, txt_CarnetiIdentidad.getText(),
                        txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoPermanencia.getText()));

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));
                // Agregar paciente estable
            } else {
                Paciente paciente = new PacienteEstable(Integer.parseInt(txt_TiempoEnfermedad.getText()),
                        txt_Tratamiento.getText(),
                        txt_CarnetiIdentidad.getText(), txt_Nombre.getText(),
                        txt_NacimientoDia.getText() + "-" + txt_NacimientoMes.getText() + "-" + txt_NacimientoYeard.getText(),
                        String.valueOf(jComboBox_Enfermedad.getSelectedItem()),
                        calendario.get(Calendar.DAY_OF_MONTH) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.YEAR),
                        Integer.parseInt(txt_TiempoEstimadoPermanencia.getText()));

                this.hospital.addPaciente(paciente, ValidarCampos.buscarSalaPorNombre(jLabel_Seleccion_Tabla.getText(), (HospitalRural) hospital));
            }

            JOptionPane.showMessageDialog(null, "El Paciente " + txt_Nombre.getText() + " ha sido agregado al sistema");
            // Limpiar campos luego de agregar un paciente
            ValidarCampos.cleardField(txt_CarnetiIdentidad);
            ValidarCampos.cleardField(txt_GradoQuemadura);
            ValidarCampos.cleardField(txt_LugarAfectado);
            ValidarCampos.cleardField(txt_NacimientoDia);
            ValidarCampos.cleardField(txt_NacimientoDia);
            ValidarCampos.cleardField(txt_NacimientoMes);
            ValidarCampos.cleardField(txt_NacimientoYeard);
            ValidarCampos.cleardField(txt_Nombre);
            ValidarCampos.cleardField(txt_SustanciaIngerida_Asfixia);
            ValidarCampos.cleardField(txt_SustanciaIngerida_Envenenamiento);
            ValidarCampos.cleardField(txt_TiempoEnfermedad);
            ValidarCampos.cleardField(txt_TiempoEstimadoPermanencia);
            ValidarCampos.cleardField(txt_TiempoEstimadoVida);
            ValidarCampos.cleardField(txt_Tratamiento);

        } else {
            JOptionPane.showMessageDialog(null, errors);
        }

    }//GEN-LAST:event_jButton_AddEnfermedadActionPerformed

    private void jRadioButton_AutomovilisticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_AutomovilisticoActionPerformed
        jPanel_Accidente.setVisible(true);
        jPanel_Asfixia.setVisible(false);
        jPanel_Envenenado.setVisible(false);
        jPanel_Incendio.setVisible(false);
    }//GEN-LAST:event_jRadioButton_AutomovilisticoActionPerformed

    private void jRadioButton_AsfixiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_AsfixiaActionPerformed
        jPanel_Accidente.setVisible(false);
        jPanel_Asfixia.setVisible(true);
        jPanel_Envenenado.setVisible(false);
        jPanel_Incendio.setVisible(false);
    }//GEN-LAST:event_jRadioButton_AsfixiaActionPerformed

    private void jRadioButton_IncendioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_IncendioActionPerformed
        jPanel_Accidente.setVisible(false);
        jPanel_Asfixia.setVisible(false);
        jPanel_Envenenado.setVisible(false);
        jPanel_Incendio.setVisible(true);
    }//GEN-LAST:event_jRadioButton_IncendioActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_CarnetiIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CarnetiIdentidadKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_CarnetiIdentidad.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CarnetiIdentidadKeyTyped

    private void txt_SustanciaIngerida_EnvenenamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_EnvenenamientoKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SustanciaIngerida_EnvenenamientoKeyTyped

    private void txt_SustanciaIngerida_AsfixiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_AsfixiaKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SustanciaIngerida_AsfixiaKeyTyped

    private void txt_GradoQuemaduraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GradoQuemaduraKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_GradoQuemadura.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_GradoQuemaduraKeyTyped

    private void txt_LugarAfectadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LugarAfectadoKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_LugarAfectadoKeyTyped

    private void txt_TiempoEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TiempoEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TiempoEnfermedadActionPerformed

    private void txt_TiempoEnfermedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TiempoEnfermedadKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TiempoEnfermedadKeyTyped

    private void txt_TratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TratamientoActionPerformed

    private void txt_TratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TratamientoKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TratamientoKeyTyped

    private void txt_NacimientoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NacimientoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NacimientoMesActionPerformed

    private void txt_NacimientoMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NacimientoMesKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_NacimientoMes.getText().length() > 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NacimientoMesKeyTyped

    private void txt_NacimientoYeardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NacimientoYeardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NacimientoYeardActionPerformed

    private void txt_NacimientoYeardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NacimientoYeardKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_NacimientoYeard.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NacimientoYeardKeyTyped

    private void txt_NacimientoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NacimientoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NacimientoDiaActionPerformed

    private void txt_NacimientoDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NacimientoDiaKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_NacimientoDia.getText().length() > 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NacimientoDiaKeyTyped

    private void txt_TiempoEstimadoPermanenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TiempoEstimadoPermanenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TiempoEstimadoPermanenciaActionPerformed

    private void txt_TiempoEstimadoPermanenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TiempoEstimadoPermanenciaKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TiempoEstimadoPermanenciaKeyTyped

    private void txt_TiempoEstimadoVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TiempoEstimadoVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TiempoEstimadoVidaActionPerformed

    private void txt_TiempoEstimadoVidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TiempoEstimadoVidaKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TiempoEstimadoVidaKeyTyped

    private void jRadioButton_CausaNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CausaNaturalActionPerformed
        jPanel_PacienteGrave.setVisible(false);
    }//GEN-LAST:event_jRadioButton_CausaNaturalActionPerformed

    private void jRadioButton_AccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_AccidenteActionPerformed
        jPanel_PacienteGrave.setVisible(true);
        if (jRadioButton_Asfixia.isSelected()) {
            jPanel_Accidente.setVisible(false);
            jPanel_Asfixia.setVisible(true);
            jPanel_Envenenado.setVisible(false);
            jPanel_Incendio.setVisible(false);
        } else if (jRadioButton_Envenenado.isSelected()) {
            jPanel_Accidente.setVisible(false);
            jPanel_Asfixia.setVisible(false);
            jPanel_Envenenado.setVisible(true);
            jPanel_Incendio.setVisible(false);
        } else if (jRadioButton_Incendio.isSelected()) {
            jPanel_Accidente.setVisible(false);
            jPanel_Asfixia.setVisible(false);
            jPanel_Envenenado.setVisible(false);
            jPanel_Incendio.setVisible(true);
        } else {
            jPanel_Accidente.setVisible(true);
            jPanel_Asfixia.setVisible(false);
            jPanel_Envenenado.setVisible(false);
            jPanel_Incendio.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton_AccidenteActionPerformed

    private void jTable_SalasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalasMousePressed
        jLabel_Seleccion_Tabla.setText(String.valueOf(jTable_Salas.getValueAt(jTable_Salas.getSelectedRow(), 0)));
    }//GEN-LAST:event_jTable_SalasMousePressed

    private void jComboBox_EnfermedadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_EnfermedadItemStateChanged
//  Repintar la tabla segun una nueva seleción en el comboBox de las enfermedades
        jLabel_Seleccion_Tabla.setText("Salas disponibles para ingresar al paciente:");
        if (jRadioButton_PacienteEstable.isSelected()) {
            DefaultTableModel model = new DefaultTableModel() {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };;
            model.addColumn("Nombre");
            model.addColumn("Cantidad de Camas");
            model.addColumn("Camas Disponibles");
            jTable_Salas.setModel(model);
            String[] datos = new String[3];
            for (Sala aux : hospital.getSalas()) {
                if (aux instanceof SalaTerapia) {
                } else {
                    for (String aux1 : aux.getEnfermedades()) {
                        if (aux1.equals(jComboBox_Enfermedad.getSelectedItem())) {
                            datos[0] = aux.getNombre();
                            datos[1] = String.valueOf(aux.getCantMaximaCamas());
                            if (aux.getPacientes() != null) {
                                datos[2] = String.valueOf(aux.getCantMaximaCamas() - aux.getPacientes().size());
                            } else {
                                datos[2] = String.valueOf(aux.getCantMaximaCamas());
                            }
                            model.addRow(datos);
                        }
                    }
                }
            }
        } else {
            DefaultTableModel model = new DefaultTableModel() {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };;
            model.addColumn("Nombre");
            model.addColumn("Tipo de Sala");
            model.addColumn("Cantidad de Camas");
            model.addColumn("Camas Disponibles");
            jTable_Salas.setModel(model);
            String[] datos = new String[4];
            for (Sala aux : hospital.getSalas()) {
                if (aux instanceof SalaTerapia && aux.getEnfermedades().contains(String.valueOf(jComboBox_Enfermedad.getSelectedItem()))) {
                    SalaTerapia salaTerapia = (SalaTerapia) aux;
                    datos[0] = salaTerapia.getNombre();
                    datos[1] = salaTerapia.getTipoSala();
                    datos[2] = String.valueOf(salaTerapia.getCantMaximaCamas());
                    if (aux.getPacientes() != null) {
                        datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas() - salaTerapia.getPacientes().size());
                    } else {
                        datos[3] = String.valueOf(salaTerapia.getCantMaximaCamas());
                    }
                    model.addRow(datos);
                }
            }
        }
    }//GEN-LAST:event_jComboBox_EnfermedadItemStateChanged

    private void jComboBox_EnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_EnfermedadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionarPaciente dialog = new AdicionarPaciente(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup_Accidente_Conductor;
    private javax.swing.ButtonGroup buttonGroup_Asfixia_FaltaOxigeno;
    private javax.swing.ButtonGroup buttonGroup_Asfixia_SustanciaToxica;
    private javax.swing.ButtonGroup buttonGroup_Envenenado;
    private javax.swing.JButton jButton_AddEnfermedad;
    private javax.swing.JComboBox jComboBox_Enfermedad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Seleccion_Tabla;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_Accidente;
    private javax.swing.JPanel jPanel_Asfixia;
    private javax.swing.JPanel jPanel_Envenenado;
    private javax.swing.JPanel jPanel_Incendio;
    private javax.swing.JPanel jPanel_PacienteGrave;
    private javax.swing.JRadioButton jRadioButton_Accidente;
    private javax.swing.JRadioButton jRadioButton_Asfixia;
    private javax.swing.JRadioButton jRadioButton_Automovilistico;
    private javax.swing.JRadioButton jRadioButton_CausaNatural;
    private javax.swing.JRadioButton jRadioButton_Conductor_No;
    private javax.swing.JRadioButton jRadioButton_Conductor_Si;
    private javax.swing.JRadioButton jRadioButton_Envenenado;
    private javax.swing.JRadioButton jRadioButton_Envenenado_No;
    private javax.swing.JRadioButton jRadioButton_Envenenado_Si;
    private javax.swing.JRadioButton jRadioButton_FaltaOxigeno_NO;
    private javax.swing.JRadioButton jRadioButton_FaltaOxigeno_SI;
    private javax.swing.JRadioButton jRadioButton_Incendio;
    private javax.swing.JRadioButton jRadioButton_PacienteEstable;
    private javax.swing.JRadioButton jRadioButton_PacienteGrave;
    private javax.swing.JRadioButton jRadioButton_SustanciaToxica_NO;
    private javax.swing.JRadioButton jRadioButton_SustanciaToxica_SI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Salas;
    private javax.swing.JTextField txt_CarnetiIdentidad;
    private javax.swing.JTextField txt_GradoQuemadura;
    private javax.swing.JTextField txt_LugarAfectado;
    private javax.swing.JTextField txt_NacimientoDia;
    private javax.swing.JTextField txt_NacimientoMes;
    private javax.swing.JTextField txt_NacimientoYeard;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_SustanciaIngerida_Asfixia;
    private javax.swing.JTextField txt_SustanciaIngerida_Envenenamiento;
    private javax.swing.JTextField txt_TiempoEnfermedad;
    private javax.swing.JTextField txt_TiempoEstimadoPermanencia;
    private javax.swing.JTextField txt_TiempoEstimadoVida;
    private javax.swing.JTextField txt_Tratamiento;
    // End of variables declaration//GEN-END:variables
}
