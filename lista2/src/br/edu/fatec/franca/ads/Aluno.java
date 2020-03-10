
package br.edu.fatec.franca.ads;

public class Aluno {
    //Variáveis 
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;
    
    //Getters
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getP1(){
        return this.p1;
    }
    
    public float getp2(){
        return this.p2;
    }
    //Stters
    public void setNumeroAluno(int numeroAluno){
        if(Integer.toString(numeroAluno).length() ==6){
            this.numeroAluno =numeroAluno;
        }else{
            System.out.println("Número do aluno  inválido");
        }
    }
    
    public void SetNome(String nome){
        if(nome.length()<=30){
            this.nome = nome;
        }else{
            System.out.println("Nome deve conter no máximo 30 caracteres!");
        }
    }
    
    public void setIdade(int idade){
        if(idade>=0){
            this.idade =idade;
        }else{
            System.out.println(" O ´Número da idade não pode ser negativa!");
        }
    }
    
    public void setP1(float p1){
        if(p1 >= 0){
            this.p1 = p1;
        }else{
            System.out.println("As notas não podem ser negativas");
        }
    }
    public void setp2(float p2){
        if(p2 >= 0){
            this.p2 = p2;
        }else{
            System.out.println("Número de conta inválido");
        }
    }
   
    //Construtor vazio
    public Aluno(){
        this.numeroAluno = 0;
        this.nome = "";
        this.idade = 0;
        this.p1= 0;
        this.p2 = 0;
    }
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.SetNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setp2(p2);
    }
    
    //metodos construtivos
    public float notaFinal(){
        return(this.p1 + this.p2)/2;
    }
    
    public String toString(){
        return " nº do Aluno: " + this.numeroAluno
                + "\nNome: " + this.nome
                + "\nIdade: " + this.idade;
    }
    
    public boolean passou(){
        if(this.notaFinal() >= 6){
            return true;
        }else{
            return false;
        }
    }    
    
}
