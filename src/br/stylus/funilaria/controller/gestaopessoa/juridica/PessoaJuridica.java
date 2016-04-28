package br.stylus.funilaria.controller.gestaopessoa.juridica;

public class PessoaJuridica {
    
    
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String inscricaoMunicipal, String inscricaoEstadual){
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }


    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
}
