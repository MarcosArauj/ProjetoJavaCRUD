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
   
    
    public void salvar (ClientePessoaFisica clienteFisico ){
         conex.conexao();
        try {
            PreparedStatement pstPessoaF = conex.con.prepareStatement("insert into pessoa_fisica (nome,cpf,rg,orgaoexpedidor) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstPessoaF.setString(1, clienteFisico.getNome());
            pstPessoaF.setString(2, clienteFisico.getCpf());
            pstPessoaF.setString(3, clienteFisico.getRg());
            pstPessoaF.setString(4, clienteFisico.getOex());
            pstPessoaF.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, clienteFisico.contato.getEndereco());
            pstContato.setString(2, clienteFisico.contato.getNumero());
            pstContato.setString(3, clienteFisico.contato.getCep());
            pstContato.setString(4, clienteFisico.contato.getBairro());
            pstContato.setString(5, clienteFisico.contato.getCidade());
            pstContato.setString(6, clienteFisico.contato.getEstado());
            pstContato.setString(7, clienteFisico.contato.getTefefone());
            pstContato.setString(8, clienteFisico.contato.getCelular());
            pstContato.setString(9, clienteFisico.contato.getEmail());
            pstContato.executeUpdate();
            
             ResultSet rs1 = pstPessoaF.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             rs1.next();
             rs2.next();

             codPessoaF = rs1.getInt(1);
             codContato = rs2.getInt(1);
            
            PreparedStatement pstClienteF = conex.con.prepareStatement("insert into cliente_pessoa_fisica (data_cadastro,cod_pessoafisica,cod_contato) values(?,?,?)");
            pstClienteF.setString(1, clienteFisico.dataFormat(LocalDateTime.now())); 
            pstClienteF.setInt(2, codPessoaF);
            pstClienteF.setInt(3, codContato);
            pstClienteF.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void salvar (ClientePessoaJuridica clienteJuridico ){
         conex.conexao();
        try {
            
            PreparedStatement pstPessoaJ = conex.con.prepareStatement("insert into pessoa_juridica (nome_fantasia,razao_social,cnpj) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);         
            pstPessoaJ.setString(1, clienteJuridico.getNomeFantasia());
            pstPessoaJ.setString(2, clienteJuridico.getRazaoSocial());
            pstPessoaJ.setString(3, clienteJuridico.getCnpj());
            pstPessoaJ.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, clienteJuridico.contato.getEndereco());
            pstContato.setString(2, clienteJuridico.contato.getNumero());
            pstContato.setString(3, clienteJuridico.contato.getCep());
            pstContato.setString(4, clienteJuridico.contato.getBairro());
            pstContato.setString(5, clienteJuridico.contato.getCidade());
            pstContato.setString(6, clienteJuridico.contato.getEstado());
            pstContato.setString(7, clienteJuridico.contato.getTefefone());
            pstContato.setString(8, clienteJuridico.contato.getCelular());
            pstContato.setString(9, clienteJuridico.contato.getEmail());
            pstContato.executeUpdate();
            
             ResultSet rs1 = pstPessoaJ.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             rs1.next();
             rs2.next();

             codPessoaJ = rs1.getInt(1);
             codContato = rs2.getInt(1);
            
            PreparedStatement pstClienteJ = conex.con.prepareStatement("insert into cliente_pessoa_juridica (data_cadastro,cod_pessoaJuridica,cod_contato) values(?,?,?)");
            pstClienteJ.setString(1, clienteJuridico.dataFormat(LocalDateTime.now()));
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
