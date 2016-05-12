package br.stylus.funilaria.model.persistencia;


import br.stylus.funilaria.controller.gestao.pessoa.juridica.Fornecedor;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FornecedorDao {
    
     ConexaoBD conex = new ConexaoBD();
    
    public void salvar (Fornecedor control ){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into fornecedor (data_cadastro) values(?)");
            pst.setString(1, control.getDataCadastro());      
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
