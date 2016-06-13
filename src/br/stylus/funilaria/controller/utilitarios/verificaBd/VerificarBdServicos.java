package br.stylus.funilaria.controller.utilitarios.verificaBd;

import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VerificarBdServicos {
    
    public static boolean verificaTipo(Servicos tipo){
    ConexaoBD conex = new ConexaoBD();
    conex.conexao();
    
     try {
         conex.executaSql("select * from servicos where tipo_servico='" +tipo.getTipo()+ "'");
         conex.rs.first();
         if(conex.rs.getString("tipo_servico").equals(tipo.getTipo())) {
             tipo.setTipo(conex.rs.getString("tipo_servico"));
             JOptionPane.showMessageDialog(null, "SERVIÇO já cadastrado!\n Tente Novamente!");
             return(true);
         }
        
        } catch (SQLException ex) {
       
        }
    
     conex.desconecta();
     return (false);
    }  
    
}
