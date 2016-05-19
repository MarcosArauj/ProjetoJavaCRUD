package br.stylus.funilaria.controller.gestao.pessoa.juridica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;

public class Fornecedor extends PessoaJuridica{
    
    private String dataCadastro;
    private int codFornecedor;
    public Contato contato;
    
    public Fornecedor() {}
    
    public Fornecedor(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,String dataCadastro,int codFornecedor,Contato contato) {
       super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
        this.dataCadastro = dataCadastro;
        this.codFornecedor = codFornecedor;
        this.contato = contato;
    }

   
    public String getDataCadastro() {
        return dataCadastro;
    }

 
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
