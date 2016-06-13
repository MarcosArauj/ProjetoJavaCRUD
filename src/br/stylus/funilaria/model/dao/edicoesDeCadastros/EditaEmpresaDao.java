package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Empresa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditaEmpresaDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void editar(Empresa empresa){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update empresa as e\n" +
                    "inner join pessoa_juridica as pj\n" +
                    "on e.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                    "inner join contato as c\n" +
                    "on e.cod_contato = c.cod_contato\n" +
                    "set  pj.nome_fantasia=?, pj.razao_social=?, pj.cnpj=?, e.inscr_municipal=?, e.inscr_estadual=?,\n" +
                    "c.endereco=?, c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                    "c.celular=?, c.email=? where e.cod_empresa=?");
            
            pst.setString(1, empresa.getNomeFantasia());
            pst.setString(2, empresa.getRazaoSocial());
            pst.setString(3, empresa.getCnpj());
            
            pst.setString(4, empresa.getInscricaoMunicipal());
            pst.setString(5, empresa.getInscricaoEstadual());
            
            pst.setString(6, empresa.contato.getEndereco());
            pst.setString(7, empresa.contato.getNumero());
            pst.setString(8, empresa.contato.getCep());
            pst.setString(9, empresa.contato.getBairro());
            pst.setString(10, empresa.contato.getCidade());
            pst.setString(11, empresa.contato.getEstado());
            pst.setString(12, empresa.contato.getTefefone());
            pst.setString(13, empresa.contato.getCelular());
            pst.setString(14, empresa.contato.getEmail());
            pst.setInt(15, empresa.getCodEmpresa());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Empresa!\n Erro:" + ex);
        }
        conex.desconecta();
    }
    
}
