package br.stylus.funilaria.controller.gestao.pessoa.juridica;

public class Empresa extends PessoaJuridica{
    
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    
    public Empresa(){}
    
    public Empresa(String razaoSocial, String nomeFantasia, String cnpj, String inscricaoMunicipal, String inscricaoEstadual){
        super(nomeFantasia,razaoSocial,cnpj);
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
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
