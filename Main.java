package exmodulo13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Alunos deseja cadastrar? ");
        int nAlunos = scanner.nextInt();

        System.out.println("qual a quantidade de provas no ano? ");
        int nProvas = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[nAlunos];

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + "\n");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Registro do aluno: ");
            String registroAluno = scanner.nextLine();

            Aluno aluno = new Aluno(nome, idade, registroAluno, nProvas);

            for (int j = 0; j < nProvas; j++) {
                double nota;

                while (true){
                    System.out.println("Nota " + (j + 1) + ": ");
                    nota = scanner.nextDouble();

                    if (nota >= 0 && nota <= 10) {
                        aluno.setNotas(j, nota);
                        break;
                    } else {
                        System.out.println("nota invalida, verifique se a nota é maior que 0 e menor que 10.");
                    }
                }
            }
            scanner.nextLine();
            alunos[i] = aluno;
        }

        for (Aluno aluno : alunos){
            System.out.println("\nAluno: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Registro: " + aluno.getRegistroAluno());

            System.out.println("Média das notas: " + aluno.calcularMedia());
        }
    }

}


