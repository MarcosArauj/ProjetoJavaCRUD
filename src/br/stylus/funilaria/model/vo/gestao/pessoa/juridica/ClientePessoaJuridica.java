package br.stylus.funilaria.model.vo.gestao.pessoa.juridica;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ClientePessoaJuridica extends PessoaJuridica implements FormatarData{
    
      private LocalDateTime dataCadastro;
      private int codClienteJ;
      public Contato contato;
      private String pesquisaClientePj;
      private String status;
    
    public ClientePessoaJuridica() {}
    
    
    public ClientePessoaJuridica(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,LocalDateTime dataCadastro,int codClienteJ,Contato contato,String pesquisaClientePj,String status) {
      super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
      this.dataCadastro = dataCadastro;
      this.codClienteJ = codClienteJ;
      this.contato = contato;
      this.pesquisaClientePj = pesquisaClientePj;
      this.status = status;
     }
    
 
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
 
    public int getCodClienteJ() {
        return codClienteJ;
    }

    public void setCodClienteJ(int codClienteJ) {
        this.codClienteJ = codClienteJ;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
      @Override
    public String dataFormat( LocalDateTime hoje) {
        this.setDataCadastro(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }

    public String getPesquisaClientePj() {
        return pesquisaClientePj;
    }

    public void setPesquisaClientePj(String pesquisaClientePj) {
        this.pesquisaClientePj = pesquisaClientePj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
