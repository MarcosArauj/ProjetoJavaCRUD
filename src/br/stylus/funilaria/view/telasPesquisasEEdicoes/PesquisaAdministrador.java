package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaAdministradorDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiAdministradorDao;
import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaAdministradorDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class PesquisaAdministrador extends javax.swing.JFrame {
    
 
    Administrador administrador = new Administrador();
    Contato contato = new Contato();
    PesquisaAdministradorDao pesquisarAdmin = new PesquisaAdministradorDao();
    EditaAdministradorDao editaAdmin = new EditaAdministradorDao();
    ExcluiAdministradorDao excluiAdmin = new ExcluiAdministradorDao();
 
    public PesquisaAdministrador() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesqIDAdmin = new javax.swing.JTextField();
        jComboBoxSexoAdmin = new javax.swing.JComboBox<>();
        jLabelStatus = new javax.swing.JLabel();
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
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelFundoCadAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("ID :");

        jTextFieldPesqIDAdmin.setEnabled(false);

        jComboBoxSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxSexoAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));
        jComboBoxSexoAdmin.setEnabled(false);

        jLabelStatus.setText("Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTituloCadAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCpfAdmin, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRgAdmin)))
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
                                .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60)
                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabelPesqSexoAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPesqIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))))
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
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeAdmin)
                    .addComponent(jLabelPesqSexoAdmin)
                    .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpfAdmin)
                    .addComponent(jLabelNasimentoAdmin)
                    .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldRgAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRgAdmin)
                    .addComponent(jLabelOrgaoExpeditor)
                    .addComponent(jTextFieldOrgaoExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 70, 770, 210);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        jPanel2.setBounds(30, 290, 770, 90);

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
        jButtonPesquisarAdmin.setBounds(690, 20, 110, 40);
        getContentPane().add(jTextFieldPesquisarAdmin);
        jTextFieldPesquisarAdmin.setBounds(440, 27, 240, 30);

        jButtonSalvar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(510, 510, 100, 40);

        jButtonEditar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(610, 510, 100, 40);

        jButtonLimpar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(710, 510, 90, 40);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(410, 510, 100, 40);

        jLabelFundoCadAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadAdmin);
        jLabelFundoCadAdmin.setBounds(0, 0, 870, 600);

        setSize(new java.awt.Dimension(850, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void pesquisarAdmin(){
      
      administrador.setPesquisaAdmin(jTextFieldPesquisarAdmin.getText());
     if(jTextFieldPesquisarAdmin.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Digite um Nome para fazer a pesquisa!");
          jTextFieldPesquisarAdmin.requestFocus();
          
      } else {
          administrador.setContato(contato);
          pesquisarAdmin.pesquisaAdmin(administrador);
          if (VerificaBdStatus.verificaStatusAdmin(administrador)){
              jTextFieldPesquisarAdmin.requestFocus();
          } else {
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
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            
          }
        }
    }
    
    private void habilitarCampos(){
      jTextFieldNomeAdmin.setEnabled(true);
      jFormattedTextFieldCpf.setEnabled(true);
      jFormattedTextFieldRgAdmin.setEnabled(true);
      jTextFieldOrgaoExp.setEnabled(true);
      jFormattedTextFieldNascimentoAdmin.setEnabled(true);
      jComboBoxSexoAdmin.setEnabled(true);

      jTextFieldEnderecoAdmin.setEnabled(true);
      jTextFieldNumeroAdmin.setEnabled(true);
      jTextFieldBairroAdmin.setEnabled(true);
      jFormattedTextFieldCepAdmin.setEnabled(true);
      jTextFieldCidadeAdmin.setEnabled(true);
      jComboBoxEstado.setEnabled(true);
      jFormattedTextFieldTelefoneAdmin.setEnabled(true);
      jFormattedTextFieldCelularAdmin.setEnabled(true);
      jTextFieldEmailAdmin.setEnabled(true);
      jButtonSalvar.setEnabled(true);
      jButtonLimpar.setEnabled(true);
      jButtonEditar.setEnabled(false);
      jButtonExcluir.setEnabled(false);
      jTextFieldPesquisarAdmin.setEnabled(false);
    }
    
    private void desabilitarCampos(){
      jTextFieldNomeAdmin.setEnabled(false);
      jFormattedTextFieldCpf.setEnabled(false);
      jFormattedTextFieldRgAdmin.setEnabled(false);
      jTextFieldOrgaoExp.setEnabled(false);
      jFormattedTextFieldNascimentoAdmin.setEnabled(false);
      jComboBoxSexoAdmin.setEnabled(false);

      jTextFieldEnderecoAdmin.setEnabled(false);
      jTextFieldNumeroAdmin.setEnabled(false);
      jTextFieldBairroAdmin.setEnabled(false);
      jFormattedTextFieldCepAdmin.setEnabled(false);
      jTextFieldCidadeAdmin.setEnabled(false);
      jComboBoxEstado.setEnabled(false);
      jFormattedTextFieldTelefoneAdmin.setEnabled(false);
      jFormattedTextFieldCelularAdmin.setEnabled(false);
      jTextFieldEmailAdmin.setEnabled(false);
      jButtonSalvar.setEnabled(false);
      jButtonLimpar.setEnabled(false);
      jButtonExcluir.setEnabled(false);
      jButtonEditar.setEnabled(true);
      
      jTextFieldPesquisarAdmin.setEnabled(true);
    }
    
    private void limparCampos(){
      jTextFieldPesqIDAdmin.setText(""); 
      jTextFieldPesquisarAdmin.setText("");
      jTextFieldNomeAdmin.setText("");
      jFormattedTextFieldCpf.setText("");
      jFormattedTextFieldRgAdmin.setText("");
      jTextFieldOrgaoExp.setText("");
      jComboBoxSexoAdmin.setSelectedIndex(0);
      jFormattedTextFieldNascimentoAdmin.setText("");

      jTextFieldEnderecoAdmin.setText("");
      jTextFieldNumeroAdmin.setText("");
      jTextFieldBairroAdmin.setText("");
      jFormattedTextFieldCepAdmin.setText("");
      jTextFieldCidadeAdmin.setText("");
      jComboBoxEstado.setSelectedIndex(0);
      jFormattedTextFieldTelefoneAdmin.setText("");
      jFormattedTextFieldCelularAdmin.setText("");
      jTextFieldEmailAdmin.setText("");  
    }
    
private void receberDados(){
    //recebendo dados
    administrador.setCodAdministrador(Integer.parseInt(jTextFieldPesqIDAdmin.getText()));
    administrador.setNome(jTextFieldNomeAdmin.getText());
    administrador.setCpf(jFormattedTextFieldCpf.getText());
    administrador.setRg(jFormattedTextFieldRgAdmin.getText());
    administrador.setNascimento(jFormattedTextFieldNascimentoAdmin.getText());
    administrador.setOex(jTextFieldOrgaoExp.getText());  
    administrador.setSexo((String) jComboBoxSexoAdmin.getSelectedItem());
    
    contato.setEndereco(jTextFieldEnderecoAdmin.getText());
    contato.setNumero(jTextFieldNumeroAdmin.getText());
    contato.setCep(jFormattedTextFieldCepAdmin.getText());
    contato.setBairro(jTextFieldBairroAdmin.getText());
    contato.setCidade(jTextFieldCidadeAdmin.getText());
    contato.setEstado((String) jComboBoxEstado.getSelectedItem());
    contato.setTefefone(jFormattedTextFieldTelefoneAdmin.getText());
    contato.setCelular(jFormattedTextFieldCelularAdmin.getText());
    contato.setEmail(jTextFieldEmailAdmin.getText());
    administrador.setContato(contato); 
    jButtonExcluir.setEnabled(true);
    jButtonEditar.setEnabled(true);
        
 }
    
public void salvarAdmin(){
   receberDados();
  // verificando campo vazio no formulário de cadastro 
   if(VerificaCampos.validaCampos(jTextFieldNomeAdmin.getText()) 
    || VerificaCampos.validaCampos(jFormattedTextFieldCpf.getText()) 
    || VerificaCampos.validaCampos(jFormattedTextFieldRgAdmin.getText())
    || VerificaCampos.validaCampos(jTextFieldOrgaoExp.getText())
    || VerificaCampos.validaCampos(jFormattedTextFieldNascimentoAdmin.getText())      
    || VerificaCampos.validaCampos(jTextFieldEnderecoAdmin.getText())
    || VerificaCampos.validaCampos(jTextFieldNumeroAdmin.getText())
    || VerificaCampos.validaCampos(jTextFieldBairroAdmin.getText())
    || VerificaCampos.validaCampos(jFormattedTextFieldCepAdmin.getText())
    || VerificaCampos.validaCampos(jTextFieldCidadeAdmin.getText())){      

  } else {
          //verificando se o dado já está cadastrado no Banco de Dados   
       if(Validacoes.isCPF(jFormattedTextFieldCpf.getText())){
         if( Validacoes.verificaEmail(jTextFieldEmailAdmin.getText())){

         } else{               
            //salvando dados
             editaAdmin.editar(administrador);                         
             limparCampos();
             desabilitarCampos();
             jTextFieldPesquisarAdmin.setText("");
              
              } 
           } else {
           JOptionPane.showMessageDialog(rootPane, "CPF inválido!\nDigite apenas os Números!");
       }
  } 
}   

public void excluirAdmin(){
        int resposta  = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiAdmin.excluir(administrador);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
}
    
    
    private void jButtonPesquisarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAdminActionPerformed
      pesquisarAdmin();   

    }//GEN-LAST:event_jButtonPesquisarAdminActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       if(jTextFieldPesquisarAdmin.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Preencha o campo de pesquisa para continuar!");
          jTextFieldPesquisarAdmin.requestFocus();
      } else{
        habilitarCampos();    
      }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarAdmin();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       excluirAdmin();
    }//GEN-LAST:event_jButtonExcluirActionPerformed
        
   
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
            java.util.logging.Logger.getLogger(PesquisaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarAdmin;
    private javax.swing.JButton jButtonSalvar;
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
    private javax.swing.JLabel jLabelStatus;
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
