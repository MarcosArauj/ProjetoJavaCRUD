package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.juridica.Empresa;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EmpresaDao {
    
    ConexaoBD conex = new ConexaoBD();
 
    
     int codPessoaJ = 0;
     int codContato  = 0;
    
    public void salvar(Empresa empresa) {
        conex.conexao();
             
        try {
            PreparedStatement pstPessoaJuridica = conex.con.prepareStatement("insert into pessoa_juridica (nome_fantasia,razao_social,cnpj) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);         
            pstPessoaJuridica.setString(1, empresa.getNomeFantasia());
            pstPessoaJuridica.setString(2, empresa.getRazaoSocial());
            pstPessoaJuridica.setString(3, empresa.getCnpj());
            pstPessoaJuridica.executeUpdate();
    
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, empresa.contato.getEndereco());
            pstContato.setString(2, empresa.contato.getNumero());
            pstContato.setString(3, empresa.contato.getCep());
            pstContato.setString(4, empresa.contato.getBairro());
            pstContato.setString(5, empresa.contato.getCidade());
            pstContato.setString(6, empresa.contato.getEstado());
            pstContato.setString(7, empresa.contato.getTefefone());
            pstContato.setString(8, empresa.contato.getCelular());
            pstContato.setString(9, empresa.contato.getEmail());
            pstContato.executeUpdate();
      
           //  if ((pstPessoaJuridica.executeUpdate() > 0 )||( pstContato.executeUpdate() > 0 )){
                
                  ResultSet rs1 = pstPessoaJuridica.getGeneratedKeys();
                  ResultSet rs2 = pstContato.getGeneratedKeys();
                  rs1.next();
                  rs2.next();

                  codPessoaJ = rs1.getInt(1);
                  codContato = rs2.getInt(1);
            
            PreparedStatement pstEmpresa = conex.con.prepareStatement("insert into empresa (inscr_municipal,inscr_estadual,cod_pessoajuridica,cod_contato) values(?,?,?,?)");         
            pstEmpresa.setString(1, empresa.getInscricaoMunicipal());
            pstEmpresa.setString(2, empresa.getInscricaoEstadual());
            pstEmpresa.setInt(3, codPessoaJ);
            pstEmpresa.setInt(4, codContato);
           // pstEmpresa.execute();
            pstEmpresa.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();    
    }
    
}
