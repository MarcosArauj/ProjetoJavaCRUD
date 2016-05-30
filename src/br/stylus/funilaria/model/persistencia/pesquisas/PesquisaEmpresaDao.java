package br.stylus.funilaria.model.persistencia.pesquisas;

import br.stylus.funilaria.controller.gestao.pessoa.juridica.Empresa;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaEmpresaDao {
    
    ConexaoBD conex  = new ConexaoBD();
    
    public Empresa pesquisaEmpresa(Empresa empresa){
        conex.conexao();
        
         conex.executaSql("select e.cod_empresa, pj.nome_fantasia, pj.razao_social, pj.cnpj, e.inscr_municipal, e.inscr_estadual,\n" +
                          "c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                           "from empresa as e\n" +
                           "inner join pessoa_juridica as pj\n" +
                           "on e.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                           "inner join contato as c\n" +
                           "on e.cod_contato = c.cod_contato where pj.nome_fantasia like '"+empresa.getPesquisaEmpresa()+"%'");
        try {
            conex.rs.first();
            empresa.setCodEmpresa(conex.rs.getInt("cod_empresa"));
            empresa.setNomeFantasia(conex.rs.getString("nome_fantasia"));
            empresa.setRazaoSocial(conex.rs.getString("razao_social"));
            empresa.setCnpj(conex.rs.getString("cnpj"));
            empresa.setInscricaoMunicipal(conex.rs.getString("inscr_municipal"));
            empresa.setInscricaoEstadual(conex.rs.getString("inscr_estadual"));
            empresa.contato.setEndereco(conex.rs.getString("endereco"));
            empresa.contato.setNumero(conex.rs.getString("numero"));
            empresa.contato.setCep(conex.rs.getString("cep"));
            empresa.contato.setBairro(conex.rs.getString("bairro"));
            empresa.contato.setCidade(conex.rs.getString("cidade"));
            empresa.contato.setEstado(conex.rs.getString("estado"));
            empresa.contato.setTefefone(conex.rs.getString("telefone"));
            empresa.contato.setCelular(conex.rs.getString("celular"));
            empresa.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Empresa não Cadastrado!");
        }
        
        conex.desconecta();
        return empresa;
        
    }
    
}
