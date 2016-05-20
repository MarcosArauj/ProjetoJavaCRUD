package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdministradorDao {
    
    ConexaoBD conex = new ConexaoBD();
    
     int codPessoaF = 0;
     int codContato  = 0;
     int codUsuario = 0;
    
    public void salvar(Administrador administrador ){
        
         conex.conexao();
        try {
            
            PreparedStatement pstPessoaF = conex.con.prepareStatement("insert into pessoa_fisica (nome,cpf,rg,orgaoexpedidor) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstPessoaF.setString(1, administrador.getNome());
            pstPessoaF.setString(2, administrador.getCpf());
            pstPessoaF.setString(3, administrador.getRg());
            pstPessoaF.setString(4, administrador.getOex());
            pstPessoaF.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, administrador.contato.getEndereco());
            pstContato.setString(2, administrador.contato.getNumero());
            pstContato.setString(3, administrador.contato.getCep());
            pstContato.setString(4, administrador.contato.getBairro());
            pstContato.setString(5, administrador.contato.getCidade());
            pstContato.setString(6, administrador.contato.getEstado());
            pstContato.setString(7, administrador.contato.getTefefone());
            pstContato.setString(8, administrador.contato.getCelular());
            pstContato.setString(9, administrador.contato.getEmail());
            pstContato.executeUpdate();
  
            PreparedStatement pstUsuario = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo,senha) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstUsuario.setString(1, administrador.usuario.getNomeUsuario());
            pstUsuario.setString(2, administrador.usuario.getTipo()); 
            pstUsuario.setString(3, administrador.usuario.getSenha());
            pstUsuario.executeUpdate();
            
             ResultSet rs1 = pstPessoaF.getGeneratedKeys();
             ResultSet rs2 = pstContato.getGeneratedKeys();
             ResultSet rs3 = pstUsuario.getGeneratedKeys();
             rs1.next();
             rs2.next();
             rs3.next();

             codPessoaF = rs1.getInt(1);
             codContato = rs2.getInt(1);
             codUsuario = rs3.getInt(1);
            
            PreparedStatement pstAdmin = conex.con.prepareStatement("insert into administrador (data_nascimento,cod_pessoafisica,cod_contato,cod_usuario) values(?,?,?,?)");
            pstAdmin.setString(1, administrador.getNascimento());
            pstAdmin.setInt(2, codPessoaF);
            pstAdmin.setInt(3, codContato);
            pstAdmin.setInt(4, codUsuario);
            pstAdmin.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
}
