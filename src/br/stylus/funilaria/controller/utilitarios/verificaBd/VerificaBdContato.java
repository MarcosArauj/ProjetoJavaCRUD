package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdContato {
    
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
