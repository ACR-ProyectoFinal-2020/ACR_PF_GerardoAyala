/*
*Nombre: Gerardo AyalaJuarez
*Tema:Proyecto final
*Descripcion: Gui del cliente para conectar al servidor
*fecha: 13 - Junio - 2020
*
*/
package cliente;

import RMI.AhorcadoInterface;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author futbo
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_apodo = new javax.swing.JTextField();
        jtf_sala = new javax.swing.JTextField();
        btn_iniciar = new javax.swing.JButton();
        jtf_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_puerto = new javax.swing.JTextField();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setText("Ahorcado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Apodo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sala:");

        jtf_apodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_apodoActionPerformed(evt);
            }
        });

        jtf_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_salaActionPerformed(evt);
            }
        });
        jtf_sala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_salaKeyPressed(evt);
            }
        });

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        jtf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_direccionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Puerto:");

        jtf_puerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_puertoActionPerformed(evt);
            }
        });
        jtf_puerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_puertoKeyPressed(evt);
            }
        });

        lbl_error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_apodo)
                                    .addComponent(jtf_direccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_iniciar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_apodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_iniciar)
                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jtf_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_apodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_apodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_apodoActionPerformed

    private void jtf_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_salaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_salaActionPerformed

    private void jtf_salaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_salaKeyPressed
        char tecla  = evt.getKeyChar();        // TODO add your handling code here:
        if(Character.isLetter(tecla)||Character.isWhitespace(tecla)){
            jtf_sala.setEditable(false);
        }else{
            jtf_sala.setEditable(true);
        }
    }//GEN-LAST:event_jtf_salaKeyPressed

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        String proto = jtf_direccion.getText();
        int port = 0;
        if(!(jtf_puerto.getText().equals(""))){
            port= Integer.parseInt(jtf_puerto.getText());
        }
        String apodo = jtf_apodo.getText();
        int sala = 0;
        if(!(jtf_sala.getText().equals(""))){
            sala = Integer.parseInt(jtf_sala.getText());
        }
            
        if(!(proto.equals("")||port==0||apodo.equals(""))){
        lbl_error.setText("");
        try{
            InetAddress ip = InetAddress.getByName(proto);
            AhorcadoInterface rmiop;
            Registry reg = LocateRegistry.getRegistry(proto,port);
            rmiop = (AhorcadoInterface)reg.lookup("gestor");
            int nsala = rmiop.generarPartida(sala, apodo);
            new Juego(nsala, reg, rmiop, apodo).setVisible(true);
            this.setVisible(false);
        } catch (UnknownHostException uhe) {
            lbl_error.setText("Ip desconocida o no valida");
        } catch (RemoteException re) {
           //no se pudo conectar al servidor
           lbl_error.setText("Error al conectar");
        } catch (NotBoundException nbe){
            //no se pudo conectar al servidor por erro de inteface
           lbl_error.setText("No encontro el objeto remoto");
        }
        }
        else{
            lbl_error.setText("Llenar todos los espacios");
        }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void jtf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_direccionActionPerformed

    private void jtf_puertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_puertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_puertoActionPerformed

    private void jtf_puertoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_puertoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_puertoKeyPressed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtf_apodo;
    private javax.swing.JTextField jtf_direccion;
    private javax.swing.JTextField jtf_puerto;
    private javax.swing.JTextField jtf_sala;
    private javax.swing.JLabel lbl_error;
    // End of variables declaration//GEN-END:variables
}
