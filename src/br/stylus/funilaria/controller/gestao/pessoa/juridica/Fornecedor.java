package br.stylus.funilaria.controller.gestao.pessoa.juridica;

public class Fornecedor extends PessoaJuridica{
    
    private String dataCadastro;
    
    public Fornecedor() {}
    
    public Fornecedor(String nomeFantasia,String razaoSocial,String cnpj,String dataCadastro) {
        super(nomeFantasia,razaoSocial,cnpj);
        this.dataCadastro = dataCadastro;
    }

   
    public String getDataCadastro() {
        return dataCadastro;
    }

 
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
