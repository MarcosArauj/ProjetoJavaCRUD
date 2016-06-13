package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Empresa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiEmpresaDao {
    
    ConexaoBD conex = new ConexaoBD();
    private final String status = "inativo";
    public void excluir(Empresa empresa){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update empresa as e\n" +
                    "inner join pessoa_juridica as pj\n" +
                    "on e.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                    "inner join contato as c\n" +
                    "on e.cod_contato = c.cod_contato\n" +
                    "set e.status=? where e.cod_empresa=?");
             pst.setString(1, status);
             pst.setInt(2, empresa.getCodEmpresa()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
}
