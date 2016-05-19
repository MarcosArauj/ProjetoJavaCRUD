package br.stylus.funilaria.controller.gestao.pessoa.fisica;

public class PessoaFisica {
    public int codPessoaJ;
    private String nome;
    private String  cpf;
    private String rg;
    private String oex; //orgão expedidor do RG

    public PessoaFisica () {}
    
    public PessoaFisica (int codPessoaJ,String nome, String cpf, String rg, String oex) {
        this.codPessoaJ = codPessoaJ;
        this.nome = nome;
        this.cpf = cpf;
        this.rg= rg;
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


    public String getOex() {
        return oex;
    }

    public void setOex(String oex) {
        this.oex = oex;
    }
    public void validaCpf(String cpf) {
    
        
    }

    public int getCodPessoaJ() {
        return codPessoaJ;
    }

    public void setCodPessoaJ(int codPessoaJ) {
        this.codPessoaJ = codPessoaJ;
    }


}
