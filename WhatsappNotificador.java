package exmodulo25;

public class WhatsappNotificador implements Notificador{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
