package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaAdministradorDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void editar(Administrador admin){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update administrador as a\n" +
                                                "inner join pessoa_fisica as pf\n" +
                                                "on a.cod_pessoafisica = pf.cod_pessoafisica\n" +
                                                "inner join contato as c\n" +
                                                "on a.cod_contato = c.cod_contato\n" +
                                                "set  pf.nome=?, pf.cpf=?, pf.rg=?, pf.orgaoexpedidor=?, pf.data_nascimento=?, pf.sexo=?,\n" +
                                                "c.endereco=?, c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                                                "c.celular=?, c.email=? where a.cod_administrador=?");
            pst.setString(1, admin.getNome());
            pst.setString(2, admin.getCpf());
            pst.setString(3, admin.getRg());
            pst.setString(4, admin.getOex());
            pst.setString(5, admin.getNascimento());
            pst.setString(6, admin.getSexo());
            
            pst.setString(7, admin.contato.getEndereco());
            pst.setString(8, admin.contato.getNumero());
            pst.setString(9, admin.contato.getCep());
            pst.setString(10, admin.contato.getBairro());
            pst.setString(11, admin.contato.getCidade());
            pst.setString(12, admin.contato.getEstado());
            pst.setString(13, admin.contato.getTefefone());
            pst.setString(14, admin.contato.getCelular());
            pst.setString(15, admin.contato.getEmail());
            pst.setInt(16, admin.getCodAdministrador());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Administrador!\n Erro:" + ex);
        }
        
        conex.desconecta();
    }
    
}
