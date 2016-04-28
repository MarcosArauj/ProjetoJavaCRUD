package br.stylus.funilaria.view.telasIniciais;

import br.stylus.funilaria.view.telasCadastros.FormFuncionario;

public class TelaAdministrador extends javax.swing.JFrame {
    
    FormFuncionario tela = new FormFuncionario();

    public TelaAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoAreaDeTrabalho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de Trabalho Administrdor");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelFundoAreaDeTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundoAreaDeTrabalho.png"))); // NOI18N
        getContentPane().add(jLabelFundoAreaDeTrabalho);
        jLabelFundoAreaDeTrabalho.setBounds(0, 0, 1120, 610);

        jMenuBar1.setToolTipText("");

        jMenuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/cadastros.png"))); // NOI18N

        jMenuItemCadFuncionario.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenuItemCadFuncionario.setText("Funcionario");
        jMenuItemCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadFuncionario);

        jMenuBar1.add(jMenuCadastrar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1099, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionarioActionPerformed
        if(tela == null){
                   tela = new FormFuncionario();
                   tela.setVisible(true);
                   tela.setResizable(false);
               } else {
                   tela.setVisible(true);
                   tela.setResizable(false);
               }
    }//GEN-LAST:event_jMenuItemCadFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoAreaDeTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadFuncionario;
    // End of variables declaration//GEN-END:variables
}
