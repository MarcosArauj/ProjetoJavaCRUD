package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.model.vo.gestao.negocios.Produtos;
import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaProdutosDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiProdutosDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaProdutoDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaProduto extends javax.swing.JFrame {
    
    Produtos produtos = new Produtos();
    PesquisaProdutoDao pesqProduto = new PesquisaProdutoDao();
    EditaProdutosDao editaProduto = new EditaProdutosDao();
    ExcluiProdutosDao excluiProduto = new ExcluiProdutosDao();
    ConexaoBD conex = new ConexaoBD();
    
    public PesquisaProduto() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloPesquisa = new javax.swing.JLabel();
        jTabbedPanePesquisaProduto = new javax.swing.JTabbedPane();
        jPanelPesqProduto = new javax.swing.JPanel();
        jcPesquisa = new javax.swing.JComboBox<>();
        jLabelTipoPesquisa = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaProduto = new javax.swing.JTable();
        jPanelEditaProduto = new javax.swing.JPanel();
        jLabelCadProdutoMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabelCadProdutoTipo = new javax.swing.JLabel();
        jLabelCadProdutoPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelCadProdutoDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCadLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Produtos");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTituloPesquisa.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloPesquisa.setText("Gerenciamento de Produtos");
        getContentPane().add(jLabelTituloPesquisa);
        jLabelTituloPesquisa.setBounds(210, 30, 280, 24);

        jTabbedPanePesquisaProduto.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jPanelPesqProduto.setBackground(new java.awt.Color(204, 255, 255));

        jcPesquisa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Marca", "Tipo", "Descrição" }));
        jcPesquisa.setToolTipText("");

        jLabelTipoPesquisa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTipoPesquisa.setText("Pesquisar por :");

        jButtonPesquisar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaProduto);

        javax.swing.GroupLayout jPanelPesqProdutoLayout = new javax.swing.GroupLayout(jPanelPesqProduto);
        jPanelPesqProduto.setLayout(jPanelPesqProdutoLayout);
        jPanelPesqProdutoLayout.setHorizontalGroup(
            jPanelPesqProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqProdutoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTipoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPesquisar)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesqProdutoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPesqProdutoLayout.setVerticalGroup(
            jPanelPesqProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesqProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoPesquisa)
                    .addComponent(jButtonPesquisar)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPanePesquisaProduto.addTab("Pesquisar Produtos", jPanelPesqProduto);

        jPanelEditaProduto.setBackground(new java.awt.Color(204, 255, 255));

        jLabelCadProdutoMarca.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoMarca.setText("Marca : ");

        txtMarca.setEnabled(false);

        jLabelCadProdutoTipo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoTipo.setText("Tipo do Produto :");

        jLabelCadProdutoPreco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoPreco.setText("Preço : ");

        txtPreco.setEnabled(false);

        txtTipo.setEnabled(false);

        txtQuantidade.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade :");

        jLabelCadProdutoDescricao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadProdutoDescricao.setText("Descrição : ");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        txaDescricao.setEnabled(false);
        jScrollPane2.setViewportView(txaDescricao);

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

        jButtonCadLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadLimpar.setText("Limpar");
        jButtonCadLimpar.setEnabled(false);
        jButtonCadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLimparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("ID :");

        txtIdProduto.setEnabled(false);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditaProdutoLayout = new javax.swing.GroupLayout(jPanelEditaProduto);
        jPanelEditaProduto.setLayout(jPanelEditaProdutoLayout);
        jPanelEditaProdutoLayout.setHorizontalGroup(
            jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadProdutoMarca))
                    .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadProdutoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelCadProdutoPreco)
                                .addGap(7, 7, 7)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabelCadProdutoDescricao))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(txtTipo))
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        jPanelEditaProdutoLayout.setVerticalGroup(
            jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadProdutoMarca)
                    .addComponent(jLabel2)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCadProdutoTipo)
                .addGap(18, 18, 18)
                .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadProdutoPreco)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCadProdutoDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelEditaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEditaProdutoLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        jTabbedPanePesquisaProduto.addTab("Editar", jPanelEditaProduto);

        getContentPane().add(jTabbedPanePesquisaProduto);
        jTabbedPanePesquisaProduto.setBounds(30, 70, 650, 380);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -20, 780, 530);

        setSize(new java.awt.Dimension(722, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
 public void pesquisaProduto(){
       produtos.setPesquisaproduto(txtPesquisa.getText());
 
    if(jcPesquisa.getSelectedItem().equals("Marca")){         
          pesqProduto.pesquisarMarca(produtos);
            if (VerificaBdStatus.verificaStatusProdutos(produtos)){
              txtPesquisa.requestFocus();
             } else {
                preencherTabela("select * from produtos where marca_produto ='"+produtos.getPesquisaproduto()+"'");
                 }
           } else if(jcPesquisa.getSelectedItem().equals("Tipo")){
              pesqProduto.pesquisarTipo(produtos);
              if (VerificaBdStatus.verificaStatusProdutos(produtos)){
                txtPesquisa.requestFocus();
               } else {
                     preencherTabela("select * from produtos where tipo_produto='"+produtos.getPesquisaproduto()+"'");
                }
            } else if(jcPesquisa.getSelectedItem().equals("Descrição")) {
                 pesqProduto.pesquisarDescricao(produtos);
                 if (VerificaBdStatus.verificaStatusProdutos(produtos)){
                     txtPesquisa.requestFocus();
                    } else {
                         preencherTabela("select * from produtos where descricao_produto='"+produtos.getPesquisaproduto()+"'");
                       }
       } else if (jcPesquisa.getSelectedItem().equals("Selecione...")){
       JOptionPane.showMessageDialog(rootPane, "Selecione uma opção para a pesquisa!");
    } else {
         JOptionPane.showMessageDialog(rootPane, "Produto não encontrado!");   
       }
  }
  private void preencherTabela(String Sql) {
       
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {"ID","Marca","Tipo","Descrição","Preço","Quatidade"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
           conex.rs.first();
       do {          
         dados.add(new Object[] {conex.rs.getInt("cod_produto"),conex.rs.getString("marca_produto"),conex.rs.getString("tipo_produto"),
                                 conex.rs.getString("descricao_produto"),conex.rs.getDouble("preco_produto"),conex.rs.getInt("quantidade_produto")}); 
       }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro produto para preencher a tabela"+ ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaProduto.setModel(modelo);
        jTablePesquisaProduto.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTablePesquisaProduto.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTablePesquisaProduto.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePesquisaProduto.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(3).setPreferredWidth(122);
        jTablePesquisaProduto.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(4).setPreferredWidth(115);
        jTablePesquisaProduto.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTablePesquisaProduto.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisaProduto.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaProduto.setAutoResizeMode(jTablePesquisaProduto.AUTO_RESIZE_OFF);
        jTablePesquisaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
  
   private void limparTabela(){
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {};
        dados.add(new Object[] {});
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaProduto.setModel(modelo);
 
  } 
     public void receberDados() throws Exception{     
       
       produtos.setMarca(txtMarca.getText());
       produtos.setTipo(txtTipo.getText());
       produtos.FormatoNumero(Double.parseDouble(txtPreco.getText()));
       produtos.FormatoNumero(Integer.parseInt(txtQuantidade.getText()));
       produtos.setDescricao(txaDescricao.getText());
  
    }
    
    private void habilitarCampos(){
        txtMarca.setEnabled(true);
        txtMarca.requestFocus();
        txtTipo.setEnabled(true);
        txtPreco.setEnabled(true);
        txaDescricao.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtMarca.requestFocus();
        jButtonSalvar.setEnabled(true);
        jButtonCadLimpar.setEnabled(true);
        jButtonEditar.setEnabled(false);
    }
    
    private void desabilitarCampos(){
         txtMarca.setEnabled(false);
         txtTipo.setEnabled(false);
         txtPreco.setEnabled(false);
         txaDescricao.setEnabled(false);
         txtQuantidade.setEnabled(false);
         jButtonSalvar.setEnabled(false);
         jButtonCadLimpar.setEnabled(false);
        
    }
    
    private void limparCampos(){
        txtIdProduto.setText("");
        txtPesquisa.setText("");
        txtMarca.setText("");
        txtTipo.setText("");
        txtPreco.setText("");
        txaDescricao.setText("");
        txtQuantidade.setText("");
    }
    
    private void preencherTextField(){
       String produto = ""+jTablePesquisaProduto.getValueAt(jTablePesquisaProduto.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from produtos where marca_produto = '"+produto+"'");
        try {
        conex.rs.first();    
            txtIdProduto.setText(String.valueOf(conex.rs.getInt("cod_produto")));
            txtMarca.setText(conex.rs.getString("marca_produto"));
            txtTipo.setText(conex.rs.getString("tipo_produto"));
            txaDescricao.setText(conex.rs.getString("descricao_produto"));
            txtPreco.setText(String.valueOf(conex.rs.getDouble("preco_produto")));
            txtQuantidade.setText(String.valueOf(conex.rs.getInt("quantidade_produto")));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
        }     
        conex.desconecta();
    }
    
    public void salvarProduto() {
       
        if(VerificaCampos.validaCampos(txtMarca.getText())
            || VerificaCampos.validaCampos(txtTipo.getText())
            || VerificaCampos.validaCampos(txtPreco.getText())
            || VerificaCampos.validaCampos(txaDescricao.getText())
            || VerificaCampos.validaCampos(txtQuantidade.getText())){

        }  else{
          try{  
             receberDados();  
            //salvando dados
            editaProduto.editar(produtos);
            JOptionPane.showMessageDialog(rootPane, "Para ver o produto alterado, pesquise novamente!");
            jTabbedPanePesquisaProduto.setSelectedIndex(0);
            txtPesquisa.requestFocus();
            limparCampos();
            desabilitarCampos();
           } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, "Digite apenas números para, \nPreço e Quantidade!\n('.' para preço com centavos)");
       }
      }
    }
    
   public void excluirCliente(){
    int resposta  = 0;
    resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiProduto.excluir(produtos);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }  
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisaProduto();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       salvarProduto();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       if(txtMarca.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um produto para continuar!");
         jTabbedPanePesquisaProduto.setSelectedIndex(0);
         txtPesquisa.requestFocus();
      } else {
        habilitarCampos();
      }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCadLimparActionPerformed

    private void jTablePesquisaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaProdutoMouseClicked
        preencherTextField();
        jTabbedPanePesquisaProduto.setSelectedIndex(1);
    }//GEN-LAST:event_jTablePesquisaProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(PesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadProdutoDescricao;
    private javax.swing.JLabel jLabelCadProdutoMarca;
    private javax.swing.JLabel jLabelCadProdutoPreco;
    private javax.swing.JLabel jLabelCadProdutoTipo;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelTipoPesquisa;
    private javax.swing.JLabel jLabelTituloPesquisa;
    private javax.swing.JPanel jPanelEditaProduto;
    private javax.swing.JPanel jPanelPesqProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPanePesquisaProduto;
    private javax.swing.JTable jTablePesquisaProduto;
    private javax.swing.JComboBox<String> jcPesquisa;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
