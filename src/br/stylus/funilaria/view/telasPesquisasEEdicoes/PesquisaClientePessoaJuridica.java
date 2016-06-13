package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaClientePjDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiClienteDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaClientePjDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaClientePessoaJuridica extends javax.swing.JFrame {
    
    ClientePessoaJuridica clientePj = new ClientePessoaJuridica();
    Contato contato = new Contato();
    ConexaoBD conex = new ConexaoBD();
    PesquisaClientePjDao pesqCliente = new PesquisaClientePjDao();
    EditaClientePjDao editarCliente = new EditaClientePjDao();
    ExcluiClienteDao excluiCliente = new ExcluiClienteDao();
    
    public PesquisaClientePessoaJuridica() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisaClienteJ = new javax.swing.JTabbedPane();
        jPanelPesquisaClienteJ = new javax.swing.JPanel();
        jLabelTipoPesquisaCliente = new javax.swing.JLabel();
        txtPesquisaCliente = new javax.swing.JTextField();
        jButtonPesquisarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaCliente = new javax.swing.JTable();
        jPanelEditaClienteJ = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jLabelCadClientePjNomeFantasia = new javax.swing.JLabel();
        jLabelCadClientePjCnpj = new javax.swing.JLabel();
        txtClientePjNomeFantasia = new javax.swing.JTextField();
        jLabelCadClientePjRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadEnderecoClientePj = new javax.swing.JLabel();
        jLabelCadCidadeClientePj = new javax.swing.JLabel();
        jLabelCadNumeroClientePj = new javax.swing.JLabel();
        jLabelCadBairroClientePj = new javax.swing.JLabel();
        jLabelCadCepClientePj = new javax.swing.JLabel();
        jLabelCadEstadoClientePj = new javax.swing.JLabel();
        txtCepClientePj = new javax.swing.JFormattedTextField();
        txtEnderecoClientePj = new javax.swing.JTextField();
        txtNumeroClientePj = new javax.swing.JTextField();
        txtBairroClientePj = new javax.swing.JTextField();
        txtCidadeClientePj = new javax.swing.JTextField();
        jcEstado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabelCadTelefoneClientePj = new javax.swing.JLabel();
        jLabelCadEmailClientePj = new javax.swing.JLabel();
        txtEmailClientePj = new javax.swing.JTextField();
        txtCelularClientePj = new javax.swing.JFormattedTextField();
        jLabelCadCelularClientePj = new javax.swing.JLabel();
        txtTelefoneClientePj = new javax.swing.JFormattedTextField();
        jLabelIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente Pessoa Jurídica");
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPanePesquisaClienteJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelPesquisaClienteJ.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPesquisaClienteJ.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTipoPesquisaCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTipoPesquisaCliente.setText("Digite o nome Fantasia :");

        jButtonPesquisarCliente.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonPesquisarCliente.setText("Pesquisar");
        jButtonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarClienteActionPerformed(evt);
            }
        });

        jTablePesquisaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaCliente);

        javax.swing.GroupLayout jPanelPesquisaClienteJLayout = new javax.swing.GroupLayout(jPanelPesquisaClienteJ);
        jPanelPesquisaClienteJ.setLayout(jPanelPesquisaClienteJLayout);
        jPanelPesquisaClienteJLayout.setHorizontalGroup(
            jPanelPesquisaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaClienteJLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTipoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelPesquisaClienteJLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisaClienteJLayout.setVerticalGroup(
            jPanelPesquisaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaClienteJLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelPesquisaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTipoPesquisaCliente))
                    .addComponent(jButtonPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPanePesquisaClienteJ.addTab("Pesquisar Cliente", jPanelPesquisaClienteJ);

        jPanelEditaClienteJ.setBackground(new java.awt.Color(204, 255, 255));

        jPanel.setBackground(new java.awt.Color(204, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadClientePjNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjNomeFantasia.setText("Nome Fantasia : ");

        jLabelCadClientePjCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjCnpj.setText("CNPJ : ");

        txtClientePjNomeFantasia.setEnabled(false);

        jLabelCadClientePjRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjRazaoSocial.setText("Razão Social : ");

        txtRazaoSocial.setEnabled(false);

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setEnabled(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadClientePjNomeFantasia)
                    .addComponent(jLabelCadClientePjCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadClientePjRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazaoSocial))
                    .addComponent(txtClientePjNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientePjNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClientePjNomeFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClientePjCnpj)
                    .addComponent(jLabelCadClientePjRazaoSocial)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadEnderecoClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEnderecoClientePj.setText("Endereço : ");

        jLabelCadCidadeClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCidadeClientePj.setText("Cidade : ");

        jLabelCadNumeroClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNumeroClientePj.setText("Nº : ");

        jLabelCadBairroClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairroClientePj.setText("Bairro : ");

        jLabelCadCepClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCepClientePj.setText("CEP : ");

        jLabelCadEstadoClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEstadoClientePj.setText("Estado : ");

        try {
            txtCepClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepClientePj.setEnabled(false);

        txtEnderecoClientePj.setEnabled(false);

        txtNumeroClientePj.setEnabled(false);

        txtBairroClientePj.setEnabled(false);

        txtCidadeClientePj.setEnabled(false);

        jcEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jcEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoClientePj)
                    .addComponent(jLabelCadCepClientePj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEnderecoClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadNumeroClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelCadBairroClientePj))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCepClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelCadEstadoClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBairroClientePj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoClientePj)
                    .addComponent(jLabelCadNumeroClientePj)
                    .addComponent(jLabelCadBairroClientePj)
                    .addComponent(txtEnderecoClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeClientePj)
                    .addComponent(jLabelCadCepClientePj)
                    .addComponent(jLabelCadEstadoClientePj)
                    .addComponent(txtCepClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneClientePj.setText("Telefone : ");

        jLabelCadEmailClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailClientePj.setText("E-mail : ");

        txtEmailClientePj.setEnabled(false);

        try {
            txtCelularClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularClientePj.setEnabled(false);

        jLabelCadCelularClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularClientePj.setText("Celular :");

        try {
            txtTelefoneClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneClientePj.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneClientePj)
                    .addComponent(jLabelCadEmailClientePj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTelefoneClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelularClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneClientePj)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularClientePj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefoneClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCelularClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailClientePj)
                    .addComponent(txtEmailClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabelIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdCliente.setText("ID :");

        txtIdCliente.setEnabled(false);

        jButtonLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
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

        jButtonSalvar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelEditaClienteJLayout = new javax.swing.GroupLayout(jPanelEditaClienteJ);
        jPanelEditaClienteJ.setLayout(jPanelEditaClienteJLayout);
        jPanelEditaClienteJLayout.setHorizontalGroup(
            jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaClienteJLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEditaClienteJLayout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEditaClienteJLayout.createSequentialGroup()
                            .addComponent(jLabelIdCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelEditaClienteJLayout.setVerticalGroup(
            jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditaClienteJLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditaClienteJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPanePesquisaClienteJ.addTab("Editar", jPanelEditaClienteJ);

        getContentPane().add(jTabbedPanePesquisaClienteJ);
        jTabbedPanePesquisaClienteJ.setBounds(30, 60, 810, 450);

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Gerenciamento de Cliente Juridico");
        getContentPane().add(jLabelDadosCadastrais);
        jLabelDadosCadastrais.setBounds(270, 20, 275, 24);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -20, 910, 570);

        setSize(new java.awt.Dimension(894, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void pesquisaCliente(){
        clientePj.setPesquisaClientePj(txtPesquisaCliente.getText());
        clientePj.setContato(contato);
        if(txtPesquisaCliente.getText().isEmpty()){         
           JOptionPane.showMessageDialog(rootPane, "Preencha o campo para fazer a pesquisa!");
           txtPesquisaCliente.requestFocus();
           
       } else {
          pesqCliente.pesquisaCLientePj(clientePj);
            if (VerificaBdStatus.verificaStatusClienteJ(clientePj)){
              txtPesquisaCliente.requestFocus();
          } else {
          preencherTabela("select cli.cod_cliente, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_juridica cli\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on cli.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pj.nome_fantasia ='"+clientePj.getPesquisaClientePj()+"'");
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
       dados.add(new Object[] {conex.rs.getInt("cod_cliente"),conex.rs.getString("nome_fantasia"),conex.rs.getString("razao_social"),conex.rs.getString("cnpj"),
                                 conex.rs.getString("endereco"),conex.rs.getString("telefone"),conex.rs.getString("email")});
       }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro cliente para preencher a tabela"+ ex);
        }   
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaCliente.setModel(modelo);
        jTablePesquisaCliente.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTablePesquisaCliente.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTablePesquisaCliente.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePesquisaCliente.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePesquisaCliente.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTablePesquisaCliente.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTablePesquisaCliente.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisaCliente.getColumnModel().getColumn(6).setPreferredWidth(170);
        jTablePesquisaCliente.getColumnModel().getColumn(6).setResizable(false);
        jTablePesquisaCliente.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaCliente.setAutoResizeMode(jTablePesquisaCliente.AUTO_RESIZE_OFF);
        jTablePesquisaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
      
    private void limparTabela(){
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {};
        dados.add(new Object[] {});
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaCliente.setModel(modelo);
  
  }  
    
   private void receberDados(){

        clientePj.setNomeFantasia(txtClientePjNomeFantasia.getText());
        clientePj.setCnpj(txtCnpj.getText());
        clientePj.setRazaoSocial(txtRazaoSocial.getText());

        contato.setEndereco(txtEnderecoClientePj.getText());
        contato.setNumero(txtNumeroClientePj.getText());
        contato.setBairro(txtBairroClientePj.getText());
        contato.setCep(txtCepClientePj.getText());
        contato.setCidade(txtCidadeClientePj.getText());
        contato.setEstado((String) jcEstado.getSelectedItem());
        contato.setCelular(txtCelularClientePj.getText());
        contato.setTefefone(txtTelefoneClientePj.getText());
        contato.setEmail(txtEmailClientePj.getText());

        clientePj.setContato(contato);
    }
    
 private void habilitarCampos(){
       txtClientePjNomeFantasia.setEnabled(true);
       txtClientePjNomeFantasia.requestFocus();
       txtCnpj.setEnabled(true);
       txtRazaoSocial.setEnabled(true);
       txtEnderecoClientePj.setEnabled(true);
       txtNumeroClientePj.setEnabled(true);
       txtBairroClientePj.setEnabled(true);
       txtCepClientePj.setEnabled(true);
       txtCidadeClientePj.setEnabled(true);
       txtTelefoneClientePj.setEnabled(true);
       txtCelularClientePj.setEnabled(true);
       txtEmailClientePj.setEnabled(true);
       jcEstado.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonEditar.setEnabled(false);
    }
    
    private void desabilitarCampos(){
        txtClientePjNomeFantasia.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtRazaoSocial.setEnabled(false);
        txtEnderecoClientePj.setEnabled(false);
        txtNumeroClientePj.setEnabled(false);
        txtBairroClientePj.setEnabled(false);
        txtCepClientePj.setEnabled(false);
        txtCidadeClientePj.setEnabled(false);
        txtTelefoneClientePj.setEnabled(false);
        txtCelularClientePj.setEnabled(false);
        txtEmailClientePj.setEnabled(false);
        jcEstado.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        
    }
    
    private void limparCampos(){
       txtIdCliente.setText("");  
       txtPesquisaCliente.setText("");
       txtClientePjNomeFantasia.setText("");
       txtCnpj.setText("");
       txtRazaoSocial.setText("");
       txtEnderecoClientePj.setText("");
       txtNumeroClientePj.setText("");
       txtBairroClientePj.setText("");
       txtCepClientePj.setText("");
       txtCidadeClientePj.setText("");
       txtTelefoneClientePj.setText("");
       txtCelularClientePj.setText("");
       txtEmailClientePj.setText("");
       jcEstado.setSelectedIndex(0);
       
    }
    
        private void preencherTextField(){
       String cliente = ""+jTablePesquisaCliente.getValueAt(jTablePesquisaCliente.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select cli.cod_cliente, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_juridica cli\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on cli.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pj.nome_fantasia ='"+cliente+"'");
        try {
        conex.rs.first();    
            txtIdCliente.setText(String.valueOf(conex.rs.getInt("cod_cliente")));
            txtClientePjNomeFantasia.setText(conex.rs.getString("nome_fantasia"));
            txtRazaoSocial.setText(conex.rs.getString("razao_social"));
            txtCnpj.setText(conex.rs.getString("cnpj"));
            txtEnderecoClientePj.setText(conex.rs.getString("endereco"));
            txtNumeroClientePj.setText(conex.rs.getString("numero"));
            txtCepClientePj.setText(conex.rs.getString("cep"));
            txtBairroClientePj.setText(conex.rs.getString("bairro"));
            txtCidadeClientePj.setText(conex.rs.getString("cidade"));
            jcEstado.setSelectedItem((String)conex.rs.getString("estado"));
            txtTelefoneClientePj.setText(conex.rs.getString("telefone"));
            txtCelularClientePj.setText(conex.rs.getString("celular"));
            txtEmailClientePj.setText(conex.rs.getString("email"));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
        }     
        conex.desconecta();
    } 
        
    public void salvarCliente(){
        receberDados();
        if (VerificaCampos.validaCampos(txtClientePjNomeFantasia.getText())                    
               || VerificaCampos.validaCampos(txtCnpj.getText())
               || VerificaCampos.validaCampos(txtRazaoSocial.getText())
               || VerificaCampos.validaCampos(txtEnderecoClientePj.getText())
               || VerificaCampos.validaCampos(txtNumeroClientePj.getText())
               || VerificaCampos.validaCampos(txtBairroClientePj.getText())
               || VerificaCampos.validaCampos(txtCepClientePj.getText())
               || VerificaCampos.validaCampos(txtCidadeClientePj.getText())) {
          } else {
                 //verificando se o email é valido
               if(Validacoes.verificaEmail(txtEmailClientePj.getText())){
               
              } else { 
                //slavando dados
                 editarCliente.editar(clientePj);
                 JOptionPane.showMessageDialog(rootPane, "Para ver o cliente alterado, pesquise novamente!");
                 jTabbedPanePesquisaClienteJ.setSelectedIndex(0);
                 txtPesquisaCliente.requestFocus();
                 limparCampos();
                 desabilitarCampos();
               }
            }

   }
    
   public void excluirCliente(){
        int resposta  = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiCliente.excluir(clientePj);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }
        
    
    private void jButtonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarClienteActionPerformed
        if(txtPesquisaCliente.getText().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "Preencha o campo como um Nome Fantasia para continuar!");
         txtPesquisaCliente.requestFocus();  
        }  else {
        pesquisaCliente();
       }
    }//GEN-LAST:event_jButtonPesquisarClienteActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       if(txtClientePjNomeFantasia.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um cliente para continuar!");
         jTabbedPanePesquisaClienteJ.setSelectedIndex(0);
         txtPesquisaCliente.requestFocus();
      } else {
        habilitarCampos();
      }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       salvarCliente();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTablePesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaClienteMouseClicked
        preencherTextField();
        jTabbedPanePesquisaClienteJ.setSelectedIndex(1);
    }//GEN-LAST:event_jTablePesquisaClienteMouseClicked

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
            java.util.logging.Logger.getLogger(PesquisaClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisaClientePessoaJuridica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCadBairroClientePj;
    private javax.swing.JLabel jLabelCadCelularClientePj;
    private javax.swing.JLabel jLabelCadCepClientePj;
    private javax.swing.JLabel jLabelCadCidadeClientePj;
    private javax.swing.JLabel jLabelCadClientePjCnpj;
    private javax.swing.JLabel jLabelCadClientePjNomeFantasia;
    private javax.swing.JLabel jLabelCadClientePjRazaoSocial;
    private javax.swing.JLabel jLabelCadEmailClientePj;
    private javax.swing.JLabel jLabelCadEnderecoClientePj;
    private javax.swing.JLabel jLabelCadEstadoClientePj;
    private javax.swing.JLabel jLabelCadNumeroClientePj;
    private javax.swing.JLabel jLabelCadTelefoneClientePj;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelTipoPesquisaCliente;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEditaClienteJ;
    private javax.swing.JPanel jPanelPesquisaClienteJ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanePesquisaClienteJ;
    private javax.swing.JTable jTablePesquisaCliente;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JTextField txtBairroClientePj;
    private javax.swing.JFormattedTextField txtCelularClientePj;
    private javax.swing.JFormattedTextField txtCepClientePj;
    private javax.swing.JTextField txtCidadeClientePj;
    private javax.swing.JTextField txtClientePjNomeFantasia;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmailClientePj;
    private javax.swing.JTextField txtEnderecoClientePj;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNumeroClientePj;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefoneClientePj;
    // End of variables declaration//GEN-END:variables
}
