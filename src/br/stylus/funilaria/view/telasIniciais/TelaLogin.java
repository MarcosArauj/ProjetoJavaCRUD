package br.stylus.funilaria.view.telasIniciais;

import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Usuario;
import br.stylus.funilaria.controller.utilitarios.verificaBd.VerificaLogin;
import br.stylus.funilaria.model.conection.ConexaoBD;

public class TelaLogin extends javax.swing.JFrame {
    
     Usuario login = new Usuario();
     ConexaoBD conex = new ConexaoBD();

    public TelaLogin() {
        initComponents();
         conex.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuário : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 140, 70, 20);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 180, 70, 30);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Stylus Funilaria & Pintura");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 90, 200, 30);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(130, 140, 220, 27);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(130, 180, 220, 27);

        jButtonLogin.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(130, 240, 100, 40);

        jButtonCancelar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(240, 240, 100, 40);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/LogoLogin.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(170, 10, 130, 90);

        jLabelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelfundo);
        jLabelfundo.setBounds(0, 0, 470, 310);

        setSize(new java.awt.Dimension(466, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
         login.setNomeUsuario(jTextFieldUsuario.getText());
         login.setSenha(jPasswordFieldSenha.getText());
         login.setTipo(jTextFieldUsuario.getText());
         
        if (VerificaLogin.validaUsuarioSenha(login)){
           if(VerificaLogin.validaUsuarioaTipo(login)){
               TelaAdministrador tela1 = new TelaAdministrador();
                tela1.setVisible(true);
                dispose();
            } else {
                TelaFuncionario tela2 = new TelaFuncionario();
                tela2.setVisible(true);
                dispose();
            }
        } else {
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    /** 
     * 
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelfundo;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
