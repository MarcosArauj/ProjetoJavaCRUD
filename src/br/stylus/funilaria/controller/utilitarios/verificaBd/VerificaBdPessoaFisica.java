package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.PessoaFisica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaFisica {
      
public static boolean verificaRg(PessoaFisica rg){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoa_fisica where rg='" +rg.getRg()+ "'");
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
         conex.executaSql("select * from pessoa_fisica where cpf='" +cpf.getCpf()+ "'");
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
           conex.executaSql("select * from pessoa_fisica where nome='" +nomeCpf.getNome()+ "'");
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
