package br.stylus.funilaria.model.persistencia;


import br.stylus.funilaria.controller.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class FornecedorDao {
    
     ConexaoBD conex = new ConexaoBD();
     
      int codPessoaJ = 0;
      int codContato = 0;
    
    public void salvar (Fornecedor fornecedor ){
         conex.conexao();
        try {
            
            PreparedStatement pstPessoaJ = conex.con.prepareStatement("insert into pessoa_juridica (nome_fantasia,razao_social,cnpj) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);         
            pstPessoaJ.setString(1, fornecedor.getNomeFantasia());
            pstPessoaJ.setString(2, fornecedor.getRazaoSocial());
            pstPessoaJ.setString(3, fornecedor.getCnpj());
            pstPessoaJ.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, fornecedor.contato.getEndereco());
            pstContato.setString(2, fornecedor.contato.getNumero());
            pstContato.setString(3, fornecedor.contato.getCep());
            pstContato.setString(4, fornecedor.contato.getBairro());
            pstContato.setString(5, fornecedor.contato.getCidade());
            pstContato.setString(6, fornecedor.contato.getEstado());
            pstContato.setString(7, fornecedor.contato.getTefefone());
            pstContato.setString(8, fornecedor.contato.getCelular());
            pstContato.setString(9, fornecedor.contato.getEmail());
            pstContato.executeUpdate();
            
             ResultSet rs1 = pstPessoaJ.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             rs1.next();
             rs2.next();

             codPessoaJ = rs1.getInt(1);
             codContato = rs2.getInt(1);
            
            PreparedStatement pstFornecedor = conex.con.prepareStatement("insert into fornecedor (data_cadastro,cod_pessoajuridica,cod_contato) values(?,?,?)");
            pstFornecedor.setString(1, fornecedor.dataFormat(LocalDateTime.now())); 
            pstFornecedor.setInt(2, codPessoaJ);
            pstFornecedor.setInt(3, codContato);
            pstFornecedor.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
