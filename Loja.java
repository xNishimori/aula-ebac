package exmodulo23;

import java.util.Scanner;

public class Loja {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto[] carrinho = new Produto[100];

        int[] quantidades = new int[100];
        int totalItens = 0;
        int opcao;

        System.out.println("***** Bem-vindo à Loja *****");

        do {
            System.out.println("Escolha um produto:");
            System.out.println("1 - Televisão");
            System.out.println("2 - Rádio");
            System.out.println("3 - Video-Game");
            System.out.println("4 - Tablet");
            System.out.println("5 - Celular");
            System.out.println("0 - Finalizar compra");

            opcao = scanner.nextInt();

            Produto produto = null;

            switch (opcao) {
                case 1:
                    produto = new Televisao();
                    break;
                case 2:
                    produto = new Radio();
                    break;
                case 3:
                    produto = new VideoGame();
                    break;
                case 4:
                    produto = new Tablet();
                    break;
                case 5:
                    produto = new Celular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            if (opcao != 0) {

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                if (quantidade <= 0) {
                    System.out.println("Quantidade inválida!");
                    continue;
                }

                carrinho[totalItens] = produto;
                quantidades[totalItens] = quantidade;

                totalItens++;

                System.out.println("Produto adicionado!");
            }

        } while (opcao != 0);

        double total = 0;

        System.out.println("***** Total da Compra *****");

        for (int i = 0; i < totalItens; i++) {

            Produto p = carrinho[i];
            double subtotal = p.getValor() * quantidades[i];
            total += subtotal;
            System.out.println(p.getNome() + " | Quantidade: " + quantidades[i] + " | Subtotal: R$ " + subtotal);
        }

        System.out.println("Valor Total: R$ " + total);

        scanner.close();
    }
}
