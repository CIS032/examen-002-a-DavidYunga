/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenN2;

import examenn2.ListaProfesores;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InterfaceE2 extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceE2
     */
    public InterfaceE2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextCedula = new javax.swing.JTextField();
        jTextNombres = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jButGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextHOrasClase = new javax.swing.JTextField();
        jTextCarrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLeer = new javax.swing.JTextArea();
        cmbProfe = new javax.swing.JComboBox<>();
        jTehoraSe = new javax.swing.JTextField();
        jLabhoraSemanal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombresActionPerformed(evt);
            }
        });

        jButGuardar.setText("Guardar");
        jButGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Cedula");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Horas de Clase");

        jLabel5.setText("Carrera");

        jButtLeer.setText("Leer");
        jButtLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtLeerActionPerformed(evt);
            }
        });

        txtLeer.setColumns(20);
        txtLeer.setRows(5);
        jScrollPane1.setViewportView(txtLeer);

        cmbProfe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo completo", "Medio Tiempo", "Tiempo Parcial" }));
        cmbProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfeActionPerformed(evt);
            }
        });

        jTehoraSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTehoraSeActionPerformed(evt);
            }
        });

        jLabhoraSemanal.setText("horas semanal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButGuardar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextHOrasClase, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTextApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTextCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(cmbProfe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jTehoraSe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabhoraSemanal))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButtLeer)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButGuardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTextHOrasClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabhoraSemanal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTehoraSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(cmbProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtLeer)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombresActionPerformed

    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
//         String  c = jTextCedula.getText();
//        String nombr = jTextNombres.getText();
//        String apellid = jTextApellidos.getText();
//        int h = Integer.parseInt(jTextHOrasClase.getText());
//        String carrer = jTextCarrera.getText();
//        examenn2.ProfesorTiempoCompleto profe = new examenn2.ProfesorTiempoCompleto(c, nombr, apellid, h, carrer);
//       ListaProfesores l = new ListaProfesores();
//       l.agregar(profe);
//      l.grabar();

        int valor = cmbProfe.getSelectedIndex();
        if (valor == 0) {
            String c = jTextCedula.getText();
            String nombr = jTextNombres.getText();
            String apellid = jTextApellidos.getText();
            int h = Integer.parseInt(jTextHOrasClase.getText());
            String carrer = jTextCarrera.getText();
            examenn2.ProfesorTiempoCompleto profe = new examenn2.ProfesorTiempoCompleto(c, nombr, apellid, h, carrer);
            ListaProfesores l = new ListaProfesores();
            l.agregar(profe);
            l.grabar();
            jTextCedula.setText("");
            jTextNombres.setText("");
            jTextApellidos.setText("");
            jTextHOrasClase.setText("");
            jTextCarrera.setText("");

        } else if (valor == 1) {
            String c = jTextCedula.getText();
            String nombr = jTextNombres.getText();
            String apellid = jTextApellidos.getText();
            int h = Integer.parseInt(jTextHOrasClase.getText());
            String carrer = jTextCarrera.getText();
            examenn2.ProfesorMedioTiempo profe = new examenn2.ProfesorMedioTiempo(c, nombr, apellid, h, carrer);
            ListaProfesores l = new ListaProfesores();
            l.agregar(profe);
            l.grabar();
            jTextCedula.setText("");
            jTextNombres.setText("");
            jTextApellidos.setText("");
            jTextHOrasClase.setText("");
            jTextCarrera.setText("");
        }else if (valor == 2) {
            String c = jTextCedula.getText();
            String nombr = jTextNombres.getText();
            String apellid = jTextApellidos.getText();
            int h = Integer.parseInt(jTextHOrasClase.getText());
            String carrer = jTextCarrera.getText();
            int hsem = Integer.parseInt(jTehoraSe.getText());
            examenn2.ProfesorTiempoParcial profe = new examenn2.ProfesorTiempoParcial(c, nombr, apellid, h, carrer,hsem);
            ListaProfesores l = new ListaProfesores();
            l.agregar(profe);
            l.grabar();
            jTextCedula.setText("");
            jTextNombres.setText("");
            jTextApellidos.setText("");
            jTextHOrasClase.setText("");
            jTextCarrera.setText("");
        }
    }//GEN-LAST:event_jButGuardarActionPerformed

    private void jButtLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtLeerActionPerformed
        txtLeer.setText("");
        String datos = ListaProfesores.leerPofesores();
        this.txtLeer.append(datos);

    }//GEN-LAST:event_jButtLeerActionPerformed

    private void cmbProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfeActionPerformed

    }//GEN-LAST:event_cmbProfeActionPerformed

    private void jTehoraSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTehoraSeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTehoraSeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceE2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceE2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbProfe;
    private javax.swing.JButton jButGuardar;
    private javax.swing.JButton jButtLeer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabhoraSemanal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTehoraSe;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextCarrera;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextHOrasClase;
    private javax.swing.JTextField jTextNombres;
    private javax.swing.JTextArea txtLeer;
    // End of variables declaration//GEN-END:variables
}
