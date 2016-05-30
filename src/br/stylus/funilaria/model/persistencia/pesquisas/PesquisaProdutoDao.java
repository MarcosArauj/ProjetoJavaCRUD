package br.stylus.funilaria.model.persistencia.pesquisas;

import br.stylus.funilaria.controller.gestao.negocios.Produtos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaProdutoDao {
    
    ConexaoBD conex = new ConexaoBD();
    
     public Produtos pesquisarMarca (Produtos marca){
        conex.conexao();
        conex.executaSql("select * from produtos where marca_produto like '"+marca.getPesquisaproduto()+"%'");
        try {
            conex.rs.first();
            do{
            marca.setCodProduto(conex.rs.getInt("cod_produto"));
            marca.setMarca(conex.rs.getString("marca_produto"));
            marca.setTipo(conex.rs.getString("tipo_produto"));
            marca.setDescricao(conex.rs.getString("descricao_produto"));
            marca.setPreco(conex.rs.getDouble("preco_produto"));
            marca.setQuantidade(conex.rs.getInt("quantidade_produto"));
           }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Marca de produto não Cadastrado!");
        }
        
        conex.desconecta();
        
        return marca;
    }
     public Produtos pesquisarTipo (Produtos tipo){
     
       
        conex.conexao();
        conex.executaSql("select * from produtos where tipo_produto='"+tipo.getPesquisaproduto()+"'");
        try {
            conex.rs.first();
         
            tipo.setCodProduto(conex.rs.getInt("cod_produto"));
            tipo.setMarca(conex.rs.getString("marca_produto"));
            tipo.setTipo(conex.rs.getString("tipo_produto"));
            tipo.setDescricao(conex.rs.getString("descricao_produto"));
            tipo.setPreco(conex.rs.getDouble("preco_produto"));
            tipo.setQuantidade(conex.rs.getInt("quantidade_produto"));
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo de produto não Cadastrado!");
        }
        
        conex.desconecta();
        
        return tipo;
    }
     
      public Produtos pesquisarDescricao (Produtos descricao){
        conex.conexao();
        conex.executaSql("select * from produtos where descricao_produto='"+descricao.getPesquisaproduto()+"'");
        try {
            conex.rs.first();
            do{
            descricao.setCodProduto(conex.rs.getInt("cod_produto"));
            descricao.setMarca(conex.rs.getString("marca_produto"));
            descricao.setTipo(conex.rs.getString("tipo_produto"));
            descricao.setDescricao(conex.rs.getString("descricao_produto"));
            descricao.setPreco(conex.rs.getDouble("preco_produto"));
            descricao.setQuantidade(conex.rs.getInt("quantidade_produto"));
           }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Descrição de produto não Cadastrada!");
        }
        
        conex.desconecta();
        
        return descricao;
    }
}
