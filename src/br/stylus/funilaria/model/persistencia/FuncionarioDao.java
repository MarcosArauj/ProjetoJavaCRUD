package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestaopessoa.fisica.Funcionario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    
     ConexaoBD conex = new ConexaoBD();
     Funcionario mod = new Funcionario();
     
     public void Salvar(Funcionario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionario (ctps,cargo,data_admissao) values(?,?,?)");
            pst.setString(1, mod.getCtps());
            pst.setString(2, mod.getCargo());
            pst.setString(3, mod.getDataAdmissao());
            pst.execute();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
