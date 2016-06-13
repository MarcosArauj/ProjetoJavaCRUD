package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditaFuncionarioDao {
    
    ConexaoBD conex = new  ConexaoBD();
    
    public void editar(Funcionario funcionario){
        
       conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionario as fu\n" +
                    "inner join pessoa_fisica as pf\n" +
                    "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                    "inner join contato as c\n" +
                    "on fu.cod_contato = c.cod_contato\n" +
                    "set  pf.nome=?, pf.cpf=?, pf.rg=?, pf.orgaoexpedidor=?, pf.data_nascimento=?, pf.sexo=?,\n" +
                    " fu.ctps=?, fu.cargo=?, c.endereco=?, c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                    "c.celular=?, c.email=? where fu.cod_funcionario=?");
            
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getRg());
            pst.setString(4, funcionario.getOex());
            pst.setString(5, funcionario.getNascimento());
            pst.setString(6, funcionario.getSexo());
            
            pst.setString(7, funcionario.getCtps());
            pst.setString(8, funcionario.getCargo());
            
            pst.setString(9, funcionario.contato.getEndereco());
            pst.setString(10, funcionario.contato.getNumero());
            pst.setString(11, funcionario.contato.getCep());
            pst.setString(12, funcionario.contato.getBairro());
            pst.setString(13, funcionario.contato.getCidade());
            pst.setString(14, funcionario.contato.getEstado());
            pst.setString(15, funcionario.contato.getTefefone());
            pst.setString(16, funcionario.contato.getCelular());
            pst.setString(17, funcionario.contato.getEmail());
            pst.setInt(18, funcionario.getCodFuncionario());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Funcionário!\n Erro:" + ex);
            System.out.println(ex);
        }
       
       conex.desconecta();
    }
    
    
}
