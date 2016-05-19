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
    
    public void salvar(Administrador control ){
        
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
  
            PreparedStatement pstUsuario = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo,senha) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstUsuario.setString(1, control.usuario.getNomeUsuario());
            pstUsuario.setString(2, control.usuario.getTipo()); 
            pstUsuario.setString(3, control.usuario.getSenha());
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
            pstAdmin.setString(1, control.getNascimento());
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
