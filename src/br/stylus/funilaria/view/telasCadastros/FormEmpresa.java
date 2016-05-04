package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.controller.gestaopessoa.contato.Contato;
import br.stylus.funilaria.controller.gestaopessoa.juridica.Empresa;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdContato;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdPessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.persistencia.ContatoDao;
import br.stylus.funilaria.model.persistencia.EmpresaDao;
import br.stylus.funilaria.view.telasIniciais.TelaAdministrador;

import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class FormEmpresa extends javax.swing.JFrame {

    Empresa control1 = new Empresa();
    Contato control2 = new Contato();
    EmpresaDao mod1 = new  EmpresaDao();
    ContatoDao mod2 = new ContatoDao();
    ConexaoBD conex = new ConexaoBD();
    
    public FormEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCadNomeFantasia = new javax.swing.JLabel();
        jTextFieldCadNomeFantasia = new javax.swing.JTextField();
        jLabelCadRazaoSocial = new javax.swing.JLabel();
        jTextFieldCadRazaoSocial = new javax.swing.JTextField();
        jLabelCadCnpj = new javax.swing.JLabel();
        jFormattedTextFieldCadCnpj = new javax.swing.JFormattedTextField();
        jLabelCadInsEstadual = new javax.swing.JLabel();
        jFormattedTextFieldCadInscrEstadual = new javax.swing.JFormattedTextField();
        jLabelCadInsMunicipal = new javax.swing.JLabel();
        jFormattedTextFieldCadInscrMunicipal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCadBairro = new javax.swing.JLabel();
        jTextFieldCadBairro = new javax.swing.JTextField();
        jLabelCadCidade = new javax.swing.JLabel();
        jTextFieldCadCidade = new javax.swing.JTextField();
        jLabelCadNumero = new javax.swing.JLabel();
        jTextFieldCadNumero = new javax.swing.JTextField();
        jLabelCadCep = new javax.swing.JLabel();
        jFormattedTextFieldCadCep = new javax.swing.JFormattedTextField();
        jLabelCadEstado = new javax.swing.JLabel();
        jComboBoxCadEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefone = new javax.swing.JLabel();
        jFormattedTextFieldCadTelefone = new javax.swing.JFormattedTextField();
        jLabelCadEmail = new javax.swing.JLabel();
        jTextFieldCadEmail = new javax.swing.JTextField();
        jLabelCadCelular = new javax.swing.JLabel();
        jFormattedTextFieldCadCelular = new javax.swing.JFormattedTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelFundoCadEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro da Empresa");
        setResizable(false);
        setSize(new java.awt.Dimension(860, 540));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNomeFantasia.setText("Nome Fantasía : ");

        jLabelCadRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadRazaoSocial.setText("Razão Social : ");

        jLabelCadCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCnpj.setText("CNPJ :");

        try {
            jFormattedTextFieldCadCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCadInsEstadual.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadInsEstadual.setText("Inscrição Estadual :");

        try {
            jFormattedTextFieldCadInscrEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCadInsMunicipal.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadInsMunicipal.setText("Inscrição Municipal : ");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("Dados Cadastrais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(306, 306, 306))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCadInsMunicipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldCadInscrMunicipal)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadInsEstadual)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldCadInscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadNomeFantasia)
                            .addComponent(jLabelCadRazaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCadRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCadCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCadCnpj))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCadNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadNomeFantasia)
                    .addComponent(jTextFieldCadNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadRazaoSocial)
                    .addComponent(jLabelCadCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCadCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadInsMunicipal)
                    .addComponent(jLabelCadInsEstadual)
                    .addComponent(jFormattedTextFieldCadInscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCadInscrMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 780, 200);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadEndereco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEndereco.setText("Endereço : ");

        jLabelCadBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairro.setText("Bairro : ");

        jLabelCadCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCidade.setText("Cidade : ");

        jLabelCadNumero.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNumero.setText("Nº : ");

        jTextFieldCadNumero.setToolTipText("");

        jLabelCadCep.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCep.setText("CEP : ");

        try {
            jFormattedTextFieldCadCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCadEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEstado.setText("Estado : ");

        jComboBoxCadEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxCadEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Alagoas ", "Amapá  ", "Amazonas  \t ", "Bahia \t ", "Ceará\t \t ", "Distrito Federal  \t ", "Espírito Santo  \t ", "Goiás  \t ", "Maranhão \t ", "Mato Grosso\t \t ", "Mato Grosso do Sul \t ", "Minas Gerais \t ", "Pará ", "Paraíba \t ", "Paraná  \t ", "Pernambuco\t ", "Piauí  ", "Rio de Janeiro \t ", "Rio Grande do Norte", "Rio Grande do Sul \t ", "Rondônia ", "Roraima", "Santa Catarina\t \t ", "São Paulo  ", "Sergipe \t ", "Tocantins" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelCadEndereco)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCadCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCadNumero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadCep, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadCidade)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldCadNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEndereco)
                    .addComponent(jLabelCadNumero)
                    .addComponent(jLabelCadBairro)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCep)
                    .addComponent(jLabelCadCidade)
                    .addComponent(jTextFieldCadCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadEstado)
                    .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCadCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 240, 780, 120);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefone.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefone.setText("Telefone :");

        try {
            jFormattedTextFieldCadTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCadEmail.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmail.setText("Email : ");

        jLabelCadCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelCadCelular.setText("Celular :");

        try {
            jFormattedTextFieldCadCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefone)
                    .addComponent(jLabelCadEmail))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jFormattedTextFieldCadTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCadCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadEmail)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadTelefone)
                    .addComponent(jFormattedTextFieldCadTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadCelular)
                    .addComponent(jFormattedTextFieldCadCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 380, 780, 100);

        jButtonLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(590, 510, 100, 40);

        jButtonCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(690, 510, 100, 40);

        jLabelFundoCadEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadEmpresa);
        jLabelFundoCadEmpresa.setBounds(0, 0, 850, 580);

        setSize(new java.awt.Dimension(850, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       // verificando campo vazio no formulário de cadastro
        if (VerificaCampos.validaCampos(jTextFieldCadRazaoSocial.getText())    
            || VerificaCampos.validaCampos(jTextFieldCadNomeFantasia.getText()) 
            || VerificaCampos.validaCampos(jFormattedTextFieldCadCnpj.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadInscrMunicipal.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadInscrEstadual.getText())
            || VerificaCampos.validaCampos(jTextFieldEndereco.getText())
            || VerificaCampos.validaCampos(jTextFieldCadNumero.getText())
            || VerificaCampos.validaCampos(jTextFieldCadBairro.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadCep.getText())
            || VerificaCampos.validaCampos(jTextFieldCadCidade.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadTelefone.getText())
            || VerificaCampos.validaCampos(jTextFieldCadEmail.getText())){ 
        } else {
           //verificando se o email é valido
            if(Validacoes.verificaEmail(jTextFieldCadEmail.getText())){
                 //verificando se o dado já está cadastrado no Banco de Dados
            } else {     
            if ( VerificaBdPessoaJuridica.verificaRazaoSocial(jTextFieldCadRazaoSocial.getText())
                 || VerificaBdPessoaJuridica.verificaCnpj(jFormattedTextFieldCadCnpj.getText()) 
                 || VerificaBdPessoaJuridica.verificaInscricaoMunicipal(jFormattedTextFieldCadInscrMunicipal.getText())
                 || VerificaBdPessoaJuridica.verificaInscricaoEstadual(jFormattedTextFieldCadInscrEstadual.getText())
                 || VerificaBdContato.verificaNumero(jTextFieldCadNumero.getText())
                 || VerificaBdContato.verificaTelefone(jFormattedTextFieldCadCelular.getText())
                 || VerificaBdContato.verificaEmail(jTextFieldCadEmail.getText())) {
         
                 } else {
                 // recebendo os dados
                   control1.setRazaoSocial(jTextFieldCadRazaoSocial.getText());
                   control1.setNomeFantasia(jTextFieldCadNomeFantasia.getText());
                   control1.setCnpj(jFormattedTextFieldCadCnpj.getText());
                   control1.setInscricaoMunicipal(jFormattedTextFieldCadInscrMunicipal.getText());
                   control1.setInscricaoEstadual(jFormattedTextFieldCadInscrEstadual.getText());
                   mod1.salvar(control1);    
                   control2.setEndereco(jTextFieldEndereco.getText());
                   control2.setNumero(jTextFieldCadNumero.getText());
                   control2.setCep(jFormattedTextFieldCadCep.getText());
                   control2.setBairro(jTextFieldCadBairro.getText());
                   control2.setCidade(jTextFieldCadCidade.getText());
                   control2.setEstado((String) jComboBoxCadEstado.getSelectedItem());
                   control2.setTefefone(jFormattedTextFieldCadTelefone.getText());
                   control2.setCelular(jFormattedTextFieldCadCelular.getText());
                   control2.setEmail(jTextFieldCadEmail.getText());
                   mod2.salvar(control2); 
                   TelaAdministrador tela = new TelaAdministrador();
                   tela.setVisible(true);
                   dispose();
                   
                 }
               }
           }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       
        jTextFieldCadRazaoSocial.setText("");
        jTextFieldCadNomeFantasia.setText("");
        jFormattedTextFieldCadCnpj.setText("");
        jFormattedTextFieldCadInscrMunicipal.setText("");
        jFormattedTextFieldCadInscrEstadual.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCadNumero.setText("");
        jFormattedTextFieldCadCep.setText("");
        jTextFieldCadBairro.setText("");
        jTextFieldCadCidade.setText("");
        jFormattedTextFieldCadTelefone.setText("");
        jFormattedTextFieldCadCelular.setText("");
        jTextFieldCadEmail.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxCadEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadInscrEstadual;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadInscrMunicipal;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadBairro;
    private javax.swing.JLabel jLabelCadCelular;
    private javax.swing.JLabel jLabelCadCep;
    private javax.swing.JLabel jLabelCadCidade;
    private javax.swing.JLabel jLabelCadCnpj;
    private javax.swing.JLabel jLabelCadEmail;
    private javax.swing.JLabel jLabelCadEndereco;
    private javax.swing.JLabel jLabelCadEstado;
    private javax.swing.JLabel jLabelCadInsEstadual;
    private javax.swing.JLabel jLabelCadInsMunicipal;
    private javax.swing.JLabel jLabelCadNomeFantasia;
    private javax.swing.JLabel jLabelCadNumero;
    private javax.swing.JLabel jLabelCadRazaoSocial;
    private javax.swing.JLabel jLabelCadTelefone;
    private javax.swing.JLabel jLabelFundoCadEmpresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCadBairro;
    private javax.swing.JTextField jTextFieldCadCidade;
    private javax.swing.JTextField jTextFieldCadEmail;
    private javax.swing.JTextField jTextFieldCadNomeFantasia;
    private javax.swing.JTextField jTextFieldCadNumero;
    private javax.swing.JTextField jTextFieldCadRazaoSocial;
    private javax.swing.JTextField jTextFieldEndereco;
    // End of variables declaration//GEN-END:variables
}
