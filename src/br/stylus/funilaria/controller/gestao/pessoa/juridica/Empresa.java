package br.stylus.funilaria.controller.gestao.pessoa.juridica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;

public class Empresa extends PessoaJuridica{
    
    private int codEmpresa;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    public PessoaJuridica pessoa;
    public Contato contato;
    private String pesquisaEmpresa;
    
    public Empresa(){}
    
    public Empresa( int codEmpresa,String inscricaoMunicipal, String inscricaoEstadual,PessoaJuridica pessoa,Contato contato,String pesquisaEmpresa){
        this.codEmpresa = codEmpresa;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.pessoa = pessoa;
        this.contato = contato;
        this.pesquisaEmpresa = pesquisaEmpresa;
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

    /**
     * @return the pesquisaEmpresa
     */
    public String getPesquisaEmpresa() {
        return pesquisaEmpresa;
    }

    /**
     * @param pesquisaEmpresa the pesquisaEmpresa to set
     */
    public void setPesquisaEmpresa(String pesquisaEmpresa) {
        this.pesquisaEmpresa = pesquisaEmpresa;
    }
    
}
