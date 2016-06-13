package br.stylus.funilaria.view.telasPesquisasEEdicoes;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.controller.utilitarios.formatacoes.ModeloTabela;
import br.stylus.funilaria.controller.utilitarios.validacoes.Validacoes;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaBdStatus;
import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.dao.edicoesDeCadastros.EditaFuncionarioDao;
import br.stylus.funilaria.model.dao.exclusoes.ExcluiFuncionarioDao;
import br.stylus.funilaria.model.dao.pesquisas.PesquisaFuncionarioDao;
import br.stylus.funilaria.view.verificaCampos.VerificaCampos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class PesquisaFuncionario extends javax.swing.JFrame {
    
    Funcionario funcionario = new Funcionario();
    Contato contato = new Contato();
    ConexaoBD conex = new ConexaoBD();
    PesquisaFuncionarioDao pesqFuncionario = new PesquisaFuncionarioDao();
    EditaFuncionarioDao editaFuncionario = new EditaFuncionarioDao();
    ExcluiFuncionarioDao excluiFuncionario = new ExcluiFuncionarioDao();
     
    public PesquisaFuncionario() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisaFuncionario = new javax.swing.JTabbedPane();
        jPanelPesquisaFuniconario = new javax.swing.JPanel();
        jLabelTipoPesquisaFun = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        txtPesquisaFun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaFun = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jPanelEditaFuncionario = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadNomeFun = new javax.swing.JLabel();
        txtNomeFun = new javax.swing.JTextField();
        jLabelCadCpfFun = new javax.swing.JLabel();
        txtCpfFun = new javax.swing.JFormattedTextField();
        jLabelCadRgFun = new javax.swing.JLabel();
        jLabelOexFun = new javax.swing.JLabel();
        txtOexFun = new javax.swing.JTextField();
        jLabelNascimnetoFun = new javax.swing.JLabel();
        txtNascimentoFun = new javax.swing.JFormattedTextField();
        txtRgFun = new javax.swing.JFormattedTextField();
        jLabelPesqSexoAdmin = new javax.swing.JLabel();
        jcSexoFun = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabelCtpsFun = new javax.swing.JLabel();
        txtCtpsFun = new javax.swing.JFormattedTextField();
        jLabelCargoFun = new javax.swing.JLabel();
        jcCargoFun = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabelCadEnderecoFun = new javax.swing.JLabel();
        jLabelCadCidadeFun = new javax.swing.JLabel();
        jLabelCadNumeroFun = new javax.swing.JLabel();
        jLabelCadBairroFun = new javax.swing.JLabel();
        jLabelCadCepFun = new javax.swing.JLabel();
        jLabelCadEstadoFun = new javax.swing.JLabel();
        txtCepFun = new javax.swing.JFormattedTextField();
        txtEnderecoFun = new javax.swing.JTextField();
        txtNumeroFun = new javax.swing.JTextField();
        txtBairroFun = new javax.swing.JTextField();
        txtCidadeFun = new javax.swing.JTextField();
        jcEstadoFun = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabelCadTelefoneFun = new javax.swing.JLabel();
        jLabelCadEmailFun = new javax.swing.JLabel();
        txtEmailFun = new javax.swing.JTextField();
        txtCelularFun = new javax.swing.JFormattedTextField();
        jLabelCadCelularFun = new javax.swing.JLabel();
        txtTelefoneFun = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimparFun = new javax.swing.JButton();
        jLabelIdFuncionario = new javax.swing.JLabel();
        txtIdFuniconario = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jLabelDadosCadastrais = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Funcionário");
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPanePesquisaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelPesquisaFuniconario.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPesquisaFuniconario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTipoPesquisaFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelTipoPesquisaFun.setText("Pesquisar por :");

        jComboBoxTipoPesquisa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Nome", "Cargo", "Cpf" }));
        jComboBoxTipoPesquisa.setToolTipText("");

        jTablePesquisaFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaFunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaFun);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaFuniconarioLayout = new javax.swing.GroupLayout(jPanelPesquisaFuniconario);
        jPanelPesquisaFuniconario.setLayout(jPanelPesquisaFuniconarioLayout);
        jPanelPesquisaFuniconarioLayout.setHorizontalGroup(
            jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaFuniconarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisaFuniconarioLayout.createSequentialGroup()
                        .addComponent(jLabelTipoPesquisaFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisaFun)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanelPesquisaFuniconarioLayout.setVerticalGroup(
            jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaFuniconarioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisaFun, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPesquisaFuniconarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoPesquisaFun)
                        .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPanePesquisaFuncionario.addTab("Pesquisar Funcionário", jPanelPesquisaFuniconario);

        jPanelEditaFuncionario.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(770, 110));

        jLabelCadNomeFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadNomeFun.setText("Nome : ");

        txtNomeFun.setEnabled(false);

        jLabelCadCpfFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCpfFun.setText("CPF : ");

        try {
            txtCpfFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfFun.setEnabled(false);

        jLabelCadRgFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadRgFun.setText("RG :  ");

        jLabelOexFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelOexFun.setText("Orgão Expedidor :");

        txtOexFun.setEnabled(false);

        jLabelNascimnetoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelNascimnetoFun.setText("Nascimento :");

        try {
            txtNascimentoFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimentoFun.setEnabled(false);

        try {
            txtRgFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRgFun.setEnabled(false);

        jLabelPesqSexoAdmin.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelPesqSexoAdmin.setText("Sexo :");

        jcSexoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcSexoFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));
        jcSexoFun.setToolTipText("");
        jcSexoFun.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadNomeFun)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadCpfFun, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPesqSexoAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabelNascimnetoFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNascimentoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtRgFun, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCadRgFun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCpfFun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelOexFun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtOexFun, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNomeFun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadNomeFun)
                    .addComponent(txtNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpfFun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCpfFun)
                        .addComponent(txtRgFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCadRgFun)
                        .addComponent(txtOexFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelOexFun)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesqSexoAdmin)
                    .addComponent(jcSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNascimnetoFun)
                    .addComponent(txtNascimentoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCtpsFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCtpsFun.setText("CTPS :");

        txtCtpsFun.setEnabled(false);

        jLabelCargoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCargoFun.setText("Cargo :");

        jcCargoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcCargoFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Funileiro", "Pintor", "Recepcionista" }));
        jcCargoFun.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabelCargoFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCtpsFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCtpsFun)
                    .addComponent(jLabelCargoFun)
                    .addComponent(jcCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            txtCepFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepFun.setEnabled(false);

        txtEnderecoFun.setEnabled(false);

        txtNumeroFun.setEnabled(false);

        txtBairroFun.setEnabled(false);

        txtCidadeFun.setEnabled(false);

        jcEstadoFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jcEstadoFun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jcEstadoFun.setToolTipText("");
        jcEstadoFun.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadEnderecoFun)
                    .addComponent(jLabelCadCepFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtEnderecoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabelCadNumeroFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadCidadeFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeFun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadBairroFun)
                    .addComponent(jLabelCadEstadoFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstadoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEnderecoFun)
                    .addComponent(jLabelCadNumeroFun)
                    .addComponent(jLabelCadBairroFun)
                    .addComponent(txtEnderecoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadCidadeFun)
                    .addComponent(jLabelCadCepFun)
                    .addComponent(jLabelCadEstadoFun)
                    .addComponent(txtCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstadoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadTelefoneFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadTelefoneFun.setText("Telefone : ");

        jLabelCadEmailFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadEmailFun.setText("E-mail : ");

        txtEmailFun.setEnabled(false);

        try {
            txtCelularFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularFun.setEnabled(false);

        jLabelCadCelularFun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelCadCelularFun.setText("Celular :");

        try {
            txtTelefoneFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFun.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCadTelefoneFun)
                    .addComponent(jLabelCadEmailFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailFun, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTelefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCadCelularFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelularFun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCadTelefoneFun)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadCelularFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCelularFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadEmailFun)
                    .addComponent(txtEmailFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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

        jButtonLimparFun.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLimparFun.setText("Limpar");
        jButtonLimparFun.setEnabled(false);
        jButtonLimparFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparFunActionPerformed(evt);
            }
        });

        jLabelIdFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdFuncionario.setText("ID :");

        txtIdFuniconario.setEnabled(false);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditaFuncionarioLayout = new javax.swing.GroupLayout(jPanelEditaFuncionario);
        jPanelEditaFuncionario.setLayout(jPanelEditaFuncionarioLayout);
        jPanelEditaFuncionarioLayout.setHorizontalGroup(
            jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEditaFuncionarioLayout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonLimparFun, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEditaFuncionarioLayout.createSequentialGroup()
                            .addComponent(jLabelIdFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdFuniconario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelEditaFuncionarioLayout.setVerticalGroup(
            jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdFuncionario)
                    .addComponent(txtIdFuniconario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimparFun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPanePesquisaFuncionario.addTab("Editar", jPanelEditaFuncionario);

        getContentPane().add(jTabbedPanePesquisaFuncionario);
        jTabbedPanePesquisaFuncionario.setBounds(40, 40, 800, 540);

        jLabelDadosCadastrais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabelDadosCadastrais.setText("Gerenciamento de Funcionário");
        getContentPane().add(jLabelDadosCadastrais);
        jLabelDadosCadastrais.setBounds(300, 20, 246, 24);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-10, -20, 910, 630);

        setSize(new java.awt.Dimension(894, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void pesquisaFuncionario(){
       funcionario.setPesquisaFun(txtPesquisaFun.getText());
        funcionario.setContato(contato);
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Nome")){         
            pesqFuncionario.pesquisaNome(funcionario);
              if (VerificaBdStatus.verificaStatusFuncionario(funcionario)){
                 txtPesquisaFun.requestFocus();
              } else {
                preencherTabela("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where pf.nome ='"+funcionario.getPesquisaFun()+"'");
                   }
              } else if(jComboBoxTipoPesquisa.getSelectedItem().equals("Cargo")){
                  pesqFuncionario.pesquisaCargo(funcionario);
                  if (VerificaBdStatus.verificaStatusFuncionario(funcionario)){
                     txtPesquisaFun.requestFocus();
                   } else {
                     preencherTabela("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where fu.cargo ='"+funcionario.getPesquisaFun()+"'");
                  }
       } else if(jComboBoxTipoPesquisa.getSelectedItem().equals("Cpf")) {
           pesqFuncionario.pesquisaCpf(funcionario);
            if (VerificaBdStatus.verificaStatusFuncionario(funcionario)){
              txtPesquisaFun.requestFocus();
              } else {
               preencherTabela("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where pf.cpf ='"+funcionario.getPesquisaFun()+"'");
            }
       } else if (jComboBoxTipoPesquisa.getSelectedItem().equals("Selecione...")){
       JOptionPane.showMessageDialog(rootPane, "Selecione uma opção para a pesquisa!");
          } else if(txtPesquisaFun.getText().isEmpty()){
               JOptionPane.showMessageDialog(rootPane, "Preencha o campo para fazer a pesquisa!");
               txtPesquisaFun.requestFocus();
      } 
    }
    
      private void preencherTabela(String Sql) {
      
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {"ID","Nome","Cpf","Sexo","Cargo","Endereco","Celular","Email"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
           conex.rs.first();
       do { 
       dados.add(new Object[] {conex.rs.getInt("cod_funcionario"),conex.rs.getString("nome"),conex.rs.getString("cpf"),conex.rs.getString("sexo"),
                               conex.rs.getString("cargo"), conex.rs.getString("endereco"),conex.rs.getString("celular"),conex.rs.getString("email")});
       }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque por outro funcionário para preencher a tabela"+ ex);
        }  
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaFun.setModel(modelo);
        jTablePesquisaFun.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTablePesquisaFun.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTablePesquisaFun.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePesquisaFun.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePesquisaFun.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTablePesquisaFun.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTablePesquisaFun.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(6).setPreferredWidth(110);
        jTablePesquisaFun.getColumnModel().getColumn(6).setResizable(false);
        jTablePesquisaFun.getColumnModel().getColumn(7).setPreferredWidth(110);
        jTablePesquisaFun.getColumnModel().getColumn(7).setResizable(false);
        jTablePesquisaFun.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaFun.setAutoResizeMode(jTablePesquisaFun.AUTO_RESIZE_OFF);
        jTablePesquisaFun.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
 
  private void limparTabela(){
       ArrayList dados = new ArrayList();
       String colunas[] = new String [] {};
        dados.add(new Object[] {});
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        jTablePesquisaFun.setModel(modelo);
 
  }       
 
    private void receberDados() {
       
    //recebendo os dados
        funcionario.setCodFuncionario(Integer.parseInt(txtIdFuniconario.getText()));
        funcionario.setNome(txtNomeFun.getText());
        funcionario.setCpf(txtCpfFun.getText());
        funcionario.setRg(txtRgFun.getText());
        funcionario.setOex(txtOexFun.getText());
        funcionario.setNascimento(txtNascimentoFun.getText());
        funcionario.setSexo((String) jcSexoFun.getSelectedItem());
        funcionario.setCtps(txtCtpsFun.getText());
        funcionario.setCargo((String) jcCargoFun.getSelectedItem());

        contato.setEndereco(txtEnderecoFun.getText());
        contato.setNumero(txtNumeroFun.getText());
        contato.setBairro(txtBairroFun.getText());
        contato.setCep(txtCepFun.getText());
        contato.setCidade(txtCidadeFun.getText());
        contato.setEstado((String) jcEstadoFun.getSelectedItem());
        contato.setTefefone(txtTelefoneFun.getText());
        contato.setCelular(txtCelularFun.getText());
        contato.setEmail(txtEmailFun.getText());          
        funcionario.setContato(contato);
        
    }
    
    private void habilitarCampos() {
        txtNomeFun.setEnabled(true);
        txtNomeFun.requestFocus();
        txtCpfFun.setEnabled(true);
        txtRgFun.setEnabled(true);
        txtOexFun.setEnabled(true);
        jcSexoFun.setEnabled(true);
        txtNascimentoFun.setEnabled(true);
        txtCtpsFun.setEnabled(true);
        jcCargoFun.setEnabled(true);
        txtEnderecoFun.setEnabled(true);
        txtNumeroFun.setEnabled(true);
        txtBairroFun.setEnabled(true);
        txtCepFun.setEnabled(true);
        txtCidadeFun.setEnabled(true);
        jcEstadoFun.setEnabled(true);
        txtTelefoneFun.setEnabled(true);
        txtCelularFun.setEnabled(true);
        txtEmailFun.setEnabled(true);
        jButtonLimparFun.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
    }
    
    private void desabilitarCampos() {
        txtNomeFun.setEnabled(false);
        txtCpfFun.setEnabled(false);
        txtRgFun.setEnabled(false);
        txtOexFun.setEnabled(false);
        txtNascimentoFun.setEnabled(false);
        jcSexoFun.setEnabled(false);
        txtCtpsFun.setEnabled(false);
        jcCargoFun.setEnabled(false);
        txtEnderecoFun.setEnabled(false);
        txtNumeroFun.setEnabled(false);
        txtBairroFun.setEnabled(false);
        txtCepFun.setEnabled(false);
        txtCidadeFun.setEnabled(false);
        jcEstadoFun.setEnabled(false);
        txtTelefoneFun.setEnabled(false);
        txtCelularFun.setEnabled(false);
        txtEmailFun.setEnabled(false);
        jButtonLimparFun.setEnabled(false);
        jButtonSalvar.setEnabled(false);
      
    }
    
    private void limparCampos() {
        txtIdFuniconario.setText("");
        txtPesquisaFun.setText("");
        txtNomeFun.setText("");
        txtCpfFun.setText("");
        txtRgFun.setText("");
        txtOexFun.setText("");
        jcSexoFun.setSelectedIndex(0);
        txtNascimentoFun.setText("");
        txtCtpsFun.setText("");
        jcCargoFun.setSelectedIndex(0);
        txtEnderecoFun.setText("");
        txtNumeroFun.setText("");
        txtBairroFun.setText("");
        txtCepFun.setText("");
        txtCidadeFun.setText("");
        jcEstadoFun.setSelectedIndex(0);
        txtTelefoneFun.setText("");
        txtCelularFun.setText("");
        txtEmailFun.setText("");
    }
    
    private void preencherTextField(){
       String fun = ""+jTablePesquisaFun.getValueAt(jTablePesquisaFun.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where pf.nome ='"+fun+"'");
        try {
        conex.rs.first();    
            txtIdFuniconario.setText(String.valueOf(conex.rs.getInt("cod_funcionario")));
            txtNomeFun.setText(conex.rs.getString("nome"));
            txtCpfFun.setText(conex.rs.getString("cpf"));
            txtRgFun.setText(conex.rs.getString("rg"));
            txtOexFun.setText(conex.rs.getString("orgaoexpedidor"));
            txtNascimentoFun.setText(conex.rs.getString("data_nascimento"));
            jcSexoFun.setSelectedItem((String)conex.rs.getString("sexo"));
            txtCtpsFun.setText(conex.rs.getString("ctps"));
            jcCargoFun.setSelectedItem((String)conex.rs.getString("cargo"));
            txtEnderecoFun.setText(conex.rs.getString("endereco"));
            txtNumeroFun.setText(conex.rs.getString("numero"));
            txtCepFun.setText(conex.rs.getString("cep"));
            txtBairroFun.setText(conex.rs.getString("bairro"));
            txtCidadeFun.setText(conex.rs.getString("cidade"));
            jcEstadoFun.setSelectedItem((String)conex.rs.getString("estado"));
            txtTelefoneFun.setText(conex.rs.getString("telefone"));
            txtCelularFun.setText(conex.rs.getString("celular"));
            txtEmailFun.setText(conex.rs.getString("email"));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ ex.getMessage());
        }     
        conex.desconecta();
    }
        
  public void salvarFuncionario(){
      receberDados();
        if (VerificaCampos.validaCampos(txtNomeFun.getText())
            || VerificaCampos.validaCampos(txtCpfFun.getText())
            || VerificaCampos.validaCampos(txtRgFun.getText())
            || VerificaCampos.validaCampos(txtOexFun.getText())
            || VerificaCampos.validaCampos(txtNascimentoFun.getText())
            || VerificaCampos.validaCampos(txtCtpsFun.getText())
            || VerificaCampos.validaCampos(txtEnderecoFun.getText())
            || VerificaCampos.validaCampos(txtNumeroFun.getText())
            || VerificaCampos.validaCampos(txtBairroFun.getText())
            || VerificaCampos.validaCampos(txtCepFun.getText())
            || VerificaCampos.validaCampos(txtCidadeFun.getText())) {

        } else {
            //verificando se o dado já está cadastrado no Banco de Dados
            if (Validacoes.isCPF(txtCpfFun.getText())) {
                if (Validacoes.verificaEmail(txtEmailFun.getText())) {

                } else {
                //salvando dados
                editaFuncionario.editar(funcionario);
                JOptionPane.showMessageDialog(rootPane, "Para ver o funcionério alterado, pesquise novamente!");
                jTabbedPanePesquisaFuncionario.setSelectedIndex(0);
                txtPesquisaFun.requestFocus();
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
           excluiFuncionario.excluir(funcionario);
           limparCampos();
           desabilitarCampos();
           jButtonExcluir.setEnabled(false);
        }
    }  
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarFuncionario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       if(txtNomeFun.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Pesquise um funcionário para continuar!");
         jTabbedPanePesquisaFuncionario.setSelectedIndex(0);
         txtPesquisaFun.requestFocus();
      } else {
        habilitarCampos();
      }
     
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparFunActionPerformed
        limparCampos();      
    }//GEN-LAST:event_jButtonLimparFunActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       pesquisaFuncionario();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTablePesquisaFunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaFunMouseClicked
         preencherTextField();
        jTabbedPanePesquisaFuncionario.setSelectedIndex(1);
    }//GEN-LAST:event_jTablePesquisaFunMouseClicked

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
            java.util.logging.Logger.getLogger(PesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimparFun;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabelCadBairroFun;
    private javax.swing.JLabel jLabelCadCelularFun;
    private javax.swing.JLabel jLabelCadCepFun;
    private javax.swing.JLabel jLabelCadCidadeFun;
    private javax.swing.JLabel jLabelCadCpfFun;
    private javax.swing.JLabel jLabelCadEmailFun;
    private javax.swing.JLabel jLabelCadEnderecoFun;
    private javax.swing.JLabel jLabelCadEstadoFun;
    private javax.swing.JLabel jLabelCadNomeFun;
    private javax.swing.JLabel jLabelCadNumeroFun;
    private javax.swing.JLabel jLabelCadRgFun;
    private javax.swing.JLabel jLabelCadTelefoneFun;
    private javax.swing.JLabel jLabelCargoFun;
    private javax.swing.JLabel jLabelCtpsFun;
    private javax.swing.JLabel jLabelDadosCadastrais;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIdFuncionario;
    private javax.swing.JLabel jLabelNascimnetoFun;
    private javax.swing.JLabel jLabelOexFun;
    private javax.swing.JLabel jLabelPesqSexoAdmin;
    private javax.swing.JLabel jLabelTipoPesquisaFun;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelEditaFuncionario;
    private javax.swing.JPanel jPanelPesquisaFuniconario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanePesquisaFuncionario;
    private javax.swing.JTable jTablePesquisaFun;
    private javax.swing.JComboBox<String> jcCargoFun;
    private javax.swing.JComboBox<String> jcEstadoFun;
    private javax.swing.JComboBox<String> jcSexoFun;
    private javax.swing.JTextField txtBairroFun;
    private javax.swing.JFormattedTextField txtCelularFun;
    private javax.swing.JFormattedTextField txtCepFun;
    private javax.swing.JTextField txtCidadeFun;
    private javax.swing.JFormattedTextField txtCpfFun;
    private javax.swing.JFormattedTextField txtCtpsFun;
    private javax.swing.JTextField txtEmailFun;
    private javax.swing.JTextField txtEnderecoFun;
    private javax.swing.JTextField txtIdFuniconario;
    private javax.swing.JFormattedTextField txtNascimentoFun;
    private javax.swing.JTextField txtNomeFun;
    private javax.swing.JTextField txtNumeroFun;
    private javax.swing.JTextField txtOexFun;
    private javax.swing.JTextField txtPesquisaFun;
    private javax.swing.JFormattedTextField txtRgFun;
    private javax.swing.JFormattedTextField txtTelefoneFun;
    // End of variables declaration//GEN-END:variables
}
