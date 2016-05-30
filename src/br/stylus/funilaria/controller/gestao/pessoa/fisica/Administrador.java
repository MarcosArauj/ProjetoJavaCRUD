package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;

public class Administrador extends PessoaFisica{
    private int codAdministrador;
    public Contato contato;
    public Usuario usuario;
    private String pesquisaAdmin;
    
    public Administrador () {}
    
    public Administrador (int codPessoaJ,String nome, String cpf, String rg,  String oex,String nascimento,String sexo,int codAdministrador,Contato contato,Usuario usuario,String pesquisaAdmin) {
       super(codPessoaJ,nome,cpf,rg,oex,nascimento,sexo);
       this.codAdministrador = codAdministrador;
       this.contato = contato;
       this.usuario = usuario;
       this.pesquisaAdmin = pesquisaAdmin;
    }
 
    public int getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(int codAdministrador) {
        this.codAdministrador = codAdministrador;
    }
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pesquisaAdmin
     */
    public String getPesquisaAdmin() {
        return pesquisaAdmin;
    }

    /**
     * @param pesquisaAdmin the pesquisaAdmin to set
     */
    public void setPesquisaAdmin(String pesquisaAdmin) {
        this.pesquisaAdmin = pesquisaAdmin;
    }

}
