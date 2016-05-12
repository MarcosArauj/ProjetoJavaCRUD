package br.stylus.funilaria.controller.gestao.pessoa.fisica;

public class ClientePessoaFisica extends PessoaFisica{
    
    private String dataCadastro;
    
    public ClientePessoaFisica() {}
    
     public ClientePessoaFisica(String dataCadastro) {
      this.dataCadastro = dataCadastro;
     }
    
 
    public String getDataCadastro() {
        return dataCadastro;
    }

   
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
