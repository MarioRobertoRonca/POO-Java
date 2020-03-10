
package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class Produto {
    
    // Variáveis
    private int id, qtde;
    private String descricao;
    private float preco;
    
    //Métodos Construtores
    public Produto() {
        this.id = 0;
        this.qtde = 0;
        this.descricao = "";
        this.preco = 0;
    }
    
    // Métodos Construtores
    public Produto(int id, int qtde, String descricao, float preco){
       this.setId(id);
       this.setQtde(qtde);
       this.descricao = descricao;
       this.setPreco(preco);
    }
    //Setters
    public void setId(int id){
        if(id > 0){
            this.id = id;
        }else {
            JOptionPane.showMessageDialog(null, "O id não pode ser 0");
        }
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    
     public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço não pode ser vazaio");
        }
    }
    
    //Getters
    public int getId(){
        return this.id;
    }
    
    public int getQtde(){
        return this.qtde;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    //Métodos
    public void comprar(int x){
        this.setQtde(this.qtde + x);
    }
    
    public void  vender(int x){
        this.setQtde(this.qtde - x);
    }
    
    public void subir(float x){
        this.setPreco(this.preco + x);
    }
    
    public void descer(float x){
        this.setPreco(this.preco - x);
    }
    
    
    public String toString(){
        return "id: " + this.id
                + "\n Descrição: " + this.descricao
                + "\n Quantidade: " + this.qtde
                + "\n Preco: " + this.preco;
        
    }
}
