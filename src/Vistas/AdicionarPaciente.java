package Vistas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class AdicionarPaciente extends javax.swing.JDialog {

    public AdicionarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setSize(875, 600);
        setLocationRelativeTo(null);
        setTitle("Agregar Paciente");

        jRadioButton_PacienteEstable.setSelected(true);
        jRadioButton_SustanciaToxica_SI.setSelected(true);
        jRadioButton_FaltaOxigeno_SI.setSelected(true);
        jRadioButton_Envenenado_Si.setSelected(true);
        jRadioButton_Accidente_Si.setSelected(true);
        jRadioButton_Automovilistico.setSelected(true);

        if (jRadioButton_PacienteEstable.isSelected()) {
            jPanel_PacienteGrave.setVisible(false);
        } else {
            jPanel_PacienteGrave.setVisible(true);
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
        jLabel_Seleccion_Tabla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_CarnetiIdentidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salas = new javax.swing.JTable();
        jRadioButton_PacienteEstable = new javax.swing.JRadioButton();
        jRadioButton_PacienteGrave = new javax.swing.JRadioButton();
        jPanel_PacienteGrave = new javax.swing.JPanel();
        jRadioButton_Automovilistico = new javax.swing.JRadioButton();
        jRadioButton_Envenenado = new javax.swing.JRadioButton();
        jRadioButton_Incendio = new javax.swing.JRadioButton();
        jRadioButton_Asfixia = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Accidente = new javax.swing.JPanel();
        jRadioButton_Accidente_No = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton_Accidente_Si = new javax.swing.JRadioButton();
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
        jLabel13 = new javax.swing.JLabel();
        jButton_AddEnfermedad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Seleccion_Tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Seleccion_Tabla.setText("Selecione una sala para ingresar al paciente:");
        getContentPane().add(jLabel_Seleccion_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 830, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Salas disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 180, -1));

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
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 290, 20));

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
        getContentPane().add(txt_CarnetiIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, 20));

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
        jScrollPane1.setViewportView(jTable_Salas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 830, 180));

        buttonGroup1.add(jRadioButton_PacienteEstable);
        jRadioButton_PacienteEstable.setText("Paciente Estable");
        jRadioButton_PacienteEstable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PacienteEstableActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_PacienteEstable, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        buttonGroup1.add(jRadioButton_PacienteGrave);
        jRadioButton_PacienteGrave.setText("Paciente Grave");
        jRadioButton_PacienteGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PacienteGraveActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_PacienteGrave, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jPanel_PacienteGrave.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_PacienteGrave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        buttonGroup2.add(jRadioButton_Incendio);
        jRadioButton_Incendio.setText("Incendio");
        jRadioButton_Incendio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_IncendioActionPerformed(evt);
            }
        });
        jPanel_PacienteGrave.add(jRadioButton_Incendio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 4, -1, -1));

        buttonGroup2.add(jRadioButton_Asfixia);
        jRadioButton_Asfixia.setText("Asfixia");
        jRadioButton_Asfixia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AsfixiaActionPerformed(evt);
            }
        });
        jPanel_PacienteGrave.add(jRadioButton_Asfixia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 4, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 10, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_PacienteGrave.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 10, 170));

        jPanel_Accidente.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Accidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Accidente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup_Accidente_Conductor.add(jRadioButton_Accidente_No);
        jRadioButton_Accidente_No.setText("No");
        jPanel_Accidente.add(jRadioButton_Accidente_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Paciente era el conductor:");
        jPanel_Accidente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        buttonGroup_Accidente_Conductor.add(jRadioButton_Accidente_Si);
        jRadioButton_Accidente_Si.setText("Si");
        jRadioButton_Accidente_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Accidente_SiActionPerformed(evt);
            }
        });
        jPanel_Accidente.add(jRadioButton_Accidente_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel_PacienteGrave.add(jPanel_Accidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 140));

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
        jPanel_Envenenado.add(jRadioButton_Envenenado_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel_PacienteGrave.add(jPanel_Envenenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 200, 140));

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

        jPanel_PacienteGrave.add(jPanel_Incendio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 200, 140));

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
        jPanel_Asfixia.add(jRadioButton_SustanciaToxica_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        buttonGroup_Asfixia_SustanciaToxica.add(jRadioButton_SustanciaToxica_NO);
        jRadioButton_SustanciaToxica_NO.setText("No");
        jRadioButton_SustanciaToxica_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SustanciaToxica_NOActionPerformed(evt);
            }
        });
        jPanel_Asfixia.add(jRadioButton_SustanciaToxica_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre de la sustancia:");
        jPanel_Asfixia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Falta de Oxigeno:");
        jPanel_Asfixia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        buttonGroup_Asfixia_FaltaOxigeno.add(jRadioButton_FaltaOxigeno_SI);
        jRadioButton_FaltaOxigeno_SI.setText("Si");
        jPanel_Asfixia.add(jRadioButton_FaltaOxigeno_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        buttonGroup_Asfixia_FaltaOxigeno.add(jRadioButton_FaltaOxigeno_NO);
        jRadioButton_FaltaOxigeno_NO.setText("No");
        jRadioButton_FaltaOxigeno_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FaltaOxigeno_NOActionPerformed(evt);
            }
        });
        jPanel_Asfixia.add(jRadioButton_FaltaOxigeno_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jPanel_PacienteGrave.add(jPanel_Asfixia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 200, 140));

        getContentPane().add(jPanel_PacienteGrave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 830, 170));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Registrar Paciente");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 180, -1));

        jButton_AddEnfermedad.setBackground(new java.awt.Color(51, 204, 0));
        jButton_AddEnfermedad.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddEnfermedad.setText("Agregar Paciente");
        jButton_AddEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEnfermedadActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AddEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 150, 25));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Carnet de Identidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enfermedad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 110, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 90));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 870, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_CarnetiIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CarnetiIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CarnetiIdentidadActionPerformed

    private void jRadioButton_PacienteEstableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PacienteEstableActionPerformed
        jPanel_PacienteGrave.setVisible(false);
    }//GEN-LAST:event_jRadioButton_PacienteEstableActionPerformed

    private void jRadioButton_PacienteGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PacienteGraveActionPerformed
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

    private void jRadioButton_Accidente_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Accidente_SiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_Accidente_SiActionPerformed

    private void jButton_AddEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEnfermedadActionPerformed
        boolean flap = true;
        String errors = "Error al ingresar paciente. Conprueve los siguientes campos:";

        if (!ValidarCampos.comprobarCamposTexto(txt_Nombre.getText())) {
            flap = false;
            errors = errors + "\n-Nombre";
        }

        if (!ValidarCampos.comprobarCamposNumericos(txt_CarnetiIdentidad.getText())
                || txt_CarnetiIdentidad.getText().length() != 11) {
            flap = false;
            errors = errors + "\n-Carnet de Identidad";
        }

        if (jRadioButton_PacienteGrave.isSelected()) {
            if (jRadioButton_Envenenado.isSelected()) {
                if (!ValidarCampos.comprobarCamposTexto(txt_SustanciaIngerida_Envenenamiento.getText())) {
                    flap = false;
                    errors = errors + "\n-Nombre de la sistancia ingerida. Paciente grave por Envenenamiento";
                }
            }
            if (jRadioButton_Asfixia.isSelected()) {
                if (!ValidarCampos.comprobarCamposTexto(txt_SustanciaIngerida_Asfixia.getText())) {
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
                if (!ValidarCampos.comprobarCamposTexto(txt_LugarAfectado.getText())) {
                    flap = flap;
                    errors = errors + "\n-Lugar afectado debe ser solamente una cadena de texto";
                }
            }
        }

        if (flap) {
            //Agregar todos los datos de paciente
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
        if (!Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_CarnetiIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CarnetiIdentidadKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE)
                || txt_CarnetiIdentidad.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CarnetiIdentidadKeyTyped

    private void txt_SustanciaIngerida_EnvenenamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_EnvenenamientoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SustanciaIngerida_EnvenenamientoKeyTyped

    private void txt_SustanciaIngerida_AsfixiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SustanciaIngerida_AsfixiaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SustanciaIngerida_AsfixiaKeyTyped

    private void txt_GradoQuemaduraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GradoQuemaduraKeyTyped
       char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_GradoQuemaduraKeyTyped

    private void txt_LugarAfectadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LugarAfectadoKeyTyped
       char c = evt.getKeyChar();
        if (!Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_LugarAfectadoKeyTyped

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
                AdicionarPaciente dialog = new AdicionarPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup_Accidente_Conductor;
    private javax.swing.ButtonGroup buttonGroup_Asfixia_FaltaOxigeno;
    private javax.swing.ButtonGroup buttonGroup_Asfixia_SustanciaToxica;
    private javax.swing.ButtonGroup buttonGroup_Envenenado;
    private javax.swing.JButton jButton_AddEnfermedad;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_Accidente;
    private javax.swing.JPanel jPanel_Asfixia;
    private javax.swing.JPanel jPanel_Envenenado;
    private javax.swing.JPanel jPanel_Incendio;
    private javax.swing.JPanel jPanel_PacienteGrave;
    private javax.swing.JRadioButton jRadioButton_Accidente_No;
    private javax.swing.JRadioButton jRadioButton_Accidente_Si;
    private javax.swing.JRadioButton jRadioButton_Asfixia;
    private javax.swing.JRadioButton jRadioButton_Automovilistico;
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
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_SustanciaIngerida_Asfixia;
    private javax.swing.JTextField txt_SustanciaIngerida_Envenenamiento;
    // End of variables declaration//GEN-END:variables
}
