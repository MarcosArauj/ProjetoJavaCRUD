package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.model.dao.cadastros.CadastroFornecedorDao;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdContato;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdPessoaJuridica;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;


public class CadastroFornecedor extends javax.swing.JFrame {

   Fornecedor fornecedor = new Fornecedor();
   Contato contato = new Contato();
   CadastroFornecedorDao salvarFornecedor = new CadastroFornecedorDao();

    public CadastroFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelCadEnderecoFornecedor = new javax.swing.JLabel();
        jLabelCadCidadeFornecedor = new javax.swing.JLabel();
        jLabelCadNumeroFornecedor = new javax.swing.JLabel();
        jLabelCadBairroFornecedor = new javax.swing.JLabel();
        jLabelCadCepFornecedor = new javax.swing.JLabel();
        jLabelCadEstadoFornecedor = new javax.swing.JLabel();
        jFormattedTextFieldCadCepFornecedor = new javax.swing.JFormattedTextField();
        jTextFieldCadEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldCadNumeroFornecedor = new javax.swing.JTextField();
        jTextFieldCadBairroFornecedor = new javax.swing.JTextField();
        jTextFieldCadCidadeFornecedor = new javax.swing.JTextField();
        jComboBoxCadEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefoneFornecedor = new javax.swing.JLabel();
        jLabelCadEmailFornecedor = new javax.swing.JLabel();
        jTextFieldjLabelCadEmailFornecedor = new javax.swing.JTextField();
        jFormattedTextFieldCadCelularFornecedor = new javax.swing.JFormattedTextField();
        jLabelCadCelularFornecedor = new javax.swing.JLabel();
        jFormattedTextFieldCadTelefoneFornecedor = new javax.swing.JFormattedTextField();
        jPanel = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadClienteNomeFantasia = new javax.swing.JLabel();
        jLabelCadClienteCnpj = new javax.swing.JLabel();
        jTextFieldCadClienteNomeFantasia = new javax.swing.JTextField();
        jLabelCadClienteRazaoSocial = new javax.swing.JLabel();
        jFormattedTextFieldCadCnpj = new javax.swing.JFormattedTextField();
        jTextFieldCadRazaoSocial = new javax.swing.JTextField();
        jButtonCadCadastrar = new javax.swing.JButton();
        jButtonCadNovo = new javax.swing.JButton();
        jButtonCadLimpar = new javax.swing.JButton();
        jLabelFundoCadFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            jFormattedTextFieldCadCepFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCepFornecedor.setEnabled(false);

        jTextFieldCadEnderecoFornecedor.setEnabled(false);

        jTextFieldCadNumeroFornecedor.setEnabled(false);

        jTextFieldCadBairroFornecedor.setEnabled(false);

        jTextFieldCadCidadeFornecedor.setEnabled(false);

        jComboBoxCadEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxCadEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxCadEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoFornecedor)
                    .addComponent(jLabelCadCepFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadNumeroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadBairroFornecedor)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldCadBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadCidadeFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadEstadoFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoFornecedor)
                    .addComponent(jLabelCadNumeroFornecedor)
                    .addComponent(jLabelCadBairroFornecedor)
                    .addComponent(jTextFieldCadEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadNumeroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeFornecedor)
                    .addComponent(jLabelCadCepFornecedor)
                    .addComponent(jLabelCadEstadoFornecedor)
                    .addComponent(jFormattedTextFieldCadCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCadEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 230, 770, 100);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneFornecedor.setText("Telefone : ");

        jLabelCadEmailFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailFornecedor.setText("E-mail : ");

        jTextFieldjLabelCadEmailFornecedor.setEnabled(false);

        try {
            jFormattedTextFieldCadCelularFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCelularFornecedor.setEnabled(false);

        jLabelCadCelularFornecedor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularFornecedor.setText("Celular :");

        try {
            jFormattedTextFieldCadTelefoneFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadTelefoneFornecedor.setEnabled(false);

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
                    .addComponent(jTextFieldjLabelCadEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneFornecedor)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldCadCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailFornecedor)
                    .addComponent(jTextFieldjLabelCadEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 344, 770, 100);

        jPanel.setBackground(new java.awt.Color(204, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadClienteNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteNomeFantasia.setText("Nome Fantasia : ");

        jLabelCadClienteCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteCnpj.setText("CNPJ : ");

        jTextFieldCadClienteNomeFantasia.setEnabled(false);

        jLabelCadClienteRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadClienteRazaoSocial.setText("Razão Social : ");

        try {
            jFormattedTextFieldCadCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCnpj.setEnabled(false);

        jTextFieldCadRazaoSocial.setEnabled(false);

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
                        .addGap(22, 22, 22)
                        .addComponent(jLabelCadClienteNomeFantasia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadClienteNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadClienteRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCadRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCadClienteCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCadCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelDadosCadastrais)
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadClienteNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadClienteNomeFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadClienteCnpj)
                    .addComponent(jLabelCadClienteRazaoSocial)
                    .addComponent(jFormattedTextFieldCadCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel);
        jPanel.setBounds(40, 30, 770, 180);

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

        jButtonCadNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadNovo.setText("Novo");
        jButtonCadNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadNovo);
        jButtonCadNovo.setBounds(610, 470, 100, 40);

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

        jLabelFundoCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadFornecedor);
        jLabelFundoCadFornecedor.setBounds(0, 0, 860, 550);

        setSize(new java.awt.Dimension(860, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void receberDados(){
    //recebendo os dados
    fornecedor.setNomeFantasia(jTextFieldCadClienteNomeFantasia.getText());
    fornecedor.setRazaoSocial(jTextFieldCadRazaoSocial.getText());
    fornecedor.setCnpj(jFormattedTextFieldCadCnpj.getText());

    contato.setEndereco(jTextFieldCadEnderecoFornecedor.getText());
    contato.setNumero(jTextFieldCadNumeroFornecedor.getText());
    contato.setBairro(jTextFieldCadBairroFornecedor.getText());
    contato.setCep(jFormattedTextFieldCadCepFornecedor.getText());
    contato.setCidade(jTextFieldCadCidadeFornecedor.getText());
    contato.setEstado((String) jComboBoxCadEstado.getSelectedItem());
    contato.setCelular(jFormattedTextFieldCadCelularFornecedor.getText());
    contato.setTefefone(jFormattedTextFieldCadTelefoneFornecedor.getText());
    contato.setEmail(jTextFieldjLabelCadEmailFornecedor.getText());
    fornecedor.setContato(contato);
}

private void habilitarCampos(){
   jTextFieldCadClienteNomeFantasia.setEnabled(true);
   jTextFieldCadClienteNomeFantasia.requestFocus();
   jTextFieldCadRazaoSocial.setEnabled(true);
   jFormattedTextFieldCadCnpj.setEnabled(true);
   jTextFieldCadEnderecoFornecedor.setEnabled(true);
   jTextFieldCadNumeroFornecedor.setEnabled(true);
   jTextFieldCadBairroFornecedor.setEnabled(true);
   jFormattedTextFieldCadCepFornecedor.setEnabled(true);
   jTextFieldCadCidadeFornecedor.setEnabled(true);
   jComboBoxCadEstado.setEnabled(true);
   jFormattedTextFieldCadCelularFornecedor.setEnabled(true);
   jFormattedTextFieldCadTelefoneFornecedor.setEnabled(true);
   jTextFieldjLabelCadEmailFornecedor.setEnabled(true);
   jComboBoxCadEstado.setEnabled(true);
   jButtonCadCadastrar.setEnabled(true);
   jButtonCadLimpar.setEnabled(true);
   jButtonCadNovo.setEnabled(false);
}

private void desabilitarCampos(){
    jTextFieldCadClienteNomeFantasia.setEnabled(false);
    jTextFieldCadRazaoSocial.setEnabled(false);
    jFormattedTextFieldCadCnpj.setEnabled(false);
    jTextFieldCadEnderecoFornecedor.setEnabled(false);
    jTextFieldCadNumeroFornecedor.setEnabled(false);
    jTextFieldCadBairroFornecedor.setEnabled(false);
    jFormattedTextFieldCadCepFornecedor.setEnabled(false);
    jTextFieldCadCidadeFornecedor.setEnabled(false);
    jComboBoxCadEstado.setEnabled(false);
    jFormattedTextFieldCadCelularFornecedor.setEnabled(false);
    jFormattedTextFieldCadTelefoneFornecedor.setEnabled(false);
    jTextFieldjLabelCadEmailFornecedor.setEnabled(false);
    jButtonCadCadastrar.setEnabled(false);
    jButtonCadLimpar.setEnabled(false);
    jButtonCadNovo.setEnabled(true);
}

private void limparCampos(){
    jTextFieldCadClienteNomeFantasia.setText("");
    jTextFieldCadRazaoSocial.setText("");
    jFormattedTextFieldCadCnpj.setText("");
    jTextFieldCadEnderecoFornecedor.setText("");
    jTextFieldCadNumeroFornecedor.setText("");
    jTextFieldCadBairroFornecedor.setText("");
    jFormattedTextFieldCadCepFornecedor.setText("");
    jTextFieldCadCidadeFornecedor.setText("");
    jFormattedTextFieldCadTelefoneFornecedor.setText("");
    jFormattedTextFieldCadCelularFornecedor.setText("");
    jTextFieldjLabelCadEmailFornecedor.setText("");
    jComboBoxCadEstado.setSelectedIndex(0);
}

public void salvarFornecedor(){

    receberDados();
     if (VerificaCampos.validaCampos(jTextFieldCadClienteNomeFantasia.getText())                    
            || VerificaCampos.validaCampos(jTextFieldCadRazaoSocial.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadCnpj.getText())
            || VerificaCampos.validaCampos(jTextFieldCadEnderecoFornecedor.getText())
            || VerificaCampos.validaCampos(jTextFieldCadNumeroFornecedor.getText())
            || VerificaCampos.validaCampos(jTextFieldCadBairroFornecedor.getText())
            || VerificaCampos.validaCampos(jFormattedTextFieldCadCepFornecedor.getText())
            || VerificaCampos.validaCampos(jTextFieldCadCidadeFornecedor.getText())) {

       } else {
            //verificando se o dado já está cadastrado no Banco de Dados 

            if (Validacoes.verificaEmail(jTextFieldjLabelCadEmailFornecedor.getText())) {

             } else if (VerificaBdPessoaJuridica.verificaCnpj(fornecedor)
                || VerificaBdPessoaJuridica.verificaRazaoSocial(fornecedor)
                || VerificaBdContato.verificaCelular(contato)
                || VerificaBdContato.verificaEmail(contato)) {
           } else {
                //salvando dados
             salvarFornecedor.salvar(fornecedor);
             limparCampos();
             desabilitarCampos();
     } 

   }  
}
    
    private void jButtonCadNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadNovoActionPerformed
      habilitarCampos();
    }//GEN-LAST:event_jButtonCadNovoActionPerformed

    private void jButtonCadCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCadastrarActionPerformed
       salvarFornecedor();
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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCadastrar;
    private javax.swing.JButton jButtonCadLimpar;
    private javax.swing.JButton jButtonCadNovo;
    private javax.swing.JComboBox<String> jComboBoxCadEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCelularFornecedor;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCepFornecedor;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadTelefoneFornecedor;
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
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundoCadFornecedor;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCadBairroFornecedor;
    private javax.swing.JTextField jTextFieldCadCidadeFornecedor;
    private javax.swing.JTextField jTextFieldCadClienteNomeFantasia;
    private javax.swing.JTextField jTextFieldCadEnderecoFornecedor;
    private javax.swing.JTextField jTextFieldCadNumeroFornecedor;
    private javax.swing.JTextField jTextFieldCadRazaoSocial;
    private javax.swing.JTextField jTextFieldjLabelCadEmailFornecedor;
    // End of variables declaration//GEN-END:variables
}
