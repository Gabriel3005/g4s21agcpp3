/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21agcpp3;

/**
 *
 * @author alexg
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaizcuadrada = new javax.swing.JButton();
        btnRaizcubica = new javax.swing.JButton();
        Factorialbtn = new javax.swing.JButton();
        Logaritmobtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Operaciones Basicas");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Primer numero ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Segundo numero ");

        btnSuma.setBackground(new java.awt.Color(0, 204, 0));
        btnSuma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSuma.setText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(0, 204, 0));
        btnResta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnResta.setText("Resta");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(0, 204, 0));
        btnMultiplicacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMultiplicacion.setText("Multiplicacion ");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(0, 204, 0));
        btnDivision.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDivision.setText("Division ");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(0, 204, 0));
        btnPotencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPotencia.setText("Potencia");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnRaizcuadrada.setBackground(new java.awt.Color(51, 153, 255));
        btnRaizcuadrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRaizcuadrada.setText("Raiz cuadrada");
        btnRaizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizcuadradaActionPerformed(evt);
            }
        });

        btnRaizcubica.setBackground(new java.awt.Color(51, 153, 255));
        btnRaizcubica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRaizcubica.setText("Raiz cubica");
        btnRaizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizcubicaActionPerformed(evt);
            }
        });

        Factorialbtn.setBackground(new java.awt.Color(51, 153, 255));
        Factorialbtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Factorialbtn.setText("Factorial ");
        Factorialbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactorialbtnActionPerformed(evt);
            }
        });

        Logaritmobtn.setBackground(new java.awt.Color(51, 153, 255));
        Logaritmobtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Logaritmobtn.setText("Logaritmo ");
        Logaritmobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogaritmobtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Resultado ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRaizcuadrada)
                        .addGap(18, 18, 18)
                        .addComponent(btnRaizcubica)
                        .addGap(18, 18, 18)
                        .addComponent(Factorialbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Logaritmobtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSuma)
                        .addGap(18, 18, 18)
                        .addComponent(btnResta)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnDivision)
                        .addGap(18, 18, 18)
                        .addComponent(btnPotencia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivision)
                    .addComponent(btnMultiplicacion)
                    .addComponent(btnResta)
                    .addComponent(btnSuma)
                    .addComponent(btnPotencia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaizcuadrada)
                    .addComponent(btnRaizcubica)
                    .addComponent(Factorialbtn)
                    .addComponent(Logaritmobtn))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Operaciones.OperacionesBasicas objOperacionesBasicas = new  Operaciones.OperacionesBasicas();
        jLabel4.setText("El resultado de la suma es " + String.valueOf(objOperacionesBasicas.Suma(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Operaciones.OperacionesBasicas objOperacionesBasicas = new  Operaciones.OperacionesBasicas();
        jLabel4.setText("El resultado de la resta es " + String.valueOf(objOperacionesBasicas.Resta(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Operaciones.OperacionesBasicas objOperacionesBasicas = new  Operaciones.OperacionesBasicas();
        jLabel4.setText("El resultado de la multiplicacion es " + String.valueOf(objOperacionesBasicas.Multiplicacion(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Operaciones.OperacionesBasicas objOperacionesBasicas = new  Operaciones.OperacionesBasicas();
        jLabel4.setText("El resultado de la division es " + String.valueOf(objOperacionesBasicas.Division(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la potencia es " + String.valueOf(objOperacionesAvanzadas.potencia(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnRaizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizcuadradaActionPerformed
        // TODO add your handling code here:
        Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la raiz cuadrada es " + String.valueOf(objOperacionesAvanzadas.Raizcuadrada( Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnRaizcuadradaActionPerformed

    private void btnRaizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizcubicaActionPerformed
        // TODO add your handling code here:
         Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la raiz cubica es " + String.valueOf(objOperacionesAvanzadas.Raizcubica(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnRaizcubicaActionPerformed

    private void FactorialbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactorialbtnActionPerformed
        // TODO add your handling code here:
         Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la factorial es " + String.valueOf(objOperacionesAvanzadas.Factorial(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_FactorialbtnActionPerformed

    private void LogaritmobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogaritmobtnActionPerformed
        // TODO add your handling code here:
         Operaciones.OperacionesAvanzadas objOperacionesAvanzadas = new  Operaciones.OperacionesAvanzadas();
        jLabel4.setText("El resultado de la logaritmo es " + String.valueOf(objOperacionesAvanzadas.Logaritmo(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_LogaritmobtnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Factorialbtn;
    private javax.swing.JButton Logaritmobtn;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaizcuadrada;
    private javax.swing.JButton btnRaizcubica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
