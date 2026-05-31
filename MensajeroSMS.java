class MensajeroSMS extends Mensajero {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Enviando SMS al número [" + destinatario + "]: " + mensaje);
    }
}