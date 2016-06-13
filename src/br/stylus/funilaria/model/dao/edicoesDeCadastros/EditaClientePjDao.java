package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.ClientePessoaJuridica;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaClientePjDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void editar(ClientePessoaJuridica cliente){
        
        conex.conexao();
        
            
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente_pessoa_juridica as cli\n" +
                                                "inner join pessoa_juridica as pj\n" +
                                                "on cli.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                                                "inner join contato as c\n" +
                                                "on cli.cod_contato = c.cod_contato\n" +
                                                "set  pj.nome_fantasia=?, pj.razao_social=?, pj.cnpj=?,c.endereco=?,\n" +
                                                " c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                                                "c.celular=?, c.email=? where cli.cod_cliente=?");
     
            pst.setString(1, cliente.getNomeFantasia());
            pst.setString(2, cliente.getRazaoSocial());
            pst.setString(3, cliente.getCnpj());
            
            pst.setString(4, cliente.contato.getEndereco());
            pst.setString(5, cliente.contato.getNumero());
            pst.setString(6, cliente.contato.getCep());
            pst.setString(7, cliente.contato.getBairro());
            pst.setString(8, cliente.contato.getCidade());
            pst.setString(9, cliente.contato.getEstado());
            pst.setString(10, cliente.contato.getTefefone());
            pst.setString(11, cliente.contato.getCelular());
            pst.setString(12, cliente.contato.getEmail());
            pst.setInt(13, cliente.getCodClienteJ());           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Cliente!\n Erro:" + ex);
        }
        conex.desconecta();
        
    }
    
}
