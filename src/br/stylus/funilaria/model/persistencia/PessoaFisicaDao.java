package br.stylus.funilaria.model.persistencia;




import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.stylus.funilaria.controller.gestaopessoa.fisica.PessoaFisica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PessoaFisicaDao {
    
     ConexaoBD conex = new ConexaoBD();
     PessoaFisica mod = new PessoaFisica();
    
    public void Salvar(PessoaFisica mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pessoafisica (nome,cpf,rg,orgaoexpedidor,data_nascimento) values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getRg());
            pst.setString(4,mod.getOex());
            pst.setString(5,mod.getNascimento());
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
