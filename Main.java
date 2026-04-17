package exmodulo22;

public class Main {
    public static void main(String[] args) {

        Evento evento = new Evento("Festa Aniversário", 2026, 04, 16, 20, 00, DiaDaSemana.QUINTA);

        System.out.println(evento);
        

        evento.exibirEvento();

        evento.atualizarData(5);
        evento.exibirEvento();

        evento.converterHorario();










    }
}
