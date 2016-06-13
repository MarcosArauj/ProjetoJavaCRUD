package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaFornecedorDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void editar(Fornecedor fornecedor){
        
        conex.conexao();
        
            
        try {
            PreparedStatement pst = conex.con.prepareStatement("update fornecedor as fo\n" +
                                                "inner join pessoa_juridica as pj\n" +
                                                "on fo.cod_pessoajuridica = pj.cod_pessoajuridica\n" +
                                                "inner join contato as c\n" +
                                                "on fo.cod_contato = c.cod_contato\n" +
                                                "set  pj.nome_fantasia=?, pj.razao_social=?, pj.cnpj=?,c.endereco=?,\n" +
                                                " c.numero=?, c.cep=?, c.bairro=?, c.cidade=?, c.estado=?, c.telefone=?,\n" +
                                                "c.celular=?, c.email=? where fo.cod_fornecedor=?");
     
            pst.setString(1, fornecedor.getNomeFantasia());
            pst.setString(2, fornecedor.getRazaoSocial());
            pst.setString(3, fornecedor.getCnpj());
            
            pst.setString(4, fornecedor.contato.getEndereco());
            pst.setString(5, fornecedor.contato.getNumero());
            pst.setString(6, fornecedor.contato.getCep());
            pst.setString(7, fornecedor.contato.getBairro());
            pst.setString(8, fornecedor.contato.getCidade());
            pst.setString(9, fornecedor.contato.getEstado());
            pst.setString(10, fornecedor.contato.getTefefone());
            pst.setString(11, fornecedor.contato.getCelular());
            pst.setString(12, fornecedor.contato.getEmail());
            pst.setInt(13, fornecedor.getCodFornecedor());           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Fornecedor!\n Erro:" + ex);
        }
        conex.desconecta();
        
    }
    
}
