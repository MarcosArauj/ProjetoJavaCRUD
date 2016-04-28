package br.stylus.funilaria.controller.gestaopessoa.fisica;

public class Funcionario extends PessoaFisica{
    
    private String ctps; //carteira de trabalho
    private String cargo;
    private String dataAdmissao;
    
    public Funcionario() {}
    
    public Funcionario(String nome,String cpf, String rg, String nascimento, String oex, String ctps, String cargo, String dataAdmissao) {
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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
}
