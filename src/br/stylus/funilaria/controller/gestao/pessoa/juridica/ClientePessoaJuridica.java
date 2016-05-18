package br.stylus.funilaria.controller.gestao.pessoa.juridica;

import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ClientePessoaJuridica extends PessoaJuridica implements FormatarData{
    
      private LocalDateTime dataCadastro;
    
    public ClientePessoaJuridica() {}
    
     public ClientePessoaJuridica(LocalDateTime dataCadastro) {
      this.dataCadastro = dataCadastro;
     }
    
 
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
     @Override
    public String dataFormat( LocalDateTime hoje) {
        this.setDataCadastro(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }
    
}
