// QUESTÃO 5 JAVA

import java.util.Scanner;
import javax.swing.JOptionPane;

public class questao5 {
    
    public static void main(String args[]) {
	try (Scanner input = new Scanner( System.in )) {
    }  
    String c = "";
    int a = 1;  
    int tamanho;  
    int b = 0;
    String saida = "";
    
   c = JOptionPane.showInputDialog("Digite o tamanho da sequencia: ");  
   tamanho = Integer.parseInt(c);  
      
    for (int i = 0; i < tamanho; i++)    
    {    
        System.out.print(b + ",");    
        b = b + a;    
        a = b - a;    
    }    
    JOptionPane.showMessageDialog(null,saida);
    }
}
