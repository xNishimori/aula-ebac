package exmodulo14;

public class Reserva {

    private String nomeHospede;
    private String tipoQuarto;
    private int numeroDiarias;
    private double valorDiaria;


    //Construtor
    public Reserva(String nomeHospede, String tipoQuarto, int numeroDiarias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDiarias = numeroDiarias;
        this.valorDiaria = valorDiaria;
    }
    public Reserva(String nomeHospede, String tipoQuarto){
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
    }

    //Metodo
    public double calcularValorTotal(){
        return valorDiaria * numeroDiarias;
    }
       
    //Getters
    public String getNomeHospede() {
        return nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public int getNumeroDiarias() {
        return numeroDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    //Setters
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public void setNumeroDiarias(int numeroDiarias) {
        this.numeroDiarias = numeroDiarias;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }



    @Override
    public String toString() {
        return "****** Reserva: ******" +
                "\nHospede: " + nomeHospede +
                "\nDiárias: " + numeroDiarias +
                "\nTipo do quarto: " + tipoQuarto +
                "\nValor da diária: R$" + valorDiaria +
                "\nValor Total: R$" + calcularValorTotal() + "\n";
    }
}
