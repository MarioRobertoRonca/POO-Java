
package br.edu.fatecfranca.ads.ex1;

import java.util.Date;


public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;
    
    // get e set de codigo e data
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    // Método Vazio
    public Reserva(){
  
    }
    
    // Método Construtor cheio

    public Reserva(int codigo, Date data, Passageiro passageiro) {
        this.codigo = codigo;
        this.data = data;
        this.passageiro = passageiro;
    }

    // 5 Método de instância Mostra informações

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", data=" + data + ", passageiro=" + passageiro + ", voo=" + voo + '}';
    }
    
     // get e set de passageiro e voo;
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    
    
    
}
