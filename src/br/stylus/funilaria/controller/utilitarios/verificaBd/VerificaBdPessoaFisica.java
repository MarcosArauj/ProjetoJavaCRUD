package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaFisica {
      
public static boolean verificaRg(String rg){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoafisica where rg='" +rg+ "'");
         conex.rs.first();
         if(conex.rs.getString("rg").equals(rg)) {
             JOptionPane.showMessageDialog(null, "RG já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
public static boolean verificaCpf(String cpf){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoafisica where cpf='" +cpf+ "'");
         conex.rs.first();
         if(conex.rs.getString("cpf").equals(cpf)) {
             JOptionPane.showMessageDialog(null, "CPF já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
public static boolean verificaNomeCpf(String nomecpf) {                                               
       ConexaoBD conex = new ConexaoBD();
       conex.conexao();
        try {
           conex.executaSql("select * from pessoafisica where nome='" +nomecpf+ "'");
            conex.rs.first();
            if (conex.rs.getString("cpf").equals(nomecpf)) {
               return(true);
            }
        } catch (SQLException ex) {
           
        }
      conex.desconecta();
     return (false);
  }
 
}
