package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import br.stylus.funilaria.controller.gestao.pessoa.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Funcionario extends PessoaFisica implements FormatarData{
    private int codFuncionario;
    private String nascimento;
    private String ctps; //carteira de trabalho
    private String cargo;
    private LocalDateTime dataAdmissao;
    public Contato contato;
    public Usuario usuario;
    
    public Funcionario() {}
    
    public Funcionario(int codPessoaF,String nome,String cpf, String rg, String oex,int codFuncionario, String nascimento, String ctps, String cargo, LocalDateTime dataAdmissao) {
        super(codPessoaF,nome,cpf,rg,oex);
        this.nascimento = nascimento;
        this.codFuncionario = codFuncionario;
        this.ctps = ctps;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    
    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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
    
    
    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
       
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
  
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String dataFormat(LocalDateTime hoje) {
         this.setDataAdmissao(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }


}
