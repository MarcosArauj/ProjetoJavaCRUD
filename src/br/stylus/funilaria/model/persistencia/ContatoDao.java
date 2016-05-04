package br.stylus.funilaria.model.persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.stylus.funilaria.controller.gestaopessoa.contato.Contato;
import br.stylus.funilaria.model.conection.ConexaoBD;

public class ContatoDao {
    
    ConexaoBD conex = new ConexaoBD();
    Contato control = new Contato();
    
    public void salvar(Contato control){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, control.getEndereco());
            pst.setString(2, control.getNumero());
            pst.setString(3, control.getCep());
            pst.setString(4, control.getBairro());
            pst.setString(5, control.getCidade());
            pst.setString(6, control.getEstado());
            pst.setString(7, control.getTefefone());
            pst.setString(8, control.getCelular());
            pst.setString(9, control.getEmail());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
}
