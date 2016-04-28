package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdUsuario {
    
public static boolean verificaNomeUsu(String nome){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where nome_usuario='" +nome+ "'");
         conex.rs.first();
         if(conex.rs.getString("nome_usuario").equals(nome)) {
             JOptionPane.showMessageDialog(null, "USUÁRIO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }

public static boolean verificaSenha(String senha){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where senha='" +senha+ "'");
         conex.rs.first();
         if(conex.rs.getString("senha").equals(senha)) {
             JOptionPane.showMessageDialog(null, "SENHA já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }

public static boolean verificaTipo(String tipo){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from usuario where tipo='" +tipo+ "'");
         conex.rs.first();
         if(conex.rs.getString("tipo").equals("Administrador")) {
             JOptionPane.showMessageDialog(null, "Usuário ADMINISTRADOR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
}
