package exmodulo10;

import java.util.Scanner;

public class ExModulo10 {
    public static void main(String[] args) {

        exercicio1();
        exercicio2();
        exercicio3();

    }

    private static void exercicio1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero para a posição " + i);
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length; i++){
            for(int j = i; j < vetor.length; j++){
                if(vetor[j] < vetor[i]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for (int vetores : vetor){
            System.out.println(vetores);
        }
        contadorVogais();
    }

    private static void contadorVogais(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome ");
        String nome = scanner.nextLine().toLowerCase();

        char[] letras = nome.toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        for (int i = 0; i < nome.length(); i++){
            for (int j = 0; j < vogais.length; j++){
                if(letras[i] == vogais[j]){
                    contador++;
                }
            }
        }
        System.out.println("Esse nome possui: " + contador + " vogais");
    }

    private static void exercicio2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero para a posição " + i);
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                vetor[i] *= 2;
            }else {
                int resultado = (int) Math.pow(vetor[i], 2);
                vetor[i] = resultado;
            }

        }
        for (int vetores : vetor){
            System.out.println(vetores);
        }
    }

    private static void exercicio3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um uma palavra: ");
        String palavra = scanner.nextLine();
        String palavraInvertida = "";

        for (int i = 0; i <= palavra.length() -1; i++){
            palavraInvertida = String.valueOf(palavra.charAt(i)).concat(palavraInvertida);

        }
        System.out.println(palavraInvertida);
    }

}


