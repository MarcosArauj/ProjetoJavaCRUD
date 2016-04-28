package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestaopessoa.fisica.Usuario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {
        
    ConexaoBD conex = new ConexaoBD();
    Usuario mod = new Usuario();
    
    public void Salvar(Usuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo,senha) values(?,?,?)");
            pst.setString(1, mod.getNomeUsuario());
            pst.setString(2, mod.getTipo());
            pst.setString(3, mod.getSenha());
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
}
