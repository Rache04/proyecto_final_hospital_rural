package Vistas;

import controllers.HospitalRural;
import interfaces.IHospitalRural;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Sala;
import models.SalaTerapia;

public class AdicionarSala extends javax.swing.JDialog {

    private DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };
    ;
    private ArrayList<String> enfermedades = new ArrayList<>();
    private String auxEliminarEnfermedad = "";
    private int auxEliminarTabla;

    private IHospitalRural hospital;

    public AdicionarSala(java.awt.Frame parent, boolean modal, HospitalRural hospital) {
        super(parent, modal);
        initComponents();
        this.hospital = hospital;
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(443, 620);
        setTitle("Registro Sala");

        jRadioButton_Acompanante_Si.setSelected(true);
        jRadioButton_SalaTerapia_Si.setSelected(true);
        jRadioButton_TerapiaIntenciva.setSelected(true);
        if (jRadioButton_SalaTerapia_Si.isSelected()) {
            jPanel_SalaTerapia.setVisible(true);
        } else {
            jPanel_SalaTerapia.setVisible(false);
        }

        this.model.addColumn("Enfermedades tratadas en la Sala");
        jTable_Enfermedades.setModel(this.model);

        /* Fagmento de código para poder selecionar a las enfermedades de la
         tabla de las enfermedades para posteriormente eliminarlas
         */
        jTable_Enfermedades.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable tabla = (JTable) Mouse_evt.getSource();
                Point paint = Mouse_evt.getPoint();
                int row = tabla.rowAtPoint(paint);
                if (Mouse_evt.getClickCount() == 1) {
                    auxEliminarEnfermedad = jTable_Enfermedades.getValueAt(jTable_Enfermedades.getSelectedRow(), 0).toString();
                    auxEliminarTabla = jTable_Enfermedades.getSelectedRow();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Enfermedades = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel_SalaTerapia = new javax.swing.JPanel();
        txt_NombreDirector = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_Acompanante_Si = new javax.swing.JRadioButton();
        jRadioButton_Acompanante_No = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton_TerapiaIntenciva = new javax.swing.JRadioButton();
        jRadioButton_TerapiaIntermedia = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_CantidadCamas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Enfermedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_SalaTerapia_Si = new javax.swing.JRadioButton();
        jRadioButton_SalaTerapia_No = new javax.swing.JRadioButton();
        jButton_AddEnfermedad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Enfermedades.setBackground(new java.awt.Color(51, 51, 51));
        jTable_Enfermedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Enfermedades.setForeground(new java.awt.Color(255, 255, 255));
        jTable_Enfermedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Enfermedades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 400, 140));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario para registrar sala", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_SalaTerapia.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_SalaTerapia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_NombreDirector.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_NombreDirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_NombreDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreDirectorActionPerformed(evt);
            }
        });
        txt_NombreDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreDirectorKeyTyped(evt);
            }
        });
        jPanel_SalaTerapia.add(txt_NombreDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 270, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Terapia Intermedia:");
        jPanel_SalaTerapia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre Director:");
        jPanel_SalaTerapia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        buttonGroup1.add(jRadioButton_Acompanante_Si);
        jRadioButton_Acompanante_Si.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Acompanante_Si.setText("Si");
        jPanel_SalaTerapia.add(jRadioButton_Acompanante_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        buttonGroup1.add(jRadioButton_Acompanante_No);
        jRadioButton_Acompanante_No.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Acompanante_No.setText("No");
        jRadioButton_Acompanante_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Acompanante_NoActionPerformed(evt);
            }
        });
        jPanel_SalaTerapia.add(jRadioButton_Acompanante_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Acompañante:");
        jPanel_SalaTerapia.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Terapia Intenciva:");
        jPanel_SalaTerapia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        buttonGroup3.add(jRadioButton_TerapiaIntenciva);
        jRadioButton_TerapiaIntenciva.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_SalaTerapia.add(jRadioButton_TerapiaIntenciva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        buttonGroup3.add(jRadioButton_TerapiaIntermedia);
        jRadioButton_TerapiaIntermedia.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_SalaTerapia.add(jRadioButton_TerapiaIntermedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jPanel1.add(jPanel_SalaTerapia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sala de Terapia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, -1));

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
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, 20));

        txt_CantidadCamas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_CantidadCamas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_CantidadCamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadCamasKeyTyped(evt);
            }
        });
        jPanel1.add(txt_CantidadCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad Máxima de Camas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, -1));

        txt_Enfermedad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Enfermedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Enfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnfermedadActionPerformed(evt);
            }
        });
        txt_Enfermedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EnfermedadKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar Enfermedad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre Sala:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        buttonGroup2.add(jRadioButton_SalaTerapia_Si);
        jRadioButton_SalaTerapia_Si.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_SalaTerapia_Si.setText("Si");
        jRadioButton_SalaTerapia_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SalaTerapia_SiActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_SalaTerapia_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        buttonGroup2.add(jRadioButton_SalaTerapia_No);
        jRadioButton_SalaTerapia_No.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_SalaTerapia_No.setText("No");
        jRadioButton_SalaTerapia_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SalaTerapia_NoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_SalaTerapia_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jButton_AddEnfermedad.setText("Agregar");
        jButton_AddEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEnfermedadActionPerformed(evt);
            }
        });
        jButton_AddEnfermedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton_AddEnfermedadKeyTyped(evt);
            }
        });
        jPanel1.add(jButton_AddEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, 25));

        jButton1.setText("Eliminar enfermedad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 350));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptado.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rechazado.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 260, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro formulario.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEnfermedadActionPerformed

        //add Enfermedades a la lista de enfermedades de la sala
        String[] datos = new String[1];
        if (!txt_Enfermedad.getText().equals("")) {

            if (!txt_Enfermedad.getText().equals("Enfermedad ya existe")) {
                if (!enfermedades.contains(txt_Enfermedad.getText())) {
                    this.enfermedades.add(txt_Enfermedad.getText());
                    datos[0] = txt_Enfermedad.getText();
                    this.model.addRow(datos);
                    txt_Enfermedad.setText("");
                    txt_Enfermedad.setBackground(Color.white);
                    txt_Enfermedad.setText("");
                } else {
                    txt_Enfermedad.setText("Enfermedad ya existe");
                    txt_Enfermedad.setBackground(Color.red);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Escriba la enfermedad que desea agregar");
        }
    }//GEN-LAST:event_jButton_AddEnfermedadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!this.auxEliminarEnfermedad.equals("")) {
            this.enfermedades.remove(this.auxEliminarEnfermedad);

            this.model.removeRow(this.auxEliminarTabla);
            auxEliminarEnfermedad = "";

            jTable_Enfermedades.setModel(model);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la enfermedad que desea eliminar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String validacion = "";
        boolean flap = true;

        if (this.hospital.getSalas().size() != 0) {
            for (Sala aux : this.hospital.getSalas()) {
                if (aux.getNombre().equals(txt_Nombre.getText())) {
                    JOptionPane.showMessageDialog(null, "ERROR. Ya existe una sala con el nombre de: " + txt_Nombre.getText());
                    txt_Nombre.setText("");
                }
            }
        }

        if (!ValidarCampos.comprobarCamposTexto(txt_Nombre.getText())) {
            flap = false;
            validacion = validacion + "\n-Nombre";
        }
        if (jRadioButton_SalaTerapia_Si.isSelected()) {
            if (!ValidarCampos.comprobarCamposTexto(txt_NombreDirector.getText())) {
                flap = false;
                validacion = validacion + "\n-Nombre del Director";
            }
        }
        if (!ValidarCampos.comprobarCamposNumericos(txt_CantidadCamas.getText())
                || ValidarCampos.convertirEntero(txt_CantidadCamas.getText()) == 0) {
            flap = false;
            validacion = validacion + "\n-Cantidad Máxima de camas";
        }
        if (this.enfermedades.size() <= 0) {
            flap = false;
            validacion = validacion + "\n-La Sala a registrar no se especialisa en ninguna enfermedad";
        }

        if (flap) {
            //Adicionar una nueva Sala médica
            String tipoSala = "";
            boolean acompanante = true;

            if (jRadioButton_Acompanante_Si.isSelected()) {
                acompanante = true;
            } else {
                acompanante = false;
            }
            if (jRadioButton_TerapiaIntenciva.isSelected()) {
                tipoSala = "intensiva";
            } else {
                tipoSala = "intermedia";
            }

            if (jRadioButton_SalaTerapia_No.isSelected()) {
                Sala sala = new Sala(txt_Nombre.getText(), this.enfermedades, ValidarCampos.convertirEntero(txt_CantidadCamas.getText()), null);
                this.hospital.crearSala(sala);
                JOptionPane.showMessageDialog(null, "La sala ha sido creada satisfactoriamente");

            } else {
//              Adicionar una nueva Sala médica de terapia intenciva
                Sala salaTerapia = new SalaTerapia(tipoSala, acompanante, txt_NombreDirector.getText(), txt_Nombre.getText(), this.enfermedades, ValidarCampos.convertirEntero(txt_CantidadCamas.getText()), null);
                this.hospital.crearSala(salaTerapia);
                JOptionPane.showMessageDialog(null, "La sala ha sido creada satisfactoriamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Verifique los siguientes campos:" + validacion);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_EnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnfermedadActionPerformed

    private void txt_NombreDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreDirectorActionPerformed

    private void jRadioButton_Acompanante_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Acompanante_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_Acompanante_NoActionPerformed

    private void jRadioButton_SalaTerapia_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SalaTerapia_SiActionPerformed
        jPanel_SalaTerapia.setVisible(true);
    }//GEN-LAST:event_jRadioButton_SalaTerapia_SiActionPerformed

    private void jRadioButton_SalaTerapia_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SalaTerapia_NoActionPerformed
        jPanel_SalaTerapia.setVisible(false);
    }//GEN-LAST:event_jRadioButton_SalaTerapia_NoActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_NombreDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreDirectorKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreDirectorKeyTyped

    private void txt_CantidadCamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadCamasKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposNumericos(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CantidadCamasKeyTyped

    private void txt_EnfermedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EnfermedadKeyTyped
        char c = evt.getKeyChar();
        if (!ValidarCampos.comprobarCamposTexto(String.valueOf(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_EnfermedadKeyTyped

    private void jButton_AddEnfermedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_AddEnfermedadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AddEnfermedadKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_Nombre.setText("");
        txt_Enfermedad.setText("");
        txt_NombreDirector.setText("");
        txt_CantidadCamas.setText("");
        
        for(int i = 0; i < jTable_Enfermedades.getRowCount(); i++ ){
              model.removeRow(i);
              i = -1;
          }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionarSala dialog = new AdicionarSala(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_AddEnfermedad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_SalaTerapia;
    private javax.swing.JRadioButton jRadioButton_Acompanante_No;
    private javax.swing.JRadioButton jRadioButton_Acompanante_Si;
    private javax.swing.JRadioButton jRadioButton_SalaTerapia_No;
    private javax.swing.JRadioButton jRadioButton_SalaTerapia_Si;
    private javax.swing.JRadioButton jRadioButton_TerapiaIntenciva;
    private javax.swing.JRadioButton jRadioButton_TerapiaIntermedia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Enfermedades;
    private javax.swing.JTextField txt_CantidadCamas;
    private javax.swing.JTextField txt_Enfermedad;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NombreDirector;
    // End of variables declaration//GEN-END:variables
}
