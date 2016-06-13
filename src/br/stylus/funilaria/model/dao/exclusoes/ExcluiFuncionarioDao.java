package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiFuncionarioDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    final private String status = "inativo";
    
    public void excluir(Funcionario fun){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionario as fu\n" +
                    "inner join pessoa_fisica as pf\n" +
                    "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                    "inner join contato as c\n" +
                    "on fu.cod_contato = c.cod_contato\n" +
                    "set fu.status=? where fu.cod_funcionario=?");
            
             pst.setString(1, status);
             pst.setInt(2, fun.getCodFuncionario()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
}
