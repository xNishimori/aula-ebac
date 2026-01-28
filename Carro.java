package exmodulo12;

import java.util.Scanner;

public class Carro {

    int quantidadeCarros;
    String [] nomeCarro;
    double [] valorCarro;
    int tamanhoLista = 0;

    public void criarLista() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Defina a quantidade de carros para criar (maximo 50)");
            tamanhoLista = scanner.nextInt();

            if (tamanhoLista > 50) {
                System.out.println("quantidade maior que 50.\n");
            }
        }
        while (tamanhoLista > 50);
        scanner.nextLine();

        nomeCarro = new String[tamanhoLista];
        valorCarro = new double[tamanhoLista];

        for(int i = 0; i < tamanhoLista; i++){

            System.out.println(i + 1 + " - Marca do Veiculo: ");
            nomeCarro[i] = scanner.nextLine();

            System.out.println("valor do veículo: R$ ");
            valorCarro[i] = scanner.nextDouble();
            scanner.nextLine();

            quantidadeCarros++;
        }
    }

    public void exibirLista(){
        System.out.println("Lista Veiculos Cadastrados");
        for (int i = 0; i < nomeCarro.length; i++){
            System.out.println(i + 1 +" - " + nomeCarro[i]);
        }
    }

    public void totalCadastrado(){
        System.out.println("Total de veículos Cadastrados: " +quantidadeCarros);
    }

    public void valorTotal(){
        double valorTotalLista = 0;
        for (int i = 0; i < valorCarro.length; i++){
            valorTotalLista += valorCarro[i];
        }
        System.out.println("Valor total dos Veículos cadastrados: R$ " + valorTotalLista);
    }


}
