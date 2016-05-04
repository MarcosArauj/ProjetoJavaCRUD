package br.stylus.funilaria.model.persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.stylus.funilaria.controller.gestaopessoa.fisica.PessoaFisica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PessoaFisicaDao {
    
     ConexaoBD conex = new ConexaoBD();
     PessoaFisica control = new PessoaFisica();
    
    public void salvar(PessoaFisica control){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pessoafisica (nome,cpf,rg,orgaoexpedidor,data_nascimento) values(?,?,?,?,?)");
            pst.setString(1, control.getNome());
            pst.setString(2, control.getCpf());
            pst.setString(3, control.getRg());
            pst.setString(4, control.getOex());
            pst.setString(5, control.getNascimento());
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
