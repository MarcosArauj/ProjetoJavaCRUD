package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.model.persistencia.cadastros.CadastroClienteDao;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdPessoaJuridica;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;

public class FormClientePessoaJuridica extends javax.swing.JFrame {
    
    ClientePessoaJuridica cliente = new ClientePessoaJuridica();
    Contato contato = new Contato();
    CadastroClienteDao salvarCliente = new CadastroClienteDao();
    int flag = 0;
    
    public FormClientePessoaJuridica() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadClientePjNomeFantasia = new javax.swing.JLabel();
        jLabelCadClientePjCnpj = new javax.swing.JLabel();
        jTextFieldCadClientePjNomeFantasia = new javax.swing.JTextField();
        jLabelCadClientePjRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jFormattedTextFieldCnpj = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadEnderecoClientePj = new javax.swing.JLabel();
        jLabelCadCidadeClientePj = new javax.swing.JLabel();
        jLabelCadNumeroClientePj = new javax.swing.JLabel();
        jLabelCadBairroClientePj = new javax.swing.JLabel();
        jLabelCadCepClientePj = new javax.swing.JLabel();
        jLabelCadEstadoClientePj = new javax.swing.JLabel();
        jFormattedTextFieldCadCepClientePj = new javax.swing.JFormattedTextField();
        jTextFieldCadEnderecoClientePj = new javax.swing.JTextField();
        jTextFieldCadNumeroClientePj = new javax.swing.JTextField();
        jTextFieldCadBairroClientePj = new javax.swing.JTextField();
        jTextFieldCadCidadeClientePj = new javax.swing.JTextField();
        jComboBoxCadEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefoneClientePj = new javax.swing.JLabel();
        jLabelCadEmailClientePj = new javax.swing.JLabel();
        jTextFieldjLabelCadEmailClientePj = new javax.swing.JTextField();
        jFormattedTextFieldCadCelularClientePj = new javax.swing.JFormattedTextField();
        jLabelCadCelularClientePj = new javax.swing.JLabel();
        jFormattedTextFieldCadTelefoneClientePj = new javax.swing.JFormattedTextField();
        jButtonCadCadastrar = new javax.swing.JButton();
        jButtonCadNovo = new javax.swing.JButton();
        jButtonCadLimpar = new javax.swing.JButton();
        jLabelFundoCadClientePj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente Pessoa Jurídica");
        getContentPane().setLayout(null);

        jPanel.setBackground(new java.awt.Color(204, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadClientePjNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjNomeFantasia.setText("Nome Fantasia : ");

        jLabelCadClientePjCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjCnpj.setText("CNPJ : ");

        jTextFieldCadClientePjNomeFantasia.setEnabled(false);

        jLabelCadClientePjRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClientePjRazaoSocial.setText("Razão Social : ");

        jTextFieldRazaoSocial.setEnabled(false);

        try {
            jFormattedTextFieldCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCnpj.setEnabled(false);

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
                        .addGap(31, 31, 31)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadClientePjNomeFantasia)
                            .addComponent(jLabelCadClientePjCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadClientePjRazaoSocial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRazaoSocial))
                            .addComponent(jTextFieldCadClientePjNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelDadosCadastrais)
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadClientePjNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClientePjNomeFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClientePjCnpj)
                    .addComponent(jLabelCadClientePjRazaoSocial)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel);
        jPanel.setBounds(40, 30, 770, 170);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            jFormattedTextFieldCadCepClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCepClientePj.setEnabled(false);

        jTextFieldCadEnderecoClientePj.setEnabled(false);

        jTextFieldCadNumeroClientePj.setEnabled(false);

        jTextFieldCadBairroClientePj.setEnabled(false);

        jTextFieldCadCidadeClientePj.setEnabled(false);

        jComboBoxCadEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas ", "Amapá  ", "Amazonas  \t ", "Bahia \t ", "Ceará\t \t ", "Distrito Federal  \t ", "Espírito Santo  \t ", "Goiás  \t ", "Maranhão \t ", "Mato Grosso\t \t ", "Mato Grosso do Sul \t ", "Minas Gerais \t ", "Pará ", "Paraíba \t ", "Paraná  \t ", "Pernambuco\t ", "Piauí  ", "Rio de Janeiro \t ", "Rio Grande do Norte", "Rio Grande do Sul \t ", "Rondônia ", "Roraima", "Santa Catarina\t \t ", "São Paulo  ", "Sergipe \t ", "Tocantins" }));
        jComboBoxCadEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoClientePj)
                    .addComponent(jLabelCadCepClientePj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadEnderecoClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadNumeroClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadNumeroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelCadBairroClientePj))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadCepClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadCidadeClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCadEstadoClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCadBairroClientePj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoClientePj)
                    .addComponent(jLabelCadNumeroClientePj)
                    .addComponent(jLabelCadBairroClientePj)
                    .addComponent(jTextFieldCadEnderecoClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadNumeroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadBairroClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeClientePj)
                    .addComponent(jLabelCadCepClientePj)
                    .addComponent(jLabelCadEstadoClientePj)
                    .addComponent(jFormattedTextFieldCadCepClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadCidadeClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 220, 770, 110);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneClientePj.setText("Telefone : ");

        jLabelCadEmailClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailClientePj.setText("E-mail : ");

        jTextFieldjLabelCadEmailClientePj.setEnabled(false);

        try {
            jFormattedTextFieldCadCelularClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCelularClientePj.setEnabled(false);

        jLabelCadCelularClientePj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularClientePj.setText("Celular :");

        try {
            jFormattedTextFieldCadTelefoneClientePj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadTelefoneClientePj.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneClientePj)
                    .addComponent(jLabelCadEmailClientePj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldjLabelCadEmailClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadTelefoneClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularClientePj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadCelularClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneClientePj)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularClientePj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadTelefoneClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldCadCelularClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailClientePj)
                    .addComponent(jTextFieldjLabelCadEmailClientePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 356, 770, 90);

        jButtonCadCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadCadastrar.setText("Cadastrar");
        jButtonCadCadastrar.setEnabled(false);
        jButtonCadCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCadastrar);
        jButtonCadCadastrar.setBounds(510, 480, 100, 40);

        jButtonCadNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadNovo.setText("Novo");
        jButtonCadNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadNovo);
        jButtonCadNovo.setBounds(610, 480, 100, 40);

        jButtonCadLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadLimpar.setText("Limpar");
        jButtonCadLimpar.setEnabled(false);
        jButtonCadLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadLimpar);
        jButtonCadLimpar.setBounds(710, 480, 100, 40);

        jLabelFundoCadClientePj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        jLabelFundoCadClientePj.setText("Cadastro de Cliente");
        getContentPane().add(jLabelFundoCadClientePj);
        jLabelFundoCadClientePj.setBounds(0, 0, 870, 590);

        setSize(new java.awt.Dimension(860, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoActionPerformed
        flag = 1;
       jTextFieldCadClientePjNomeFantasia.setEnabled(true);
       jTextFieldCadClientePjNomeFantasia.requestFocus();
       jFormattedTextFieldCnpj.setEnabled(true);
       jTextFieldRazaoSocial.setEnabled(true);
       jTextFieldCadEnderecoClientePj.setEnabled(true);
       jTextFieldCadNumeroClientePj.setEnabled(true);
       jTextFieldCadBairroClientePj.setEnabled(true);
       jFormattedTextFieldCadCepClientePj.setEnabled(true);
       jTextFieldCadCidadeClientePj.setEnabled(true);
       jFormattedTextFieldCadTelefoneClientePj.setEnabled(true);
       jFormattedTextFieldCadCelularClientePj.setEnabled(true);
       jTextFieldjLabelCadEmailClientePj.setEnabled(true);
       jComboBoxCadEstado.setEnabled(true);
       jButtonCadCadastrar.setEnabled(true);
       jButtonCadLimpar.setEnabled(true);
       jButtonCadNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonCadNovoActionPerformed

    private void jButtonCadCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCadastrarActionPerformed
        if (flag == 1) {
            cliente.setNomeFantasia(jTextFieldCadClientePjNomeFantasia.getText());
            cliente.setCnpj(jFormattedTextFieldCnpj.getText());
            cliente.setRazaoSocial(jTextFieldRazaoSocial.getText());
            
            contato.setEndereco(jTextFieldCadEnderecoClientePj.getText());
            contato.setNumero(jTextFieldCadNumeroClientePj.getText());
            contato.setBairro(jTextFieldCadBairroClientePj.getText());
            contato.setCep(jFormattedTextFieldCadCepClientePj.getText());
            contato.setCidade(jTextFieldCadCidadeClientePj.getText());
            contato.setEstado((String) jComboBoxCadEstado.getSelectedItem());
            contato.setCelular(jFormattedTextFieldCadCelularClientePj.getText());
            contato.setTefefone(jFormattedTextFieldCadTelefoneClientePj.getText());
            contato.setEmail(jTextFieldjLabelCadEmailClientePj.getText());
            
            cliente.setContato(contato);
            
             if (VerificaCampos.validaCampos(jTextFieldCadClientePjNomeFantasia.getText())                    
                    || VerificaCampos.validaCampos(jFormattedTextFieldCnpj.getText())
                    || VerificaCampos.validaCampos(jTextFieldRazaoSocial.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadEnderecoClientePj.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadNumeroClientePj.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadBairroClientePj.getText())
                    || VerificaCampos.validaCampos(jFormattedTextFieldCadCepClientePj.getText())
                    || VerificaCampos.validaCampos(jTextFieldCadCidadeClientePj.getText())) {
               } else {
                      //verificando se o email é valido
                    if(Validacoes.verificaEmail(jTextFieldjLabelCadEmailClientePj.getText())){
                      //verificando se o dado já está cadastrado no Banco de Dados
                   } else { 
                      if ( VerificaBdPessoaJuridica.verificaRazaoSocial(cliente)
                          || VerificaBdPessoaJuridica.verificaCnpj(cliente) 
                          || VerificaBdPessoaJuridica.verificaNumero(cliente)
                          || VerificaBdPessoaJuridica.verificaTelefone(cliente)
                          || VerificaBdPessoaJuridica.verificaCelular(cliente)   
                          || VerificaBdPessoaJuridica.verificaEmail(cliente)) {
         
                         } else {
                         //slavando dados
                          salvarCliente.salvar(cliente);
                          
                         jTextFieldCadClientePjNomeFantasia.setText("");
                         jFormattedTextFieldCnpj.setText("");
                         jTextFieldRazaoSocial.setText("");
                         jTextFieldCadEnderecoClientePj.setText("");
                         jTextFieldCadNumeroClientePj.setText("");
                         jTextFieldCadBairroClientePj.setText("");
                         jFormattedTextFieldCadCepClientePj.setText("");
                         jTextFieldCadCidadeClientePj.setText("");
                         jFormattedTextFieldCadTelefoneClientePj.setText("");
                         jFormattedTextFieldCadCelularClientePj.setText("");
                         jTextFieldjLabelCadEmailClientePj.setText("");
                         
                        jTextFieldCadClientePjNomeFantasia.setEnabled(false);
                        jFormattedTextFieldCnpj.setEnabled(false);
                        jTextFieldRazaoSocial.setEnabled(false);
                        jTextFieldCadEnderecoClientePj.setEnabled(false);
                        jTextFieldCadNumeroClientePj.setEnabled(false);
                        jTextFieldCadBairroClientePj.setEnabled(false);
                        jFormattedTextFieldCadCepClientePj.setEnabled(false);
                        jTextFieldCadCidadeClientePj.setEnabled(false);
                        jFormattedTextFieldCadTelefoneClientePj.setEnabled(false);
                        jFormattedTextFieldCadCelularClientePj.setEnabled(false);
                        jTextFieldjLabelCadEmailClientePj.setEnabled(false);
                        jComboBoxCadEstado.setEnabled(false);
                        jButtonCadCadastrar.setEnabled(false);
                        jButtonCadLimpar.setEnabled(false);
                        jButtonCadNovo.setEnabled(true);
                          
                      }
                 }
             }
        }
    }//GEN-LAST:event_jButtonCadCadastrarActionPerformed

    private void jButtonCadLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLimparActionPerformed
        jTextFieldCadClientePjNomeFantasia.setText("");
        jFormattedTextFieldCnpj.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldCadEnderecoClientePj.setText("");
        jTextFieldCadNumeroClientePj.setText("");
        jTextFieldCadBairroClientePj.setText("");
        jFormattedTextFieldCadCepClientePj.setText("");
        jTextFieldCadCidadeClientePj.setText("");
        jFormattedTextFieldCadTelefoneClientePj.setText("");
        jFormattedTextFieldCadCelularClientePj.setText("");
        jTextFieldjLabelCadEmailClientePj.setText("");
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
            java.util.logging.Logger.getLogger(FormClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientePessoaJuridica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCadastrar;
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonCadNovo;
    private javax.swing.JComboBox<String> jComboBoxCadEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCelularClientePj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCepClientePj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadTelefoneClientePj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpj;
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
    private javax.swing.JLabel jLabelFundoCadClientePj;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCadBairroClientePj;
    private javax.swing.JTextField jTextFieldCadCidadeClientePj;
    private javax.swing.JTextField jTextFieldCadClientePjNomeFantasia;
    private javax.swing.JTextField jTextFieldCadEnderecoClientePj;
    private javax.swing.JTextField jTextFieldCadNumeroClientePj;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldjLabelCadEmailClientePj;
    // End of variables declaration//GEN-END:variables
}
