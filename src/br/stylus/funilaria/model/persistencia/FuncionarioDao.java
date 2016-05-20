package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    
     ConexaoBD conex = new ConexaoBD();

    int codPessoaF = 0;
    int codContato = 0;
    int codUsuario = 0;
     
     public void salvar(Funcionario funcionario){
        conex.conexao();
        try {
            
            PreparedStatement pstPessoaF = conex.con.prepareStatement("insert into pessoa_fisica (nome,cpf,rg,orgaoexpedidor) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstPessoaF.setString(1, funcionario.getNome());
            pstPessoaF.setString(2, funcionario.getCpf());
            pstPessoaF.setString(3, funcionario.getRg());
            pstPessoaF.setString(4, funcionario.getOex());
            pstPessoaF.executeUpdate();
            
            PreparedStatement pstContato = conex.con.prepareStatement("insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstContato.setString(1, funcionario.contato.getEndereco());
            pstContato.setString(2, funcionario.contato.getNumero());
            pstContato.setString(3, funcionario.contato.getCep());
            pstContato.setString(4, funcionario.contato.getBairro());
            pstContato.setString(5, funcionario.contato.getCidade());
            pstContato.setString(6, funcionario.contato.getEstado());
            pstContato.setString(7, funcionario.contato.getTefefone());
            pstContato.setString(8, funcionario.contato.getCelular());
            pstContato.setString(9, funcionario.contato.getEmail());
            pstContato.executeUpdate();
            
            PreparedStatement pstUsuario = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo,senha) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            pstUsuario.setString(1, funcionario.usuario.getNomeUsuario());
            pstUsuario.setString(2, funcionario.usuario.getTipo()); 
            pstUsuario.setString(3, funcionario.usuario.getSenha());
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
            
            PreparedStatement pstFuncionario = conex.con.prepareStatement("insert into funcionario (data_nascimento,ctps,cargo,data_admissao,cod_pessoafisica,cod_contato,cod_usuario) values(?,?,?,?,?,?,?)");
            pstFuncionario.setString(1, funcionario.getNascimento());
            pstFuncionario.setString(2, funcionario.getCtps());
            pstFuncionario.setString(3, funcionario.getCargo());
            pstFuncionario.setString(4, funcionario.dataFormat(LocalDateTime.now()));
            pstFuncionario.setInt(5, codPessoaF);
            pstFuncionario .setInt(6, codContato);
            pstFuncionario .setInt(7, codUsuario);
            pstFuncionario.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
