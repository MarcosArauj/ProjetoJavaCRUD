package br.stylus.funilaria.model.vo.gestao.pessoa.fisica;

public class Usuario {
    
    private String nomeUsuario;
    private String tipo;
    private String senha;
    private String status;
    
    
    public Usuario() {}
    
    public Usuario(String nomeUsuario, String tipo, String senha,String status) {
        this.nomeUsuario = nomeUsuario;
        this.tipo = tipo;
        this.senha = senha;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
}