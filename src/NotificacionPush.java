import java.util.Map;

public class NotificacionPush implements Notificacion{

    @Override
    public void enviar(Usuario usuario, String mensaje) {
        System.out.println("Enviando por PUSH a USUARIO "+ usuario + " : " + mensaje);
    }

    @Override
    public void enviarAll(Map<Integer, Usuario> mapaUser, String mensaje) {

    }
}


