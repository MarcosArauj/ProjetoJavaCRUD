package br.stylus.funilaria.model.dao.edicoesDeCadastros;

import br.stylus.funilaria.model.conection.ConexaoBD;
import br.stylus.funilaria.model.vo.gestao.negocios.Servicos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditaServicosDao {
    
        ConexaoBD conex = new ConexaoBD();
    
    public void editar( Servicos servicos){
            conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("update servicos set tipo_servico=?, preco_inicial=? where cod_servico=?");
                pst.setString(1,servicos.getTipo());
                pst.setDouble(2, servicos.getPrecoInicial());
                pst.setInt(3, servicos.getCodServico());
                pst.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao alterar Serviço!" + ex);
            }
        conex.desconecta();
    }
    
}
