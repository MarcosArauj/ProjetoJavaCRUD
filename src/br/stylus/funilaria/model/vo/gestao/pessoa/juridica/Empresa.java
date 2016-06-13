package br.stylus.funilaria.model.vo.gestao.pessoa.juridica;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;

public class Empresa extends PessoaJuridica{
    
    private int codEmpresa;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    public PessoaJuridica pessoa;
    public Contato contato;
    private String pesquisaEmpresa;
    private String status;
    
    public Empresa(){}
    
    public Empresa( int codEmpresa,String inscricaoMunicipal, String inscricaoEstadual,PessoaJuridica pessoa,Contato contato,String pesquisaEmpresa,String status){
        this.codEmpresa = codEmpresa;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.pessoa = pessoa;
        this.contato = contato;
        this.pesquisaEmpresa = pesquisaEmpresa;
        this.status = status;
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

    public PessoaJuridica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaJuridica pessoa) {
        this.pessoa = pessoa;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getPesquisaEmpresa() {
        return pesquisaEmpresa;
    }
  
    public void setPesquisaEmpresa(String pesquisaEmpresa) {
        this.pesquisaEmpresa = pesquisaEmpresa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
