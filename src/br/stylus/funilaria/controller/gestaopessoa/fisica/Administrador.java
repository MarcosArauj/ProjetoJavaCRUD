package br.stylus.funilaria.controller.gestaopessoa.fisica;

public class Administrador extends PessoaFisica{
    
    public Administrador () {}
    
    public Administrador (String nome, String cpf, String rg, String nascimento, String oex) {
       super(nome,cpf,rg,nascimento,oex);
    }
}
