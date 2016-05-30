package br.stylus.funilaria.model.persistencia.pesquisas;

import br.stylus.funilaria.controller.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaFornecedorDao {
    
      ConexaoBD conex = new ConexaoBD();
    
    public Fornecedor pesquisaFronecedor(Fornecedor nomeFantasia){
        conex.conexao();
        
         conex.executaSql("select f.cod_fornecedor, pj.nome_fantasia, pj.razao_social, pj.cnpj,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from fornecedor as f\n" +
                          "inner join pessoa_juridica as pj\n" +
                          "on f.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                          "inner join contato as c\n" +
                          "on f.cod_contato = c.cod_contato where pj.nome_fantasia like '"+nomeFantasia.getPesquisaFor()+"%'");
        try {
            conex.rs.first();
            nomeFantasia.setCodFornecedor(conex.rs.getInt("cod_fornecedor"));
            nomeFantasia.setNomeFantasia(conex.rs.getString("nome_fantasia"));
            nomeFantasia.setRazaoSocial(conex.rs.getString("razao_social"));
            nomeFantasia.setCnpj(conex.rs.getString("cnpj"));
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
            JOptionPane.showMessageDialog(null, "Fornecedor não Cadastrado!");
        }
        
        conex.desconecta();
        return nomeFantasia;
    }
    
}
