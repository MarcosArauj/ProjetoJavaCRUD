
package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.ClientePessoaFisica;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaClientePfDao {
    
    ConexaoBD conex =new ConexaoBD();
    
    public void editar( ClientePessoaFisica cliente ){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente_pessoa_fisica as cli\n" +
                    "inner join pessoa_fisica as pf\n" +
                    "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                    "inner join contato as c\n" +
                    "on cli.cod_contato = c.cod_contato\n" +
                    "set  pf.nome=?, pf.cpf=?, pf.rg=?, pf.orgaoexpedidor=?, pf.data_nascimento=?, pf.sexo=?,\n" +
                    "c.endereco=?, c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                    "c.celular=?, c.email=? where cli.cod_cliente=?");
            
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getCpf());
            pst.setString(3, cliente.getRg());
            pst.setString(4, cliente.getOex());
            pst.setString(5, cliente.getNascimento());
            pst.setString(6, cliente.getSexo());
            
            pst.setString(7, cliente.contato.getEndereco());
            pst.setString(8, cliente.contato.getNumero());
            pst.setString(9, cliente.contato.getCep());
            pst.setString(10, cliente.contato.getBairro());
            pst.setString(11, cliente.contato.getCidade());
            pst.setString(12, cliente.contato.getEstado());
            pst.setString(13, cliente.contato.getTefefone());
            pst.setString(14, cliente.contato.getCelular());
            pst.setString(15, cliente.contato.getEmail());
            pst.setInt(16, cliente.getCodClienteF());           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Cliente!\n Erro:" + ex);
        }
        
        conex.desconecta();
        
    }
}
