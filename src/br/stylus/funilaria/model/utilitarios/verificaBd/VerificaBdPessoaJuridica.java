package br.stylus.funilaria.model.utilitarios.verificaBd;

import br.stylus.funilaria.controller.gestaopessoa.juridica.PessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaJuridica {
    
    PessoaJuridica pj = new PessoaJuridica();
     
   public static boolean verificaRazaoSocial(PessoaJuridica razaoS){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where razao_social='" +razaoS.getRazaoSocial()+ "'");
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
         conex.executaSql("select * from pessoajuridica where cnpj='" +cnpj.getCnpj()+ "'");
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
     
  public static boolean verificaInscricaoMunicipal(PessoaJuridica inscrMunicipal){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where inscr_municipal='" +inscrMunicipal.getInscricaoMunicipal()+ "'");
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
  
   public static boolean verificaInscricaoEstadual(PessoaJuridica inscrEstadual){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where inscr_estadual='" +inscrEstadual.getInscricaoEstadual()+ "'");
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
}
