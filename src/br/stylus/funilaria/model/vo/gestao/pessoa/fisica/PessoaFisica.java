package br.stylus.funilaria.model.vo.gestao.pessoa.fisica;

public class PessoaFisica {
    public int codPessoaJ;
    private String nome;
    private String  cpf;
    private String rg;
    private String oex; //orgão expedidor do RG
    private String nascimento;
    private String sexo;
    public PessoaFisica () {}
    
    public PessoaFisica (int codPessoaJ,String nome, String cpf, String rg, String oex,String nascimento,String sexo) {
        this.codPessoaJ = codPessoaJ;
        this.nome = nome;
        this.cpf = cpf;
        this.rg= rg;
        this.oex = oex;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public String  getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getOex() {
        return oex;
    }

    public void setOex(String oex) {
        this.oex = oex;
    }
    public void validaCpf(String cpf) {
    
        
    }

    public int getCodPessoaJ() {
        return codPessoaJ;
    }

    public void setCodPessoaJ(int codPessoaJ) {
        this.codPessoaJ = codPessoaJ;
    }

    /**
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
