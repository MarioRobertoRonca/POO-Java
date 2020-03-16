
package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;


public class BusStation {
   //Variáveis 
    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibus;
    
    // Método vazio 
    public BusStation(){
        // Iniciando ArrayList
        onibus = new ArrayList();  
    }
    
    //Método construtor com Parâmetro;

    public BusStation(String nome, String cidade, ArrayList<Onibus> onibus) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = onibus;
    }
    
    // Get and Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }
    
    // ToString

    @Override
    public String toString() {
        return "BusStation{" + "nome=" + nome + ", cidade=" + cidade + ", onibus=" + onibus + '}';
    }
    
    //CRUD
    //add
    public void addOnibus(Onibus onibus){
        this.onibus.add(onibus);
    }
    
    //Remover
    public void removerOnibus(Onibus onibus){
        this.onibus.remove(onibus);
    }
    
    public int getOnibus(Onibus  onibus){
        return this.onibus.indexOf(onibus);
    }
    
    public boolean updateOnibus(Onibus atual, Onibus novo){
        int posicao = this.getOnibus(atual);
        if(posicao != -1){
            this.onibus.set(posicao, novo);
            return true;
        }else{
            return false;
        }
    }
}
