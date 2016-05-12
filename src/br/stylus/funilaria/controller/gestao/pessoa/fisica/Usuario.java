package br.stylus.funilaria.controller.gestao.pessoa.fisica;

public class Usuario {
    
    private String nomeUsuario;
    private String tipo;
    private String senha;
    
    public Usuario() {}
    
    public Usuario(String nomeUsuario, String tipo, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.tipo = tipo;
        this.senha = senha;
    }

     public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
}
