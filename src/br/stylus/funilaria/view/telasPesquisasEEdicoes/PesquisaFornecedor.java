package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaFornecedorDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiFornecedorDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaFornecedorDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaFornecedor extends javax.swing.JFrame {
    
    Fornecedor fornecedor = new Fornecedor();
    Contato contato = new Contato();
    ConexaoBD conex = new ConexaoBD();
    PesquisaFornecedorDao pesqFornecedor = new PesquisaFornecedorDao();
    EditaFornecedorDao editaFornecedor = new EditaFornecedorDao();
    ExcluiFornecedorDao excluiFornecedor = new ExcluiFornecedorDao();
     
    public PesquisaFornecedor() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisaFornecedor = new javax.swing.JTabbedPane();
        jPanelPesquisaFornecedor = new javax.swing.JPanel();
        jLabelTipoPesquisaCliente = new javax.swing.JLabel();
        txtPesquisaFornecedor = new javax.swing.JTextField();
        jButtonPesquisarFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaFornecedor = new javax.swing.JTable();
        jPanelEditaFonecedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefoneFornecedor = new javax.swing.JLabel();
        jLabelCadEmailFornecedor = new javax.swing.JLabel();
        txtFornecedorEmail = new javax.swing.JTextField();
        txtFornecedorCelular = new javax.swing.JFormattedTextField();
        jLabelCadCelularFornecedor = new javax.swing.JLabel();
        txtFornecedorTelefone = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabelCadEnderecoFornecedor = new javax.swing.JLabel();
        jLabelCadCidadeFornecedor = new javax.swing.JLabel();
        jLabelCadNumeroFornecedor = new javax.swing.JLabel();
        jLabelCadBairroFornecedor = new javax.swing.JLabel();
        jLabelCadCepFornecedor = new javax.swing.JLabel();
        jLabelCadEstadoFornecedor = new javax.swing.JLabel();
        txtFornecedorCep = new javax.swing.JFormattedTextField();
        txtFornecedorEndereco = new javax.swing.JTextField();
        txtFornecedorNumero = new javax.swing.JTextField();
        txtFornecedorBairro = new javax.swing.JTextField();
        txtFornecedorCidade = new javax.swing.JTextField();
        jcFornecedorEstado = new javax.swing.JComboBox<>();
        jPanel = new javax.swing.JPanel();
        jLabelCadClienteNomeFantasia = new javax.swing.JLabel();
        jLabelCadClienteCnpj = new javax.swing.JLabel();
        txtFornecedorNomeFantasia = new javax.swing.JTextField();
        jLabelCadClienteRazaoSocial = new javax.swing.JLabel();
        txtFornecedorCnpj = new javax.swing.JFormattedTextField();
        txtFornecedorRazaoSocial = new javax.swing.JTextField();
        jLabelIdFornecedor = new javax.swing.JLabel();
        txtIdFornecedor = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Fornecedor");
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPanePesquisaFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelPesquisaFornecedor.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPesquisaFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTipoPesquisaCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTipoPesquisaCliente.setText("Digite o nome Fantasia :");

        jButtonPesquisarFornecedor.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonPesquisarFornecedor.setText("Pesquisar");
        jButtonPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarFornecedorActionPerformed(evt);
            }
        });

        jTablePesquisaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaFornecedor);

        javax.swing.GroupLayout jPanelPesquisaFornecedorLayout = new javax.swing.GroupLayout(jPanelPesquisaFornecedor);
        jPanelPesquisaFornecedor.setLayout(jPanelPesquisaFornecedorLayout);
        jPanelPesquisaFornecedorLayout.setHorizontalGroup(
            jPanelPesquisaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisaFornecedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTipoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisaFornecedorLayout.setVerticalGroup(
            jPanelPesquisaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaFornecedorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelPesquisaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTipoPesquisaCliente))
                    .addComponent(jButtonPesquisarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPanePesquisaFornecedor.addTab("Pesquisar Fornecedor", jPanelPesquisaFornecedor);

        jPanelEditaFonecedor.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneFornecedor.setText("Telefone : ");

        jLabelCadEmailFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailFornecedor.setText("E-mail : ");

        txtFornecedorEmail.setEnabled(false);

        try {
            txtFornecedorCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFornecedorCelular.setEnabled(false);

        jLabelCadCelularFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularFornecedor.setText("Celular :");

        try {
            txtFornecedorTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFornecedorTelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneFornecedor)
                    .addComponent(jLabelCadEmailFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFornecedorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFornecedorTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFornecedorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneFornecedor)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFornecedorTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFornecedorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailFornecedor)
                    .addComponent(txtFornecedorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadEnderecoFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEnderecoFornecedor.setText("Endereço : ");

        jLabelCadCidadeFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCidadeFornecedor.setText("Cidade : ");

        jLabelCadNumeroFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNumeroFornecedor.setText("Nº : ");

        jLabelCadBairroFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairroFornecedor.setText("Bairro : ");

        jLabelCadCepFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCepFornecedor.setText("CEP : ");

        jLabelCadEstadoFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEstadoFornecedor.setText("Estado : ");

        try {
            txtFornecedorCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFornecedorCep.setEnabled(false);

        txtFornecedorEndereco.setEnabled(false);

        txtFornecedorNumero.setEnabled(false);

        txtFornecedorBairro.setEnabled(false);

        txtFornecedorCidade.setEnabled(false);

        jcFornecedorEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcFornecedorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jcFornecedorEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoFornecedor)
                    .addComponent(jLabelCadCepFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFornecedorEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadBairroFornecedor)
                        .addGap(4, 4, 4)
                        .addComponent(txtFornecedorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFornecedorCep, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedorCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadEstadoFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcFornecedorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoFornecedor)
                    .addComponent(jLabelCadNumeroFornecedor)
                    .addComponent(jLabelCadBairroFornecedor)
                    .addComponent(txtFornecedorEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeFornecedor)
                    .addComponent(jLabelCadCepFornecedor)
                    .addComponent(jLabelCadEstadoFornecedor)
                    .addComponent(txtFornecedorCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcFornecedorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel.setBackground(new java.awt.Color(204, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadClienteNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteNomeFantasia.setText("Nome Fantasia : ");

        jLabelCadClienteCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteCnpj.setText("CNPJ : ");

        txtFornecedorNomeFantasia.setEnabled(false);

        jLabelCadClienteRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteRazaoSocial.setText("Razão Social : ");

        try {
            txtFornecedorCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFornecedorCnpj.setEnabled(false);

        txtFornecedorRazaoSocial.setEnabled(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelCadClienteNomeFantasia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedorNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelCadClienteRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFornecedorRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCadClienteCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedorCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedorNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClienteNomeFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClienteCnpj)
                    .addComponent(jLabelCadClienteRazaoSocial)
                    .addComponent(txtFornecedorCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedorRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabelIdFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdFornecedor.setText("ID :");

        txtIdFornecedor.setEnabled(false);

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

        javax.swing.GroupLayout jPanelEditaFonecedorLayout = new javax.swing.GroupLayout(jPanelEditaFonecedor);
        jPanelEditaFonecedor.setLayout(jPanelEditaFonecedorLayout);
        jPanelEditaFonecedorLayout.setHorizontalGroup(
            jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaFonecedorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEditaFonecedorLayout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEditaFonecedorLayout.createSequentialGroup()
                            .addComponent(jLabelIdFornecedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelEditaFonecedorLayout.setVerticalGroup(
            jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaFonecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdFornecedor)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditaFonecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPanePesquisaFornecedor.addTab("Editar", jPanelEditaFonecedor);

        getContentPane().add(jTabbedPanePesquisaFornecedor);
        jTabbedPanePesquisaFornecedor.setBounds(30, 50, 810, 460);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de Fornecedor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 270, 22);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -20, 910, 560);

        setSize(new java.awt.Dimension(894, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void pesquisaCliente(){
        fornecedor.setPesquisaFor(txtPesquisaFornecedor.getText());
        fornecedor.setContato(contato);
        if(txtPesquisaFornecedor.getText().isEmpty()){         
           JOptionPane.showMessageDialog(rootPane, "Preencha o campo para fazer a pesquisa!");
           txtPesquisaFornecedor.requestFocus();         
       } else {
           pesqFornecedor.pesquisaFronecedor(fornecedor); 
          if (VerificaBdStatus.verificaStatusFornecedor(fornecedor)){
              txtPesquisaFornecedor.requestFocus();  
          } else {
              preencherTabela("select fo.cod_fornecedor, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "fo.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from fornecedor as fo\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on fo.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on fo.cod_contato = c.cod_contato where pj.nome_fantasia ='"+fornecedor.getPesquisaFor()+"'");
          }
      }  
    }
    
      private void preencherTabela(String Sql) {
      
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {"ID","Nome Fantasia","Razão Social","CNPJ","Endereco","Telefone","Email"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
           conex.rs.first();
       do {  
       dados.add(new Object[] {conex.rs.getInt("cod_fornecedor"),conex.rs.getString("nome_fantasia"),conex.rs.getString("razao_social"),conex.rs.getString("cnpj"),
                                 conex.rs.getString("endereco"),conex.rs.getString("telefone"),conex.rs.getString("email")});
       }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro cliente para preencher a tabela"+ ex);
        }   
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaFornecedor.setModel(modelo);
        jTablePesquisaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTablePesquisaFornecedor.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTablePesquisaFornecedor.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePesquisaFornecedor.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePesquisaFornecedor.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTablePesquisaFornecedor.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTablePesquisaFornecedor.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisaFornecedor.getColumnModel().getColumn(6).setPreferredWidth(170);
        jTablePesquisaFornecedor.getColumnModel().getColumn(6).setResizable(false);
        jTablePesquisaFornecedor.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaFornecedor.setAutoResizeMode(jTablePesquisaFornecedor.AUTO_RESIZE_OFF);
        jTablePesquisaFornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
      
              private void limparTabela(){
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {};
        dados.add(new Object[] {});
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaFornecedor.setModel(modelo);
    
  }  
    
    
   private void receberDados(){

        fornecedor.setNomeFantasia(txtFornecedorNomeFantasia.getText());
        fornecedor.setCnpj(txtFornecedorCnpj.getText());
        fornecedor.setRazaoSocial(txtFornecedorRazaoSocial.getText());

        contato.setEndereco(txtFornecedorEndereco.getText());
        contato.setNumero(txtFornecedorNumero.getText());
        contato.setBairro(txtFornecedorBairro.getText());
        contato.setCep(txtFornecedorCep.getText());
        contato.setCidade(txtFornecedorCidade.getText());
        contato.setEstado((String) jcFornecedorEstado.getSelectedItem());
        contato.setCelular(txtFornecedorCelular.getText());
        contato.setTefefone(txtFornecedorTelefone.getText());
        contato.setEmail(txtFornecedorEmail.getText());

        fornecedor.setContato(contato);
    }
    
 private void habilitarCampos(){
       txtFornecedorNomeFantasia.setEnabled(true);
       txtFornecedorNomeFantasia.requestFocus();
       txtFornecedorRazaoSocial.setEnabled(true);
       txtFornecedorCnpj.setEnabled(true);
       txtFornecedorEndereco.setEnabled(true);
       txtFornecedorNumero.setEnabled(true);
       txtFornecedorBairro.setEnabled(true);
       txtFornecedorCep.setEnabled(true);
       txtFornecedorCidade.setEnabled(true);
       txtFornecedorTelefone.setEnabled(true);
       txtFornecedorCelular.setEnabled(true);
       txtFornecedorEmail.setEnabled(true);
       jcFornecedorEstado.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonEditar.setEnabled(false);
    }
    
    private void desabilitarCampos(){
        txtFornecedorNomeFantasia.setEnabled(false);
        txtFornecedorRazaoSocial.setEnabled(false);
        txtFornecedorCnpj.setEnabled(false);
        txtFornecedorEndereco.setEnabled(false);
        txtFornecedorNumero.setEnabled(false);
        txtFornecedorBairro.setEnabled(false);
        txtFornecedorCep.setEnabled(false);
        txtFornecedorCidade.setEnabled(false);
        txtFornecedorTelefone.setEnabled(false);
        txtFornecedorCelular.setEnabled(false);
        txtFornecedorEmail.setEnabled(false);
        jcFornecedorEstado.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }
    
    private void limparCampos(){
       txtIdFornecedor.setText("");
       txtPesquisaFornecedor.setText("");
       txtFornecedorNomeFantasia.setText("");
       txtFornecedorRazaoSocial.setText("");
       txtFornecedorCnpj.setText("");
       txtFornecedorEndereco.setText("");
       txtFornecedorNumero.setText("");
       txtFornecedorBairro.setText("");
       txtFornecedorCep.setText("");
       txtFornecedorCidade.setText("");
       txtFornecedorTelefone.setText("");
       txtFornecedorCelular.setText("");
       txtFornecedorEmail.setText("");
       jcFornecedorEstado.setSelectedIndex(0);
    }
    
        private void preencherTextField(){
       String forne = ""+jTablePesquisaFornecedor.getValueAt(jTablePesquisaFornecedor.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select fo.cod_fornecedor, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "fo.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from fornecedor as fo\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on fo.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on fo.cod_contato = c.cod_contato where pj.nome_fantasia ='"+forne+"'");
        try {
        conex.rs.first();    
            txtIdFornecedor.setText(String.valueOf(conex.rs.getInt("cod_fornecedor")));
            txtFornecedorNomeFantasia.setText(conex.rs.getString("nome_fantasia"));
            txtFornecedorRazaoSocial.setText(conex.rs.getString("razao_social"));
            txtFornecedorCnpj.setText(conex.rs.getString("cnpj"));
            txtFornecedorEndereco.setText(conex.rs.getString("endereco"));
            txtFornecedorNumero.setText(conex.rs.getString("numero"));
            txtFornecedorCep.setText(conex.rs.getString("cep"));
            txtFornecedorBairro.setText(conex.rs.getString("bairro"));
            txtFornecedorCidade.setText(conex.rs.getString("cidade"));
            jcFornecedorEstado.setSelectedItem((String)conex.rs.getString("estado"));
            txtFornecedorTelefone.setText(conex.rs.getString("telefone"));
            txtFornecedorCelular.setText(conex.rs.getString("celular"));
            txtFornecedorEmail.setText(conex.rs.getString("email"));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
        }     
        conex.desconecta();
    } 
        
    public void salvarCliente(){
        receberDados();
        if (VerificaCampos.validaCampos(txtFornecedorNomeFantasia.getText())                    
               || VerificaCampos.validaCampos(txtFornecedorRazaoSocial.getText())
               || VerificaCampos.validaCampos(txtFornecedorCnpj.getText())
               || VerificaCampos.validaCampos(txtFornecedorEndereco.getText())
               || VerificaCampos.validaCampos(txtFornecedorNumero.getText())
               || VerificaCampos.validaCampos(txtFornecedorBairro.getText())
               || VerificaCampos.validaCampos(txtFornecedorCep.getText())
               || VerificaCampos.validaCampos(txtFornecedorCidade.getText())) {
          } else {
                 //verificando se o email é valido
               if(Validacoes.verificaEmail(txtFornecedorEmail.getText())){
               
              } else { 
                //slavando dados
                 editaFornecedor.editar(fornecedor);
                 JOptionPane.showMessageDialog(rootPane, "Para ver o fornecedor alterado, pesquise novamente!");
                 jTabbedPanePesquisaFornecedor.setSelectedIndex(0);
                 txtPesquisaFornecedor.requestFocus();
                 limparCampos();
                 desabilitarCampos();
               }
            }

   }
    
    public void excluirCliente(){
        int resposta  = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiFornecedor.excluir(fornecedor);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }
     
    
    private void jButtonPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarFornecedorActionPerformed
       if(txtPesquisaFornecedor.getText().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "Preencha o campo como um Nome Fantasia para continuar!");
         txtPesquisaFornecedor.requestFocus();  
        }  else {
        pesquisaCliente();
       }
    }//GEN-LAST:event_jButtonPesquisarFornecedorActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarCliente();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
      if(txtFornecedorNomeFantasia.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um cliente para continuar!");
         jTabbedPanePesquisaFornecedor.setSelectedIndex(0);
         txtPesquisaFornecedor.requestFocus();
      } else {
        habilitarCampos();
      }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTablePesquisaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaFornecedorMouseClicked
        preencherTextField();
        jTabbedPanePesquisaFornecedor.setSelectedIndex(1);
    }//GEN-LAST:event_jTablePesquisaFornecedorMouseClicked

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
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarFornecedor;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadBairroFornecedor;
    private javax.swing.JLabel jLabelCadCelularFornecedor;
    private javax.swing.JLabel jLabelCadCepFornecedor;
    private javax.swing.JLabel jLabelCadCidadeFornecedor;
    private javax.swing.JLabel jLabelCadClienteCnpj;
    private javax.swing.JLabel jLabelCadClienteNomeFantasia;
    private javax.swing.JLabel jLabelCadClienteRazaoSocial;
    private javax.swing.JLabel jLabelCadEmailFornecedor;
    private javax.swing.JLabel jLabelCadEnderecoFornecedor;
    private javax.swing.JLabel jLabelCadEstadoFornecedor;
    private javax.swing.JLabel jLabelCadNumeroFornecedor;
    private javax.swing.JLabel jLabelCadTelefoneFornecedor;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIdFornecedor;
    private javax.swing.JLabel jLabelTipoPesquisaCliente;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEditaFonecedor;
    private javax.swing.JPanel jPanelPesquisaFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanePesquisaFornecedor;
    private javax.swing.JTable jTablePesquisaFornecedor;
    private javax.swing.JComboBox<String> jcFornecedorEstado;
    private javax.swing.JTextField txtFornecedorBairro;
    private javax.swing.JFormattedTextField txtFornecedorCelular;
    private javax.swing.JFormattedTextField txtFornecedorCep;
    private javax.swing.JTextField txtFornecedorCidade;
    private javax.swing.JFormattedTextField txtFornecedorCnpj;
    private javax.swing.JTextField txtFornecedorEmail;
    private javax.swing.JTextField txtFornecedorEndereco;
    private javax.swing.JTextField txtFornecedorNomeFantasia;
    private javax.swing.JTextField txtFornecedorNumero;
    private javax.swing.JTextField txtFornecedorRazaoSocial;
    private javax.swing.JFormattedTextField txtFornecedorTelefone;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtPesquisaFornecedor;
    // End of variables declaration//GEN-END:variables
}
