package exmodulo8;

import java.util.Scanner;

public class ExModulo8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite um numero positivo: ");
        int numero = scanner.nextInt();

        for (int n = 0; n <= numero; n++){
            System.out.println(n);
        }

        System.out.println(); //pula linha

        for (int n = 0; n <= numero; numero--) {
            System.out.println(numero);
        }

        System.out.println(); //pula linha

        if(nome.length() < 6){
            System.out.println(nome);
        }else {
            for (int n = 0; n < nome.length(); n++){
                System.out.println(nome);
            }
        }

    }
}
