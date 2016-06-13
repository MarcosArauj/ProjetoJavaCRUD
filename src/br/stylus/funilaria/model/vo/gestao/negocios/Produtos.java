package br.stylus.funilaria.model.vo.gestao.negocios;

import javax.swing.JOptionPane;

public class Produtos {
   
    private int codProduto;
    private String marca;
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;
    private String pesquisaproduto;
    private String status;
    
    public Produtos () {}
    
    public Produtos(int codProduto,String marca,String tipo,String descricao,double preco,int quantidade, String pesquisaproduto,String status) {
        this.codProduto = codProduto;
        this.marca = marca;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.pesquisaproduto = pesquisaproduto;
        this.status = status;
    }

 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public String getPesquisaproduto() {
        return pesquisaproduto;
    }

    public void setPesquisaproduto(String pesquisaproduto) {
        this.pesquisaproduto = pesquisaproduto;
    }

 
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double FormatoNumero( double preco) throws Exception{
 
            this.setPreco(preco);
 
        return preco;
    }
    
     public int FormatoNumero(int quantidade) throws Exception{
    
        this.setQuantidade(quantidade);
   
         return quantidade;
    }

  
}
