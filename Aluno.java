package exmodulo13;

public class Aluno {

    private String nome;
    private int idade;
    private String registroAluno;
    private double[] notas;


    public Aluno(String nome, int idade, String registroAluno, int nProvas){
        this.nome = nome;
        this.idade = idade;
        this.registroAluno = registroAluno;
        this.notas = new double[nProvas];
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRegistroAluno() {
        return registroAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRegistroAluno(String registroAluno) {
        this.registroAluno = registroAluno;
    }

    public void setNotas(int indice, double nota) {
        this.notas[indice] = nota;
    }

    public double calcularMedia(){
        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

}
