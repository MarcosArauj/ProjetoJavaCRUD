package br.stylus.funilaria.model.vo.gestao.pessoa.juridica;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Fornecedor extends PessoaJuridica implements FormatarData{
    
    private LocalDateTime dataCadastro;
    private int codFornecedor;
    public Contato contato;
    private String pesquisaFor;
    public String status;
    
    public Fornecedor() {}
    
    public Fornecedor(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,LocalDateTime dataCadastro,int codFornecedor,Contato contato, String pesquisaFor,String status) {
       super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
        this.dataCadastro = dataCadastro;
        this.codFornecedor = codFornecedor;
        this.contato = contato;
        this.pesquisaFor = pesquisaFor;
        this.status = status;
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

    public String getPesquisaFor() {
        return pesquisaFor;
    }

    public void setPesquisaFor(String pesquisaFor) {
        this.pesquisaFor = pesquisaFor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String dataFormat(LocalDateTime hoje) {
         this.setDataCadastro(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }

}
