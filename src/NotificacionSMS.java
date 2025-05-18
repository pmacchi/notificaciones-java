import java.util.List;
import java.util.Map;

public class NotificacionSMS implements Notificacion{

    @Override
    public void enviar(Usuario usuario, String mensaje) {
        System.out.println("Enviando por SMS a USUARIO "+ usuario + " : " + mensaje);
    }

    @Override
    public void enviarAll(List<Usuario> listAux, String mensaje) {

    }
}

