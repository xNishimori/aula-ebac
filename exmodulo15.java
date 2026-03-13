package exmodulo15;

import java.util.Scanner;

public class exmodulo15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int n = scanner.nextInt();
        System.out.println("A " + maneirasSubir(n) + " maneiras pra subir" );

    }

    public static int maneirasSubir(int n){

        if (n <= 2)
            return n;

        return maneirasSubir(n - 1) + maneirasSubir( n -2);
    }
}
