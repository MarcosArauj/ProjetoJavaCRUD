/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaEmpresaDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiEmpresaDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaEmpresaDao;
import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import javax.swing.JOptionPane;

/**
 *
 * @author 10112998607
 */
public class PesquisaEmpresa extends javax.swing.JFrame {

    br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Empresa empresa = new br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Empresa();
    Contato contato = new Contato();
    PesquisaEmpresaDao pesquisaEmpresa = new  PesquisaEmpresaDao();
    EditaEmpresaDao editaEmpresa = new  EditaEmpresaDao();
    ExcluiEmpresaDao excluiEmpresa = new  ExcluiEmpresaDao();
       public PesquisaEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelInsMunicipal = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jLabelInsEstadual = new javax.swing.JLabel();
        jLabelIdEmpresa = new javax.swing.JLabel();
        jTextFieldIdPesquisa = new javax.swing.JTextField();
        jFormattedTextFieldPesqCnpj = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPesqInscMunicipal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPesqInscEstadual = new javax.swing.JFormattedTextField();
        jLabelTitluloEmpresa = new javax.swing.JLabel();
        jTextFieldPesqNomeFantasia = new javax.swing.JTextField();
        jTextFieldPesqRazaoSocial = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldPesqEndereco = new javax.swing.JTextField();
        jLabelCadBairro = new javax.swing.JLabel();
        jTextFieldPesqBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldPesqCidade = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldPesqNumero = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jFormattedTextFieldPesqCep = new javax.swing.JFormattedTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxPesqEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldPesqTelefone = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldPesqEmail = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jFormattedTextFieldPesqCelular = new javax.swing.JFormattedTextField();
        jTextFieldPesquisarEmpresa = new javax.swing.JTextField();
        jButtonPesquisarEmpresa = new javax.swing.JButton();
        jButtonSalvarEmpresa = new javax.swing.JButton();
        jButtonEditarEmpresa = new javax.swing.JButton();
        jButtonLimparEmpresa = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelInsMunicipal.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelInsMunicipal.setText("Inscrição Municipal : ");

        jLabelCnpj.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCnpj.setText("CNPJ :");

        jLabelRazaoSocial.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelRazaoSocial.setText("Razão Social : ");

        jLabelNomeFantasia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNomeFantasia.setText("Nome Fantasía : ");

        jLabelInsEstadual.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelInsEstadual.setText("Inscrição Estadual :");

        jLabelIdEmpresa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelIdEmpresa.setText("ID :");

        jTextFieldIdPesquisa.setEnabled(false);

        try {
            jFormattedTextFieldPesqCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesqCnpj.setEnabled(false);

        jFormattedTextFieldPesqInscMunicipal.setEnabled(false);

        try {
            jFormattedTextFieldPesqInscEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesqInscEstadual.setEnabled(false);

        jLabelTitluloEmpresa.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelTitluloEmpresa.setText("Dados Cadastrais da Empresa");

        jTextFieldPesqNomeFantasia.setEnabled(false);

        jTextFieldPesqRazaoSocial.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIdEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabelNomeFantasia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesqNomeFantasia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelInsMunicipal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldPesqInscMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelRazaoSocial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldPesqRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInsEstadual)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelCnpj)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextFieldPesqCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldPesqInscEstadual)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabelTitluloEmpresa)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitluloEmpresa)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jLabelIdEmpresa)
                    .addComponent(jTextFieldIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesqNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRazaoSocial)
                        .addComponent(jFormattedTextFieldPesqCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldPesqRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInsEstadual)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelInsMunicipal)
                        .addComponent(jFormattedTextFieldPesqInscMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldPesqInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 60, 820, 160);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelEndereco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEndereco.setText("Endereço : ");

        jTextFieldPesqEndereco.setEnabled(false);

        jLabelCadBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadBairro.setText("Bairro : ");

        jTextFieldPesqBairro.setEnabled(false);

        jLabelCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade : ");

        jTextFieldPesqCidade.setEnabled(false);

        jLabelNumero.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNumero.setText("Nº : ");

        jTextFieldPesqNumero.setToolTipText("");
        jTextFieldPesqNumero.setEnabled(false);

        jLabelCep.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCep.setText("CEP : ");

        try {
            jFormattedTextFieldPesqCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesqCep.setEnabled(false);

        jLabelEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado : ");

        jComboBoxPesqEstado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxPesqEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxPesqEstado.setToolTipText("");
        jComboBoxPesqEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelEndereco)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesqEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelNumero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldPesqCep, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldPesqNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesqBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesqCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPesqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelNumero)
                    .addComponent(jLabelCadBairro)
                    .addComponent(jTextFieldPesqEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesqBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesqNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldPesqCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxPesqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPesqCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 240, 820, 110);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTelefone.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTelefone.setText("Telefone :");

        try {
            jFormattedTextFieldPesqTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesqTelefone.setEnabled(false);

        jLabelEmail.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelEmail.setText("Email : ");

        jTextFieldPesqEmail.setEnabled(false);

        jLabelCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelCelular.setText("Celular :");

        try {
            jFormattedTextFieldPesqCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesqCelular.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEmail))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jFormattedTextFieldPesqTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldPesqCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesqEmail)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextFieldPesqTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jFormattedTextFieldPesqCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 370, 820, 100);
        getContentPane().add(jTextFieldPesquisarEmpresa);
        jTextFieldPesquisarEmpresa.setBounds(510, 20, 220, 30);

        jButtonPesquisarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisarEmpresa.setText("Pesquisar");
        jButtonPesquisarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisarEmpresa);
        jButtonPesquisarEmpresa.setBounds(740, 20, 100, 30);

        jButtonSalvarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalvarEmpresa.setText("Salvar");
        jButtonSalvarEmpresa.setEnabled(false);
        jButtonSalvarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvarEmpresa);
        jButtonSalvarEmpresa.setBounds(550, 500, 100, 40);

        jButtonEditarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditarEmpresa.setText("Editar");
        jButtonEditarEmpresa.setEnabled(false);
        jButtonEditarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarEmpresa);
        jButtonEditarEmpresa.setBounds(650, 500, 100, 40);

        jButtonLimparEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimparEmpresa.setText("Limpar");
        jButtonLimparEmpresa.setEnabled(false);
        jButtonLimparEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimparEmpresa);
        jButtonLimparEmpresa.setBounds(750, 500, 100, 40);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(450, 500, 100, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, -110, 940, 790);

        setSize(new java.awt.Dimension(903, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void pesquisarEmpresa(){

    empresa.setPesquisaEmpresa(jTextFieldPesquisarEmpresa.getText());
    if(jTextFieldPesquisarEmpresa.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Digite um Nome Fantasia para fazer a pesquisa!");
        jTextFieldPesquisarEmpresa.requestFocus();
    } else {
        empresa.setContato(contato);
        pesquisaEmpresa.pesquisaEmpresa(empresa);   
         if (VerificaBdStatus.verificaStatusEmpresa(empresa)){
              jTextFieldPesquisarEmpresa.requestFocus();
          } else {
            jTextFieldIdPesquisa.setText(String.valueOf(empresa.getCodEmpresa()));
            jTextFieldPesqNomeFantasia.setText(empresa.getNomeFantasia());
            jTextFieldPesqRazaoSocial.setText(empresa.getRazaoSocial());
            jFormattedTextFieldPesqCnpj.setText(empresa.getCnpj());
            jFormattedTextFieldPesqInscMunicipal.setText(empresa.getInscricaoMunicipal());
            jFormattedTextFieldPesqInscEstadual.setText(empresa.getInscricaoEstadual());

            jTextFieldPesqEndereco.setText(contato.getEndereco());
            jTextFieldPesqNumero.setText(contato.getNumero());
            jTextFieldPesqBairro.setText(contato.getBairro());
            jFormattedTextFieldPesqCep.setText(contato.getCep());
            jTextFieldPesqCidade.setText(contato.getCidade());
            jComboBoxPesqEstado.setSelectedItem(contato.getEstado());
            jFormattedTextFieldPesqTelefone.setText(contato.getTefefone());
            jFormattedTextFieldPesqCelular.setText(contato.getCelular());
            jTextFieldPesqEmail.setText(contato.getEmail()); 
            
         }
       }
   }
   
   private void habilitarCampos(){

    jTextFieldPesqNomeFantasia.setEnabled(true);
    jTextFieldPesqRazaoSocial.setEnabled(true);
    jFormattedTextFieldPesqCnpj.setEnabled(true);
    jFormattedTextFieldPesqInscMunicipal.setEnabled(true);
    jFormattedTextFieldPesqInscEstadual.setEnabled(true);

    jTextFieldPesqEndereco.setEnabled(true);
    jTextFieldPesqNumero.setEnabled(true);
    jTextFieldPesqBairro.setEnabled(true);
    jFormattedTextFieldPesqCep.setEnabled(true);
    jTextFieldPesqCidade.setEnabled(true);
    jComboBoxPesqEstado.setEnabled(true);
    jFormattedTextFieldPesqTelefone.setEnabled(true);
    jFormattedTextFieldPesqCelular.setEnabled(true);
    jTextFieldPesqEmail.setEnabled(true);
    jButtonSalvarEmpresa.setEnabled(true);
    jButtonLimparEmpresa.setEnabled(true);
    jButtonEditarEmpresa.setEnabled(false);
    jTextFieldPesquisarEmpresa.setEnabled(false);
     jButtonExcluir.setEnabled(false);
   }
   
   private void desabilitarCampos(){
            
    jTextFieldPesqNomeFantasia.setEnabled(false);
    jTextFieldPesqRazaoSocial.setEnabled(false);
    jFormattedTextFieldPesqCnpj.setEnabled(false);
    jFormattedTextFieldPesqInscMunicipal.setEnabled(false);
    jFormattedTextFieldPesqInscEstadual.setEnabled(false);

    jTextFieldPesqEndereco.setEnabled(false);
    jTextFieldPesqNumero.setEnabled(false);
    jTextFieldPesqBairro.setEnabled(false);
    jFormattedTextFieldPesqCep.setEnabled(false);
    jTextFieldPesqCidade.setEnabled(false);
    jComboBoxPesqEstado.setEnabled(false);
    jFormattedTextFieldPesqTelefone.setEnabled(false);
    jFormattedTextFieldPesqCelular.setEnabled(false);
    jTextFieldPesqEmail.setEnabled(false);
    jButtonSalvarEmpresa.setEnabled(false);
    jButtonLimparEmpresa.setEnabled(false);
    jButtonEditarEmpresa.setEnabled(true);
    jTextFieldPesquisarEmpresa.setEnabled(true);
    
   }
   
   private void limparCampos(){
    jTextFieldIdPesquisa.setText("");
    jTextFieldPesquisarEmpresa.setText("");
    jTextFieldPesqNomeFantasia.setText("");
    jTextFieldPesqRazaoSocial.setText("");
    jFormattedTextFieldPesqCnpj.setText("");
    jFormattedTextFieldPesqInscMunicipal.setText("");
    jFormattedTextFieldPesqInscEstadual.setText("");
    jComboBoxPesqEstado.setSelectedIndex(0);

    jTextFieldPesqEndereco.setText("");
    jTextFieldPesqNumero.setText("");
    jTextFieldPesqBairro.setText("");
    jFormattedTextFieldPesqCep.setText("");
    jTextFieldPesqCidade.setText("");
    jFormattedTextFieldPesqTelefone.setText("");
    jFormattedTextFieldPesqCelular.setText("");
    jTextFieldPesqEmail.setText("");
   
   }
   
   public void receberDados(){
    // recebendo os dados
    empresa.setCodEmpresa(Integer.parseInt(jTextFieldIdPesquisa.getText()));
    empresa.setRazaoSocial(jTextFieldPesqRazaoSocial.getText());
    empresa.setNomeFantasia(jTextFieldPesqNomeFantasia.getText());
    empresa.setCnpj(jFormattedTextFieldPesqCnpj.getText());
    empresa.setInscricaoMunicipal(jFormattedTextFieldPesqInscMunicipal.getText());
    empresa.setInscricaoEstadual(jFormattedTextFieldPesqInscEstadual.getText());            
    contato.setEndereco(jTextFieldPesqEndereco.getText());
    contato.setNumero(jTextFieldPesqNumero.getText());
    contato.setCep(jFormattedTextFieldPesqCep.getText());
    contato.setBairro(jTextFieldPesqBairro.getText());
    contato.setCidade(jTextFieldPesqCidade.getText());
    contato.setEstado((String) jComboBoxPesqEstado.getSelectedItem());
    contato.setTefefone(jFormattedTextFieldPesqTelefone.getText());
    contato.setCelular(jFormattedTextFieldPesqCelular.getText());
    contato.setEmail(jTextFieldPesqEmail.getText());   
    empresa.setContato(contato);
    jButtonExcluir.setEnabled(true);
    jButtonEditarEmpresa.setEnabled(true);
   }
   
   public void salvarEmpresa(){
       
   receberDados();
// verificando campo vazio no formulário de cadastro
 if (VerificaCampos.validaCampos(jTextFieldPesqRazaoSocial.getText())    
     || VerificaCampos.validaCampos(jTextFieldPesqNomeFantasia.getText()) 
     || VerificaCampos.validaCampos(jFormattedTextFieldPesqCnpj.getText())
     || VerificaCampos.validaCampos(jFormattedTextFieldPesqInscMunicipal.getText())
     || VerificaCampos.validaCampos(jFormattedTextFieldPesqInscEstadual.getText())
     || VerificaCampos.validaCampos(jTextFieldPesqEndereco.getText())
     || VerificaCampos.validaCampos(jTextFieldPesqNumero.getText())
     || VerificaCampos.validaCampos(jTextFieldPesqBairro.getText())
     || VerificaCampos.validaCampos(jFormattedTextFieldPesqCep.getText())
     || VerificaCampos.validaCampos(jTextFieldPesqCidade.getText())
     || VerificaCampos.validaCampos(jFormattedTextFieldPesqTelefone.getText())
     || VerificaCampos.validaCampos(jTextFieldPesqEmail.getText())){ 
 } else {

    //verificando se o email é valido
     if(Validacoes.verificaEmail(jTextFieldPesqEmail.getText())){
          //verificando se o dado já está cadastrado no Banco de Dados
     } else {     
           //salvando dados
            editaEmpresa.editar(empresa);            
            limparCampos();
            desabilitarCampos();
            jTextFieldPesquisarEmpresa.setText("");
          }
        }
    
   }  
   
   public void excluirEmpresa(){
        int resposta  = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION ) {
           excluiEmpresa.excluir(empresa);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }
    private void jButtonEditarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarEmpresaActionPerformed
      if(jTextFieldPesquisarEmpresa.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Preencha o campo de pesquisa para continuar!");
          jTextFieldPesquisarEmpresa.requestFocus();
      } else{
        habilitarCampos();    
      }
    }//GEN-LAST:event_jButtonEditarEmpresaActionPerformed

    private void jButtonSalvarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEmpresaActionPerformed
        salvarEmpresa();
    }//GEN-LAST:event_jButtonSalvarEmpresaActionPerformed

    private void jButtonLimparEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparEmpresaActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparEmpresaActionPerformed

    private void jButtonPesquisarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarEmpresaActionPerformed
        pesquisarEmpresa();
    }//GEN-LAST:event_jButtonPesquisarEmpresaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirEmpresa();
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
            java.util.logging.Logger.getLogger(PesquisaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarEmpresa;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimparEmpresa;
    private javax.swing.JButton jButtonPesquisarEmpresa;
    private javax.swing.JButton jButtonSalvarEmpresa;
    private javax.swing.JComboBox<String> jComboBoxPesqEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqInscEstadual;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqInscMunicipal;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesqTelefone;
    private javax.swing.JLabel jLabelCadBairro;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIdEmpresa;
    private javax.swing.JLabel jLabelInsEstadual;
    private javax.swing.JLabel jLabelInsMunicipal;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitluloEmpresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldIdPesquisa;
    private javax.swing.JTextField jTextFieldPesqBairro;
    private javax.swing.JTextField jTextFieldPesqCidade;
    private javax.swing.JTextField jTextFieldPesqEmail;
    private javax.swing.JTextField jTextFieldPesqEndereco;
    private javax.swing.JTextField jTextFieldPesqNomeFantasia;
    private javax.swing.JTextField jTextFieldPesqNumero;
    private javax.swing.JTextField jTextFieldPesqRazaoSocial;
    private javax.swing.JTextField jTextFieldPesquisarEmpresa;
    // End of variables declaration//GEN-END:variables
}
