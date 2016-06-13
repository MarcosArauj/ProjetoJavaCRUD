package br.stylus.funilaria.model.vo.gestao.pessoa.fisica;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;

public class Administrador extends PessoaFisica{
    private int codAdministrador;
    public Contato contato;
    public Usuario usuario;
    private String pesquisaAdmin;
    private String status;
    
    public Administrador () {}
    
    public Administrador (int codPessoaJ,String nome, String cpf, String rg,  String oex,String nascimento,String sexo,int codAdministrador,Contato contato,Usuario usuario,String pesquisaAdmin,String status) {
       super(codPessoaJ,nome,cpf,rg,oex,nascimento,sexo);
       this.codAdministrador = codAdministrador;
       this.contato = contato;
       this.usuario = usuario;
       this.pesquisaAdmin = pesquisaAdmin;
       this.status = status;
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

    public String getPesquisaAdmin() {
        return pesquisaAdmin;
    }

    public void setPesquisaAdmin(String pesquisaAdmin) {
        this.pesquisaAdmin = pesquisaAdmin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
