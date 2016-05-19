package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class ClienteDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    int codPessoaF = 0;
    int codPessoaJ = 0;
    int codContato = 0;
   
    
    public void salvar (ClientePessoaFisica control ){
         conex.conexao();
        try {
            PreparedStatement pstPessoaF = conex.con.prepareStatement("insert into pessoa_fisica (nome,cpf,rg,orgaoexpedidor) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstPessoaF.setString(1, control.getNome());
            pstPessoaF.setString(2, control.getCpf());
            pstPessoaF.setString(3, control.getRg());
            pstPessoaF.setString(4, control.getOex());
            pstPessoaF.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, control.contato.getEndereco());
            pstContato.setString(2, control.contato.getNumero());
            pstContato.setString(3, control.contato.getCep());
            pstContato.setString(4, control.contato.getBairro());
            pstContato.setString(5, control.contato.getCidade());
            pstContato.setString(6, control.contato.getEstado());
            pstContato.setString(7, control.contato.getTefefone());
            pstContato.setString(8, control.contato.getCelular());
            pstContato.setString(9, control.contato.getEmail());
            pstContato.executeUpdate();
            
             ResultSet rs1 = pstPessoaF.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             rs1.next();
             rs2.next();

             codPessoaF = rs1.getInt(1);
             codContato = rs2.getInt(1);
            
            PreparedStatement pstClienteF = conex.con.prepareStatement("insert into cliente_pessoa_fisica (data_cadastro,cod_pessoafisica,cod_contato) values(?,?,?)");
            pstClienteF.setString(1, control.dataFormat(LocalDateTime.now())); 
            pstClienteF.setInt(2, codPessoaF);
            pstClienteF.setInt(3, codContato);
            pstClienteF.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void salvar (ClientePessoaJuridica control ){
         conex.conexao();
        try {
            
            PreparedStatement pstPessoaJ = conex.con.prepareStatement("insert into pessoa_juridica (nome_fantasia,razao_social,cnpj) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);         
            pstPessoaJ.setString(1, control.getNomeFantasia());
            pstPessoaJ.setString(2, control.getRazaoSocial());
            pstPessoaJ.setString(3, control.getCnpj());
            pstPessoaJ.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, control.contato.getEndereco());
            pstContato.setString(2, control.contato.getNumero());
            pstContato.setString(3, control.contato.getCep());
            pstContato.setString(4, control.contato.getBairro());
            pstContato.setString(5, control.contato.getCidade());
            pstContato.setString(6, control.contato.getEstado());
            pstContato.setString(7, control.contato.getTefefone());
            pstContato.setString(8, control.contato.getCelular());
            pstContato.setString(9, control.contato.getEmail());
            pstContato.executeUpdate();
            
             ResultSet rs1 = pstPessoaJ.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             rs1.next();
             rs2.next();

             codPessoaJ = rs1.getInt(1);
             codContato = rs2.getInt(1);
            
            PreparedStatement pstClienteJ = conex.con.prepareStatement("insert into cliente_pessoa_juridica (data_cadastro,cod_pessoaJuridica,cod_contato) values(?,?,?)");
            pstClienteJ.setString(1, control.dataFormat(LocalDateTime.now()));
            pstClienteJ.setInt(2, codPessoaJ);
            pstClienteJ.setInt(3, codContato);
 
            pstClienteJ.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
}
