package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;

public class Administrador extends PessoaFisica{
    private int codAdministrador;
    private String nascimento;
    public Contato contato;
    public Usuario usuario;
    
    public Administrador () {}
    
    public Administrador (int codPessoaJ,String nome, String cpf, String rg,  String oex,int codAdministrador, String nascimento,Contato contato,Usuario usuario) {
       super(codPessoaJ,nome,cpf,rg,oex);
       this.codAdministrador = codAdministrador;
       this.nascimento = nascimento;
       this.contato = contato;
       this.usuario = usuario;
    }
 
    public int getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(int codAdministrador) {
        this.codAdministrador = codAdministrador;
    }
    
    
    public String getNascimento() {
        return nascimento;
    }

    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

}
