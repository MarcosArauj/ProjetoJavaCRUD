package br.stylus.funilaria.controller.gestao.negocios;

public class Servicos {
    
    private String tipo;
    private double precoInicial;

  
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(double precoInicial) {
        this.precoInicial = precoInicial;
    }
    
    public double FormatoNumero( double preco) throws Exception{
      
        this.setPrecoInicial(preco);
  
        return preco;
    }
    
}
