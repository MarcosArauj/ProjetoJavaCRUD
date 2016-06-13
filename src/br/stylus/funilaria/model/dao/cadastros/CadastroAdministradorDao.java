package br.stylus.funilaria.model.dao.cadastros;

import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CadastroAdministradorDao implements CadastrarDados{
    
    ConexaoBD conex = new ConexaoBD();
    
     int codPessoaF = 0;
     int codContato  = 0;
     int codUsuario = 0;
     
     String status = "ativo";
    
    public void salvar(Administrador administrador ){
        
         conex.conexao();
        try {
            
            PreparedStatement pstPessoaF = conex.con.prepareStatement(SALVAR_PESSOA_FISICA,Statement.RETURN_GENERATED_KEYS);
            pstPessoaF.setString(1, administrador.getNome());
            pstPessoaF.setString(2, administrador.getCpf());
            pstPessoaF.setString(3, administrador.getRg());
            pstPessoaF.setString(4, administrador.getOex());
            pstPessoaF.setString(5, administrador.getNascimento());
            pstPessoaF.setString(6, administrador.getSexo());
            pstPessoaF.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement(SALVAR_CONTATO,Statement.RETURN_GENERATED_KEYS);
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
  
            PreparedStatement pstUsuario = conex.con.prepareStatement(SALVAR_USUARIO,Statement.RETURN_GENERATED_KEYS);
            pstUsuario.setString(1, administrador.usuario.getNomeUsuario());
            pstUsuario.setString(2, administrador.usuario.getTipo()); 
            pstUsuario.setString(3, administrador.usuario.getSenha());
            pstUsuario.setString(4, status);
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
            
            PreparedStatement pstAdmin = conex.con.prepareStatement(SALVAR_ADMINISTRADOR);
            pstAdmin.setInt(1, codPessoaF);
            pstAdmin.setInt(2, codContato);
            pstAdmin.setInt(3, codUsuario);
            pstAdmin.setString(4, status);
            pstAdmin.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
}
