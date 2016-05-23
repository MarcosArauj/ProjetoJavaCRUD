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
    
    public Fornecedor() {}
    
    public Fornecedor(int codPessoaJuridica,String nomeFantasia,String razaoSocial,String cnpj,LocalDateTime dataCadastro,int codFornecedor,Contato contato) {
       super(codPessoaJuridica,nomeFantasia,razaoSocial,cnpj);
        this.dataCadastro = dataCadastro;
        this.codFornecedor = codFornecedor;
        this.contato = contato;
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
}
