package exmodulo25;

public class EmailNotificador implements Notificador{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
