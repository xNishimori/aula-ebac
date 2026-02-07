package exmodulo14;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int indice = 0;
        int maximoReserva = 10;
        Reserva[] reservas = new Reserva[maximoReserva];
        int opcao = 0;

        //Loop para o Menu
        while(opcao != 9) {
            System.out.println("******** Menu ********" +
                    "\n1- Nova Reserva" +
                    "\n2- Listar Reservas" +
                    "\n3- Buscar Reservas" +
                    "\n4- Ordernar Reservas" +
                    "\n5- Cadastrar Cliente" +
                    "\n9- Sair" +
                    "\n**********************");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: //Cadastrar reserva
                    System.out.println("Nome do hospede: ");
                    String nomeHospede = scanner.nextLine();

                    int numeroDiarias = 0;

                    do {
                        System.out.println("Número de diárias: ");
                        numeroDiarias = scanner.nextInt();
                        scanner.nextLine();
                    if (numeroDiarias < 0) {
                        System.out.println("Número de diárias invalido");
                    }
                    } while (numeroDiarias < 0);

                    System.out.println("Tipo do quarto:" +
                            "\n1- Standard" +
                            "\n2- Luxo" +
                            "\n3- Presidencial");

                    int quarto = scanner.nextInt();
                    scanner.nextLine();

                    String tipoQuarto = "";

                    while (true) {
                        if (quarto == 1) {
                            tipoQuarto = "Standard";
                            break;
                        } else if (quarto == 2) {
                            tipoQuarto = "Luxo";
                            break;
                        } else if (quarto == 3) {
                            tipoQuarto = "Presidencial";
                            break;
                        } else {
                            System.out.println("Opção invalida.");
                            quarto = scanner.nextInt();
                            scanner.nextLine();
                        }
                    }

                    double valorDiaria = 0;

                    do {
                        System.out.println("Valor da diária: ");
                        valorDiaria = scanner.nextDouble();
                        if (valorDiaria <= 0) {
                            System.out.println("Valor invalido.");
                        }
                    } while (valorDiaria <= 0);

                    System.out.println("**********************" +
                            "\nHospede: " + nomeHospede +
                            "\nDiárias: " + numeroDiarias +
                            "\nQuarto: " + tipoQuarto +
                            "\nValor da diária: " + valorDiaria +
                            "\nValor total: R$ " +valorDiaria * numeroDiarias +
                            "\n**********************");

                    System.out.println("Deseja confimar? \n1 - Sim\n2 - Não");
                    int confirmar = scanner.nextInt();
                    scanner.nextLine();

                    if(confirmar == 1){
                        Reserva reserva = new Reserva(nomeHospede, tipoQuarto, numeroDiarias, valorDiaria);

                        if (indice < maximoReserva) {
                            reservas[indice] = reserva;
                            indice++;
                        } else {
                            System.out.println("Numero maximo de reservas atingido");
                        }
                        break;
                    }else {
                        System.out.println("Reserva cancelada");
                        break;
                    }
                case 2: // Listar reservas
                    for (int i = 0; i < maximoReserva; i++) {
                        if(reservas[i] != null) {
                            System.out.println(reservas[i]);
                        }
                    }
                    break;
                case 3: //Buscar reserva por nome ou sobrenome,ignorando maiusculas ou minusculas
                    System.out.println("Nome do Hospede: ");
                    String nome = scanner.nextLine();

                    for (int i = 0; i < maximoReserva; i++){
                        if(reservas[i] != null) {
                            if (reservas[i].getNomeHospede().toLowerCase().contains(nome.toLowerCase())) {
                                System.out.println(reservas[i]);
                            }
                        }
                    }
                    break;
                case 4: //Ordernar Reservas
                    for (int i = 0; i < indice; i++){
                        for (int j = i; j < indice; j++) {
                            if (reservas[i].getNumeroDiarias() < reservas[j].getNumeroDiarias()) {
                                Reserva aux = reservas[i];
                                reservas[i] = reservas[j];
                                reservas[j] = aux;
                            }
                        }
                    }
                    for (Reserva reserva : reservas){
                        if (reserva != null){
                        System.out.println(reserva);
                        }
                    }
                    break;
                case 9:
                    System.out.println("obrigado por usar nosso serviço");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
