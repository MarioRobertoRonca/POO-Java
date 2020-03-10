
package br.edu.fatecfranca.ads.ex2;


public class Rio {
    // Variáveis
    private String nome;
    private float nivel;
    private boolean poluido;
    
    // Método contrutor
    public Rio(String nome, float nivel,
            boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    // Método construtor vazio
    public Rio(){
        
    }
    
    //Métodos
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolar(float x){
        this.nivel -= x;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    
    public String toString(){
        return "Nome: " + this.nome
                + "\n nivel: " + this.nivel
                + "\n Poluido: " + this.poluido;
    }
}
