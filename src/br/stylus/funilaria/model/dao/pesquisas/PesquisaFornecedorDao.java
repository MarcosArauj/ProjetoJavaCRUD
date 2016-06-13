package br.stylus.funilaria.model.dao.pesquisas;

import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaFornecedorDao {
    
      ConexaoBD conex = new ConexaoBD();
    
    public Fornecedor pesquisaFronecedor(Fornecedor nomeFantasia){
        conex.conexao();
        
         conex.executaSql("select fo.cod_fornecedor, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "fo.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from fornecedor as fo\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on fo.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on fo.cod_contato = c.cod_contato where pj.nome_fantasia ='"+nomeFantasia.getPesquisaFor()+"'");
        try {
            conex.rs.first();
            nomeFantasia.setCodFornecedor(conex.rs.getInt("cod_fornecedor"));
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
            
        }
        
        conex.desconecta();
        return nomeFantasia;
    }
    
}
