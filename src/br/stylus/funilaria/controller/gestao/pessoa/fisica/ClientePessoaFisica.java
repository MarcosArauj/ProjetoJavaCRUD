package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ClientePessoaFisica extends PessoaFisica implements FormatarData{
    
    private LocalDateTime dataCadastro;
    private int codClienteF;
    public Contato contato;
    private String pesquisaCientePf;
    
    public ClientePessoaFisica() {}
    
     public ClientePessoaFisica(int codPessoaJ,String nome, String cpf, String rg, String oex,String nascimento,String sexo,LocalDateTime dataCadastro,int codClienteF,Contato contato, String pesquisaCientePf) {
      super(codPessoaJ,nome,cpf,rg,oex,nascimento,sexo);   
      this.dataCadastro = dataCadastro;
      this.codClienteF = codClienteF;
      this.contato = contato;
      this.pesquisaCientePf = pesquisaCientePf;
     }
    
 
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCodClienteF() {
        return codClienteF;
    }

    public void setCodClienteF(int codClienteF) {
        this.codClienteF = codClienteF;
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
     * @return the pesquisaCientePf
     */
    public String getPesquisaCientePf() {
        return pesquisaCientePf;
    }

    /**
     * @param pesquisaCientePf the pesquisaCientePf to set
     */
    public void setPesquisaCientePf(String pesquisaCientePf) {
        this.pesquisaCientePf = pesquisaCientePf;
    }
}
