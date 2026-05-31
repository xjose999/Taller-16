public class PruebaMensajeria {
    public static void main(String[] args) {
        String texto = "Tu código de verificación es 4581";


        Mensajero email = new Mensajero();


        Mensajero sms = new MensajeroSMS();
        Mensajero push = new MensajeroPush();


        email.enviarMensaje(texto, "manuel@email.com");
        sms.enviarMensaje(texto, "+573001234567");
        push.enviarMensaje(texto, "User_Device_ID_9921");
    }
}