package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestaopessoa.fisica.Funcionario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdFuncionario {
    
    Funcionario funcionario = new Funcionario();
    
   public static boolean verificaCtps(Funcionario ctps){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from funcionario where ctps='" +ctps.getCtps()+ "'");
         conex.rs.first();
         if(conex.rs.getString("ctps").equals(ctps.getCtps())) {
             ctps.setCtps(conex.rs.getString("ctps"));
             JOptionPane.showMessageDialog(null, "CARTEIRA DE TRABALHO já cadastrada !\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
}
