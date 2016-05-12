package br.stylus.funilaria.controller.gestao.negocios;

import javax.swing.JOptionPane;

public class Produtos {
    
    private String marca;
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;
    
    public Produtos () {}
    
    public Produtos(String marca,String tipo,String descricao,double preco,int quantidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
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
     
    
    
}
