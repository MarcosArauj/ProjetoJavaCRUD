package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import br.stylus.funilaria.model.dao.cadastros.CadastroServicosDao;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificarBdServicos;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class CadastroServicos extends javax.swing.JFrame {
   
    Servicos servico = new Servicos();
    CadastroServicosDao salvarServico = new CadastroServicosDao();
    
  
   
    public CadastroServicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadServicoTipo = new javax.swing.JLabel();
        jTextFieldCadServicoTipo = new javax.swing.JTextField();
        jLabelCadServicoPreco = new javax.swing.JLabel();
        jTextFieldCadServicoPreco = new javax.swing.JTextField();
        jButtonCadCadastrar = new javax.swing.JButton();
        jButtonCadNovo = new javax.swing.JButton();
        jButtonCadLimpar = new javax.swing.JButton();
        jLabelFundoCadServicos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Serviços");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadServicoTipo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadServicoTipo.setText("Tipo de Serviço :");

        jTextFieldCadServicoTipo.setEnabled(false);

        jLabelCadServicoPreco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadServicoPreco.setText("Preço : ");

        jTextFieldCadServicoPreco.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadServicoPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCadServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCadServicoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabelDadosCadastrais)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelDadosCadastrais)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadServicoTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCadServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadServicoPreco)
                    .addComponent(jTextFieldCadServicoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 440, 160);

        jButtonCadCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadCadastrar.setText("Cadastrar");
        jButtonCadCadastrar.setEnabled(false);
        jButtonCadCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCadastrar);
        jButtonCadCadastrar.setBounds(180, 210, 100, 40);

        jButtonCadNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadNovo.setText("Novo");
        jButtonCadNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadNovo);
        jButtonCadNovo.setBounds(280, 210, 100, 40);

        jButtonCadLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadLimpar.setText("Limpar");
        jButtonCadLimpar.setEnabled(false);
        jButtonCadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadLimpar);
        jButtonCadLimpar.setBounds(380, 210, 100, 40);

        jLabelFundoCadServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadServicos);
        jLabelFundoCadServicos.setBounds(0, 0, 570, 290);

        setSize(new java.awt.Dimension(537, 295));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
private void receberDados() throws Exception{
 
 servico.setTipo(jTextFieldCadServicoTipo.getText());
 servico.FormatoNumero(Double.parseDouble(jTextFieldCadServicoPreco.getText()));
     
 }

 private void habilitarCampos(){
 jTextFieldCadServicoPreco.setEnabled(true);
 jTextFieldCadServicoTipo.setEnabled(true);
 jTextFieldCadServicoTipo.requestFocus();
 jButtonCadCadastrar.setEnabled(true);
 jButtonCadLimpar.setEnabled(true);
 jButtonCadNovo.setEnabled(false);
 }

 private void desabilitarCampos(){
 jTextFieldCadServicoPreco.setEnabled(false);
 jTextFieldCadServicoTipo.setEnabled(false);
 jButtonCadCadastrar.setEnabled(false);
 jButtonCadLimpar.setEnabled(false);
 jButtonCadNovo.setEnabled(true);
 }

 private void limparCampos(){
   jTextFieldCadServicoPreco.setText("");
   jTextFieldCadServicoTipo.setText("");
 }
 
public void salvarServico(){
 try{
 receberDados();
 if(VerificaCampos.validaCampos(jTextFieldCadServicoTipo.getText())
    ||VerificaCampos.validaCampos(jTextFieldCadServicoPreco.getText())
    ||VerificarBdServicos.verificaTipo(servico)){

   }else{                   
     salvarServico.salvar(servico); 
     limparCampos();
     desabilitarCampos();
    }
  } catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane, "Digite apenas número para Preço!\n('.' para preço com centavos) ");
 }
} 
    
    private void jButtonCadNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoActionPerformed
      habilitarCampos();
    }//GEN-LAST:event_jButtonCadNovoActionPerformed

    
    private void jButtonCadCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCadastrarActionPerformed
      salvarServico();
    }//GEN-LAST:event_jButtonCadCadastrarActionPerformed

    private void jButtonCadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLimparActionPerformed
      limparCampos();
    }//GEN-LAST:event_jButtonCadLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCadastrar;
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonCadNovo;
    private javax.swing.JLabel jLabelCadServicoPreco;
    private javax.swing.JLabel jLabelCadServicoTipo;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundoCadServicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCadServicoPreco;
    private javax.swing.JTextField jTextFieldCadServicoTipo;
    // End of variables declaration//GEN-END:variables
}
