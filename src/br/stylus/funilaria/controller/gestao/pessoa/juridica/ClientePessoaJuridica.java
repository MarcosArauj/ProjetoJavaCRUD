package br.stylus.funilaria.controller.gestao.pessoa.juridica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ClientePessoaJuridica extends PessoaJuridica implements FormatarData{
    
      private LocalDateTime dataCadastro;
      private int codClienteJ;
      public Contato contato;
      private String pesquisaClientePj;
    
    public ClientePessoaJuridica() {}
    
    
    public ClientePessoaJuridica(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,LocalDateTime dataCadastro,int codClienteJ,Contato contato,String pesquisaClientePj) {
      super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
      this.dataCadastro = dataCadastro;
      this.codClienteJ = codClienteJ;
      this.contato = contato;
      this.pesquisaClientePj = pesquisaClientePj;
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

    /**
     * @return the pesquisaClientePj
     */
    public String getPesquisaClientePj() {
        return pesquisaClientePj;
    }

    /**
     * @param pesquisaClientePj the pesquisaClientePj to set
     */
    public void setPesquisaClientePj(String pesquisaClientePj) {
        this.pesquisaClientePj = pesquisaClientePj;
    }
    
}
