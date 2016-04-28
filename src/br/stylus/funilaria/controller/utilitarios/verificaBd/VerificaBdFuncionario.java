package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdFuncionario {
    
   public static boolean verificaCtps(String ctps){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from funcionario where ctps='" +ctps+ "'");
         conex.rs.first();
         if(conex.rs.getString("ctps").equals(ctps)) {
             JOptionPane.showMessageDialog(null, "CARTEIRA DE TRABALHO já cadastrada !\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
}
