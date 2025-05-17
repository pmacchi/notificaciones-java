public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase().trim()) {
            case ("email") : return new NotificacionEmail();
            case ("sms") : return new NotificacionSMS();
            case ("push") : return new NotificacionPush();
            default:
                System.out.println("Opcion invalida");
        };
        return null;
    }
}




