import java.util.Scanner;

public class ExModulo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        }else {
            System.out.println("Os números são iguais!");
        }

    }
}