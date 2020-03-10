
package br.edu.fatecfranca.ads;

public class Cliente {
    //Variáveis 
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    //Método construtor Vazio
    public Cliente (){
        this.numeroConta = "Número da conta inexistente";
        this.numeroAgencia = "Número da agência inexistente";
        this.nome = "Nome inexistente";
        this.saldo = 0;
    }
    
    // Método construtor
    public Cliente (String numeroConta, String numeroAgencia,
            String nome, float saldo){
            this.setNumeroConta(numeroConta);
            this.setNumeroAgencia(numeroAgencia);
            this.setNome(nome);
            this.setSaldo(saldo);
    }
    
    //Setters
    public void setNumeroConta(String numeroConta){
        if (numeroConta.length()== 8 && numeroConta.indexOf("-") == 6){
            this.numeroConta = numeroConta;
        }else{
            System.out.println("Número de conta inválido");
        }
    }
    public void setNumeroAgencia(String numeroAgencia){
        if (numeroAgencia.length() == 6 && numeroAgencia.indexOf("-") == 4){
            this.numeroAgencia = numeroAgencia;
        }else{
            System.out.println("Número de agência inválido");
        }
    }
    public void setNome (String nome){
        if (nome.length() <=30){
            this.nome = nome;
        }else{
            System.out.println("O nome não pode ultrapassar 30 caracters");
        }
    }
    public void setSaldo (float saldo){
        if (saldo >=0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo não pode ser 0");
        }
    }
    
    //geters
    
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    //Métodos
    public void realizarDeposito(float x){
        setSaldo(this.saldo + x);
    }
    
    public void realizarSaque(float x){
        setSaldo(this.saldo - x);
    }
    
    public String toString(){
        return "Numero da conta: " + this.numeroConta
                + "\n Número da Agência: " + this.numeroAgencia
                + "\n Nome do Cliente: " + this.nome
                + "\n Saldo R$: " + this.saldo;
    }
}

