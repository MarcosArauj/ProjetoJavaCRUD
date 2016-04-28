package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaLogin {
    
    
 public static boolean validaUsuarioSenha(String usuario, String senha) {
     
      ConexaoBD conex = new ConexaoBD();
      conex.conexao();
      try {
            conex.executaSql("select * from usuario where nome_usuario='"+usuario+"'");
            conex.rs.first();
            if (conex.rs.getString("senha").equals(senha)) {
               return(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha ou Usuário inválidos!");
            }
    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Senha ou Usuário inválidos!");
        }
      
      return(false);
 }  
   
    
 
  public static boolean validaUsuarioaTipo(String usu){
     
      ConexaoBD conex = new ConexaoBD();
      conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where nome_usuario='"+usu+"'");
         conex.rs.first();
         if(conex.rs.getString("tipo").equals("Administrador")) {
             return(true);
         } 
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
 
    
}
