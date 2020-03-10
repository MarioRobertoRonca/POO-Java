
package br.edu.fatecfranca.ads.ex1;


public class Voo {
    //1-Variáveis 
    private String numero, destino;
    
    //2-Método Contrutor sem parâmetro;
    public Voo(){
        
    }
    
    //2.1-Método construtor com parâmetro
    public Voo(String numero, String destino) {
        this.numero = numero;
        this.destino = destino;
    }
    
    // 3 Métodos set e get
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    //4- Método de intância, mostrar informações

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero
                + ", destino=" + destino + '}';
    }
    
    
}
