
package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;


public class Onibus {
    //variáveis
    private int numero ;
    private String placa;
    private ArrayList<Passageiro> passageiro;
    
    // Método Vazio
    public Onibus(){
        // Iniciando ArrayList()
        passageiro = new ArrayList ();
    }
    // Método com parâmetros 

    public Onibus(int numero, String placa, ArrayList<Passageiro> passageiro) {
        this.numero = numero;
        this.placa = placa;
        this.passageiro = passageiro;
    }
    
    //Get e Set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ArrayList<Passageiro> getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(ArrayList<Passageiro> passageiro) {
        this.passageiro = passageiro;
    }
    //Mostrar toString

    @Override
    public String toString() {
        return "\n Onibus{" + "numero=" + numero + ", placa=" + placa + ", passageiro=" + passageiro + '}';
    }
    
    //CRUD
    //add
    public void addPassageiro(Passageiro passageiro){
        this.passageiro.add(passageiro);
    }
    //Remover
    public void removePassageiro(Passageiro passageiro){
        this.passageiro.remove(passageiro);
    }
    
    public int getPassageiro(Passageiro passageiro){
        return this.passageiro.indexOf(passageiro);
    }
    public boolean uptdatePassageiro(Passageiro atual, Passageiro nova){
        int posicao = this.getPassageiro(atual);
        if(posicao != -1){
            this.passageiro.set(posicao, nova);
            return true;
        }else{
            return false;
        }
    }
}
