
package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.negocios.Produtos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaProdutosDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void editar(Produtos produtos){
        conex.conexao();
                    try {
                PreparedStatement pst = conex.con.prepareStatement("update produtos set marca_produto=?, tipo_produto=?, descricao_produto=?, preco_produto=?, quantidade_produto=? where cod_produto=?");
                pst.setString(1,produtos.getMarca());
                pst.setString(2, produtos.getTipo());
                pst.setString(3, produtos.getDescricao());
                pst.setDouble(4, produtos.getPreco());
                pst.setInt(5, produtos.getQuantidade());
                pst.setInt(6, produtos.getCodProduto());
                pst.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao alterar Produto!" + ex);
            }
        
        
        conex.desconecta();
    }
    
}
