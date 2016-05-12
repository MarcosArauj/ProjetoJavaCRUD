package br.stylus.funilaria.controller.gestao.pessoa.juridica;

public class PessoaJuridica {
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    
    public PessoaJuridica() {}
    
    public PessoaJuridica(String nomeFantasia,String razaoSocial,String cnpj) {
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
    
}
