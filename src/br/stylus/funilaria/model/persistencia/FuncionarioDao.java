package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.fisica.Funcionario;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    
     ConexaoBD conex = new ConexaoBD();
     Funcionario control = new Funcionario();
     
     public void salvar(Funcionario control){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionario (ctps,cargo,data_admissao) values(?,?,?)");
            pst.setString(1, control.getCtps());
            pst.setString(2, control.getCargo());
            pst.setString(3, control.getDataAdmissao());
            pst.execute();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
