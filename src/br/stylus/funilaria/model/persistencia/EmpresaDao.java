package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.juridica.Empresa;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmpresaDao {
    
    ConexaoBD conex = new ConexaoBD();
    Empresa control = new Empresa();
    
    public void salvar(Empresa control) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into empresa (inscr_municipal,inscr_estadual) values(?,?)");         
            pst.setString(1, control.getInscricaoMunicipal());
            pst.setString(2, control.getInscricaoEstadual());
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
