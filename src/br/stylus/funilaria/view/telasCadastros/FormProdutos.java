package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.controller.gestao.negocios.Produtos;
import br.stylus.funilaria.model.persistencia.ProdutosDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class FormProdutos extends javax.swing.JFrame {

    Produtos produto = new Produtos();
    ProdutosDao salvarProduto = new ProdutosDao();
    
    int flag = 0;
    
    public FormProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadProdutoTipo = new javax.swing.JLabel();
        jLabelCadProdutoMarca = new javax.swing.JLabel();
        jLabelCadProdutoPreco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCadProdutoDescricao = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonCadCadastrar = new javax.swing.JButton();
        jButtonCadNovo = new javax.swing.JButton();
        jButtonCadLimpar = new javax.swing.JButton();
        jLabelFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);
        setSize(new java.awt.Dimension(579, 472));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadProdutoTipo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoTipo.setText("Tipo do Produto :");

        jLabelCadProdutoMarca.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoMarca.setText("Marca : ");

        jLabelCadProdutoPreco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoPreco.setText("Preço : ");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade :");

        jLabelCadProdutoDescricao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoDescricao.setText("Descrição : ");

        jTextFieldMarca.setEnabled(false);

        jTextFieldTipo.setEnabled(false);

        jTextFieldPreco.setEnabled(false);

        jTextFieldQuantidade.setEnabled(false);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabelDadosCadastrais))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCadProdutoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabelCadProdutoDescricao))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTipo))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCadProdutoMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCadProdutoPreco)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDadosCadastrais)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadProdutoMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadProdutoTipo)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadProdutoPreco)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCadProdutoDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 500, 330);

        jButtonCadCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadCadastrar.setText("Cadastrar");
        jButtonCadCadastrar.setEnabled(false);
        jButtonCadCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCadastrar);
        jButtonCadCadastrar.setBounds(240, 370, 100, 40);

        jButtonCadNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadNovo.setText("Novo");
        jButtonCadNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadNovo);
        jButtonCadNovo.setBounds(340, 370, 100, 40);

        jButtonCadLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadLimpar.setText("Limpar");
        jButtonCadLimpar.setEnabled(false);
        jButtonCadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadLimpar);
        jButtonCadLimpar.setBounds(440, 370, 100, 40);

        jLabelFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoTela);
        jLabelFundoTela.setBounds(-20, -30, 690, 480);

        setSize(new java.awt.Dimension(579, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCadastrarActionPerformed

        if (flag == 1) {
            try {               
               
                produto.setMarca(jTextFieldMarca.getText());
                produto.setTipo(jTextFieldTipo.getText());
                produto.FormatoNumero(Double.parseDouble(jTextFieldPreco.getText()));
                produto.FormatoNumero(Integer.parseInt(jTextFieldQuantidade.getText()));
                produto.setDescricao(jTextAreaDescricao.getText());

                if(VerificaCampos.validaCampos(jTextFieldMarca.getText())
                    || VerificaCampos.validaCampos(jTextFieldTipo.getText())
                    || VerificaCampos.validaCampos(jTextFieldPreco.getText())
                    || VerificaCampos.validaCampos(jTextAreaDescricao.getText())
                    || VerificaCampos.validaCampos(jTextFieldQuantidade.getText())){

                }  else{

                    salvarProduto.salvar(produto);

                    jTextFieldMarca.setText("");
                    jTextFieldTipo.setText("");
                    jTextFieldPreco.setText("");
                    jTextAreaDescricao.setText("");
                    jTextFieldQuantidade.setText("");

                    jTextFieldMarca.setEnabled(false);
                    jTextFieldTipo.setEnabled(false);
                    jTextFieldPreco.setEnabled(false);
                    jTextAreaDescricao.setEnabled(false);
                    jTextFieldQuantidade.setEnabled(false);
                    jButtonCadCadastrar.setEnabled(false);
                    jButtonCadLimpar.setEnabled(false);
                    jButtonCadNovo.setEnabled(true);

                }
                 } catch (Exception ex) {
                   JOptionPane.showMessageDialog(rootPane, "Digite apenas números para, \nPreço e Quantidade!\n('.' para preço com centavos)");
               }

        }
    }//GEN-LAST:event_jButtonCadCadastrarActionPerformed

    private void jButtonCadNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoActionPerformed
        flag = 1;
        jTextFieldMarca.setEnabled(true);
        jTextFieldMarca.requestFocus();
        jTextFieldTipo.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextAreaDescricao.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldMarca.requestFocus();
        jButtonCadCadastrar.setEnabled(true);
        jButtonCadLimpar.setEnabled(true);
        jButtonCadNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonCadNovoActionPerformed

    private void jButtonCadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLimparActionPerformed
        jTextFieldMarca.setText("");
        jTextFieldTipo.setText("");
        jTextFieldPreco.setText("");
        jTextAreaDescricao.setText("");
        jTextFieldQuantidade.setText("");
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
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCadastrar;
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonCadNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadProdutoDescricao;
    private javax.swing.JLabel jLabelCadProdutoMarca;
    private javax.swing.JLabel jLabelCadProdutoPreco;
    private javax.swing.JLabel jLabelCadProdutoTipo;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundoTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
}
