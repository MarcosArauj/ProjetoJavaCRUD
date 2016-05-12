package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.negocios.Servicos;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ServicosDao {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void salvar(Servicos control ){
        
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into servicos (tipo_servico,valor_inicial) values(?,?)");
            pst.setString(1, control.getTipo());
            pst.setDouble(2, control.getPrecoInicial());          
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados inserido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
