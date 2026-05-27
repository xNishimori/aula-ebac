package exmodulo25;

public class Main {
    public static void main(String[] args) {

        new UsuarioService(new SmsNotificador()).registrar("Luan");
        System.out.println();

        new UsuarioService(new EmailNotificador()).registrar("Fran");
        System.out.println();

        new UsuarioService(new WhatsappNotificador()).registrar("Arthur");


    }
}
