package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.negocios.Produtos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutosDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void salvar( Produtos produto) {
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos (marca_produto,tipo_produto,descricao_produto,preco_produto,quantidade_produto) values(?,?,?,?,?)");
            pst.setString(1, produto.getMarca());
            pst.setString(2, produto.getTipo());
            pst.setString(3, produto.getDescricao());
            pst.setDouble(4, produto.getPreco()); 
            pst.setInt(5, produto.getQuantidade());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
