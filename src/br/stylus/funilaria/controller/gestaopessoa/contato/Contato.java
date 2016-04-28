package br.stylus.funilaria.controller.gestaopessoa.contato;

public class Contato {
    
    private String endereco;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String tefefone;
    private String celular;
    private String email;

    public Contato () {}
    
     public Contato (String endereco, String numero, String cep, String bairro, String cidade, String estado,String telefone,String celular, String email) {
         this.endereco = endereco;
         this.numero = numero;
         this.cep = cep;
         this.bairro = bairro;
         this.cidade = cidade;
         this.estado = estado;
         this.tefefone = telefone;
         this.celular = celular;
         this.email = email;
     }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTefefone() {
        return tefefone;
    }

    public void setTefefone(String tefefone) {
        this.tefefone = tefefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getEmail() {
        return email;
    }

  
    public void setEmail(String email) {
        this.email = email;
    }

   
    
}
