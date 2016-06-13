package br.stylus.funilaria.model.dao.cadastros;

import br.stylus.funilaria.model.vo.gestao.negocios.Produtos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroProdutosDao implements CadastrarDados{
    
    ConexaoBD conex = new ConexaoBD();
     private final String status = "ativo";
    public void salvar( Produtos produto) {
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement(SALVAR_PRODUTO);
            pst.setString(1, produto.getMarca());
            pst.setString(2, produto.getTipo());
            pst.setString(3, produto.getDescricao());
            pst.setDouble(4, produto.getPreco()); 
            pst.setInt(5, produto.getQuantidade());
            pst.setString(6, status);
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
