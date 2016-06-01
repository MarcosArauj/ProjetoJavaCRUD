package br.stylus.funilaria.view.telasCadastros;

import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdUsuario;
import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Usuario;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.model.utilitarios.verificaBd.VerificaBdPessoaFisica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.persistencia.cadastros.CadastroFuncionarioDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

public class FormFuncionario extends javax.swing.JFrame  {
    

    Funcionario funcionario = new Funcionario();
    Contato contato = new Contato();
    Usuario usuario = new Usuario();
    CadastroFuncionarioDao salvarFuncionario = new CadastroFuncionarioDao();
    ConexaoBD conex = new ConexaoBD();


    public FormFuncionario() {
        initComponents();
    }

    public void receberDados(Funcionario funcionario) {
        
        //recebendo os dados
            funcionario.setNome(jTextFieldCadNomeFun.getText());
            funcionario.setCpf(jFormattedTextFieldCadCpfFun.getText());
            funcionario.setRg(jFormattedTextFieldRgFun.getText());
            funcionario.setOex(jTextFieldOexFun.getText());
            funcionario.setNascimento(jFormattedTextFieldNascimentoFun.getText());
            funcionario.setSexo((String) jComboBoxSexoAdmin.getSelectedItem());
            funcionario.setCtps(jFormattedTextFieldCtpsFun.getText());
            funcionario.setCargo((String) jComboBoxCargoFun.getSelectedItem());
                   
            usuario.setNomeUsuario(jTextFieldCadUsuarioFun.getText());
            usuario.setTipo(jLabelCadFuncionarioUsu.getText());
            usuario.setSenha(jPasswordFieldCadSenhaFun.getText());          
            funcionario.setUsuario(usuario);
                          
            contato.setEndereco(jTextFieldCadEnderecoFun.getText());
            contato.setNumero(jTextFieldCadNumeroFun.getText());
            contato.setBairro(jTextFieldCadBairroFun.getText());
            contato.setCep(jFormattedTextFieldCadCepFun.getText());
            contato.setCidade(jTextFieldCadCidadeFun.getText());
            contato.setEstado((String) jComboBoxEstadoFun.getSelectedItem());
            contato.setTefefone(jFormattedTextFieldCadTelefoneFun.getText());
            contato.setCelular(jFormattedTextFieldCadCelularFun.getText());
            contato.setEmail(jTextFieldjLabelCadEmailFun.getText());          
            funcionario.setContato(contato);
             // verificando campo vazio no formulário de cadastro 
    }
    
    public void abilitarCampos() {
        jTextFieldCadNomeFun.setEnabled(true);
        jTextFieldCadNomeFun.requestFocus();
        jFormattedTextFieldCadCpfFun.setEnabled(true);
        jFormattedTextFieldRgFun.setEnabled(true);
        jTextFieldOexFun.setEnabled(true);
        jComboBoxSexoAdmin.setEnabled(true);
        jFormattedTextFieldNascimentoFun.setEnabled(true);
        jTextFieldCadUsuarioFun.setEnabled(true);
        jPasswordFieldCadSenhaFun.setEnabled(true);
        jPasswordFieldCadConfSenhaFun.setEnabled(true);
        jFormattedTextFieldCtpsFun.setEnabled(true);
        jComboBoxCargoFun.setEnabled(true);
        jTextFieldCadEnderecoFun.setEnabled(true);
        jTextFieldCadNumeroFun.setEnabled(true);
        jTextFieldCadBairroFun.setEnabled(true);
        jFormattedTextFieldCadCepFun.setEnabled(true);
        jTextFieldCadCidadeFun.setEnabled(true);
        jComboBoxEstadoFun.setEnabled(true);
        jFormattedTextFieldCadTelefoneFun.setEnabled(true);
        jFormattedTextFieldCadCelularFun.setEnabled(true);
        jTextFieldjLabelCadEmailFun.setEnabled(true);
        jButtonLimparFun.setEnabled(true);
        jButtonCadastrar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }
    
    public void desabilitarCampos() {
        jTextFieldCadNomeFun.setEnabled(false);
        jFormattedTextFieldCadCpfFun.setEnabled(false);
        jFormattedTextFieldRgFun.setEnabled(false);
        jTextFieldOexFun.setEnabled(false);
        jFormattedTextFieldNascimentoFun.setEnabled(false);
        jComboBoxSexoAdmin.setEnabled(false);
        jTextFieldCadUsuarioFun.setEnabled(false);
        jPasswordFieldCadSenhaFun.setEnabled(false);
        jPasswordFieldCadConfSenhaFun.setEnabled(false);
        jFormattedTextFieldCtpsFun.setEnabled(false);
        jComboBoxCargoFun.setEnabled(false);
        jTextFieldCadEnderecoFun.setEnabled(false);
        jTextFieldCadNumeroFun.setEnabled(false);
        jTextFieldCadBairroFun.setEnabled(false);
        jFormattedTextFieldCadCepFun.setEnabled(false);
        jTextFieldCadCidadeFun.setEnabled(false);
        jComboBoxEstadoFun.setEnabled(false);
        jFormattedTextFieldCadTelefoneFun.setEnabled(false);
        jFormattedTextFieldCadCelularFun.setEnabled(false);
        jTextFieldjLabelCadEmailFun.setEnabled(false);
        jButtonLimparFun.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonNovo.setEnabled(true);       
    }
    
    public void limparCampos() {
        jTextFieldCadNomeFun.setText("");
        jFormattedTextFieldCadCpfFun.setText("");
        jFormattedTextFieldRgFun.setText("");
        jTextFieldOexFun.setText("");
        jFormattedTextFieldNascimentoFun.setText("");
        jTextFieldCadUsuarioFun.setText("");
        jPasswordFieldCadSenhaFun.setText("");
        jPasswordFieldCadConfSenhaFun.setText("");
        jFormattedTextFieldCtpsFun.setText("");
        jTextFieldCadEnderecoFun.setText("");
        jTextFieldCadNumeroFun.setText("");
        jTextFieldCadBairroFun.setText("");
        jFormattedTextFieldCadCepFun.setText("");
        jTextFieldCadCidadeFun.setText("");
        jFormattedTextFieldCadTelefoneFun.setText("");
        jFormattedTextFieldCadCelularFun.setText("");
        jTextFieldjLabelCadEmailFun.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelCadNomeFun = new javax.swing.JLabel();
        jTextFieldCadNomeFun = new javax.swing.JTextField();
        jLabelCadCpfFun = new javax.swing.JLabel();
        jFormattedTextFieldCadCpfFun = new javax.swing.JFormattedTextField();
        jLabelCadRgFun = new javax.swing.JLabel();
        jLabelOexFun = new javax.swing.JLabel();
        jTextFieldOexFun = new javax.swing.JTextField();
        jLabelNascimnetoFun = new javax.swing.JLabel();
        jFormattedTextFieldNascimentoFun = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRgFun = new javax.swing.JFormattedTextField();
        jLabelPesqSexoAdmin = new javax.swing.JLabel();
        jComboBoxSexoAdmin = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabelTituloUsu = new javax.swing.JLabel();
        jLabelCadFuncionarioUsu = new javax.swing.JLabel();
        jLabelUsuarioFun = new javax.swing.JLabel();
        jTextFieldCadUsuarioFun = new javax.swing.JTextField();
        jLabelSenhaFun = new javax.swing.JLabel();
        jPasswordFieldCadSenhaFun = new javax.swing.JPasswordField();
        jLabelConfSenhaFun = new javax.swing.JLabel();
        jPasswordFieldCadConfSenhaFun = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabelCtpsFun = new javax.swing.JLabel();
        jFormattedTextFieldCtpsFun = new javax.swing.JFormattedTextField();
        jLabelCargoFun = new javax.swing.JLabel();
        jComboBoxCargoFun = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadEnderecoFun = new javax.swing.JLabel();
        jLabelCadCidadeFun = new javax.swing.JLabel();
        jLabelCadNumeroFun = new javax.swing.JLabel();
        jLabelCadBairroFun = new javax.swing.JLabel();
        jLabelCadCepFun = new javax.swing.JLabel();
        jLabelCadEstadoFun = new javax.swing.JLabel();
        jFormattedTextFieldCadCepFun = new javax.swing.JFormattedTextField();
        jTextFieldCadEnderecoFun = new javax.swing.JTextField();
        jTextFieldCadNumeroFun = new javax.swing.JTextField();
        jTextFieldCadBairroFun = new javax.swing.JTextField();
        jTextFieldCadCidadeFun = new javax.swing.JTextField();
        jComboBoxEstadoFun = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadTelefoneFun = new javax.swing.JLabel();
        jLabelCadEmailFun = new javax.swing.JLabel();
        jTextFieldjLabelCadEmailFun = new javax.swing.JTextField();
        jFormattedTextFieldCadCelularFun = new javax.swing.JFormattedTextField();
        jLabelCadCelularFun = new javax.swing.JLabel();
        jFormattedTextFieldCadTelefoneFun = new javax.swing.JFormattedTextField();
        jButtonLimparFun = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jLabelFundoCadFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        setResizable(false);
        setSize(new java.awt.Dimension(840, 560));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 110));

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Dados Cadastrais");

        jLabelCadNomeFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNomeFun.setText("Nome : ");

        jTextFieldCadNomeFun.setEnabled(false);

        jLabelCadCpfFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCpfFun.setText("CPF : ");

        try {
            jFormattedTextFieldCadCpfFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCpfFun.setEnabled(false);

        jLabelCadRgFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadRgFun.setText("RG :  ");

        jLabelOexFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelOexFun.setText("Orgão Expedidor :");

        jTextFieldOexFun.setEnabled(false);

        jLabelNascimnetoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNascimnetoFun.setText("Nascimento :");

        try {
            jFormattedTextFieldNascimentoFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldNascimentoFun.setEnabled(false);

        try {
            jFormattedTextFieldRgFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRgFun.setEnabled(false);

        jLabelPesqSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelPesqSexoAdmin.setText("Sexo :");

        jComboBoxSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxSexoAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));
        jComboBoxSexoAdmin.setToolTipText("");
        jComboBoxSexoAdmin.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadNomeFun)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelCadCpfFun))
                            .addComponent(jLabelCadRgFun, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextFieldRgFun)
                                    .addComponent(jFormattedTextFieldCadCpfFun, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNascimnetoFun)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldNascimentoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelOexFun)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldOexFun))))
                            .addComponent(jTextFieldCadNomeFun)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPesqSexoAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDadosCadastrais)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadNomeFun))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCpfFun)
                    .addComponent(jFormattedTextFieldCadCpfFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNascimnetoFun)
                    .addComponent(jFormattedTextFieldNascimentoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldRgFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadRgFun)
                    .addComponent(jLabelOexFun)
                    .addComponent(jTextFieldOexFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesqSexoAdmin))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 450, 220);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTituloUsu.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTituloUsu.setText("Criar Usuário");

        jLabelCadFuncionarioUsu.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelCadFuncionarioUsu.setText("Funcionário");

        jLabelUsuarioFun.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelUsuarioFun.setText("Usuário :");

        jTextFieldCadUsuarioFun.setEnabled(false);

        jLabelSenhaFun.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelSenhaFun.setText("Senha :");

        jPasswordFieldCadSenhaFun.setEnabled(false);

        jLabelConfSenhaFun.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelConfSenhaFun.setText("Confirma Senha :");

        jPasswordFieldCadConfSenhaFun.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelTituloUsu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelCadFuncionarioUsu))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelUsuarioFun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCadUsuarioFun, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelSenhaFun)
                            .addGap(18, 18, 18)
                            .addComponent(jPasswordFieldCadSenhaFun, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelConfSenhaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldCadConfSenhaFun)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloUsu)
                    .addComponent(jLabelCadFuncionarioUsu))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadUsuarioFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarioFun))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldCadSenhaFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenhaFun))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldCadConfSenhaFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfSenhaFun))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(500, 30, 310, 220);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCtpsFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCtpsFun.setText("CTPS :");

        jFormattedTextFieldCtpsFun.setEnabled(false);

        jLabelCargoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCargoFun.setText("Cargo :");

        jComboBoxCargoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxCargoFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Funileiro", "Pintor", "Recepcionista" }));
        jComboBoxCargoFun.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabelCargoFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCtpsFun)
                    .addComponent(jLabelCargoFun)
                    .addComponent(jComboBoxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(40, 260, 770, 50);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadEnderecoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEnderecoFun.setText("Endereço : ");

        jLabelCadCidadeFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCidadeFun.setText("Cidade : ");

        jLabelCadNumeroFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNumeroFun.setText("Nº : ");

        jLabelCadBairroFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairroFun.setText("Bairro : ");

        jLabelCadCepFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCepFun.setText("CEP : ");

        jLabelCadEstadoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEstadoFun.setText("Estado : ");

        try {
            jFormattedTextFieldCadCepFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCepFun.setEnabled(false);

        jTextFieldCadEnderecoFun.setEnabled(false);

        jTextFieldCadNumeroFun.setEnabled(false);

        jTextFieldCadBairroFun.setEnabled(false);

        jTextFieldCadCidadeFun.setEnabled(false);

        jComboBoxEstadoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxEstadoFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxEstadoFun.setToolTipText("");
        jComboBoxEstadoFun.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoFun)
                    .addComponent(jLabelCadCepFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadEnderecoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadNumeroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCadCidadeFun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadBairroFun)
                    .addComponent(jLabelCadEstadoFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCadBairroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstadoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoFun)
                    .addComponent(jLabelCadNumeroFun)
                    .addComponent(jLabelCadBairroFun)
                    .addComponent(jTextFieldCadEnderecoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadNumeroFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadBairroFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeFun)
                    .addComponent(jLabelCadCepFun)
                    .addComponent(jLabelCadEstadoFun)
                    .addComponent(jFormattedTextFieldCadCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCadCidadeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstadoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 320, 770, 90);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneFun.setText("Telefone : ");

        jLabelCadEmailFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailFun.setText("E-mail : ");

        jTextFieldjLabelCadEmailFun.setEnabled(false);

        try {
            jFormattedTextFieldCadCelularFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadCelularFun.setEnabled(false);

        jLabelCadCelularFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularFun.setText("Celular :");

        try {
            jFormattedTextFieldCadTelefoneFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCadTelefoneFun.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneFun)
                    .addComponent(jLabelCadEmailFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldjLabelCadEmailFun, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCadTelefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadCelularFun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneFun)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCadTelefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldCadCelularFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailFun)
                    .addComponent(jTextFieldjLabelCadEmailFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 420, 770, 90);

        jButtonLimparFun.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimparFun.setText("Limpar");
        jButtonLimparFun.setEnabled(false);
        jButtonLimparFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparFunActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimparFun);
        jButtonLimparFun.setBounds(700, 520, 110, 40);

        jButtonCadastrar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(500, 520, 100, 40);

        jButtonNovo.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(600, 520, 100, 40);

        jLabelFundoCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadFuncionario);
        jLabelFundoCadFuncionario.setBounds(0, -30, 870, 620);

        setSize(new java.awt.Dimension(850, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparFunActionPerformed

      limparCampos();
    }//GEN-LAST:event_jButtonLimparFunActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

              receberDados(funcionario);
            if (VerificaCampos.validaCampos(jTextFieldCadNomeFun.getText())                   
               || VerificaCampos.validaCampos(jFormattedTextFieldCadCpfFun.getText())
               || VerificaCampos.validaCampos(jFormattedTextFieldRgFun.getText())
               || VerificaCampos.validaCampos(jTextFieldOexFun.getText())
               || VerificaCampos.validaCampos(jFormattedTextFieldNascimentoFun.getText())
               || VerificaCampos.validaCampos(jTextFieldCadUsuarioFun.getText())
               || VerificaCampos.validaCampos(jPasswordFieldCadSenhaFun.getText())
               || VerificaCampos.validaCampos(jPasswordFieldCadConfSenhaFun.getText())
               || VerificaCampos.validaCampos(jFormattedTextFieldCtpsFun.getText())
               || VerificaCampos.validaCampos(jTextFieldCadEnderecoFun.getText())
               || VerificaCampos.validaCampos(jTextFieldCadNumeroFun.getText())
               || VerificaCampos.validaCampos(jTextFieldCadBairroFun.getText())
               || VerificaCampos.validaCampos(jFormattedTextFieldCadCepFun.getText())
               || VerificaCampos.validaCampos(jTextFieldCadCidadeFun.getText())) {

               } else {            
                  //verificando se o dado já está cadastrado no Banco de Dados 
                if (Validacoes.isCPF(jFormattedTextFieldCadCpfFun.getText())) {
                    if (Validacoes.verificaEmail(jTextFieldjLabelCadEmailFun.getText())) {
  
                  }else if (VerificaBdPessoaFisica.verificaCpf(funcionario)
                        || VerificaBdPessoaFisica.verificaRg(funcionario)
                        || VerificaBdPessoaFisica.verificaNomeCpf(funcionario)     
                        || VerificaBdUsuario.verificaNomeUsu(usuario)
                        || VerificaBdUsuario.verificaTipo(usuario)
                        || VerificaBdPessoaFisica.verificaCtps(funcionario)
                        || VerificaBdPessoaFisica.verificaCelular(funcionario)
                        || VerificaBdPessoaFisica.verificaEmail(funcionario)) {

                } else if (jPasswordFieldCadSenhaFun.getText().equals(jPasswordFieldCadConfSenhaFun.getText())) {
                  
                    //salvando dados
                    salvarFuncionario.salvar(funcionario);
                    limparCampos();
                    desabilitarCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Confirme a senha corretamente!\nE tente novamente!");
                    jPasswordFieldCadConfSenhaFun.setText("");
                    jPasswordFieldCadConfSenhaFun.requestFocus();
                }
                   
            } else {
                JOptionPane.showMessageDialog(rootPane, "CPF inválido!\nDigite apenas os Números!");
            }
            
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
 
       abilitarCampos();

    }//GEN-LAST:event_jButtonNovoActionPerformed

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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimparFun;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JComboBox<String> jComboBoxCargoFun;
    private javax.swing.JComboBox<String> jComboBoxEstadoFun;
    private javax.swing.JComboBox<String> jComboBoxSexoAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCelularFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCepFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadCpfFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldCadTelefoneFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldCtpsFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimentoFun;
    private javax.swing.JFormattedTextField jFormattedTextFieldRgFun;
    private javax.swing.JLabel jLabelCadBairroFun;
    private javax.swing.JLabel jLabelCadCelularFun;
    private javax.swing.JLabel jLabelCadCepFun;
    private javax.swing.JLabel jLabelCadCidadeFun;
    private javax.swing.JLabel jLabelCadCpfFun;
    private javax.swing.JLabel jLabelCadEmailFun;
    private javax.swing.JLabel jLabelCadEnderecoFun;
    private javax.swing.JLabel jLabelCadEstadoFun;
    private javax.swing.JLabel jLabelCadFuncionarioUsu;
    private javax.swing.JLabel jLabelCadNomeFun;
    private javax.swing.JLabel jLabelCadNumeroFun;
    private javax.swing.JLabel jLabelCadRgFun;
    private javax.swing.JLabel jLabelCadTelefoneFun;
    private javax.swing.JLabel jLabelCargoFun;
    private javax.swing.JLabel jLabelConfSenhaFun;
    private javax.swing.JLabel jLabelCtpsFun;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundoCadFuncionario;
    private javax.swing.JLabel jLabelNascimnetoFun;
    private javax.swing.JLabel jLabelOexFun;
    private javax.swing.JLabel jLabelPesqSexoAdmin;
    private javax.swing.JLabel jLabelSenhaFun;
    private javax.swing.JLabel jLabelTituloUsu;
    private javax.swing.JLabel jLabelUsuarioFun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordFieldCadConfSenhaFun;
    private javax.swing.JPasswordField jPasswordFieldCadSenhaFun;
    private javax.swing.JTextField jTextFieldCadBairroFun;
    private javax.swing.JTextField jTextFieldCadCidadeFun;
    private javax.swing.JTextField jTextFieldCadEnderecoFun;
    private javax.swing.JTextField jTextFieldCadNomeFun;
    private javax.swing.JTextField jTextFieldCadNumeroFun;
    private javax.swing.JTextField jTextFieldCadUsuarioFun;
    private javax.swing.JTextField jTextFieldOexFun;
    private javax.swing.JTextField jTextFieldjLabelCadEmailFun;
    // End of variables declaration//GEN-END:variables
}
