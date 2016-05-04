package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestaopessoa.juridica.PessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmpresaDao {
    
    ConexaoBD conex = new ConexaoBD();
    PessoaJuridica control = new PessoaJuridica();
    
    public void salvar(PessoaJuridica control) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pessoajuridica (razao_social,nome_fantasia,cnpj,inscr_municipal,inscr_estadual) values(?,?,?,?,?)");
            pst.setString(1, control.getRazaoSocial());
            pst.setString(2, control.getNomeFantasia());
            pst.setString(3, control.getCnpj());
            pst.setString(4, control.getInscricaoMunicipal());
            pst.setString(5, control.getInscricaoEstadual());
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
