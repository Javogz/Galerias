/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7_museo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 19008082-k
 */
public class frmUsuario extends javax.swing.JFrame {
    ArrayList<Administrador> datos=new ArrayList<>();
    /**
     * Creates new form frmUsuario
     */
    public frmUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        nUsuario = new javax.swing.JTextField();
        eUsuario = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        pUsuario = new javax.swing.JPasswordField();
        bVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setText("Nombre usuario");

        l2.setText("Password usuario");

        l3.setText("Email usuario");

        nUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nUsuarioActionPerformed(evt);
            }
        });

        eUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eUsuarioActionPerformed(evt);
            }
        });

        bCrear.setText("Crear");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        bVer.setText("Ver");
        bVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l1)
                        .addGap(30, 30, 30)
                        .addComponent(nUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2)
                            .addComponent(l3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eUsuario)
                            .addComponent(pUsuario))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCrear)
                .addGap(18, 18, 18)
                .addComponent(bVer)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(nUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(eUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrear)
                    .addComponent(bVer))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nUsuarioActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        String pass=String.copyValueOf(pUsuario.getPassword());
        if (pass.equals("")||eUsuario.equals("")||nUsuario.equals("")) {
            JOptionPane.showMessageDialog(this, "Faltan datos");
            nUsuario.grabFocus();
        }
        else{
        datos.add(new Administrador(nUsuario.getText(), pass, eUsuario.getText()));
        /*Administrador admin = new Administrador(nUsuario.getText(),pass,eUsuario.getText());
        JOptionPane.showMessageDialog(this, "Email: "+admin.getEmailUsuario()+
                " // Nombre: "+admin.getNombreUsuario());*/
        //Clear
        eUsuario.setText("");
        nUsuario.setText("");
        pUsuario.setText("");
        nUsuario.grabFocus();
        }
    }//GEN-LAST:event_bCrearActionPerformed

    private void eUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eUsuarioActionPerformed

    private void bVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerActionPerformed
        String mensaje="Lista de Usuarios\n";
        for (Administrador ver:datos) {
            mensaje+="Email: "+ver.getEmailUsuario()+" // Nombre: "+ver.getNombreUsuario()+"\n";
        }
        JOptionPane.showMessageDialog(this, mensaje);
        nUsuario.grabFocus();
    }//GEN-LAST:event_bVerActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bVer;
    private javax.swing.JTextField eUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField nUsuario;
    private javax.swing.JPasswordField pUsuario;
    // End of variables declaration//GEN-END:variables
}
