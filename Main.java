package exercicio21;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Luan", 37);
        Pessoa pessoa2 = new Pessoa("Fran", 36);
        Pessoa pessoa3 = new Pessoa("Arthur", 15);
        Pessoa pessoa4 = new Pessoa("Ana", 7);
        Pessoa pessoa5 = new Pessoa("João", 40);
        Pessoa pessoa6 = new Pessoa("Luan", 37);
        Pessoa pessoa7 = new Pessoa("Fran", 36);
        Pessoa pessoa8 = new Pessoa("Arthur", 20);
        Pessoa pessoa9 = new Pessoa("Pedro", 50);
        Pessoa pessoa10 = new Pessoa("Ana", 7);

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        pessoas.add(pessoa8);
        pessoas.add(pessoa9);
        pessoas.add(pessoa10);

        System.out.println("Quantidade de pessoas na lista: " + pessoas.size());
        System.out.println();

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        System.out.println();
        System.out.println("Dados repetidos (mesmo nome e idade), não foram adicionados na lista.");


    }

}
