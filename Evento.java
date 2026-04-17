package exmodulo22;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Evento {

    private String nome;
    private LocalDateTime dataHora;
    DiaDaSemana diaDaSemana;

    public Evento(String nome, int ano, int mes, int dia, int hora, int minuto, DiaDaSemana diaDaSemana) {
        this.nome = nome;
        this.dataHora = LocalDateTime.of(ano, mes, dia, hora, minuto);
        this.diaDaSemana = diaDaSemana;
    }

    public void exibirEvento(){
        System.out.println(nome);
        System.out.println(dataHora);
    }

    public void atualizarData(int dia){
        dataHora = dataHora.plusDays(dia);
    }

    public void converterHorario(){
        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZoneId gmt = ZoneId.of("GMT");

        ZonedDateTime eventoSP = dataHora.atZone(sp);
        ZonedDateTime eventoGMT = eventoSP.withZoneSameInstant(gmt);

        System.out.println("Horário de São Paulo: " + eventoSP);
        System.out.println("Horario GMT: " + eventoGMT);
    }

    @Override
    public String toString() {
        return "Evento Registrado" +
                "\nNome: " + nome +
                "\nData e Hora: " + dataHora +
                "\nDia da Semana: " + diaDaSemana;
    }

}
