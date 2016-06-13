package br.stylus.funilaria.model.dao.cadastros;

public interface CadastrarDados {
    
    final String SALVAR_PESSOA_FISICA = "insert into pessoa_fisica (nome,cpf,rg,orgaoexpedidor,data_nascimento,sexo) values(?,?,?,?,?,?)";
   
    final String SALVAR_PESSOA_JURIDICA = "insert into pessoa_juridica (nome_fantasia,razao_social,cnpj) values(?,?,?)";
    
    final String SALVAR_CONTATO = "insert into contato (endereco,numero,cep,bairro,cidade,estado,telefone,celular,email) values(?,?,?,?,?,?,?,?,?)";        
    
    final String SALVAR_USUARIO = "insert into usuario (nome_usuario,tipo,senha,status) values(?,?,?,?)";
    
    final String SALVAR_ADMINISTRADOR = "insert into administrador (cod_pessoafisica,cod_contato,cod_usuario,status) values(?,?,?,?)";
            
    final String SALVAR_EMPRESA = "insert into empresa (inscr_municipal,inscr_estadual,cod_pessoajuridica,cod_contato,status) values(?,?,?,?,?)";
     
    final String SALVAR_FUNCIONARIO = "insert into funcionario (ctps,cargo,data_admissao,cod_pessoafisica,cod_contato,cod_usuario,status) values(?,?,?,?,?,?,?)";
    
    final String SALVAR_FORNECEDOR = "insert into fornecedor (data_cadastro,cod_pessoajuridica,cod_contato,status) values(?,?,?,?)"; 
    
    final String SALVAR_CLIENTE_PF = "insert into cliente_pessoa_fisica (data_cadastro,cod_pessoafisica,cod_contato,status) values(?,?,?,?)";
    
    final String SALVAR_CLIENTE_PJ = "insert into cliente_pessoa_juridica (data_cadastro,cod_pessoaJuridica,cod_contato,status) values(?,?,?,?)"; 
             
    final String SALVAR_PRODUTO = "insert into produtos (marca_produto,tipo_produto,descricao_produto,preco_produto,quantidade_produto,status) values(?,?,?,?,?,?)";
    
    final String SALVAR_SERVICO = "insert into servicos (tipo_servico,preco_inicial,status) values(?,?,?)";
    

    
}
