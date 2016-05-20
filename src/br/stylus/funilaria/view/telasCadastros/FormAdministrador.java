package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Usuario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.model.persistencia.AdministradorDao;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdPessoaFisica;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdUsuario;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class FormAdministrador extends javax.swing.JFrame {
    
 
    Administrador administrador = new Administrador();
    Contato contato = new Contato();
    Usuario usuario = new Usuario();
    AdministradorDao salvarAdmin = new AdministradorDao();
    ConexaoBD conex = new ConexaoBD();
   
 
    public FormAdministrador() {
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
        jPanel4 = new javax.swing.JPanel();
        jLabelTituloUsuario = new javax.swing.JLabel();
        jLabelAdministradorUsu = new javax.swing.JLabel();
        jLabelUsuarioAdmin = new javax.swing.JLabel();
        jTextFieldUsuarioAdmin = new javax.swing.JTextField();
        jLabelSenhaAdmin = new javax.swing.JLabel();
        jPasswordFieldSenhaAdmin = new javax.swing.JPasswordField();
        jLabelConfiSenhaAdmin = new javax.swing.JLabel();
        jPasswordFieldConfSenhaAdmin = new javax.swing.JPasswordField();
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
        jButtonCadAdmin = new javax.swing.JButton();
        jButtonLimparCadAdmin = new javax.swing.JButton();
        jLabelFundoCadAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Administrador");
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

        jLabelNasimentoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNasimentoAdmin.setText("Nascimento :");

        jLabelRgAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelRgAdmin.setText("RG :");

        try {
            jFormattedTextFieldRgAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelOrgaoExpeditor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelOrgaoExpeditor.setText("Orgão Expedidor :");

        try {
            jFormattedTextFieldNascimentoAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelTituloCadAdmin.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloCadAdmin.setText("Dados Cadastrais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRgAdmin)
                    .addComponent(jLabelNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpfAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextFieldRgAdmin)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelOrgaoExpeditor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldOrgaoExp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNasimentoAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                    .addComponent(jTextFieldNomeAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabelTituloCadAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTituloCadAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeAdmin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpfAdmin)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNasimentoAdmin)
                    .addComponent(jFormattedTextFieldNascimentoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRgAdmin)
                    .addComponent(jFormattedTextFieldRgAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOrgaoExpeditor)
                    .addComponent(jTextFieldOrgaoExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 60, 430, 180);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTituloUsuario.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloUsuario.setText("Criar Usuário ");

        jLabelAdministradorUsu.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelAdministradorUsu.setText("Administrador");

        jLabelUsuarioAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelUsuarioAdmin.setText("Usuário :");

        jLabelSenhaAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelSenhaAdmin.setText("Senha :");

        jLabelConfiSenhaAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelConfiSenhaAdmin.setText("Confirma Senha :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabelTituloUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelAdministradorUsu))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelSenhaAdmin)
                                .addComponent(jLabelUsuarioAdmin))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelConfiSenhaAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldConfSenhaAdmin)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloUsuario)
                    .addComponent(jLabelAdministradorUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarioAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenhaAdmin))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldConfSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfiSenhaAdmin))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(470, 60, 330, 180);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCidadeAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCidadeAdmin.setText("Cidade :");

        jLabelEnderecoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEnderecoAdmin.setText("Endereço :");

        jLabelNumeroAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNumeroAdmin.setText("Nº :");

        jTextFieldNumeroAdmin.setToolTipText("Número Residencial");

        jLabelCepAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCepAdmin.setText("CEP :");

        jLabelBairroAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelBairroAdmin.setText("Bairro :");

        jLabelEstadoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEstadoAdmin.setText("Estado:");

        jComboBoxEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas ", "Amapá  ", "Amazonas  \t ", "Bahia \t ", "Ceará\t \t ", "Distrito Federal  \t ", "Espírito Santo  \t ", "Goiás  \t ", "Maranhão \t ", "Mato Grosso\t \t ", "Mato Grosso do Sul \t ", "Minas Gerais \t ", "Pará ", "Paraíba \t ", "Paraná  \t ", "Pernambuco\t ", "Piauí  ", "Rio de Janeiro \t ", "Rio Grande do Norte", "Rio Grande do Sul \t ", "Rondônia ", "Roraima", "Santa Catarina\t \t ", "São Paulo  ", "Sergipe \t ", "Tocantins" }));

        try {
            jFormattedTextFieldCepAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
        jPanel2.setBounds(30, 250, 770, 100);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTelafoneAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTelafoneAdmin.setText("Telefone :");

        try {
            jFormattedTextFieldTelefoneAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelEmailAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEmailAdmin.setText("Email :");

        jTextFieldEmailAdmin.setToolTipText("Email");

        jLabelCelularAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCelularAdmin.setText("Celular :");

        try {
            jFormattedTextFieldCelularAdmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
        jPanel3.setBounds(30, 360, 770, 100);

        jButtonCadAdmin.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadAdmin.setText("Cadastrar");
        jButtonCadAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadAdmin);
        jButtonCadAdmin.setBounds(690, 480, 110, 40);

        jButtonLimparCadAdmin.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimparCadAdmin.setText("Limpar");
        jButtonLimparCadAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCadAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimparCadAdmin);
        jButtonLimparCadAdmin.setBounds(600, 480, 90, 40);

        jLabelFundoCadAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadAdmin);
        jLabelFundoCadAdmin.setBounds(0, 0, 870, 600);

        setSize(new java.awt.Dimension(850, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
   
    private void jButtonCadAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAdminActionPerformed
     
    //recebendo dados
    administrador.setNome(jTextFieldNomeAdmin.getText());
    administrador.setCpf(jFormattedTextFieldCpf.getText());
    administrador.setRg(jFormattedTextFieldRgAdmin.getText());
    administrador.setNascimento(jFormattedTextFieldNascimentoAdmin.getText());
    administrador.setOex(jTextFieldOrgaoExp.getText());          
    usuario.setNomeUsuario(jTextFieldUsuarioAdmin.getText());
    usuario.setTipo(jLabelAdministradorUsu.getText());
    usuario.setSenha(jPasswordFieldSenhaAdmin.getText()); 
    administrador.setUsuario(usuario);
    
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
        // verificando campo vazio no formulário de cadastro 
         if(VerificaCampos.validaCampos(jTextFieldNomeAdmin.getText()) 
          || VerificaCampos.validaCampos(jFormattedTextFieldCpf.getText()) 
          || VerificaCampos.validaCampos(jFormattedTextFieldRgAdmin.getText())
          || VerificaCampos.validaCampos(jTextFieldOrgaoExp.getText())
          || VerificaCampos.validaCampos(jFormattedTextFieldNascimentoAdmin.getText())  
          || VerificaCampos.validaCampos(jTextFieldUsuarioAdmin.getText()) 
          || VerificaCampos.validaCampos(jPasswordFieldSenhaAdmin.getText())
          || VerificaCampos.validaCampos(jPasswordFieldConfSenhaAdmin.getText())     
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
                    if(VerificaBdPessoaFisica.verificaCpf(administrador) 
                       || VerificaBdPessoaFisica.verificaRg(administrador)
                       || VerificaBdPessoaFisica.verificaNomeCpf(administrador)
                       || VerificaBdUsuario.verificaNomeUsu(usuario)
                       || VerificaBdUsuario.verificaTipo(usuario)
                       || VerificaBdPessoaFisica.verificaCelular(administrador)     
                       || VerificaBdPessoaFisica.verificaEmail(administrador)){
                     
                    }else{
                        if (jPasswordFieldSenhaAdmin.getText().equals(jPasswordFieldConfSenhaAdmin.getText())){
                           //salvando dados
                            salvarAdmin.salvar(administrador);                         
                            
                            FormTelaIntemediaria tela = new FormTelaIntemediaria();
                            tela.setVisible(true);
                            dispose();
                        }else {
                              JOptionPane.showMessageDialog(rootPane, "Confirme a senha corretamente!\nE tente novamente!");
                              jPasswordFieldConfSenhaAdmin.setText("");
                              jPasswordFieldConfSenhaAdmin.requestFocus();
                        }
                      }    
                    } 
             } else {
                 JOptionPane.showMessageDialog(rootPane, "CPF inválido!\nDigite apenas os Números!");
             }
        } 
    }//GEN-LAST:event_jButtonCadAdminActionPerformed

    private void jButtonLimparCadAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCadAdminActionPerformed
        jTextFieldNomeAdmin.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldRgAdmin.setText("");
        jTextFieldOrgaoExp.setText("");
        jFormattedTextFieldNascimentoAdmin.setText("");
        jTextFieldUsuarioAdmin.setText("");
        jPasswordFieldSenhaAdmin.setText("");
        jPasswordFieldConfSenhaAdmin.setText("");
        jTextFieldEnderecoAdmin.setText("");
        jTextFieldNumeroAdmin.setText("");
        jFormattedTextFieldCepAdmin.setText("");
        jTextFieldBairroAdmin.setText("");
        jTextFieldCidadeAdmin.setText("");
        jFormattedTextFieldTelefoneAdmin.setText("");
        jFormattedTextFieldCelularAdmin.setText("");
        jTextFieldEmailAdmin.setText("");
    }//GEN-LAST:event_jButtonLimparCadAdminActionPerformed

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
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAdmin;
    private javax.swing.JButton jButtonLimparCadAdmin;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelularAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimentoAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldRgAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneAdmin;
    private javax.swing.JLabel jLabelAdministradorUsu;
    private javax.swing.JLabel jLabelBairroAdmin;
    private javax.swing.JLabel jLabelCelularAdmin;
    private javax.swing.JLabel jLabelCepAdmin;
    private javax.swing.JLabel jLabelCidadeAdmin;
    private javax.swing.JLabel jLabelConfiSenhaAdmin;
    private javax.swing.JLabel jLabelCpfAdmin;
    private javax.swing.JLabel jLabelEmailAdmin;
    private javax.swing.JLabel jLabelEnderecoAdmin;
    private javax.swing.JLabel jLabelEstadoAdmin;
    private javax.swing.JLabel jLabelFundoCadAdmin;
    private javax.swing.JLabel jLabelNasimentoAdmin;
    private javax.swing.JLabel jLabelNomeAdmin;
    private javax.swing.JLabel jLabelNumeroAdmin;
    private javax.swing.JLabel jLabelOrgaoExpeditor;
    private javax.swing.JLabel jLabelRgAdmin;
    private javax.swing.JLabel jLabelSenhaAdmin;
    private javax.swing.JLabel jLabelTelafoneAdmin;
    private javax.swing.JLabel jLabelTituloCadAdmin;
    private javax.swing.JLabel jLabelTituloUsuario;
    private javax.swing.JLabel jLabelUsuarioAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldConfSenhaAdmin;
    private javax.swing.JPasswordField jPasswordFieldSenhaAdmin;
    private javax.swing.JTextField jTextFieldBairroAdmin;
    private javax.swing.JTextField jTextFieldCidadeAdmin;
    private javax.swing.JTextField jTextFieldEmailAdmin;
    private javax.swing.JTextField jTextFieldEnderecoAdmin;
    private javax.swing.JTextField jTextFieldNomeAdmin;
    private javax.swing.JTextField jTextFieldNumeroAdmin;
    private javax.swing.JTextField jTextFieldOrgaoExp;
    private javax.swing.JTextField jTextFieldUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
