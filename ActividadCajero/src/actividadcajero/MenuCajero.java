/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package actividadcajero;

import java.awt.Color;
import java.awt.Cursor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MenuCajero extends javax.swing.JFrame {

    float Saldo=1000;
    int AuxRetiro;
    DefaultTableModel model = new DefaultTableModel();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public MenuCajero() {
        initComponents();
        lblSaldoActual.setText("Tu saldo actual es de: $"+Saldo+"MXN");
        groupRetiro.add(rbtn50);
        groupRetiro.add(rbtn100);
        groupRetiro.add(rbtn200);
        groupRetiro.add(rbtn500);
        groupRetiro.add(rbtn1000);
        groupRetiro.add(rbtnCantidad);
        model.addColumn("Fecha");
        model.addColumn("Retiro");
        tblHistorico.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRetiro = new javax.swing.ButtonGroup();
        pnBackground = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        pnSaldo = new javax.swing.JPanel();
        lblSaldo = new javax.swing.JLabel();
        pnRetirar = new javax.swing.JPanel();
        lblRetirar = new javax.swing.JLabel();
        pnHistorico = new javax.swing.JPanel();
        lblHistorico = new javax.swing.JLabel();
        pnSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        tpnMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblSaldoActual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtn50 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbtn100 = new javax.swing.JRadioButton();
        rbtn200 = new javax.swing.JRadioButton();
        rbtn500 = new javax.swing.JRadioButton();
        rbtn1000 = new javax.swing.JRadioButton();
        rbtnCantidad = new javax.swing.JRadioButton();
        txtCantidad = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setBackground(new java.awt.Color(153, 0, 51));

        pnSaldo.setBackground(new java.awt.Color(153, 0, 51));
        pnSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaldo.setBackground(new java.awt.Color(153, 0, 51));
        lblSaldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("Consultar saldo");
        lblSaldo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSaldoMouseMoved(evt);
            }
        });
        lblSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaldoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSaldoMouseExited(evt);
            }
        });
        pnSaldo.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        pnRetirar.setBackground(new java.awt.Color(153, 0, 51));
        pnRetirar.setPreferredSize(new java.awt.Dimension(180, 41));
        pnRetirar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRetirar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRetirar.setForeground(new java.awt.Color(255, 255, 255));
        lblRetirar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRetirar.setText("Retirar saldo");
        lblRetirar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRetirarMouseMoved(evt);
            }
        });
        lblRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetirarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRetirarMouseExited(evt);
            }
        });
        pnRetirar.add(lblRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        pnHistorico.setBackground(new java.awt.Color(153, 0, 51));
        pnHistorico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHistorico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHistorico.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorico.setText("Histórico");
        lblHistorico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblHistoricoMouseMoved(evt);
            }
        });
        lblHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHistoricoMouseExited(evt);
            }
        });
        pnHistorico.add(lblHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        pnSalir.setBackground(new java.awt.Color(153, 0, 51));

        lblSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");
        lblSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSalirMouseMoved(evt);
            }
        });
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnSalirLayout = new javax.swing.GroupLayout(pnSalir);
        pnSalir.setLayout(pnSalirLayout);
        pnSalirLayout.setHorizontalGroup(
            pnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnSalirLayout.setVerticalGroup(
            pnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pnBackground.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 430));

        tpnMenu.setEnabled(false);

        lblSaldoActual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSaldoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        tpnMenu.addTab("saldo", jPanel1);

        rbtn50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn50.setText("$50.00MXN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RETIRO");

        rbtn100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn100.setText("$100.00MXN");

        rbtn200.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn200.setText("$200.00MXN");

        rbtn500.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn500.setText("$500.00MXN");

        rbtn1000.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn1000.setText("$1000.00MXN");

        rbtnCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnCantidad.setText("Otra cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetirarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn200)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn50)
                                    .addComponent(rbtn100))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn1000)
                                    .addComponent(rbtn500)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(rbtnCantidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn50)
                    .addComponent(rbtn500))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn100)
                    .addComponent(rbtn1000))
                .addGap(18, 18, 18)
                .addComponent(rbtn200)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        tpnMenu.addTab("retirar", jPanel2);

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Retiro"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ultimos 10 movimientos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        tpnMenu.addTab("historico", jPanel3);

        pnBackground.add(tpnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -30, 400, 460));

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSaldoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaldoMouseMoved
        pnSaldo.setBackground(new Color(204,0,0));
        pnSaldo.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_lblSaldoMouseMoved

    private void lblSaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaldoMouseExited
        pnSaldo.setBackground(new Color(153,0,51));
    }//GEN-LAST:event_lblSaldoMouseExited

    private void lblRetirarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseMoved
        pnRetirar.setBackground(new Color(204,0,0));
        pnRetirar.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_lblRetirarMouseMoved

    private void lblRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseExited
        pnRetirar.setBackground(new Color(153,0,51));
    }//GEN-LAST:event_lblRetirarMouseExited

    private void lblSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseMoved
        pnSalir.setBackground(new Color(204,0,0));
        pnSalir.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_lblSalirMouseMoved

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        pnSalir.setBackground(new Color(153,0,51));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaldoMouseClicked
        tpnMenu.setSelectedIndex(0);
        lblSaldoActual.setText("Tu saldo actual es de: $"+Saldo+"MXN");
    }//GEN-LAST:event_lblSaldoMouseClicked

    private void lblHistoricoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoricoMouseMoved
        pnHistorico.setBackground(new Color(204,0,0));
        pnHistorico.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_lblHistoricoMouseMoved

    private void lblHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoricoMouseExited
        pnHistorico.setBackground(new Color(153,0,51));
    }//GEN-LAST:event_lblHistoricoMouseExited

    private void lblRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetirarMouseClicked
        tpnMenu.setSelectedIndex(1);
        rbtn50.setSelected(true);
        
    }//GEN-LAST:event_lblRetirarMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >47 && key <=57;
        if(txtCantidad.getText().trim().length()>3||!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseClicked
        if(rbtn50.isSelected()){
            AuxRetiro=50;
        }else if(rbtn100.isSelected()){
            AuxRetiro=100;
        }else if(rbtn200.isSelected()){
            AuxRetiro=200;
        }else if(rbtn500.isSelected()){
            AuxRetiro=500;
        }else if(rbtn1000.isSelected()){
            AuxRetiro=1000;
        }else if(rbtnCantidad.isSelected()){
            AuxRetiro=Integer.parseInt(txtCantidad.getText());
        }
        
        if(AuxRetiro>Saldo){
            JOptionPane.showMessageDialog(this,"Fondos insuficientes","Error",JOptionPane.ERROR_MESSAGE);
            txtCantidad.setText("");
        }else{
            JOptionPane.showMessageDialog(this,"Saldo reitrado con exito","Exito",1);
            Saldo = Saldo - AuxRetiro;
            txtCantidad.setText("");
            
            model.addRow(new Object[]{dtf.format(LocalDateTime.now()),"$"+AuxRetiro+".00MXN"});
            tblHistorico.setModel(model);
            AuxRetiro=0;
        }
    }//GEN-LAST:event_btnRetirarMouseClicked

    private void lblHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHistoricoMouseClicked
        tpnMenu.setSelectedIndex(2);
    }//GEN-LAST:event_lblHistoricoMouseClicked

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
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.ButtonGroup groupRetiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblRetirar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoActual;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnHistorico;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRetirar;
    private javax.swing.JPanel pnSaldo;
    private javax.swing.JPanel pnSalir;
    private javax.swing.JRadioButton rbtn100;
    private javax.swing.JRadioButton rbtn1000;
    private javax.swing.JRadioButton rbtn200;
    private javax.swing.JRadioButton rbtn50;
    private javax.swing.JRadioButton rbtn500;
    private javax.swing.JRadioButton rbtnCantidad;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTabbedPane tpnMenu;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
