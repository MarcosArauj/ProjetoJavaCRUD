package br.stylus.funilaria.model.vo.gestao.negocios;

public class Servicos {
    
    private String tipo;
    private double precoInicial;
    private int codServico;
    private String pesquisaServico;
    private String status;
    
    
    public Servicos() {}
    
    public Servicos(String tipo,double precoInicial,int codServico,String pesquisaServico,String status) {
        this.tipo = tipo;
        this.precoInicial = precoInicial;
        this.codServico = codServico;
        this.pesquisaServico = pesquisaServico;
        this.status = status;
    }

  
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
    
    
    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public String getPesquisaServico() {
        return pesquisaServico;
    }

    public void setPesquisaServico(String pesquisaServico) {
        this.pesquisaServico = pesquisaServico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double FormatoNumero( double preco) throws Exception{
      
        this.setPrecoInicial(preco);
  
        return preco;
    }

    
}
