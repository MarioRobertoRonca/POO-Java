
package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TesteProduto {
    
    public static void main(String[] args) {
        // Criando Objetos
        
        int oId = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite o ID do produto: "));
        String oDesc = JOptionPane.showInputDialog(
        "Digite a descrição do produto: ");
        int oQtde = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite a quantidade do produto"));
        float oPreco = Float.parseFloat(JOptionPane.showInputDialog(
        "Digite o preço do produto: "));
        

        Produto obj1 = new Produto(1113, 200, "brocolis", 10);
        obj1.comprar(30);
        obj1.subir(3);
        
       Produto obj2 = new Produto(123, 100, "abacate", 3);
        obj2.vender(10);
        obj2.descer(1);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }    
        
    
}
