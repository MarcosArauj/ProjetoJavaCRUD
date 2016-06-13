package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.ClientePessoaJuridica;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiClienteDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    final private String status = "inativo";
    
    public void excluir(ClientePessoaFisica cliente){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente_pessoa_fisica as cli\n" +
                    "inner join pessoa_fisica as pf\n" +
                    "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                    "inner join contato as c\n" +
                    "on cli.cod_contato = c.cod_contato\n" +
                    "set cli.status=? where cli.cod_cliente=?");
            
             pst.setString(1, status);
             pst.setInt(2, cliente.getCodClienteF()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
    public void excluir(ClientePessoaJuridica cliente){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente_pessoa_juridica as cli\n" +
                                                "inner join pessoa_juridica as pj\n" +
                                                "on cli.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                                                "inner join contato as c\n" +
                                                "on cli.cod_contato = c.cod_contato\n" +
                                                "set cli.status=? where cli.cod_cliente=?");
            
             pst.setString(1, status);
             pst.setInt(2, cliente.getCodClienteJ()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
}
