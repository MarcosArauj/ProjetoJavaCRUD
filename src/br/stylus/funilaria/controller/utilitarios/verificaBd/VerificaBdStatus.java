package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.negocios.Produtos;
import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Administrador;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.ClientePessoaFisica;
import br.stylus.funilaria.model.vo.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.ClientePessoaJuridica;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Empresa;
import br.stylus.funilaria.model.vo.gestao.pessoa.juridica.Fornecedor;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificaBdStatus {
    
    public static boolean verificaStatusAdmin(Administrador admin){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from administrador where status = '"+admin.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             admin.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Administrador excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
    
  public static boolean verificaStatusEmpresa(Empresa empresa){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from empresa where status = '"+empresa.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             empresa.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Empresa excluida!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
  
   public static boolean verificaStatusClienteF(ClientePessoaFisica cliente){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from cliente_pessoa_fisica where status = '"+cliente.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             cliente.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Cliente excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
   public static boolean verificaStatusClienteJ(ClientePessoaJuridica cliente){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from cliente_pessoa_juridica where status = '"+cliente.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             cliente.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Cliente excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
   
 public static boolean verificaStatusFornecedor(Fornecedor fornecedor){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from fornecedor where status = '"+fornecedor.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             fornecedor.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Fornecedor excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }
 
  public static boolean verificaStatusFuncionario(Funcionario fun){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from funcionario where status = '"+fun.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             fun.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Funcionário excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }  
     conex.desconecta();
     return (false);
    }
  
   public static boolean verificaStatusProdutos(Produtos produtos){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from produtos where status = '"+produtos.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             produtos.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Produto excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }  
     conex.desconecta();
     return (false);
    }
   
    public static boolean verificaStatusServicos(Servicos servicos){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from servicos where status = '"+servicos.getStatus()+"'");
         conex.rs.first();
         if(conex.rs.getString("status").equals("inativo")) {
             servicos.setStatus(conex.rs.getString("status"));
             JOptionPane.showMessageDialog(null, "Serviço excluido!\n Tente Novamente!");
             return(true);
         } else {
             return(false);
         }
        
        } catch (SQLException ex) {
       
        }  
     conex.desconecta();
     return (false);
    }
}
