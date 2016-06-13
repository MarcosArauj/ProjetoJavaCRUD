package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiFornecedorDao {
    
      ConexaoBD conex = new ConexaoBD();
    final private String status = "inativo";
    
    public void excluir(Fornecedor fornecedor){
        conex.conexao();
     
        try {
            PreparedStatement pst = conex.con.prepareStatement("update fornecedor as fo\n" +
                                        "inner join pessoa_juridica as pj\n" +
                                        "on fo.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                                        "inner join contato as c\n" +
                                        "on fo.cod_contato = c.cod_contato\n" +
                                        "set fo.status=? where fo.cod_fornecedor=?");
            
             pst.setString(1, status);
             pst.setInt(2, fornecedor.getCodFornecedor()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
      
    }
    
    
}
