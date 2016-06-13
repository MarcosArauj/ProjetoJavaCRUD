package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaClientePfDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiClienteDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaClientePfDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaClientePessoaFisica extends javax.swing.JFrame {
    
    ClientePessoaFisica clientePf = new ClientePessoaFisica();
    Contato contato = new Contato();
    ConexaoBD conex = new ConexaoBD();
    PesquisaClientePfDao pesqCliente = new PesquisaClientePfDao();
    EditaClientePfDao editaCliente = new EditaClientePfDao();
    ExcluiClienteDao excluiCliente = new ExcluiClienteDao();
    
    public PesquisaClientePessoaFisica() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisaCliente = new javax.swing.JTabbedPane();
        jPanelPesquisaCliente = new javax.swing.JPanel();
        jLabelTipoPesquisaCliente = new javax.swing.JLabel();
        jcCliente = new javax.swing.JComboBox<>();
        txtPesquisaCliente = new javax.swing.JTextField();
        jButtonPesquisarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaCliente = new javax.swing.JTable();
        jPanelEditaCliente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadClienteNome = new javax.swing.JLabel();
        jLabelCadClienteCpf = new javax.swing.JLabel();
        jLabelCadClienteRg = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteCpf = new javax.swing.JFormattedTextField();
        txtClienteRg = new javax.swing.JFormattedTextField();
        jLabelCadOex = new javax.swing.JLabel();
        txtEox = new javax.swing.JTextField();
        jLabelPesqSexoCliente = new javax.swing.JLabel();
        jcSexoCliente = new javax.swing.JComboBox<>();
        txtNascimentoCliente = new javax.swing.JFormattedTextField();
        jLabelNasimentoCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadEnderecoCliente = new javax.swing.JLabel();
        jLabelCadCidadeCliente = new javax.swing.JLabel();
        jLabelCadNumeroCliente = new javax.swing.JLabel();
        jLabelCadBairroCliente = new javax.swing.JLabel();
        jLabelCadCepCliente = new javax.swing.JLabel();
        jLabelCadEstadoCliente = new javax.swing.JLabel();
        txtCepCliente = new javax.swing.JFormattedTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        txtBairroCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        jcEstado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabelCadTelefoneCliente = new javax.swing.JLabel();
        jLabelCadEmailCliente = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        txtCelularCliente = new javax.swing.JFormattedTextField();
        jLabelCadCelularCliente = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente Pessoa Fisíca");
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPanePesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelPesquisaCliente.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPesquisaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTipoPesquisaCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTipoPesquisaCliente.setText("Pesquisar por  :");

        jcCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Nome", "Cpf", "Sexo" }));
        jcCliente.setToolTipText("");

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

        javax.swing.GroupLayout jPanelPesquisaClienteLayout = new javax.swing.GroupLayout(jPanelPesquisaCliente);
        jPanelPesquisaCliente.setLayout(jPanelPesquisaClienteLayout);
        jPanelPesquisaClienteLayout.setHorizontalGroup(
            jPanelPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaClienteLayout.createSequentialGroup()
                        .addComponent(jLabelTipoPesquisaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisaClienteLayout.setVerticalGroup(
            jPanelPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaClienteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoPesquisaCliente)
                        .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPanePesquisaCliente.addTab("Pesquisar Cliente", jPanelPesquisaCliente);

        jPanelEditaCliente.setBackground(new java.awt.Color(204, 255, 255));
        jPanelEditaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadClienteNome.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteNome.setText("Nome : ");

        jLabelCadClienteCpf.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteCpf.setText("CPF : ");

        jLabelCadClienteRg.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteRg.setText("RG : ");

        txtClienteNome.setEnabled(false);

        try {
            txtClienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCpf.setEnabled(false);

        try {
            txtClienteRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteRg.setEnabled(false);

        jLabelCadOex.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadOex.setText("Orgão Expedidor :");

        txtEox.setEnabled(false);

        jLabelPesqSexoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelPesqSexoCliente.setText("Sexo :");

        jcSexoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));
        jcSexoCliente.setToolTipText("");
        jcSexoCliente.setEnabled(false);

        try {
            txtNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimentoCliente.setEnabled(false);

        jLabelNasimentoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNasimentoCliente.setText("Nascimento :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadClienteCpf)
                            .addComponent(jLabelCadClienteNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadClienteRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadOex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabelPesqSexoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNasimentoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClienteNome)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClienteCpf)
                    .addComponent(txtClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClienteRg)
                    .addComponent(txtClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadOex)
                    .addComponent(txtEox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNasimentoCliente)
                    .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesqSexoCliente)
                    .addComponent(jcSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadEnderecoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEnderecoCliente.setText("Endereço : ");

        jLabelCadCidadeCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCidadeCliente.setText("Cidade : ");

        jLabelCadNumeroCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNumeroCliente.setText("Nº : ");

        jLabelCadBairroCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairroCliente.setText("Bairro : ");

        jLabelCadCepCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCepCliente.setText("CEP : ");

        jLabelCadEstadoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEstadoCliente.setText("Estado : ");

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCliente.setEnabled(false);

        txtEnderecoCliente.setEnabled(false);

        txtNumeroCliente.setEnabled(false);

        txtBairroCliente.setEnabled(false);

        txtCidadeCliente.setEnabled(false);

        jcEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jcEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoCliente)
                    .addComponent(jLabelCadCepCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCadBairroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadEstadoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoCliente)
                    .addComponent(jLabelCadNumeroCliente)
                    .addComponent(jLabelCadBairroCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeCliente)
                    .addComponent(jLabelCadCepCliente)
                    .addComponent(jLabelCadEstadoCliente)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneCliente.setText("Telefone : ");

        jLabelCadEmailCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailCliente.setText("E-mail : ");

        txtEmailCliente.setEnabled(false);

        try {
            txtCelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularCliente.setEnabled(false);

        jLabelCadCelularCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularCliente.setText("Celular :");

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneCliente)
                    .addComponent(jLabelCadEmailCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneCliente)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailCliente)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID :");

        txtIdCliente.setEnabled(false);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditaClienteLayout = new javax.swing.GroupLayout(jPanelEditaCliente);
        jPanelEditaCliente.setLayout(jPanelEditaClienteLayout);
        jPanelEditaClienteLayout.setHorizontalGroup(
            jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                .addGroup(jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditaClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                        .addGroup(jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEditaClienteLayout.setVerticalGroup(
            jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditaClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditaClienteLayout.createSequentialGroup()
                        .addGroup(jPanelEditaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        jTabbedPanePesquisaCliente.addTab("Editar", jPanelEditaCliente);

        getContentPane().add(jTabbedPanePesquisaCliente);
        jTabbedPanePesquisaCliente.setBounds(40, 40, 800, 490);

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Gerenciamento de Cliente Fisico");
        getContentPane().add(jLabelDadosCadastrais);
        jLabelDadosCadastrais.setBounds(290, 10, 260, 24);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -20, 910, 560);

        setSize(new java.awt.Dimension(894, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void pesquisaCliente(){
        clientePf.setPesquisaCientePf(txtPesquisaCliente.getText());
        clientePf.setContato(contato);
        if(jcCliente.getSelectedItem().equals("Nome")){         
            pesqCliente.pesquisaNome(clientePf);
            if (VerificaBdStatus.verificaStatusClienteF(clientePf)){
              txtPesquisaCliente.requestFocus();
          } else {
            preencherTabela( "select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.nome ='"+clientePf.getPesquisaCientePf()+"'");
            }
          } else if(jcCliente.getSelectedItem().equals("Cpf")) {
             pesqCliente.pesquisaCpf(clientePf);
             if (VerificaBdStatus.verificaStatusClienteF(clientePf)){
              txtPesquisaCliente.requestFocus();
               } else {
                 preencherTabela( "select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.cpf = '"+clientePf.getPesquisaCientePf()+"'");
             }
           } else if(jcCliente.getSelectedItem().equals("Sexo")) {
             pesqCliente.pesquisaSexo(clientePf);
             if (VerificaBdStatus.verificaStatusClienteF(clientePf)){
              txtPesquisaCliente.requestFocus();
               } else {
                preencherTabela("select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.sexo = '"+clientePf.getPesquisaCientePf()+"'");
                   }
              } else if (jcCliente.getSelectedItem().equals("Selecione...")){
                JOptionPane.showMessageDialog(rootPane, "Selecione uma opção para a pesquisa!");
           }  else if(txtPesquisaCliente.getText().isEmpty()){
               JOptionPane.showMessageDialog(rootPane, "Preencha o campo para fazer a pesquisa!");
               txtPesquisaCliente.requestFocus();
      }
    }
    
       public void preencherTabela(String Sql) {
      
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {"ID","Nome","Cpf","Sexo","Endereco","Celular","Email"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
           conex.rs.first();
       do {  
       dados.add(new Object[] {conex.rs.getInt("cod_cliente"),conex.rs.getString("nome"),conex.rs.getString("cpf"),conex.rs.getString("sexo"),
                                 conex.rs.getString("endereco"),conex.rs.getString("celular"),conex.rs.getString("email")});
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
        clientePf.setCodClienteF(Integer.parseInt(txtIdCliente.getText()));
        clientePf.setNome(txtClienteNome.getText());
        clientePf.setCpf(txtClienteCpf.getText());
        clientePf.setRg(txtClienteRg.getText());
        clientePf.setOex(txtEox.getText());
        clientePf.setNascimento(txtNascimentoCliente.getText());
        clientePf.setSexo((String) jcSexoCliente.getSelectedItem());
            
        contato.setEndereco(txtEnderecoCliente.getText());
        contato.setNumero(txtNumeroCliente.getText());
        contato.setBairro(txtBairroCliente.getText());
        contato.setCep(txtCepCliente.getText());
        contato.setCidade(txtCidadeCliente.getText());
        contato.setEstado((String) jcEstado.getSelectedItem());
        contato.setCelular(txtCelularCliente.getText());
        contato.setTefefone(txtTelefoneCliente.getText());
        contato.setEmail(txtEmailCliente.getText());    
        clientePf.setContato(contato); 
  
   
  }    
  
   private void habilitarCampos(){
       txtClienteNome.setEnabled(true);
       txtClienteNome.requestFocus();
       txtClienteCpf.setEnabled(true);
       txtClienteRg.setEnabled(true);
       txtEox.setEnabled(true);
       txtNascimentoCliente.setEnabled(true);
       jcSexoCliente.setEnabled(true);
       txtEnderecoCliente.setEnabled(true);
       txtNumeroCliente.setEnabled(true);
       txtBairroCliente.setEnabled(true);
       txtCepCliente.setEnabled(true);
       txtCidadeCliente.setEnabled(true);
       txtTelefoneCliente.setEnabled(true);
       txtCelularCliente.setEnabled(true);
       txtEmailCliente.setEnabled(true);
       jcEstado.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonEditar.setEnabled(false);  
    }
    
    public void desabilitarCampos(){
        txtClienteNome.setEnabled(false);
        txtClienteCpf.setEnabled(false);
        txtClienteRg.setEnabled(false);
        txtEox.setEnabled(false);
        txtNascimentoCliente.setEnabled(false);
        jcSexoCliente.setEnabled(false);
        txtEnderecoCliente.setEnabled(false);
        txtNumeroCliente.setEnabled(false);
        txtBairroCliente.setEnabled(false);
        txtCepCliente.setEnabled(false);
        txtCidadeCliente.setEnabled(false);
        txtTelefoneCliente.setEnabled(false);
        txtCelularCliente.setEnabled(false);
        txtEmailCliente.setEnabled(false);
        jcEstado.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        
    }
    
    private void limparCampos(){
        txtIdCliente.setText("");
        txtPesquisaCliente.setText("");
        txtClienteNome.setText("");
        txtClienteCpf.setText("");
        txtClienteRg.setText("");
        txtEox.setText("");
        txtNascimentoCliente.setText("");
        jcSexoCliente.setSelectedIndex(0);
        txtEnderecoCliente.setText("");
        txtNumeroCliente.setText("");
        txtBairroCliente.setText("");
        txtCepCliente.setText("");
        txtCidadeCliente.setText("");
        jcEstado.setSelectedIndex(0);
        txtTelefoneCliente.setText("");
        txtCelularCliente.setText("");
        txtEmailCliente.setText("");  
    }
    
     private void preencherTextField(){
       String cliente = ""+jTablePesquisaCliente.getValueAt(jTablePesquisaCliente.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.nome = '"+cliente+"'");
        try {
        conex.rs.first();    
            txtIdCliente.setText(String.valueOf(conex.rs.getInt("cod_cliente")));
            txtClienteNome.setText(conex.rs.getString("nome"));
            txtClienteCpf.setText(conex.rs.getString("cpf"));
            txtClienteRg.setText(conex.rs.getString("rg"));
            txtEox.setText(conex.rs.getString("orgaoexpedidor"));
            txtNascimentoCliente.setText(conex.rs.getString("data_nascimento"));
            jcSexoCliente.setSelectedItem((String)conex.rs.getString("sexo"));
            txtEnderecoCliente.setText(conex.rs.getString("endereco"));
            txtNumeroCliente.setText(conex.rs.getString("numero"));
            txtCepCliente.setText(conex.rs.getString("cep"));
            txtBairroCliente.setText(conex.rs.getString("bairro"));
            txtCidadeCliente.setText(conex.rs.getString("cidade"));
            jcEstado.setSelectedItem((String)conex.rs.getString("estado"));
            txtTelefoneCliente.setText(conex.rs.getString("telefone"));
            txtCelularCliente.setText(conex.rs.getString("celular"));
            txtEmailCliente.setText(conex.rs.getString("email"));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
        }     
        conex.desconecta();
    }
        
    public void salvarCliente(){
        
        receberDados();
        if (VerificaCampos.validaCampos(txtClienteNome.getText())
            || VerificaCampos.validaCampos(txtClienteCpf.getText())
            || VerificaCampos.validaCampos(txtClienteRg.getText())
            || VerificaCampos.validaCampos(txtEox.getText())
            || VerificaCampos.validaCampos(txtNascimentoCliente.getText())
            || VerificaCampos.validaCampos(txtEnderecoCliente.getText())
            || VerificaCampos.validaCampos(txtNumeroCliente.getText())
            || VerificaCampos.validaCampos(txtBairroCliente.getText())
            || VerificaCampos.validaCampos(txtCepCliente.getText())
            || VerificaCampos.validaCampos(txtCidadeCliente.getText())) {

        } else {
            //verificando se o dado já está cadastrado no Banco de Dados
            if (Validacoes.isCPF(txtClienteCpf.getText())) {
                if (Validacoes.verificaEmail(txtEmailCliente.getText())) {
                    
                } else {
                    //salvando dados
                    editaCliente.editar(clientePf);
                    JOptionPane.showMessageDialog(rootPane, "Para ver o cliente alterado, pesquise novamente!");
                    jTabbedPanePesquisaCliente.setSelectedIndex(0);
                    txtPesquisaCliente.requestFocus();
                    limparCampos();
                    desabilitarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "CPF inválido!\nDigite apenas os Números!");
            }

        }
    } 
    
    public void excluirCliente(){
        int resposta  = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiCliente.excluir(clientePf);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }  
    private void jButtonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarClienteActionPerformed
       pesquisaCliente();
    }//GEN-LAST:event_jButtonPesquisarClienteActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      salvarCliente();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       if(txtClienteNome.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um cliente para continuar!");
         jTabbedPanePesquisaCliente.setSelectedIndex(0);
         txtPesquisaCliente.requestFocus();
      } else {
        habilitarCampos();
      }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTablePesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaClienteMouseClicked
        preencherTextField();
        jTabbedPanePesquisaCliente.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(PesquisaClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisaClientePessoaFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadBairroCliente;
    private javax.swing.JLabel jLabelCadCelularCliente;
    private javax.swing.JLabel jLabelCadCepCliente;
    private javax.swing.JLabel jLabelCadCidadeCliente;
    private javax.swing.JLabel jLabelCadClienteCpf;
    private javax.swing.JLabel jLabelCadClienteNome;
    private javax.swing.JLabel jLabelCadClienteRg;
    private javax.swing.JLabel jLabelCadEmailCliente;
    private javax.swing.JLabel jLabelCadEnderecoCliente;
    private javax.swing.JLabel jLabelCadEstadoCliente;
    private javax.swing.JLabel jLabelCadNumeroCliente;
    private javax.swing.JLabel jLabelCadOex;
    private javax.swing.JLabel jLabelCadTelefoneCliente;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNasimentoCliente;
    private javax.swing.JLabel jLabelPesqSexoCliente;
    private javax.swing.JLabel jLabelTipoPesquisaCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEditaCliente;
    private javax.swing.JPanel jPanelPesquisaCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanePesquisaCliente;
    private javax.swing.JTable jTablePesquisaCliente;
    private javax.swing.JComboBox<String> jcCliente;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcSexoCliente;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JFormattedTextField txtCelularCliente;
    private javax.swing.JFormattedTextField txtCepCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JFormattedTextField txtClienteCpf;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JFormattedTextField txtClienteRg;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtEox;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JFormattedTextField txtNascimentoCliente;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JFormattedTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
