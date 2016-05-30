package br.stylus.funilaria.model.persistencia.pesquisas;

import br.stylus.funilaria.controller.gestao.negocios.Servicos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaServicoDao {
    
    ConexaoBD conex = new ConexaoBD();
    
     public Servicos pesquisarMarca (Servicos tipo){
        conex.conexao();
        conex.executaSql("select * from servicos where tipo_servico='"+tipo.getPesquisaServico()+"'");
        try {
            conex.rs.first();
            do{
            tipo.setCodServico(conex.rs.getInt("cod_servico"));
            tipo.setTipo(conex.rs.getString("tipo_servico"));
            tipo.setPrecoInicial(conex.rs.getDouble("preco_inicial"));
           }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Serviço não Cadastrado!");
        }
        
        conex.desconecta();
        
        return tipo;
     }
    
}
