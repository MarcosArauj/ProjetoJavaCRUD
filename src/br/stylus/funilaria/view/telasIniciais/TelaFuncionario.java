package br.stylus.funilaria.view.telasIniciais;

import br.stylus.funilaria.view.telasCadastros.CadastroClientePessoaFisica;
import br.stylus.funilaria.view.telasCadastros.CadastroClientePessoaJuridica;
import br.stylus.funilaria.view.telasCadastros.CadastroProdutos;
import br.stylus.funilaria.view.telasCadastros.CadastroServicos;
import br.stylus.funilaria.view.telasPesquisasEEdicoes.PesquisaClientePessoaFisica;
import br.stylus.funilaria.view.telasPesquisasEEdicoes.PesquisaClientePessoaJuridica;
import br.stylus.funilaria.view.telasPesquisasEEdicoes.PesquisaProduto;
import br.stylus.funilaria.view.telasPesquisasEEdicoes.PesquisaServicos;

public class TelaFuncionario extends javax.swing.JFrame {
    
    
    CadastroClientePessoaFisica tela1 = new CadastroClientePessoaFisica();
    CadastroClientePessoaJuridica tela2 = new CadastroClientePessoaJuridica();
    CadastroProdutos tela3 = new CadastroProdutos();
    CadastroServicos tela4 = new CadastroServicos();

    public TelaFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTelaFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuCdaClientes = new javax.swing.JMenu();
        jMenuItemCadClienteFisico = new javax.swing.JMenuItem();
        jMenuItemClienteJuridico = new javax.swing.JMenuItem();
        jMenuItemCadProdutos = new javax.swing.JMenuItem();
        jMenuItemCadServicos = new javax.swing.JMenuItem();
        jMenuPesquisar = new javax.swing.JMenu();
        jMenuPesquisarCliente = new javax.swing.JMenu();
        jMenuItemPesquisaClientePf = new javax.swing.JMenuItem();
        jMenuItemPesquisarClientePj = new javax.swing.JMenuItem();
        jMenuItemPesquisarProdutos = new javax.swing.JMenuItem();
        jMenuItemPesquisarServicos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de Trabalho Funcionario");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundoAreaDeTrabalho.png"))); // NOI18N
        getContentPane().add(jLabelTelaFundo);
        jLabelTelaFundo.setBounds(0, -10, 1110, 660);

        jMenuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/cadastros.png"))); // NOI18N

        jMenuCdaClientes.setText("Clientes");
        jMenuCdaClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItemCadClienteFisico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadClienteFisico.setText("Pessoa Fisíca");
        jMenuItemCadClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteFisicoActionPerformed(evt);
            }
        });
        jMenuCdaClientes.add(jMenuItemCadClienteFisico);

        jMenuItemClienteJuridico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemClienteJuridico.setText("Pessoa Juridica");
        jMenuItemClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteJuridicoActionPerformed(evt);
            }
        });
        jMenuCdaClientes.add(jMenuItemClienteJuridico);

        jMenuCadastros.add(jMenuCdaClientes);

        jMenuItemCadProdutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadProdutos.setText("Produtos");
        jMenuItemCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadProdutos);

        jMenuItemCadServicos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadServicos.setText("Serviços");
        jMenuItemCadServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadServicosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadServicos);

        jMenuBar1.add(jMenuCadastros);

        jMenuPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/Pesquisar.png"))); // NOI18N

        jMenuPesquisarCliente.setText("Cliente");
        jMenuPesquisarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItemPesquisaClientePf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemPesquisaClientePf.setText("Pessoa Fisíca");
        jMenuItemPesquisaClientePf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaClientePfActionPerformed(evt);
            }
        });
        jMenuPesquisarCliente.add(jMenuItemPesquisaClientePf);

        jMenuItemPesquisarClientePj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemPesquisarClientePj.setText("Pessoa Jurídica");
        jMenuItemPesquisarClientePj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarClientePjActionPerformed(evt);
            }
        });
        jMenuPesquisarCliente.add(jMenuItemPesquisarClientePj);

        jMenuPesquisar.add(jMenuPesquisarCliente);

        jMenuItemPesquisarProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemPesquisarProdutos.setText("Produtos");
        jMenuItemPesquisarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarProdutosActionPerformed(evt);
            }
        });
        jMenuPesquisar.add(jMenuItemPesquisarProdutos);

        jMenuItemPesquisarServicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemPesquisarServicos.setText("Serviços");
        jMenuItemPesquisarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarServicosActionPerformed(evt);
            }
        });
        jMenuPesquisar.add(jMenuItemPesquisarServicos);

        jMenuBar1.add(jMenuPesquisar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1099, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteFisicoActionPerformed
        if(tela1 == null){
                tela1 = new CadastroClientePessoaFisica();
                tela1.setVisible(true);
               
               } else {
                tela1.setVisible(true);
             
           }
    }//GEN-LAST:event_jMenuItemCadClienteFisicoActionPerformed

    private void jMenuItemClienteJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteJuridicoActionPerformed
         if(tela2 == null){
                tela2 = new CadastroClientePessoaJuridica();
                tela2.setVisible(true);
                 
               } else {
                 tela2.setVisible(true);
                  
           }
    }//GEN-LAST:event_jMenuItemClienteJuridicoActionPerformed

    private void jMenuItemCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutosActionPerformed
       if(tela3 == null){
                tela3 = new CadastroProdutos();
                tela3.setVisible(true);
      
               } else {
                tela3.setVisible(true);
     
           } 
    }//GEN-LAST:event_jMenuItemCadProdutosActionPerformed

    private void jMenuItemCadServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadServicosActionPerformed
        if(tela4 == null){
                tela4 = new CadastroServicos();
                tela4.setVisible(true);
    
               } else {
                tela4.setVisible(true);
        
           }
    }//GEN-LAST:event_jMenuItemCadServicosActionPerformed

    PesquisaClientePessoaFisica telaCliPf = new PesquisaClientePessoaFisica();
    PesquisaClientePessoaJuridica telaCliPj = new PesquisaClientePessoaJuridica();
    PesquisaProduto telaPro = new PesquisaProduto();
    PesquisaServicos telaSer = new PesquisaServicos();
    
    private void jMenuItemPesquisaClientePfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaClientePfActionPerformed
        if(telaCliPf == null){
            telaCliPf = new PesquisaClientePessoaFisica();
            telaCliPf.setVisible(true);

        } else {
            telaCliPf.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItemPesquisaClientePfActionPerformed

    private void jMenuItemPesquisarClientePjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarClientePjActionPerformed
        if(telaCliPj == null){
            telaCliPj = new PesquisaClientePessoaJuridica();
            telaCliPj.setVisible(true);

        } else {
            telaCliPj.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItemPesquisarClientePjActionPerformed

    private void jMenuItemPesquisarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarProdutosActionPerformed
        if(telaPro == null){
            telaPro = new PesquisaProduto();
            telaPro.setVisible(true);

        } else {
            telaPro.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItemPesquisarProdutosActionPerformed

    private void jMenuItemPesquisarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarServicosActionPerformed
        if(telaSer == null){
            telaSer = new PesquisaServicos();
            telaSer.setVisible(true);

        } else {
            telaSer.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItemPesquisarServicosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTelaFundo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCdaClientes;
    private javax.swing.JMenuItem jMenuItemCadClienteFisico;
    private javax.swing.JMenuItem jMenuItemCadProdutos;
    private javax.swing.JMenuItem jMenuItemCadServicos;
    private javax.swing.JMenuItem jMenuItemClienteJuridico;
    private javax.swing.JMenuItem jMenuItemPesquisaClientePf;
    private javax.swing.JMenuItem jMenuItemPesquisarClientePj;
    private javax.swing.JMenuItem jMenuItemPesquisarProdutos;
    private javax.swing.JMenuItem jMenuItemPesquisarServicos;
    private javax.swing.JMenu jMenuPesquisar;
    private javax.swing.JMenu jMenuPesquisarCliente;
    // End of variables declaration//GEN-END:variables
}
