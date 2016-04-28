package br.stylus.funilaria.model.persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.stylus.funilaria.controller.gestaopessoa.contato.Contato;
import br.stylus.funilaria.model.conection.ConexaoBD;

public class ContatoDao {
    
    ConexaoBD conex = new ConexaoBD();
    Contato mod = new Contato();
    
    public void Salvar(Contato mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getEndereco());
            pst.setString(2, mod.getNumero());
            pst.setString(3, mod.getCep());
            pst.setString(4,mod.getBairro());
            pst.setString(5,mod.getCidade());
            pst.setString(6,mod.getEstado());
            pst.setString(7,mod.getTefefone());
            pst.setString(8,mod.getCelular());
            pst.setString(9,mod.getEmail());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
}
