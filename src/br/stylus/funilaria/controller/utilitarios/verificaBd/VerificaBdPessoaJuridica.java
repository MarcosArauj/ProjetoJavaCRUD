package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdPessoaJuridica {
     
   public static boolean verificaRazaoSocial(String razaoS){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where razao_social='" +razaoS+ "'");
         conex.rs.first();
         if(conex.rs.getString("razao_social").equals(razaoS)) {
              JOptionPane.showMessageDialog(null, "RAZÃO SOCIAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
   
   public static boolean verificaCnpj(String cnpj){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where cnpj='" +cnpj+ "'");
         conex.rs.first();
         if(conex.rs.getString("cnpj").equals(cnpj)) {
             JOptionPane.showMessageDialog(null, "CNPJ já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
     
  public static boolean verificaInscricaoMunicipal(String inscrMunicipal){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where inscr_municipal='" +inscrMunicipal+ "'");
         conex.rs.first();
         if(conex.rs.getString("inscr_municipal").equals(inscrMunicipal)) {
              JOptionPane.showMessageDialog(null, "INSCRIÇÃO MUNICIPAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
  
   public static boolean verificaInscricaoEstadual(String inscrEstadual){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from pessoajuridica where inscr_estadual='" +inscrEstadual+ "'");
         conex.rs.first();
         if(conex.rs.getString("inscr_estadual").equals(inscrEstadual)) {
              JOptionPane.showMessageDialog(null, "INSCRIÇÃO ESTADUAL já cadastrada!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    } 
}
