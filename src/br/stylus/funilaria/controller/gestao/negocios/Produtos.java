package br.stylus.funilaria.controller.gestao.negocios;

import javax.swing.JOptionPane;

public class Produtos {
   
    private int codProduto;
    private String marca;
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;
    private String pesquisaproduto;
    
    public Produtos () {}
    
    public Produtos(int codProduto,String marca,String tipo,String descricao,double preco,int quantidade, String pesquisaproduto) {
        this.codProduto = codProduto;
        this.marca = marca;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.pesquisaproduto = pesquisaproduto;
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
    
    public double FormatoNumero( double preco) throws Exception{
       // try{
            this.setPreco(preco);
       // } catch(NumberFormatException e ){
            
        //}
        return preco;
    }
    
     public int FormatoNumero(int quantidade) throws Exception{
       // try{
            this.setQuantidade(quantidade);
        //} catch(NumberFormatException e ){
           
       // }
        
         return quantidade;
    }

    /**
     * @return the pesquisaproduto
     */
    public String getPesquisaproduto() {
        return pesquisaproduto;
    }

    /**
     * @param pesquisaproduto the pesquisaproduto to set
     */
    public void setPesquisaproduto(String pesquisaproduto) {
        this.pesquisaproduto = pesquisaproduto;
    }

    /**
     * @return the codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
     
    
    
}
