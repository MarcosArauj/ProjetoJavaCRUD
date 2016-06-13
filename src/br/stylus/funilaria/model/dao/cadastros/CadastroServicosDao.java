package br.stylus.funilaria.model.dao.cadastros;

import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroServicosDao implements CadastrarDados{
    
    ConexaoBD conex = new ConexaoBD();
    private final String status = "ativo";
    
    public void salvar(Servicos servico ){
        
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement(SALVAR_SERVICO);
            pst.setString(1, servico.getTipo());
            pst.setDouble(2, servico.getPrecoInicial()); 
            pst.setString(3, status);
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
