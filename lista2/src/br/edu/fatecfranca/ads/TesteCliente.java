
package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;


public class TesteCliente {

   
    public static void main(String[] args) {
       Cliente obj1 = new Cliente ("12345--1", "1234-2", "Mário", 0);
       obj1.realizarDeposito(1000);
       obj1.realizarSaque(200);
       
       Cliente obj2 = new Cliente ("654321-2", "4321-1", "Roberto", 0);
       obj1.realizarDeposito(300);
       obj2.realizarSaque(100);
       
       JOptionPane.showMessageDialog(null, obj1.toString());
       JOptionPane.showMessageDialog(null, obj2.toString());
       
       
    }
    
}
