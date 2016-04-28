package br.stylus.funilaria.controller.gestaopessoa.fisica;

import java.util.Date;

public class PessoaFisica {
    
    private String nome;
    private String  cpf;
    private String rg;
    private String nascimento;
    private String oex; //orgão expedidor do RG

    public PessoaFisica () {}
    
    public PessoaFisica (String nome, String cpf, String rg, String nascimento, String oex) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg= rg;
        this.nascimento = nascimento;
        this.oex = oex;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public String  getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascimento() {
        return nascimento;
    }

    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getOex() {
        return oex;
    }

    public void setOex(String oex) {
        this.oex = oex;
    }
    public void validaCpf(String cpf) {
    
        
    }


}
