package br.stylus.funilaria.model.dao.exclusoes;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluiAdministradorDao {
    
    ConexaoBD conex = new ConexaoBD();
    private final String status = "inativo";
    
    public void excluir(Administrador admin){
        
        conex.conexao();
       
        try {
           PreparedStatement pst = conex.con.prepareStatement("update administrador as a\n" +
                    "inner join pessoa_fisica as pf\n" +
                    "on a.cod_pessoafisica = pf.cod_pessoafisica\n" +
                    "inner join contato as c\n" +
                    "on a.cod_contato = c.cod_contato\n" +
                    "set  a.status=? where a.cod_administrador=?");
             pst.setString(1, status);
             pst.setInt(2, admin.getCodAdministrador()); 
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n Erro:" + ex.getMessage());
        }
        
        
        conex.desconecta();
    }
    
}
