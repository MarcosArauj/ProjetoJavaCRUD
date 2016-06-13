package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaServicosDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiServicosDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaServicoDao;
import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaServicos extends javax.swing.JFrame {

    Servicos servico = new Servicos();
    PesquisaServicoDao pesqServico = new PesquisaServicoDao();
    EditaServicosDao editarServico = new EditaServicosDao();
    ExcluiServicosDao excluiServico = new ExcluiServicosDao();
    ConexaoBD conex = new ConexaoBD();
    
    public PesquisaServicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisa = new javax.swing.JTabbedPane();
        jPanelPesqServico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaServico = new javax.swing.JTable();
        txtPesquisaServico = new javax.swing.JTextField();
        jButtonPesquisarServico = new javax.swing.JButton();
        jPanelEditar = new javax.swing.JPanel();
        jLabelIdServico = new javax.swing.JLabel();
        txtIdServico = new javax.swing.JTextField();
        jLabelCadServicoTipo = new javax.swing.JLabel();
        txtServicoTipo = new javax.swing.JTextField();
        jLabelCadServicoPreco = new javax.swing.JLabel();
        txtServicoPreco = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelTituloPesquisa = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPanePesquisa.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPanePesquisa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jPanelPesqServico.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPesqServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTablePesquisaServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaServico);

        jButtonPesquisarServico.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonPesquisarServico.setText("Pesquisar");
        jButtonPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesqServicoLayout = new javax.swing.GroupLayout(jPanelPesqServico);
        jPanelPesqServico.setLayout(jPanelPesqServicoLayout);
        jPanelPesqServicoLayout.setHorizontalGroup(
            jPanelPesqServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesqServicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPesquisarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanelPesqServicoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelPesqServicoLayout.setVerticalGroup(
            jPanelPesqServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqServicoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPesqServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarServico))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPanePesquisa.addTab("Pesquisar Serviço", jPanelPesqServico);

        jPanelEditar.setBackground(new java.awt.Color(204, 255, 255));
        jPanelEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelIdServico.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelIdServico.setText("ID :");

        txtIdServico.setEnabled(false);

        jLabelCadServicoTipo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadServicoTipo.setText("Tipo de Serviço :");

        txtServicoTipo.setEnabled(false);

        jLabelCadServicoPreco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadServicoPreco.setText("Preço : ");

        txtServicoPreco.setEnabled(false);

        jButtonSalvar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditarLayout = new javax.swing.GroupLayout(jPanelEditar);
        jPanelEditar.setLayout(jPanelEditarLayout);
        jPanelEditarLayout.setHorizontalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addComponent(jLabelIdServico)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdServico, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(txtServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabelCadServicoPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtServicoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanelEditarLayout.setVerticalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdServico)
                    .addComponent(txtIdServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadServicoTipo)
                    .addComponent(txtServicoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadServicoPreco)
                    .addComponent(txtServicoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        jTabbedPanePesquisa.addTab("Editar", jPanelEditar);

        getContentPane().add(jTabbedPanePesquisa);
        jTabbedPanePesquisa.setBounds(30, 50, 560, 330);

        jLabelTituloPesquisa.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloPesquisa.setText("Gereciamento de Serviços");
        getContentPane().add(jLabelTituloPesquisa);
        jLabelTituloPesquisa.setBounds(200, 10, 260, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -10, 680, 440);

        setSize(new java.awt.Dimension(633, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  public void pesquisaServico(){
    servico.setPesquisaServico(txtPesquisaServico.getText());
    
    if(txtPesquisaServico.getText().isEmpty()){
     JOptionPane.showMessageDialog(rootPane, "Preencha o campo de pesquisa para continuar!");
    }   else {  
       pesqServico.pesquisarTipo(servico);
       if (VerificaBdStatus.verificaStatusServicos(servico)){
       txtPesquisaServico.requestFocus();
        } else {
       preencherTabela("select * from servicos where tipo_servico='"+servico.getPesquisaServico()+"'");
       }
    } 
  }  
    
  private void preencherTabela(String Sql) {
       
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {"ID","Tipo","Preço Inicial",};
        conex.conexao();
        conex.executaSql(Sql);
        try{
           conex.rs.first();
       do {  
       dados.add(new Object[] {conex.rs.getInt("cod_servico"),conex.rs.getString("tipo_servico"),conex.rs.getString("preco_inicial")});     
       }while(conex.rs.next());
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro produto para preencher a tabela"+ ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaServico.setModel(modelo);
        jTablePesquisaServico.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTablePesquisaServico.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaServico.getColumnModel().getColumn(1).setPreferredWidth(217);
        jTablePesquisaServico.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaServico.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTablePesquisaServico.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaServico.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaServico.setAutoResizeMode(jTablePesquisaServico.AUTO_RESIZE_OFF);
        jTablePesquisaServico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
  }
  
    private void limparTabela(){
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {};
        dados.add(new Object[] {});
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaServico.setModel(modelo);
 
  } 
    
   private void receberDados() throws Exception{
    servico.setTipo(txtServicoTipo.getText());
    servico.FormatoNumero(Double.parseDouble(txtServicoPreco.getText()));
 
    }
    
    private void habilitarCampos(){
    txtServicoPreco.setEnabled(true);
    txtServicoTipo.setEnabled(true);
    txtServicoTipo.requestFocus();
    jButtonSalvar.setEnabled(true);
    jButtonLimpar.setEnabled(true);
    jButtonEditar.setEnabled(false);
    }
    
    private void desabilitarCampos(){
    txtServicoPreco.setEnabled(false);
    txtServicoTipo.setEnabled(false);
    jButtonSalvar.setEnabled(false);
    jButtonLimpar.setEnabled(false);
    jButtonEditar.setEnabled(true);
    }
    
    private void limparCampos(){
      txtIdServico.setText(""); 
      txtPesquisaServico.setText("");
      txtServicoPreco.setText("");
      txtServicoTipo.setText("");
    }
    
    private void preencherTextField(){
    String serv = ""+jTablePesquisaServico.getValueAt(jTablePesquisaServico.getSelectedRow(), 1);
     conex.conexao();
     conex.executaSql("select * from servicos where tipo_servico = '"+serv+"'");
     try {
     conex.rs.first();    
        txtIdServico.setText(String.valueOf(conex.rs.getInt("cod_servico")));
        txtServicoTipo.setText(conex.rs.getString("tipo_servico"));
        txtServicoPreco.setText(String.valueOf(conex.rs.getString("preco_inicial")));
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
      }     
       conex.desconecta();
    }
    
    
   public void salvarServico(){
     if(VerificaCampos.validaCampos(txtServicoTipo.getText())
       ||VerificaCampos.validaCampos(txtServicoPreco.getText())){
        
      }else{       
   
   try{
     receberDados(); 
     
     editarServico.editar(servico); 
     limparCampos();
     desabilitarCampos();
     JOptionPane.showMessageDialog(rootPane, "Para ver o serviço alterado, pesquise novamente!");
     jTabbedPanePesquisa.setSelectedIndex(0);
     txtPesquisaServico.requestFocus();
     } catch (Exception ex) {
       JOptionPane.showMessageDialog(rootPane, "Digite apenas número para Preço!\n('.' para preço com centavos) ");
    }
    }  
  }
   
public void excluirCliente(){
    int resposta  = 0;
    resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiServico.excluir(servico);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    } 
    private void jTablePesquisaServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaServicoMouseClicked

        preencherTextField();
        jTabbedPanePesquisa.setSelectedIndex(1);
    }//GEN-LAST:event_jTablePesquisaServicoMouseClicked

    private void jButtonPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarServicoActionPerformed
        pesquisaServico();
    }//GEN-LAST:event_jButtonPesquisarServicoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      
         salvarServico();      
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
      if(txtServicoTipo.getText().isEmpty()|| txtPesquisaServico.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um serviço para continuar!");
         jTabbedPanePesquisa.setSelectedIndex(0);
         txtPesquisaServico.requestFocus();
      } else {
        habilitarCampos();
    }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      excluirCliente();
      limparTabela(); 
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    

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
            java.util.logging.Logger.getLogger(PesquisaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarServico;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCadServicoPreco;
    private javax.swing.JLabel jLabelCadServicoTipo;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIdServico;
    private javax.swing.JLabel jLabelTituloPesquisa;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelPesqServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanePesquisa;
    private javax.swing.JTable jTablePesquisaServico;
    private javax.swing.JTextField txtIdServico;
    private javax.swing.JTextField txtPesquisaServico;
    private javax.swing.JTextField txtServicoPreco;
    private javax.swing.JTextField txtServicoTipo;
    // End of variables declaration//GEN-END:variables
}
