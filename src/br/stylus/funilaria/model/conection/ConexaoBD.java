package br.stylus.funilaria.model.conection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/stylus_funilaria";
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;
    
   
    public void conexao(){
       
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o BD:\n" + ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n" + ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao desconectar com o BD:\n" + ex.getMessage());
        }
    }
    
}
