package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Funcionario extends PessoaFisica implements FormatarData{
    
    private String ctps; //carteira de trabalho
    private String cargo;
    private LocalDateTime dataAdmissao;
    
    public Funcionario() {}
    
    public Funcionario(String nome,String cpf, String rg, String nascimento, String oex, String ctps, String cargo, LocalDateTime dataAdmissao) {
        super(nome,cpf,rg,nascimento,oex);
        this.ctps = ctps;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String dataFormat(LocalDateTime hoje) {
         this.setDataAdmissao(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }
    
}
