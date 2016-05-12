package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.PessoaFisica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaFisica {
    
    PessoaFisica pf = new PessoaFisica();
      
public static boolean verificaRg(PessoaFisica rg){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoafisica where rg='" +rg.getRg()+ "'");
         conex.rs.first();
         if(conex.rs.getString("rg").equals(rg.getRg())) {
             rg.setRg(conex.rs.getString("rg"));
             JOptionPane.showMessageDialog(null, "RG já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
public static boolean verificaCpf(PessoaFisica cpf){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoafisica where cpf='" +cpf.getCpf()+ "'");
         conex.rs.first();
         if(conex.rs.getString("cpf").equals(cpf.getCpf())) {
             cpf.setCpf(conex.rs.getString("cpf"));
             JOptionPane.showMessageDialog(null, "CPF já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
public static boolean verificaNomeCpf(PessoaFisica nomeCpf) {                                               
       ConexaoBD conex = new ConexaoBD();
       conex.conexao();
        try {
           conex.executaSql("select * from pessoafisica where nome='" +nomeCpf.getNome()+ "'");
            conex.rs.first();
            if (conex.rs.getString("cpf").equals(nomeCpf.getCpf())) {
                nomeCpf.setNome(conex.rs.getString("nome"));
                nomeCpf.setCpf(conex.rs.getString("cpf"));
                JOptionPane.showMessageDialog(null, "Já existe um NOME cadastrado com este CPF!\n Tente Novamente!");
               return(true);
            }
        } catch (SQLException ex) {
           
        }
      conex.desconecta();
     return (false);
  }
 
}
