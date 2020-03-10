
package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TesteRio {

    public static void main(String[] args) {
       //Criando Objetos
       String Onome = JOptionPane.showInputDialog("Informe o nome do rio: ");
       float Onivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível do rio: "));
       int aux = JOptionPane.showConfirmDialog(null, "Poluição do rio",
               "O rio está poluido?",JOptionPane.YES_NO_OPTION);
       boolean Opoluido = (aux == JOptionPane.YES_OPTION);
       
       Rio obj1 = new Rio (Onome, Onivel, Opoluido);
       obj1.chover(10);
       obj1.sujar();
       
       Rio obj2 = new Rio ("Sapucai", 100, true);
       obj2.ensolar(50);
       obj2.limpar();
       
       JOptionPane.showMessageDialog(null, obj1.toString());
       JOptionPane.showMessageDialog(null, obj2.toString());
    }
    
}
