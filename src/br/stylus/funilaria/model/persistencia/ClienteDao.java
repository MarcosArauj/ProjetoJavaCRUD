package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class ClienteDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void salvar (ClientePessoaFisica control ){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cliente (data_cadastro) values(?)");
            pst.setString(1, control.dataFormat(LocalDateTime.now()));      
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void salvar (ClientePessoaJuridica control ){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cliente (data_cadastro) values(?)");
            pst.setString(1, control.dataFormat(LocalDateTime.now()));      
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
}
