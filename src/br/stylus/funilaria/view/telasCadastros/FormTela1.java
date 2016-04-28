package br.stylus.funilaria.view.telasCadastros;

public class FormTela1 extends javax.swing.JFrame {

    public FormTela1() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrarEmpresa = new javax.swing.JButton();
        jLabelFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(544, 299));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Agora faça o cadastramento de sua empresa! ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 470, 60);

        jButtonCadastrarEmpresa.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButtonCadastrarEmpresa.setText("Clique Aqui");
        jButtonCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarEmpresa);
        jButtonCadastrarEmpresa.setBounds(200, 150, 130, 40);

        jLabelFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoTela);
        jLabelFundoTela.setBounds(-10, -10, 590, 410);

        setSize(new java.awt.Dimension(554, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarEmpresaActionPerformed
        FormEmpresa tela  = new FormEmpresa();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrarEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoTela;
    // End of variables declaration//GEN-END:variables
}
