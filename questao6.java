// QUESTÃO 6 JAVA

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        Float n1, n2, n3, maior, menor;
        
        Scanner n = new Scanner (System.in);
        System.out.print("Informe número1: ");
        n1 = n.nextFloat();
        System.out.print("Informe número2: ");
        n2 = n.nextFloat();
        System.out.print("Informe número3: ");
        n3 = n.nextFloat();
        
        if(n1>n2 && n1>n3 ){
            maior = n1;
        }else if(n2>n1 && n2>n3){
            maior = n2; 
        }else{
            maior = n3;
        }
        
        if(n1<n2 && n1<n3){
            menor = n1;
        }else if(n2<n1 && n2<n3){
            menor = n2;
        }else{
            menor = n3;
        }
        
        
        
        System.out.println("Maior número é: " + maior);
        System.out.println("Menor número é: " + menor);
    }
}