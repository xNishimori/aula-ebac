package exmodulo9;

import java.util.Scanner;

public class ExModulo9 {
    public static void main(String[] args) {

        tabuada();
        menu();

    }

    public static void tabuada(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a tabuada ");
        int numTabuada = scanner.nextInt();

        int n= 1;
        while (n <= 10){
            int resultado= numTabuada * n;

            System.out.println(numTabuada + " x " + n + " = " + resultado);
            n++;
        }
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        do{
            System.out.println("Escolha uma opção: \nOpcão 1: Continuar\nOpção 2: Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Escreva uma frase");
                String frase = scanner.nextLine();
                System.out.println(frase);
            } else if (opcao != 2) {
                opcao = 1;
                System.out.println("opção inválida\n");
                continue;
            }
        }while (opcao == 1);
        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
        scanner.close();
    }

}
