package br.stylus.funilaria.controller.gestaopessoa.juridica;

public class Empresa extends PessoaJuridica{
    
     public Empresa (){}
    
    public Empresa (String razaoSocial, String nomeFantasia, String cnpj, String inscricaoMunicipal, String inscricaoEstadual){
       super(razaoSocial,nomeFantasia,cnpj,inscricaoMunicipal,inscricaoEstadual);
    }
}
