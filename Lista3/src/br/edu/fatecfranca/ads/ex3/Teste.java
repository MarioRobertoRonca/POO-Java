
package br.edu.fatecfranca.ads.ex3;

import javax.swing.JOptionPane;


public class Teste {

    public static void main(String[] args) {
        //Objtos Passageiros
        Passageiro p1 = new Passageiro("Mário", "001");
        Passageiro p2 = new Passageiro("Matheus", "002");
        Passageiro p3 = new Passageiro("Gustavo", "003");
        Passageiro p4 = new Passageiro("Fedido", "004");
        Passageiro p5 = new Passageiro("Heitor", "005");
        Passageiro p6 = new Passageiro("Carol", "006");
        Passageiro p7 = new Passageiro("Yago", "007");
        
        //Criando o Onibus 1
        Onibus cometa1 = new Onibus ();
        cometa1.setNumero(1113);
        cometa1.setPlaca("GMI-3742");
        cometa1.addPassageiro(p1);
        cometa1.addPassageiro(p2);
        cometa1.addPassageiro(p3);
        
         //Criando o Onibus 2
         Onibus cometa2 = new Onibus ();
         cometa2.setNumero(1513);
         cometa2.setPlaca("CVP-0502");
         cometa2.addPassageiro(p4);
         cometa2.addPassageiro(p5);
         cometa2.addPassageiro(p6);
         
         //Criando BusStation
         BusStation station = new BusStation();
         station.setCidade("Franca-SP");
         station.setNome("Mário Station");
         station.addOnibus(cometa1);
         station.addOnibus(cometa2);
         
         JOptionPane.showMessageDialog(null, station.toString());
         
         //Removendo Fedido e Onibus1 
         cometa2.removePassageiro(p4);
         station.removerOnibus(cometa1);
         JOptionPane.showMessageDialog(null, station.toString());
         
         //Adicionar Passageiro e onibus3
         Onibus cometa3 = new Onibus();
         cometa3.setNumero(1113);
         cometa3.setPlaca("BWE4836");
         cometa3.addPassageiro(p1);
         cometa3.addPassageiro(p2);
         cometa3.addPassageiro(p3);
         station.addOnibus(cometa3);
         
         cometa2.addPassageiro(p7);
         JOptionPane.showMessageDialog(null, station.toString());
         
         //Update nome do Passageiro, Onibus e estação 
         Passageiro p8 = new Passageiro("Ana","006");
         cometa2.uptdatePassageiro(p6, p8);
         JOptionPane.showMessageDialog(null, station.toString());
         
         
         
         
         //Remover Onibus1
         
         
    }
    
}
