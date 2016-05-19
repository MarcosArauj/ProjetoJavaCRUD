package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.controller.gestao.pessoa.fisica.Funcionario;
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
 

  public static boolean verificaTelefone(Administrador telefone){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where telefone='" +telefone.contato.getTefefone()+ "'");
         conex.rs.first();
         if(conex.rs.getString("telefone").equals(telefone.contato.getTefefone())) {
             telefone.contato.setTefefone(conex.rs.getString("telefone"));
             JOptionPane.showMessageDialog(null, "TELEFONE já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
  public static boolean verificaCelular(Administrador cel){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where celular='" +cel.contato.getCelular()+ "'");
         conex.rs.first();
         if(conex.rs.getString("celular").equals(cel.contato.getCelular())) {
             cel.contato.setCelular(conex.rs.getString("celular"));
             JOptionPane.showMessageDialog(null, "CELULAR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
    public static boolean verificaEmail(Administrador email){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where email='" +email.contato.getEmail()+ "'");
         conex.rs.first();
         if(conex.rs.getString("email").equals(email.contato.getEmail())) {
             email.contato.setEmail(conex.rs.getString("email"));
              JOptionPane.showMessageDialog(null, "EMAIL já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
    
    
    
    ///verfica se o número de celular já em Cliente pessoa fiśica
    public static boolean verificaCelular(ClientePessoaFisica cel){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where celular='" +cel.contato.getCelular()+ "'");
         conex.rs.first();
         if(conex.rs.getString("celular").equals(cel.contato.getCelular())) {
             cel.contato.setCelular(conex.rs.getString("celular"));
             JOptionPane.showMessageDialog(null, "CELULAR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
     ///verfica se o número de email já em Cliente pessoa fiśica
    public static boolean verificaEmail(ClientePessoaFisica email){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where email='" +email.contato.getEmail()+ "'");
         conex.rs.first();
         if(conex.rs.getString("email").equals(email.contato.getEmail())) {
             email.contato.setEmail(conex.rs.getString("email"));
              JOptionPane.showMessageDialog(null, "EMAIL já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
    
    
    public static boolean verificaCelular(Funcionario cel){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where celular='" +cel.contato.getCelular()+ "'");
         conex.rs.first();
         if(conex.rs.getString("celular").equals(cel.contato.getCelular())) {
             cel.contato.setCelular(conex.rs.getString("celular"));
             JOptionPane.showMessageDialog(null, "CELULAR já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
    public static boolean verificaEmail(Funcionario email){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where email='" +email.contato.getEmail()+ "'");
         conex.rs.first();
         if(conex.rs.getString("email").equals(email.contato.getEmail())) {
             email.contato.setEmail(conex.rs.getString("email"));
              JOptionPane.showMessageDialog(null, "EMAIL já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
 
}
