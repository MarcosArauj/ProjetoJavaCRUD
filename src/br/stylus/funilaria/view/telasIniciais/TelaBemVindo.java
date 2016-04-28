package br.stylus.funilaria.view.telasIniciais;

import br.stylus.funilaria.view.telasCadastros.FormAdministrador;
import javax.swing.JOptionPane;

public class TelaBemVindo extends javax.swing.JFrame {
   
    public TelaBemVindo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoTelaInicial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        jLabelFundoTela = new javax.swing.JLabel();

        fundoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/imagens/fundo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Boas Vindas");
        setResizable(false);
        setSize(new java.awt.Dimension(650, 360));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/bemvindo_1.png"))); // NOI18N
        jLabel1.setText("Obrigado por escolher o ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 350, 100);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 2, 18)); // NOI18N
        jLabel4.setText("Stylus Funilaria & Pintura");
        jLabel4.setPreferredSize(new java.awt.Dimension(230, 25));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 90, 260, 50);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel3.setText("Seja bem vindo ao Stylus, este software auxilia no gerenciamento de sua funilaria e pintura. ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 620, 40);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N
        jLabel5.setText("esperamos que você aproveite o máximo e não hesite em nos enviar seu comentarios! ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 190, 610, 40);

        botaoEntrar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorder(new javax.swing.border.MatteBorder(null));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(250, 260, 130, 40);

        jLabelFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/stylus/funilaria/view/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoTela);
        jLabelFundoTela.setBounds(-10, -10, 670, 380);

        setSize(new java.awt.Dimension(645, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        FormAdministrador tela = new FormAdministrador();
        tela.setVisible(true);
        dispose();
         JOptionPane.showMessageDialog(rootPane, "Cadastre-se no Sistema!!!");
    }//GEN-LAST:event_botaoEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBemVindo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel fundoTelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFundoTela;
    // End of variables declaration//GEN-END:variables

    private void Sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
