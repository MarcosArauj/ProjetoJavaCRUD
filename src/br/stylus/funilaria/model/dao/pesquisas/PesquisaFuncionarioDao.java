package br.stylus.funilaria.model.dao.pesquisas;

import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaFuncionarioDao {
    
    
        
    ConexaoBD conex  = new ConexaoBD();
    
    public Funcionario pesquisaNome(Funcionario nome){
        conex.conexao();
        
         conex.executaSql("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where pf.nome ='"+nome.getPesquisaFun()+"'");
        try {
            conex.rs.first();
            nome.setCodFuncionario(conex.rs.getInt("cod_funcionario"));
            nome.setNome(conex.rs.getString("nome"));
            nome.setCpf(conex.rs.getString("cpf"));
            nome.setRg(conex.rs.getString("rg"));
            nome.setOex(conex.rs.getString("orgaoexpedidor"));
            nome.setNascimento(conex.rs.getString("data_nascimento"));
            nome.setSexo(conex.rs.getString("sexo"));
            nome.setCtps(conex.rs.getString("ctps"));
            nome.setCargo(conex.rs.getString("cargo"));
            nome.setStatus(conex.rs.getString("status"));
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
            JOptionPane.showMessageDialog(null, "Funcionário não Cadastrado!");
        }
        
        conex.desconecta();
        return nome;
    }
    
     public Funcionario pesquisaCargo(Funcionario cargo){
        conex.conexao();
        
         conex.executaSql("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where fu.cargo ='"+cargo.getPesquisaFun()+"'");
        try {
            conex.rs.first();
            cargo.setCodFuncionario(conex.rs.getInt("cod_funcionario"));
            cargo.setNome(conex.rs.getString("nome"));
            cargo.setCpf(conex.rs.getString("cpf"));
            cargo.setRg(conex.rs.getString("rg"));
            cargo.setOex(conex.rs.getString("orgaoexpedidor"));
            cargo.setNascimento(conex.rs.getString("data_nascimento"));
            cargo.setSexo(conex.rs.getString("sexo"));
            cargo.setCtps(conex.rs.getString("ctps"));
            cargo.setCargo(conex.rs.getString("cargo"));
            cargo.setStatus(conex.rs.getString("status"));
            cargo.contato.setEndereco(conex.rs.getString("endereco"));
            cargo.contato.setNumero(conex.rs.getString("numero"));
            cargo.contato.setCep(conex.rs.getString("cep"));
            cargo.contato.setBairro(conex.rs.getString("bairro"));
            cargo.contato.setCidade(conex.rs.getString("cidade"));
            cargo.contato.setEstado(conex.rs.getString("estado"));
            cargo.contato.setTefefone(conex.rs.getString("telefone"));
            cargo.contato.setCelular(conex.rs.getString("celular"));
            cargo.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionário não Cadastrado!");
        }
        
        conex.desconecta();
        return cargo;
    }
     
      public Funcionario pesquisaCpf(Funcionario cpf){
        conex.conexao();
        
         conex.executaSql("select fu.cod_funcionario, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                          "fu.ctps, fu.cargo,fu.status, \n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                          "from funcionario as fu\n" +
                          "inner join pessoa_fisica as pf\n" +
                          "on fu.cod_pessoafisica = pf.cod_pessoafisica\n" +
                          "inner join contato as c\n" +
                           "on fu.cod_contato = c.cod_contato where pf.cpf ='"+cpf.getPesquisaFun()+"'");
        try {
            conex.rs.first();
            cpf.setCodFuncionario(conex.rs.getInt("cod_funcionario"));
            cpf.setNome(conex.rs.getString("nome"));
            cpf.setCpf(conex.rs.getString("cpf"));
            cpf.setRg(conex.rs.getString("rg"));
            cpf.setOex(conex.rs.getString("orgaoexpedidor"));
            cpf.setNascimento(conex.rs.getString("data_nascimento"));
            cpf.setSexo(conex.rs.getString("sexo"));
            cpf.setCtps(conex.rs.getString("ctps"));
            cpf.setCargo(conex.rs.getString("cargo"));
            cpf.setStatus(conex.rs.getString("status"));
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
            JOptionPane.showMessageDialog(null, "Funcionário não Cadastrado!");
        }
        
        conex.desconecta();
        return cpf;
    }

}
