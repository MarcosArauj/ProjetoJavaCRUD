package br.stylus.funilaria.view.telasPesquisas;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Usuario;
import br.stylus.funilaria.model.persistencia.pesquisas.PesquisaAdministradorDao;
import javax.swing.JOptionPane;

public class FormPesquisarAdministrador extends javax.swing.JFrame {
    
 
    Administrador administrador = new Administrador();
    Contato contato = new Contato();
    PesquisaAdministradorDao pesquisarAdmin = new PesquisaAdministradorDao();
  
   
 
    public FormPesquisarAdministrador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeAdmin = new javax.swing.JLabel();
        jLabelCpfAdmin = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldNomeAdmin = new javax.swing.JTextField();
        jLabelNasimentoAdmin = new javax.swing.JLabel();
        jLabelRgAdmin = new javax.swing.JLabel();
        jFormattedTextFieldRgAdmin = new javax.swing.JFormattedTextField();
        jLabelOrgaoExpeditor = new javax.swing.JLabel();
        jTextFieldOrgaoExp = new javax.swing.JTextField();
        jFormattedTextFieldNascimentoAdmin = new javax.swing.JFormattedTextField();
        jLabelTituloCadAdmin = new javax.swing.JLabel();
        jLabelPesqSexoAdmin = new javax.swing.JLabel();
        jComboBoxSexoAdmin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesqIDAdmin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCidadeAdmin = new javax.swing.JTextField();
        jLabelCidadeAdmin = new javax.swing.JLabel();
        jLabelEnderecoAdmin = new javax.swing.JLabel();
        jLabelNumeroAdmin = new javax.swing.JLabel();
        jTextFieldNumeroAdmin = new javax.swing.JTextField();
        jLabelCepAdmin = new javax.swing.JLabel();
        jTextFieldBairroAdmin = new javax.swing.JTextField();
        jLabelBairroAdmin = new javax.swing.JLabel();
        jLabelEstadoAdmin = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jTextFieldEnderecoAdmin = new javax.swing.JTextField();
        jFormattedTextFieldCepAdmin = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelTelafoneAdmin = new javax.swing.JLabel();
        jFormattedTextFieldTelefoneAdmin = new javax.swing.JFormattedTextField();
        jLabelEmailAdmin = new javax.swing.JLabel();
        jTextFieldEmailAdmin = new javax.swing.JTextField();
        jLabelCelularAdmin = new javax.swing.JLabel();
        jFormattedTextFieldCelularAdmin = new javax.swing.JFormattedTextField();
        jButtonPesquisarAdmin = new javax.swing.JButton();
        jTextFieldPesquisarAdmin = new javax.swing.JTextField();
        jLabelFundoCadAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Administrador");
        setName("Cadastro de Administrodor"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(840, 560));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));

        jLabelNomeAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNomeAdmin.setText("Nome :");

        jLabelCpfAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCpfAdmin.setText("CPF : ");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setToolTipText("Somente Números");
        jFormattedTextFieldCpf.setEnabled(false);

        jTextFieldNomeAdmin.setEnabled(false);

        jLabelNasimentoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNasimentoAdmin.setText("Nascimento :");

        jLabelRgAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelRgAdmin.setText("RG :");

        try {
            jFormattedTextFieldRgAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRgAdmin.setEnabled(false);

        jLabelOrgaoExpeditor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelOrgaoExpeditor.setText("Orgão Expedidor :");

        jTextFieldOrgaoExp.setEnabled(false);

        try {
            jFormattedTextFieldNascimentoAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldNascimentoAdmin.setEnabled(false);

        jLabelTituloCadAdmin.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloCadAdmin.setText("Dados Cadastrais do Administrador");

        jLabelPesqSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelPesqSexoAdmin.setText("Sexo :");

        jComboBoxSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxSexoAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));
        jComboBoxSexoAdmin.setToolTipText("");
        jComboBoxSexoAdmin.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("ID :");

        jTextFieldPesqIDAdmin.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTituloCadAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelRgAdmin)
                                .addComponent(jLabelCpfAdmin)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldRgAdmin)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOrgaoExpeditor)
                            .addComponent(jLabelNasimentoAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOrgaoExp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(227, 227, 227))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelPesqSexoAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPesqIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTituloCadAdmin)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPesqIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAdmin)
                    .addComponent(jTextFieldNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesqSexoAdmin)
                    .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCpfAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNasimentoAdmin)
                            .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRgAdmin)
                    .addComponent(jFormattedTextFieldRgAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOrgaoExpeditor)
                    .addComponent(jTextFieldOrgaoExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 70, 770, 197);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldCidadeAdmin.setEnabled(false);

        jLabelCidadeAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCidadeAdmin.setText("Cidade :");

        jLabelEnderecoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEnderecoAdmin.setText("Endereço :");

        jLabelNumeroAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNumeroAdmin.setText("Nº :");

        jTextFieldNumeroAdmin.setToolTipText("Número Residencial");
        jTextFieldNumeroAdmin.setEnabled(false);

        jLabelCepAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCepAdmin.setText("CEP :");

        jTextFieldBairroAdmin.setEnabled(false);

        jLabelBairroAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelBairroAdmin.setText("Bairro :");

        jLabelEstadoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEstadoAdmin.setText("Estado:");

        jComboBoxEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxEstado.setEnabled(false);

        jTextFieldEnderecoAdmin.setEnabled(false);

        try {
            jFormattedTextFieldCepAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepAdmin.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEnderecoAdmin)
                    .addComponent(jLabelCepAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCepAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidadeAdmin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldEnderecoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumeroAdmin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNumeroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBairroAdmin)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldBairroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCidadeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEstadoAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, 0, 1, Short.MAX_VALUE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairroAdmin)
                    .addComponent(jLabelEnderecoAdmin)
                    .addComponent(jLabelNumeroAdmin)
                    .addComponent(jTextFieldNumeroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEnderecoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCepAdmin)
                        .addComponent(jFormattedTextFieldCepAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEstadoAdmin)
                        .addComponent(jTextFieldCidadeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCidadeAdmin)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 280, 770, 100);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTelafoneAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTelafoneAdmin.setText("Telefone :");

        try {
            jFormattedTextFieldTelefoneAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefoneAdmin.setEnabled(false);

        jLabelEmailAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEmailAdmin.setText("Email :");

        jTextFieldEmailAdmin.setToolTipText("Email");
        jTextFieldEmailAdmin.setEnabled(false);

        jLabelCelularAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCelularAdmin.setText("Celular :");

        try {
            jFormattedTextFieldCelularAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelularAdmin.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelafoneAdmin)
                    .addComponent(jLabelEmailAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldTelefoneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCelularAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jFormattedTextFieldCelularAdmin))
                    .addComponent(jTextFieldEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelafoneAdmin)
                    .addComponent(jFormattedTextFieldTelefoneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelularAdmin)
                    .addComponent(jFormattedTextFieldCelularAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailAdmin)
                    .addComponent(jTextFieldEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 390, 770, 110);

        jButtonPesquisarAdmin.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonPesquisarAdmin.setText("Pesquisar");
        jButtonPesquisarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisarAdmin);
        jButtonPesquisarAdmin.setBounds(690, 30, 110, 30);
        getContentPane().add(jTextFieldPesquisarAdmin);
        jTextFieldPesquisarAdmin.setBounds(450, 27, 230, 30);

        jLabelFundoCadAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadAdmin);
        jLabelFundoCadAdmin.setBounds(0, 0, 870, 600);

        setSize(new java.awt.Dimension(850, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAdminActionPerformed
            
            administrador.setPesquisaAdmin(jTextFieldPesquisarAdmin.getText());
            if(jTextFieldPesquisarAdmin.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Digite um Nome para fazer a pesquisa!");
                jTextFieldPesquisarAdmin.requestFocus();
            }
            administrador.setContato(contato);
            pesquisarAdmin.pesquisaAdmin(administrador);
            jTextFieldPesqIDAdmin.setText(String.valueOf(administrador.getCodAdministrador()));
            jTextFieldNomeAdmin.setText(administrador.getNome());
            jFormattedTextFieldCpf.setText(administrador.getCpf());
            jFormattedTextFieldRgAdmin.setText(administrador.getRg());
            jTextFieldOrgaoExp.setText(administrador.getOex());
            jFormattedTextFieldNascimentoAdmin.setText(administrador.getNascimento());
            jComboBoxSexoAdmin.setSelectedItem(administrador.getSexo());
            
            jTextFieldEnderecoAdmin.setText(contato.getEndereco());
            jTextFieldNumeroAdmin.setText(contato.getNumero());
            jTextFieldBairroAdmin.setText(contato.getBairro());
            jFormattedTextFieldCepAdmin.setText(contato.getCep());
            jTextFieldCidadeAdmin.setText(contato.getCidade());
            jComboBoxEstado.setSelectedItem(contato.getEstado());
            jFormattedTextFieldTelefoneAdmin.setText(contato.getTefefone());
            jFormattedTextFieldCelularAdmin.setText(contato.getCelular());
            jTextFieldEmailAdmin.setText(contato.getEmail());
    }//GEN-LAST:event_jButtonPesquisarAdminActionPerformed
        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesquisarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisarAdmin;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxSexoAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelularAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimentoAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldRgAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairroAdmin;
    private javax.swing.JLabel jLabelCelularAdmin;
    private javax.swing.JLabel jLabelCepAdmin;
    private javax.swing.JLabel jLabelCidadeAdmin;
    private javax.swing.JLabel jLabelCpfAdmin;
    private javax.swing.JLabel jLabelEmailAdmin;
    private javax.swing.JLabel jLabelEnderecoAdmin;
    private javax.swing.JLabel jLabelEstadoAdmin;
    private javax.swing.JLabel jLabelFundoCadAdmin;
    private javax.swing.JLabel jLabelNasimentoAdmin;
    private javax.swing.JLabel jLabelNomeAdmin;
    private javax.swing.JLabel jLabelNumeroAdmin;
    private javax.swing.JLabel jLabelOrgaoExpeditor;
    private javax.swing.JLabel jLabelPesqSexoAdmin;
    private javax.swing.JLabel jLabelRgAdmin;
    private javax.swing.JLabel jLabelTelafoneAdmin;
    private javax.swing.JLabel jLabelTituloCadAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldBairroAdmin;
    private javax.swing.JTextField jTextFieldCidadeAdmin;
    private javax.swing.JTextField jTextFieldEmailAdmin;
    private javax.swing.JTextField jTextFieldEnderecoAdmin;
    private javax.swing.JTextField jTextFieldNomeAdmin;
    private javax.swing.JTextField jTextFieldNumeroAdmin;
    private javax.swing.JTextField jTextFieldOrgaoExp;
    private javax.swing.JTextField jTextFieldPesqIDAdmin;
    private javax.swing.JTextField jTextFieldPesquisarAdmin;
    // End of variables declaration//GEN-END:variables
}
