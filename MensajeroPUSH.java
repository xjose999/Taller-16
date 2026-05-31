class MensajeroPush extends Mensajero {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Enviando Notificación Push al dispositivo [" + destinatario + "]: " + mensaje);
    }
}
