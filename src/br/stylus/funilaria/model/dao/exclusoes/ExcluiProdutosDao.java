package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.negocios.Produtos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiProdutosDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    final private String status = "inativo";
    
    public void excluir(Produtos produtos){
       
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set status=? where cod_produto=?");
            
             pst.setString(1, status);
             pst.setInt(2, produtos.getCodProduto()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
}
