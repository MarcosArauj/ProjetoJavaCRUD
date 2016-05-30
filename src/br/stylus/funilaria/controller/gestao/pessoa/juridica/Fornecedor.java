package br.stylus.funilaria.controller.gestao.pessoa.juridica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Fornecedor extends PessoaJuridica implements FormatarData{
    
    private LocalDateTime dataCadastro;
    private int codFornecedor;
    public Contato contato;
    private String pesquisaFor;
    
    public Fornecedor() {}
    
    public Fornecedor(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,LocalDateTime dataCadastro,int codFornecedor,Contato contato, String pesquisaFor) {
       super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
        this.dataCadastro = dataCadastro;
        this.codFornecedor = codFornecedor;
        this.contato = contato;
        this.pesquisaFor = pesquisaFor;
    }

   
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

 
    public void setDataCadastro(LocalDateTime dataCadastro) {
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

    @Override
    public String dataFormat(LocalDateTime hoje) {
         this.setDataCadastro(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }

    /**
     * @return the pesquisaFor
     */
    public String getPesquisaFor() {
        return pesquisaFor;
    }

    /**
     * @param pesquisaFor the pesquisaFor to set
     */
    public void setPesquisaFor(String pesquisaFor) {
        this.pesquisaFor = pesquisaFor;
    }
}
