package br.stylus.funilaria.model.persistencia.pesquisas;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaClientePfDao {
    
       ConexaoBD conex  = new ConexaoBD();
    
    public ClientePessoaFisica pesquisaNome (ClientePessoaFisica nome){
        conex.conexao();
        
         conex.executaSql("select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.nome like '"+nome.getPesquisaCientePf()+"%'");
        try {
            conex.rs.first();
            nome.setCodClienteF(conex.rs.getInt("cod_cliente"));
            nome.setNome(conex.rs.getString("nome"));
            nome.setCpf(conex.rs.getString("cpf"));
            nome.setRg(conex.rs.getString("rg"));
            nome.setOex(conex.rs.getString("orgaoexpedidor"));
            nome.setNascimento(conex.rs.getString("data_nascimento"));
            nome.setSexo(conex.rs.getString("sexo"));
            nome.contato.setEndereco(conex.rs.getString("endereco"));
            nome.contato.setNumero(conex.rs.getString("numero"));
            nome.contato.setCep(conex.rs.getString("cep"));
            nome.contato.setBairro(conex.rs.getString("bairro"));
            nome.contato.setCidade(conex.rs.getString("cidade"));
            nome.contato.setEstado(conex.rs.getString("estado"));
            nome.contato.setTefefone(conex.rs.getString("telefone"));
            nome.contato.setCelular(conex.rs.getString("celular"));
            nome.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não Cadastrado!");
        }
        
        conex.desconecta();
        return nome;
    }
    
       public ClientePessoaFisica pesquisaCpf (ClientePessoaFisica cpf){
        conex.conexao();
        
         conex.executaSql("select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.cpf like '"+cpf.getPesquisaCientePf()+"%'");
        try {
            conex.rs.first();
            cpf.setCodClienteF(conex.rs.getInt("cod_cliente"));
            cpf.setNome(conex.rs.getString("nome"));
            cpf.setCpf(conex.rs.getString("cpf"));
            cpf.setRg(conex.rs.getString("rg"));
            cpf.setOex(conex.rs.getString("orgaoexpedidor"));
            cpf.setNascimento(conex.rs.getString("data_nascimento"));
            cpf.setSexo(conex.rs.getString("sexo"));
            cpf.contato.setEndereco(conex.rs.getString("endereco"));
            cpf.contato.setNumero(conex.rs.getString("numero"));
            cpf.contato.setCep(conex.rs.getString("cep"));
            cpf.contato.setBairro(conex.rs.getString("bairro"));
            cpf.contato.setCidade(conex.rs.getString("cidade"));
            cpf.contato.setEstado(conex.rs.getString("estado"));
            cpf.contato.setTefefone(conex.rs.getString("telefone"));
            cpf.contato.setCelular(conex.rs.getString("celular"));
            cpf.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não Cadastrado!");
        }
        
        conex.desconecta();
        return cpf;
    }
       
            public ClientePessoaFisica pesquisaSexo (ClientePessoaFisica sexo){
        conex.conexao();
        
         conex.executaSql("select cli.cod_cliente, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from cliente_pessoa_fisica cli\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on cli.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                          "on cli.cod_contato = c.cod_contato where pf.sexo like '"+sexo.getPesquisaCientePf()+"%'");
        try {
            conex.rs.first();
            sexo.setCodClienteF(conex.rs.getInt("cod_cliente"));
            sexo.setNome(conex.rs.getString("nome"));
            sexo.setCpf(conex.rs.getString("cpf"));
            sexo.setRg(conex.rs.getString("rg"));
            sexo.setOex(conex.rs.getString("orgaoexpedidor"));
            sexo.setNascimento(conex.rs.getString("data_nascimento"));
            sexo.setSexo(conex.rs.getString("sexo"));
            sexo.contato.setEndereco(conex.rs.getString("endereco"));
            sexo.contato.setNumero(conex.rs.getString("numero"));
            sexo.contato.setCep(conex.rs.getString("cep"));
            sexo.contato.setBairro(conex.rs.getString("bairro"));
            sexo.contato.setCidade(conex.rs.getString("cidade"));
            sexo.contato.setEstado(conex.rs.getString("estado"));
            sexo.contato.setTefefone(conex.rs.getString("telefone"));
            sexo.contato.setCelular(conex.rs.getString("celular"));
            sexo.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não Cadastrado!");
        }
        
        conex.desconecta();
        return sexo;
    }
    
}
