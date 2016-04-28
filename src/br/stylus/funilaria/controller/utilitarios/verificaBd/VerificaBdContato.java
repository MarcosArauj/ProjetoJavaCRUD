package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdContato {
    
   public static boolean verificaNumero(String numero){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where numero='" +numero+ "'");
         conex.rs.first();
         if(conex.rs.getString("numero").equals(numero)) {
             JOptionPane.showMessageDialog(null, "NÚMERO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }  

  public static boolean verificaTelefone(String telefone){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where telefone='" +telefone+ "'");
         conex.rs.first();
         if(conex.rs.getString("telefone").equals(telefone)) {
             JOptionPane.showMessageDialog(null, "TELEFONE já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
  public static boolean verificaCelular(String cel){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where celular='" +cel+ "'");
         conex.rs.first();
         if(conex.rs.getString("celular").equals(cel)) {
             JOptionPane.showMessageDialog(null, "CELULAR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
    public static boolean verificaEmail(String email){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where email='" +email+ "'");
         conex.rs.first();
         if(conex.rs.getString("email").equals(email)) {
              JOptionPane.showMessageDialog(null, "EMAIL já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
}
