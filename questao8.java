// QUESTÃO 8 JAVA

import java.util.Scanner;

public class questao8{

private static Scanner reader = new Scanner(System.in);

public static void main(String[] args){
System.out.print("Digite uma letra de A a Z: ");
String nome = reader.next();
char c = Character.toLowerCase(nome.charAt(0)); // converte o primeiro caractere para minúsculo
if ('a' <= c && c <= 'z') { // vejo se é letra
    // aqui dentro do if, com certeza é uma letra de "a" a "z"
    switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.printf("'%s' é uma vogal", nome);
            break;

        // como aqui eu sei que "c" é uma letra, então se não for vogal, com certeza é consoante
        default:
            System.out.printf("'%s' é uma consoante", nome);
            break;
    }
	} else { // se cair no else, é porque não é uma letra de "a" a "z"
   		 System.out.printf("'%s' não é nem vogal e nem consoante", nome);
	}
	}
}
