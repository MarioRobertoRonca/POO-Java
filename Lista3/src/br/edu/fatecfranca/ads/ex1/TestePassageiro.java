
package br.edu.fatecfranca.ads.ex1;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestePassageiro {

    
    public static void main(String[] args) {
       //Objeto parte 1 Passageiro
       Passageiro objparte1 = new Passageiro();
       objparte1.setNome("Mário Roberto");
       objparte1.setCpf("350347678-48");
       
       //Objeto parte 2 Pate Voo
       Voo objparte2 = new Voo();
       objparte2.setNumero("447");
       objparte2.setDestino("Paris");
       
       //Objeto todo
       Reserva objtodo = new Reserva();
       //Data
       Calendar d = Calendar.getInstance();
       d.set(2001, 8, 11);
       objtodo.setCodigo(12345);
       objtodo.setData(d.getTime());
       
       //Associação e Agregação 
       objtodo.setPassageiro(objparte1);
       objtodo.setVoo(objparte2);
       //Mostrar
       JOptionPane.showMessageDialog(null, objtodo.toString());
       
       //Reservar
       String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
       String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
       int reserva = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da reserva: "));
      
      objtodo.setCodigo(reserva);
      d.set(2014, 3, 11);
      objtodo.getPassageiro().setNome(nome);
      objtodo.getPassageiro().setCpf(cpf);
      objtodo.getVoo().setNumero("111");
      objtodo.getVoo().setDestino("Genebra");
    
      //Mostrar
      JOptionPane.showMessageDialog(null, objtodo.toString());
      
    }
    
   
    
}
