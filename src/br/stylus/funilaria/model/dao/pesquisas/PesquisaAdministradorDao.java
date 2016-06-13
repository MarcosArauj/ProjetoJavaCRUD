package br.stylus.funilaria.model.dao.pesquisas;

import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisaAdministradorDao {
    
    ConexaoBD conex  = new ConexaoBD();
    
    public Administrador pesquisaAdmin(Administrador admin){
        conex.conexao();
        
         conex.executaSql("select a.cod_administrador, pf.nome, pf.cpf, pf.rg, pf.orgaoexpedidor, pf.data_nascimento, pf.sexo,\n" +
                           "a.status,c.endereco, c.numero, c.cep, c.bairro, c.cidade, c.estado, c.telefone, c.celular, c.email\n" +
                           "from administrador as a\n" +
                           "inner join pessoa_fisica as pf\n" +
                           "on a.cod_pessoafisica = pf.cod_pessoafisica\n" +
                            "inner join contato as c\n" +
                            "on a.cod_contato = c.cod_contato where pf.nome = '"+admin.getPesquisaAdmin()+"'");
        try {
            
            conex.rs.first();
            admin.setCodAdministrador(conex.rs.getInt("cod_administrador"));
            admin.setNome(conex.rs.getString("nome"));
            admin.setCpf(conex.rs.getString("cpf"));
            admin.setRg(conex.rs.getString("rg"));
            admin.setOex(conex.rs.getString("orgaoexpedidor"));
            admin.setNascimento(conex.rs.getString("data_nascimento"));
            admin.setSexo(conex.rs.getString("sexo"));
            admin.setStatus(conex.rs.getString("status"));
            admin.contato.setEndereco(conex.rs.getString("endereco"));
            admin.contato.setNumero(conex.rs.getString("numero"));
            admin.contato.setCep(conex.rs.getString("cep"));
            admin.contato.setBairro(conex.rs.getString("bairro"));
            admin.contato.setCidade(conex.rs.getString("cidade"));
            admin.contato.setEstado(conex.rs.getString("estado"));
            admin.contato.setTefefone(conex.rs.getString("telefone"));
            admin.contato.setCelular(conex.rs.getString("celular"));
            admin.contato.setEmail(conex.rs.getString("email"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Administrador não Cadastrado!");
        }
        
        conex.desconecta();
        return admin;
    }
}
