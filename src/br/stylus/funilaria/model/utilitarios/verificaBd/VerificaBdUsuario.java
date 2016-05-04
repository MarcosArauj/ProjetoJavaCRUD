package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestaopessoa.fisica.Usuario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdUsuario {
    
    Usuario usu = new Usuario();
    
public static boolean verificaNomeUsu(Usuario nome){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where nome_usuario='" +nome.getNomeUsuario()+ "'");
         conex.rs.first();
         if(conex.rs.getString("nome_usuario").equals(nome.getNomeUsuario())) {
             nome.setNomeUsuario(conex.rs.getString("nome_usuario"));
             JOptionPane.showMessageDialog(null, "USUÁRIO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }

public static boolean verificaTipo(Usuario tipo){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where tipo='" +tipo.getTipo()+ "'");
         conex.rs.first();
         if(conex.rs.getString("tipo").equals("Administrador")) {
             tipo.setTipo(conex.rs.getString("tipo"));
             JOptionPane.showMessageDialog(null, "Usuário ADMINISTRADOR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
}
