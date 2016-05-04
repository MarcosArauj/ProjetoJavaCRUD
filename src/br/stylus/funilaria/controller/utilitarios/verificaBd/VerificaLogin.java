package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestaopessoa.fisica.Usuario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaLogin {
   
    Usuario usu = new Usuario();
    
 public static boolean validaUsuarioSenha(Usuario usu) {
     
      ConexaoBD conex = new ConexaoBD();
      conex.conexao();
      try {
            conex.executaSql("select * from usuario where nome_usuario='"+usu.getNomeUsuario()+"'");
            conex.rs.first();
            
            if (conex.rs.getString("senha").equals(usu.getSenha())) {
                usu.setNomeUsuario(conex.rs.getString("nome_usuario"));
                usu.setSenha(conex.rs.getString("senha"));
               return(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha ou Usuário inválidos!");
            }
    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Senha ou Usuário inválidos!");
        }
      
      return(false);
 }  
   
    
 
  public static boolean validaUsuarioaTipo(Usuario usu){
     
      ConexaoBD conex = new ConexaoBD();
      conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where nome_usuario='"+usu.getTipo()+"'");
         conex.rs.first();
         if(conex.rs.getString("tipo").equals("Administrador")) {
             usu.setTipo(conex.rs.getString("tipo"));
             return(true);
         } 
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
 
    
}
