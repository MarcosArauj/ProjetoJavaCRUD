package br.stylus.funilaria.model.vo.gestao.pessoa.fisica;

import br.stylus.funilaria.model.vo.gestao.contato.Contato;
import br.stylus.funilaria.controller.utilitarios.formatacoes.FormatarData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Funcionario extends PessoaFisica implements FormatarData{
    private int codFuncionario;
    private String ctps; //carteira de trabalho
    private String cargo;
    private LocalDateTime dataAdmissao;
    public Contato contato;
    public Usuario usuario;
    private String pesquisaFun;
    private String status;
    
    public Funcionario() {}
    
    public Funcionario(int codPessoaF,String nome,String cpf, String rg, String oex,String nascimento,String sexo,int codFuncionario, String ctps, String cargo, LocalDateTime dataAdmissao,String pesquisaFun,String status) {
        super(codPessoaF,nome,cpf,rg,oex,nascimento,sexo);
        this.codFuncionario = codFuncionario;
        this.ctps = ctps;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.pesquisaFun = pesquisaFun;
        this.status = status;
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
    
      public String getPesquisaFun() {
        return pesquisaFun;
    }

    public void setPesquisaFun(String pesquisaFun) {
        this.pesquisaFun = pesquisaFun;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String dataFormat(LocalDateTime hoje) {
         this.setDataAdmissao(hoje);
        hoje = LocalDateTime.now();
		
	DateTimeFormatter formatador =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       return hoje.format(formatador); 
    }

}
