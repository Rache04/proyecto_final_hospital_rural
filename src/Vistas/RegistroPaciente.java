/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import controllers.HospitalRural;
import interfaces.IHospitalRural;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Medico;
import models.Paciente;
import models.Sala;
import models.SalaTerapia;

/**
 *
 * @author Gabriel
 */
public class RegistroPaciente extends javax.swing.JDialog {

    private HospitalRural hospital;
    DefaultTableModel modeloTablaPaciente = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };

    ;

    /**
     * Creates new form RegistroPaciente
     */
    public RegistroPaciente(java.awt.Frame parent, boolean modal, HospitalRural hospital) {
        super(parent, modal);
        initComponents();
        this.hospital = hospital;
        setResizable(false);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        modeloTablaPaciente.addColumn("Nombre");
        modeloTablaPaciente.addColumn("CI");
        modeloTablaPaciente.addColumn("Fecha nacimiento");
        modeloTablaPaciente.addColumn("Enfermedad");
        modeloTablaPaciente.addColumn("Estado");
        modeloTablaPaciente.addColumn("Tiempo de permanencia");
        modeloTablaPaciente.addColumn("Sala");
        jTable1.setModel(modeloTablaPaciente);

        for (Sala sala : hospital.getSalas()) {
            for (Paciente elemento : sala.getPacientes()) {
                String[] relleno = new String[7];
                relleno[0] = elemento.getNombreCompleto();
                relleno[1] = elemento.getCi();
                relleno[2] = elemento.getFechaNacimiento();
                relleno[3] = elemento.getEnfermedad();
                relleno[4] = hospital.conocerEstadoPaciente(elemento.getCi());
                relleno[5] = String.valueOf(elemento.getTiempoEstimadoPermanencia());
                relleno[6] = sala.getNombre();
                modeloTablaPaciente.addRow(relleno);
            }

        }
        
        jLabel_PacientesGreves.setText(String.valueOf(hospital.cantPacientesGraves()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_BuscarPorCi = new javax.swing.JTextField();
        jLabel_PacienteSelecionado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CarnetIdentidadMedico = new javax.swing.JTextField();
        txt_CarnetDeIdentidadPaciente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_TrasladoPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_trasladarSala = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel_PacientesGreves = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1180, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton1.setText("Eliminar paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar por CI:");

        txt_BuscarPorCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarPorCiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarPorCiKeyTyped(evt);
            }
        });

        jLabel_PacienteSelecionado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PacienteSelecionado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PacienteSelecionado.setText("Seleccione un paciente:");
        jLabel_PacienteSelecionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI paciente:");

        txt_CarnetIdentidadMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CarnetIdentidadMedicoKeyTyped(evt);
            }
        });

        txt_CarnetDeIdentidadPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CarnetDeIdentidadPacienteKeyTyped(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Trasladar paciente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_TrasladoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TrasladoPacienteKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("a");

        txt_trasladarSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_trasladarSalaKeyTyped(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CI medico:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CI Paciente:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sala:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pacientes Graves: ");

        jLabel_PacientesGreves.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PacientesGreves.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PacientesGreves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_CarnetIdentidadMedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(txt_BuscarPorCi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CarnetDeIdentidadPaciente)
                    .addComponent(jLabel_PacienteSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_PacientesGreves, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TrasladoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_trasladarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1070, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel_PacienteSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_BuscarPorCi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_TrasladoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_trasladarSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_PacientesGreves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_CarnetIdentidadMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_CarnetDeIdentidadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(45, 45, 45)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1180, 150));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro formulario.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 680));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro formulario.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 500, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean flap = true;
        if (ValidarCampos.comprobarCamposTexto(txt_trasladarSala.getText())
                && ValidarCampos.comprobarCamposNumericos(txt_TrasladoPaciente.getText())
                && txt_TrasladoPaciente.getText().length() == 11) {

            hospital.trasladarPaciente(txt_trasladarSala.getText(), txt_trasladarSala.getText());
            JOptionPane.showMessageDialog(null, "El paciente ha sido agregado satisfactoriamente");

        } else {
            JOptionPane.showMessageDialog(null, "Error al comprobar los campos. Verifique los datos");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hospital.eliminarPaciente(jLabel_PacienteSelecionado.getText());
        ValidarCampos.cleardField(modeloTablaPaciente);

        for (Sala sala : hospital.getSalas()) {
            if (!sala.getPacientes().isEmpty()) {
                for (Paciente elemento : sala.getPacientes()) {
                    String[] relleno = new String[7];
                    relleno[0] = elemento.getNombreCompleto();
                    relleno[1] = elemento.getCi();
                    relleno[2] = elemento.getFechaNacimiento();
                    relleno[3] = elemento.getEnfermedad();
                    relleno[4] = hospital.conocerEstadoPaciente(elemento.getCi());
                    relleno[5] = String.valueOf(elemento.getTiempoEstimadoPermanencia());
                    relleno[6] = sala.getNombre();
                    modeloTablaPaciente.addRow(relleno);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jLabel_PacienteSelecionado.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
    }//GEN-LAST:event_jTable1MousePressed

    private void txt_BuscarPorCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarPorCiKeyReleased
        List<Paciente> pacientes = new ArrayList<>();
        for (Sala aux : hospital.getSalas()) {
            if (!aux.getPacientes().isEmpty()) {
                pacientes.addAll(aux.getPacientes());
            }
        }
        ValidarCampos.cleardField(modeloTablaPaciente);
        pacientes = ValidarCampos.filterPacientes(pacientes, txt_BuscarPorCi.getText());

        for (Paciente elemento : pacientes) {
            String[] relleno = new String[7];
            relleno[0] = elemento.getNombreCompleto();
            relleno[1] = elemento.getCi();
            relleno[2] = elemento.getFechaNacimiento();
            relleno[3] = elemento.getEnfermedad();
            relleno[4] = hospital.conocerEstadoPaciente(elemento.getCi());
            relleno[5] = String.valueOf(elemento.getTiempoEstimadoPermanencia());
            modeloTablaPaciente.addRow(relleno);
        }

    }//GEN-LAST:event_txt_BuscarPorCiKeyReleased

    private void txt_BuscarPorCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarPorCiKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_BuscarPorCi.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarPorCiKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ValidarCampos.comprobarCamposNumericos(txt_CarnetDeIdentidadPaciente.getText())
                && ValidarCampos.comprobarCamposNumericos(txt_CarnetIdentidadMedico.getText())
                && txt_CarnetDeIdentidadPaciente.getText().length() == 11
                && txt_CarnetIdentidadMedico.getText().length() == 11) {
            if (hospital.pacienteAtendMedico(txt_CarnetDeIdentidadPaciente.getText(), txt_CarnetIdentidadMedico.getText())) {
                JOptionPane.showMessageDialog(null, "El Paciente con el numero de identidad: " + txt_CarnetDeIdentidadPaciente.getText() + "\nha sido atendido por el Médico con el número de identificación: " + txt_CarnetIdentidadMedico.getText());
            } else {
                JOptionPane.showMessageDialog(null, "El Paciente con el numero de identidad: " + txt_CarnetDeIdentidadPaciente.getText() + "\nNO ha sido atendido por el Médico con el número de identificación: " + txt_CarnetIdentidadMedico.getText());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al comprobar los numero de identificación. Verifique los datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_CarnetIdentidadMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CarnetIdentidadMedicoKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_CarnetIdentidadMedico.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CarnetIdentidadMedicoKeyTyped

    private void txt_CarnetDeIdentidadPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CarnetDeIdentidadPacienteKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_CarnetDeIdentidadPaciente.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CarnetDeIdentidadPacienteKeyTyped

    private void txt_TrasladoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TrasladoPacienteKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c)) || txt_TrasladoPaciente.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TrasladoPacienteKeyTyped

    private void txt_trasladarSalaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_trasladarSalaKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_trasladarSalaKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroPaciente dialog = new RegistroPaciente(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_PacienteSelecionado;
    private javax.swing.JLabel jLabel_PacientesGreves;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_BuscarPorCi;
    private javax.swing.JTextField txt_CarnetDeIdentidadPaciente;
    private javax.swing.JTextField txt_CarnetIdentidadMedico;
    private javax.swing.JTextField txt_TrasladoPaciente;
    private javax.swing.JTextField txt_trasladarSala;
    // End of variables declaration//GEN-END:variables
}
