package br.stylus.funilaria.view.telasIniciais;

import br.stylus.funilaria.view.telasCadastros.FormClientePessoaFisica;
import br.stylus.funilaria.view.telasCadastros.FormClientePessoaJuridica;
import br.stylus.funilaria.view.telasCadastros.FormFornecedor;
import br.stylus.funilaria.view.telasCadastros.FormFuncionario;
import br.stylus.funilaria.view.telasCadastros.FormProdutos;
import br.stylus.funilaria.view.telasCadastros.FormServicos;

public class TelaAdministrador extends javax.swing.JFrame {
    
    FormFuncionario tela = new FormFuncionario();
    FormFornecedor tela2 = new FormFornecedor();
    FormClientePessoaFisica tela3 = new FormClientePessoaFisica();
    FormClientePessoaJuridica tela4 = new FormClientePessoaJuridica();
    FormProdutos tela5 = new FormProdutos();
    FormServicos tela6 = new FormServicos();

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
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadClientePessoaFisica = new javax.swing.JMenuItem();
        jMenuItemCadClientePessoaJuridica = new javax.swing.JMenuItem();
        jMenuItemCadProdutos = new javax.swing.JMenuItem();
        jMenuItemCadServicos = new javax.swing.JMenuItem();

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

        jMenuItemCadFornecedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadFornecedor.setText("Fornecedor");
        jMenuItemCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadFornecedor);

        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItemCadClientePessoaFisica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadClientePessoaFisica.setText("Pessoa Fisíca");
        jMenuItemCadClientePessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientePessoaFisicaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadClientePessoaFisica);

        jMenuItemCadClientePessoaJuridica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadClientePessoaJuridica.setText("Pessoa Juridica");
        jMenuItemCadClientePessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientePessoaJuridicaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadClientePessoaJuridica);

        jMenuCadastrar.add(jMenu1);

        jMenuItemCadProdutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadProdutos.setText("Produtos");
        jMenuItemCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadProdutos);

        jMenuItemCadServicos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadServicos.setText("Serviços");
        jMenuItemCadServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadServicosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadServicos);

        jMenuBar1.add(jMenuCadastrar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1099, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionarioActionPerformed
        if(tela == null){
            tela = new FormFuncionario();
            tela.setVisible(true);
              
              } else {
               tela.setVisible(true);
             
           }
    }//GEN-LAST:event_jMenuItemCadFuncionarioActionPerformed

    private void jMenuItemCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFornecedorActionPerformed
          if(tela2 == null){
              tela2 = new FormFornecedor();
              tela2.setVisible(true);
                
               } else {
                 tela2.setVisible(true);
                 
            }
    }//GEN-LAST:event_jMenuItemCadFornecedorActionPerformed

    private void jMenuItemCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutosActionPerformed
            if(tela5 == null){
                tela5 = new FormProdutos();
                tela5.setVisible(true);
      
               } else {
                tela5.setVisible(true);
     
           } 
    }//GEN-LAST:event_jMenuItemCadProdutosActionPerformed

    private void jMenuItemCadServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadServicosActionPerformed
            if(tela6 == null){
                tela6 = new FormServicos();
                tela6.setVisible(true);
    
               } else {
                tela6.setVisible(true);
        
           }
    }//GEN-LAST:event_jMenuItemCadServicosActionPerformed

    private void jMenuItemCadClientePessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClientePessoaFisicaActionPerformed
        if(tela3 == null){
                tela3 = new FormClientePessoaFisica();
                tela3.setVisible(true);
               
               } else {
                tela3.setVisible(true);
             
           }
    }//GEN-LAST:event_jMenuItemCadClientePessoaFisicaActionPerformed

    private void jMenuItemCadClientePessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClientePessoaJuridicaActionPerformed
         if(tela4 == null){
                tela4 = new FormClientePessoaJuridica();
                tela4.setVisible(true);
                 
               } else {
                 tela4.setVisible(true);
                  
           }
    }//GEN-LAST:event_jMenuItemCadClientePessoaJuridicaActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadClientePessoaFisica;
    private javax.swing.JMenuItem jMenuItemCadClientePessoaJuridica;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadFuncionario;
    private javax.swing.JMenuItem jMenuItemCadProdutos;
    private javax.swing.JMenuItem jMenuItemCadServicos;
    // End of variables declaration//GEN-END:variables
}
