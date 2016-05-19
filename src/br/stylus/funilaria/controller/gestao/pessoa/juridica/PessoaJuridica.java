package br.stylus.funilaria.controller.gestao.pessoa.juridica;

public class PessoaJuridica {
    
    private int codPessoaJuridica;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
   
    
    public PessoaJuridica() {}
    
    public PessoaJuridica(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj) {
        this.codPessoaJuridica = codPessoaJuridica;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
 
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodPessoaJuridica() {
        return codPessoaJuridica;
    }

    public void setCodPessoaJuridica(int codPessoaJuridica) {
        this.codPessoaJuridica = codPessoaJuridica;
    }

  
    
}
