package br.stylus.funilaria.model.persistencia.cadastros;

import br.stylus.funilaria.controller.gestao.negocios.Servicos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroServicosDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void salvar(Servicos servico ){
        
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into servicos (tipo_servico,preco_inicial) values(?,?)");
            pst.setString(1, servico.getTipo());
            pst.setDouble(2, servico.getPrecoInicial());          
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
