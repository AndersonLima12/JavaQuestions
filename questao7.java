// QUESTÃO 7 JAVA

import java.util.Scanner;

public class questao7{
    public static void main(String[] args){
        int ano;
        Scanner d = new Scanner(System.in);
        System.out.print("Digite um ano para saber se é bissexto: ");
        ano = d.nextInt();
        
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto com 29 dias no mês de fevereiro");
            
        }else if((ano % 4 == 0)&& (ano % 100 != 0)){
            System.out.println(ano + " é bissexto com 29 dias no mes de fevereiro");
        }else{
            System.out.println(ano + " nao é bissexto com 28 dias no mes de fevereiro");
        }
    }
}
