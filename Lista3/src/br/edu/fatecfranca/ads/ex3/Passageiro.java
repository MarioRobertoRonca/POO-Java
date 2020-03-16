
package br.edu.fatecfranca.ads.ex3;


public class Passageiro {
    private String nome;
    private String rg;
    
    //Método Vazio
    public Passageiro(){
        
    }
    
    //Método Cheigo
    public Passageiro(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
    }
    
    // Get & Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //Mostrat to String

    @Override
    public String toString() {
        return "\n Passageiro{" + "nome=" + nome + ", rg=" + rg + '}';
    }
    
    
}
