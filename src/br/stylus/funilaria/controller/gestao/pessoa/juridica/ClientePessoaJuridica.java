package br.stylus.funilaria.controller.gestao.pessoa.juridica;

public class ClientePessoaJuridica extends PessoaJuridica {
    
     private String dataCadastro;
     
     public ClientePessoaJuridica() {}
    
     public ClientePessoaJuridica(String dataCadastro) {
      this.dataCadastro = dataCadastro;
     }
    
    public String getDataCadastro() {
        return dataCadastro;
    }
 
   public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
     
    
}
