package br.stylus.funilaria.controller.gestao.negocios;

public class Servicos {
    
    private String tipo;
    private double precoInicial;
    private int codServico;
    private String pesquisaServico;
    
    
    public Servicos() {}
    
    public Servicos(String tipo,double precoInicial,int codServico,String pesquisaServico) {
        this.tipo = tipo;
        this.precoInicial = precoInicial;
        this.codServico = codServico;
        this.pesquisaServico = pesquisaServico;
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
    
    public double FormatoNumero( double preco) throws Exception{
      
        this.setPrecoInicial(preco);
  
        return preco;
    }

    /**
     * @return the codServico
     */
    public int getCodServico() {
        return codServico;
    }

    /**
     * @param codServico the codServico to set
     */
    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    /**
     * @return the pesquisaServico
     */
    public String getPesquisaServico() {
        return pesquisaServico;
    }

    /**
     * @param pesquisaServico the pesquisaServico to set
     */
    public void setPesquisaServico(String pesquisaServico) {
        this.pesquisaServico = pesquisaServico;
    }
    
}
