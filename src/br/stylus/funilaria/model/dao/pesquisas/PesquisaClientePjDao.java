package br.stylus.funilaria.model.dao.pesquisas;

import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaClientePjDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public ClientePessoaJuridica pesquisaCLientePj(ClientePessoaJuridica nomeFantasia){
        conex.conexao();
        
         conex.executaSql("select cli.cod_cliente, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "cli.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_juridica cli\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on cli.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pj.nome_fantasia ='"+nomeFantasia.getPesquisaClientePj()+"'");
        try {
            conex.rs.first();
            nomeFantasia.setCodClienteJ(conex.rs.getInt("cod_cliente"));
            nomeFantasia.setNomeFantasia(conex.rs.getString("nome_fantasia"));
            nomeFantasia.setRazaoSocial(conex.rs.getString("razao_social"));
            nomeFantasia.setCnpj(conex.rs.getString("cnpj"));
            nomeFantasia.setStatus(conex.rs.getString("status"));
            nomeFantasia.contato.setEndereco(conex.rs.getString("endereco"));
            nomeFantasia.contato.setNumero(conex.rs.getString("numero"));
            nomeFantasia.contato.setCep(conex.rs.getString("cep"));
            nomeFantasia.contato.setBairro(conex.rs.getString("bairro"));
            nomeFantasia.contato.setCidade(conex.rs.getString("cidade"));
            nomeFantasia.contato.setEstado(conex.rs.getString("estado"));
            nomeFantasia.contato.setTefefone(conex.rs.getString("telefone"));
            nomeFantasia.contato.setCelular(conex.rs.getString("celular"));
            nomeFantasia.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não Cadastrado!");
        }
        
        conex.desconecta();
        return nomeFantasia;
    }
    
}
