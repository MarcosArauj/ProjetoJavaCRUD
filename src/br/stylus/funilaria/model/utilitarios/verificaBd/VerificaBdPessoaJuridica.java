package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.Empresa;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.controller.gestao.pessoa.juridica.PessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaJuridica {
    Contato contato = new Contato();
    
    public static boolean verificaRazaoSocial(PessoaJuridica razaoS){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoa_juridica where razao_social='" +razaoS.getRazaoSocial()+ "'");
         conex.rs.first();
         if(conex.rs.getString("razao_social").equals(razaoS.getRazaoSocial())) {
             razaoS.setRazaoSocial(conex.rs.getString("razao_social"));
              JOptionPane.showMessageDialog(null, "RAZÃO SOCIAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
   
   public static boolean verificaCnpj(PessoaJuridica cnpj){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoa_juridica where cnpj='" +cnpj.getCnpj()+ "'");
         conex.rs.first();
         if(conex.rs.getString("cnpj").equals(cnpj.getCnpj())) {
             cnpj.setCnpj(conex.rs.getString("cnpj"));
             JOptionPane.showMessageDialog(null, "CNPJ já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
     
  public static boolean verificaInscricaoMunicipal(Empresa inscrMunicipal){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from empresa where inscr_municipal='" +inscrMunicipal.getInscricaoMunicipal()+ "'");
         conex.rs.first();
         if(conex.rs.getString("inscr_municipal").equals(inscrMunicipal.getInscricaoMunicipal())) {
             inscrMunicipal.setInscricaoMunicipal(conex.rs.getString("inscr_municipal"));
              JOptionPane.showMessageDialog(null, "INSCRIÇÃO MUNICIPAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
  
   public static boolean verificaInscricaoEstadual(Empresa inscrEstadual){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from empresa where inscr_estadual='" +inscrEstadual.getInscricaoEstadual()+ "'");
         conex.rs.first();
         if(conex.rs.getString("inscr_estadual").equals(inscrEstadual.getInscricaoEstadual())) {
             inscrEstadual.setInscricaoEstadual(conex.rs.getString("inscr_estadual"));
              JOptionPane.showMessageDialog(null, "INSCRIÇÃO ESTADUAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
    
   public static boolean verificaNumero(Empresa numero){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where numero='" +numero.contato.getNumero()+ "'");
         conex.rs.first();
         if(conex.rs.getString("numero").equals(numero.contato.getNumero())) {
             numero.contato.setNumero(conex.rs.getString("numero"));
             JOptionPane.showMessageDialog(null, "NÚMERO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }  

  public static boolean verificaTelefone(Empresa telefone){
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
  
  public static boolean verificaCelular(Empresa cel){
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
   
    public static boolean verificaEmail(Empresa email){
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
    
    
    
     public static boolean verificaNumero(ClientePessoaJuridica numero){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from contato where numero='" +numero.contato.getNumero()+ "'");
         conex.rs.first();
         if(conex.rs.getString("numero").equals(numero.contato.getNumero())) {
             numero.contato.setNumero(conex.rs.getString("numero"));
             JOptionPane.showMessageDialog(null, "NÚMERO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }  

  public static boolean verificaTelefone(ClientePessoaJuridica telefone){
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
  
  public static boolean verificaCelular(ClientePessoaJuridica cel){
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
   
    public static boolean verificaEmail(ClientePessoaJuridica email){
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
    
    
    
    public static boolean verificaTelefone(Fornecedor telefone){
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
  
  public static boolean verificaCelular(Fornecedor cel){
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
   
    public static boolean verificaEmail(Fornecedor email){
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
