package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.Usuario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {
        
    ConexaoBD conex = new ConexaoBD();
    Usuario control = new Usuario();
    
    public void salvar(Usuario control){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo,senha) values(?,?,?)");
            pst.setString(1, control.getNomeUsuario());
            pst.setString(2, control.getTipo());
            pst.setString(3, control.getSenha());
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
}
