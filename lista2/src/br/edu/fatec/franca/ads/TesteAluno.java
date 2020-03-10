
package br.edu.fatec.franca.ads;

import javax.swing.JOptionPane;

public class TesteAluno {

    
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(123456, "Mário" , 22, 9, 10);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, "A média é: " + obj1.notaFinal());
        
        //obj1.nome = "Roberto";
        //JOptionPane.showMessageDialog(null, (obj1.nome));
        // Não tem acesso ao obj1
        JOptionPane.showMessageDialog(null, "O aluno: " + obj1.getNome()
                + " foi aprovado? " + ((obj1.passou()) ? "Sim" : "Não"));
    }
    
}
