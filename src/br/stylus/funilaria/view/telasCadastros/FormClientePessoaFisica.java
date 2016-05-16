package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.model.persistencia.ClienteDao;
import br.stylus.funilaria.model.persistencia.ContatoDao;
import br.stylus.funilaria.model.persistencia.PessoaFisicaDao;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdContato;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdPessoaFisica;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class FormClientePessoaFisica extends javax.swing.JFrame {
        
    ClientePessoaFisica controlCli = new ClientePessoaFisica();
    Contato controlCont = new Contato();
    PessoaFisicaDao modPf = new PessoaFisicaDao();
    ClienteDao modCli = new ClienteDao();
    ContatoDao modCont = new ContatoDao();
    int flag = 0;
    
    public FormClientePessoaFisica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadClienteNome = new javax.swing.JLabel();
        jLabelCadClienteCpf = new javax.swing.JLabel();
        jLabelCadClienteRg = new javax.swing.JLabel();
        jTextFieldCadClienteNome = new javax.swing.JTextField();
        jFormattedTextFieldCadClienteCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCadClienteRg = new javax.swing.JFormattedTextField();
        jLabelCadOex = new javax.swing.JLabel();
        jTextFieldCadEox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadEnderecoCliente = new javax.swing.JLabel();
        jLabelCadCidadeCliente = new javax.swing.JLabel();
        jLabelCadNumeroCliente = new javax.swing.JLabel();
        jLabelCadBairroCliente = new javax.swing.JLabel();
        jLabelCadCepCliente = new javax.swing.JLabel();
        jLabelCadEstadoCliente = new javax.swing.JLabel();
        jFormattedTextFieldCadCepCliente = new javax.swing.JFormattedTextField();
        jTextFieldCadEnderecoCliente = new javax.swing.JTextField();
        jTextFieldCadNumeroCliente = new javax.swing.JTextField();
        jTextFieldCadBairroCliente = new javax.swing.JTextField();
        jTextFieldCadCidadeCliente = new javax.swing.JTextField();
        jComboBoxCadEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefoneCliente = new javax.swing.JLabel();
        jLabelCadEmailCliente = new javax.swing.JLabel();
        jTextFieldjLabelCadEmailCliente = new javax.swing.JTextField();
        jFormattedTextFieldCadCelularCliente = new javax.swing.JFormattedTextField();
        jLabelCadCelularCliente = new javax.swing.JLabel();
        jFormattedTextFieldCadTelefoneCliente = new javax.swing.JFormattedTextField();
        jButtonCadLimpar = new javax.swing.JButton();
        jButtonCadNovo = new javax.swing.JButton();
        jButtonCadCadastrar = new javax.swing.JButton();
        jLabelFundoCadCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Cadastro de Cliente Pessoa Física");
        getContentPane().setLayout(null);

        jPanel.setBackground(new java.awt.Color(204, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadClienteNome.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteNome.setText("Nome : ");

        jLabelCadClienteCpf.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteCpf.setText("CPF : ");

        jLabelCadClienteRg.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteRg.setText("RG : ");

        jTextFieldCadClienteNome.setEnabled(false);

        try {
            jFormattedTextFieldCadClienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadClienteCpf.setEnabled(false);

        try {
            jFormattedTextFieldCadClienteRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadClienteRg.setEnabled(false);

        jLabelCadOex.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadOex.setText("Orgão Expedidor :");

        jTextFieldCadEox.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Data :");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setEnabled(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabelDadosCadastrais))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCadClienteCpf)
                                    .addComponent(jLabelCadClienteNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCadClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabelCadClienteRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCadClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCadOex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCadEox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCadClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelDadosCadastrais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadClienteNome)
                    .addComponent(jTextFieldCadClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClienteCpf)
                    .addComponent(jFormattedTextFieldCadClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClienteRg)
                    .addComponent(jFormattedTextFieldCadClienteRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadOex)
                    .addComponent(jTextFieldCadEox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel);
        jPanel.setBounds(40, 30, 770, 180);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            jFormattedTextFieldCadCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCepCliente.setEnabled(false);

        jTextFieldCadEnderecoCliente.setEnabled(false);

        jTextFieldCadNumeroCliente.setEnabled(false);

        jTextFieldCadBairroCliente.setEnabled(false);

        jTextFieldCadCidadeCliente.setEnabled(false);

        jComboBoxCadEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas ", "Amapá  ", "Amazonas  \t ", "Bahia \t ", "Ceará\t \t ", "Distrito Federal  \t ", "Espírito Santo  \t ", "Goiás  \t ", "Maranhão \t ", "Mato Grosso\t \t ", "Mato Grosso do Sul \t ", "Minas Gerais \t ", "Pará ", "Paraíba \t ", "Paraná  \t ", "Pernambuco\t ", "Piauí  ", "Rio de Janeiro \t ", "Rio Grande do Norte", "Rio Grande do Sul \t ", "Rondônia ", "Roraima", "Santa Catarina\t \t ", "São Paulo  ", "Sergipe \t ", "Tocantins" }));
        jComboBoxCadEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoCliente)
                    .addComponent(jLabelCadCepCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadBairroCliente)
                        .addGap(16, 16, 16)
                        .addComponent(jTextFieldCadBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadCidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadEstadoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoCliente)
                    .addComponent(jLabelCadNumeroCliente)
                    .addComponent(jLabelCadBairroCliente)
                    .addComponent(jTextFieldCadEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeCliente)
                    .addComponent(jLabelCadCepCliente)
                    .addComponent(jLabelCadEstadoCliente)
                    .addComponent(jFormattedTextFieldCadCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 220, 770, 100);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneCliente.setText("Telefone : ");

        jLabelCadEmailCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailCliente.setText("E-mail : ");

        jTextFieldjLabelCadEmailCliente.setEnabled(false);

        try {
            jFormattedTextFieldCadCelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCelularCliente.setEnabled(false);

        jLabelCadCelularCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularCliente.setText("Celular :");

        try {
            jFormattedTextFieldCadTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadTelefoneCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneCliente)
                    .addComponent(jLabelCadEmailCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldjLabelCadEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneCliente)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldCadCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailCliente)
                    .addComponent(jTextFieldjLabelCadEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 330, 770, 110);

        jButtonCadLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadLimpar.setText("Limpar");
        jButtonCadLimpar.setEnabled(false);
        jButtonCadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadLimpar);
        jButtonCadLimpar.setBounds(710, 470, 100, 40);

        jButtonCadNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadNovo.setText("Novo");
        jButtonCadNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadNovo);
        jButtonCadNovo.setBounds(610, 470, 100, 40);

        jButtonCadCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadCadastrar.setText("Cadastrar");
        jButtonCadCadastrar.setEnabled(false);
        jButtonCadCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCadastrar);
        jButtonCadCadastrar.setBounds(510, 470, 100, 40);

        jLabelFundoCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadCliente);
        jLabelFundoCadCliente.setBounds(0, 0, 870, 590);

        setSize(new java.awt.Dimension(860, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoActionPerformed
       flag = 1;
       jTextFieldCadClienteNome.setEnabled(true);
       jFormattedTextFieldCadClienteCpf.setEnabled(true);
       jFormattedTextFieldCadClienteRg.setEnabled(true);
       jTextFieldCadEox.setEnabled(true);
       jFormattedTextFieldData.setEnabled(true);
       jTextFieldCadEnderecoCliente.setEnabled(true);
       jTextFieldCadNumeroCliente.setEnabled(true);
       jTextFieldCadBairroCliente.setEnabled(true);
       jFormattedTextFieldCadCepCliente.setEnabled(true);
       jTextFieldCadCidadeCliente.setEnabled(true);
       jFormattedTextFieldCadTelefoneCliente.setEnabled(true);
       jFormattedTextFieldCadCelularCliente.setEnabled(true);
       jTextFieldjLabelCadEmailCliente.setEnabled(true);
       jComboBoxCadEstado.setEnabled(true);
       jButtonCadCadastrar.setEnabled(true);
       jButtonCadLimpar.setEnabled(true);
       jButtonCadNovo.setEnabled(false);
       
    }//GEN-LAST:event_jButtonCadNovoActionPerformed

    private void jButtonCadCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCadastrarActionPerformed
        if (flag == 1) {
            //recebendo os dados
            controlCli.setNome(jTextFieldCadClienteNome.getText());
            controlCli.setCpf(jFormattedTextFieldCadClienteCpf.getText());
            controlCli.setRg(jFormattedTextFieldCadClienteRg.getText());
            controlCli.setOex(jTextFieldCadEox.getText());
            controlCli.setDataCadastro(jFormattedTextFieldData.getText());
            
            controlCont.setEndereco(jTextFieldCadEnderecoCliente.getText());
            controlCont.setNumero(jTextFieldCadNumeroCliente.getText());
            controlCont.setBairro(jTextFieldCadBairroCliente.getText());
            controlCont.setCep(jFormattedTextFieldCadCepCliente.getText());
            controlCont.setCidade(jTextFieldCadCidadeCliente.getText());
            controlCont.setEstado((String) jComboBoxCadEstado.getSelectedItem());
            controlCont.setCelular(jFormattedTextFieldCadCelularCliente.getText());
            controlCont.setTefefone(jFormattedTextFieldCadTelefoneCliente.getText());
            controlCont.setEmail(jTextFieldjLabelCadEmailCliente.getText());
            
             if (VerificaCampos.validaCampos(jTextFieldCadClienteNome.getText())                    
                    || VerificaCampos.validaCampos(jFormattedTextFieldCadClienteCpf.getText())
                    || VerificaCampos.validaCampos(jFormattedTextFieldCadClienteRg.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadEox.getText())
                    || VerificaCampos.validaCampos(jFormattedTextFieldData.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadEnderecoCliente.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadNumeroCliente.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadBairroCliente.getText())
                    || VerificaCampos.validaCampos(jFormattedTextFieldCadCepCliente.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadCidadeCliente.getText())) {

               } else {
                    //verificando se o dado já está cadastrado no Banco de Dados 
                if (Validacoes.isCPF(jFormattedTextFieldCadClienteCpf.getText())) {
                    if (Validacoes.verificaEmail(jTextFieldjLabelCadEmailCliente.getText())) {

                     } else if (VerificaBdPessoaFisica.verificaCpf(controlCli)
                        || VerificaBdPessoaFisica.verificaRg(controlCli)
                        || VerificaBdPessoaFisica.verificaNomeCpf(controlCli)     
                        || VerificaBdContato.verificaCelular(controlCont)
                        || VerificaBdContato.verificaEmail(controlCont)) {
                   } else {
                        //salvando dados
                    modPf.salvar(controlCli);
                    modCli.salvar(controlCli);
                    modCont.salvar(controlCont);  
                     
                    jTextFieldCadClienteNome.setText("");
                    jFormattedTextFieldCadClienteCpf.setText("");
                    jFormattedTextFieldCadClienteRg.setText("");
                    jTextFieldCadEox.setText("");
                    jFormattedTextFieldData.setText("");
                    jTextFieldCadEnderecoCliente.setText("");
                    jTextFieldCadNumeroCliente.setText("");
                    jTextFieldCadBairroCliente.setText("");
                    jFormattedTextFieldCadCepCliente.setText("");
                    jTextFieldCadCidadeCliente.setText("");
                    jFormattedTextFieldCadTelefoneCliente.setText("");
                    jFormattedTextFieldCadCelularCliente.setText("");
                    jTextFieldjLabelCadEmailCliente.setText("");
                    
                    jTextFieldCadClienteNome.setEnabled(false);
                    jFormattedTextFieldCadClienteCpf.setEnabled(false);
                    jFormattedTextFieldCadClienteRg.setEnabled(false);
                    jTextFieldCadEox.setEnabled(false);
                    jFormattedTextFieldData.setEnabled(false);
                    jTextFieldCadEnderecoCliente.setEnabled(false);
                    jTextFieldCadNumeroCliente.setEnabled(false);
                    jTextFieldCadBairroCliente.setEnabled(false);
                    jFormattedTextFieldCadCepCliente.setEnabled(false);
                    jTextFieldCadCidadeCliente.setEnabled(false);
                    jFormattedTextFieldCadTelefoneCliente.setEnabled(false);
                    jFormattedTextFieldCadCelularCliente.setEnabled(false);
                    jTextFieldjLabelCadEmailCliente.setEnabled(false);
                    jComboBoxCadEstado.setEnabled(false);
                    jButtonCadCadastrar.setEnabled(false);
                    jButtonCadLimpar.setEnabled(false);
                    jButtonCadNovo.setEnabled(true);
                   
                  } 
            } else {
                JOptionPane.showMessageDialog(rootPane, "CPF inválido!\nDigite apenas os Números!");
            }
          }       
        }
    }//GEN-LAST:event_jButtonCadCadastrarActionPerformed

    private void jButtonCadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLimparActionPerformed
        jTextFieldCadClienteNome.setText("");
        jFormattedTextFieldCadClienteCpf.setText("");
        jFormattedTextFieldCadClienteRg.setText("");
        jTextFieldCadEox.setText("");
        jFormattedTextFieldData.setText("");
        jTextFieldCadEnderecoCliente.setText("");
        jTextFieldCadNumeroCliente.setText("");
        jTextFieldCadBairroCliente.setText("");
        jFormattedTextFieldCadCepCliente.setText("");
        jTextFieldCadCidadeCliente.setText("");
        jFormattedTextFieldCadTelefoneCliente.setText("");
        jFormattedTextFieldCadCelularCliente.setText("");
        jTextFieldjLabelCadEmailCliente.setText("");
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
            java.util.logging.Logger.getLogger(FormClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientePessoaFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCadastrar;
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonCadNovo;
    private javax.swing.JComboBox<String> jComboBoxCadEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCelularCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCepCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadClienteCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadClienteRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadTelefoneCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
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
    private javax.swing.JLabel jLabelFundoCadCliente;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCadBairroCliente;
    private javax.swing.JTextField jTextFieldCadCidadeCliente;
    private javax.swing.JTextField jTextFieldCadClienteNome;
    private javax.swing.JTextField jTextFieldCadEnderecoCliente;
    private javax.swing.JTextField jTextFieldCadEox;
    private javax.swing.JTextField jTextFieldCadNumeroCliente;
    private javax.swing.JTextField jTextFieldjLabelCadEmailCliente;
    // End of variables declaration//GEN-END:variables
}
