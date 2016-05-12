/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.stylus.funilaria.model.persistencia;

import br.stylus.funilaria.controller.gestao.pessoa.juridica.PessoaJuridica;
import br.stylus.funilaria.model.conection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PessoaJuridicaDao {
    
     ConexaoBD conex = new ConexaoBD();
     PessoaJuridica  control = new PessoaJuridica();
    
    public void salvar(PessoaJuridica control) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pessoajuridica (nome_fantasia,razao_social,cnpj) values(?,?,?)");         
            pst.setString(1, control.getNomeFantasia());
            pst.setString(2, control.getRazaoSocial());
            pst.setString(3, control.getCnpj());
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n Erro:" + ex.getMessage());
        }
        conex.desconecta();
    }
    
}
