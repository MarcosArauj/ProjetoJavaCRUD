package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestaopessoa.contato.Contato;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdContato {
    Contato contato = new Contato();
    
   public static boolean verificaNumero(Contato numero){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where numero='" +numero.getNumero()+ "'");
         conex.rs.first();
         if(conex.rs.getString("numero").equals(numero.getNumero())) {
             numero.setNumero(conex.rs.getString("numero"));
             JOptionPane.showMessageDialog(null, "NÚMERO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }  

  public static boolean verificaTelefone(Contato telefone){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where telefone='" +telefone.getTefefone()+ "'");
         conex.rs.first();
         if(conex.rs.getString("telefone").equals(telefone.getTefefone())) {
             telefone.setTefefone(conex.rs.getString("telefone"));
             JOptionPane.showMessageDialog(null, "TELEFONE já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
  public static boolean verificaCelular(Contato cel){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where celular='" +cel.getCelular()+ "'");
         conex.rs.first();
         if(conex.rs.getString("celular").equals(cel.getCelular())) {
             cel.setCelular(conex.rs.getString("celular"));
             JOptionPane.showMessageDialog(null, "CELULAR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
    public static boolean verificaEmail(Contato email){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where email='" +email.getEmail()+ "'");
         conex.rs.first();
         if(conex.rs.getString("email").equals(email.getEmail())) {
             email.setEmail(conex.rs.getString("email"));
              JOptionPane.showMessageDialog(null, "EMAIL já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
}
