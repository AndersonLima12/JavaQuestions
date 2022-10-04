import java.util.Scanner;

public class TesteElevador {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int elevadorAndares = Integer.parseInt(teclado.nextLine());
        Elevador elevador = new Elevador(elevadorAndares);

        while(true){
            String menu = "0 - Terminar (sair)\n" + 
                          "1 - Digitar o andar destino desejado\n" +
                          "2 - Imprimir o andar atual do elevador";
                          
            System.out.println(menu);

            int comando = Integer.parseInt(teclado.nextLine());

            if(comando ==1){
                int andarDestino = Integer.parseInt(teclado.nextLine());

                int[] andares;
                andares = elevador.irPara(andarDestino);

                for(int i=0; i<andares.length; i++)
                    System.out.println("=>" + andares[i]);
            } else if(comando == 2){
                System.out.println(elevador.getAndarAtual());
            } else {
                break;
            }
        }
        teclado.close();
    }
}
