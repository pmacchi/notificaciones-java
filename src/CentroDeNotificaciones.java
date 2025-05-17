import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentroDeNotificaciones {

    private static CentroDeNotificaciones instance;

    private Map<Integer, String> historial = new HashMap<>();
    private  Integer clave = 1;


    private CentroDeNotificaciones (){}

    public static CentroDeNotificaciones getInstance (){
        if ( instance == null ) {
            instance = new CentroDeNotificaciones();
        }
        return instance;
    }

    public void enviar (String tipo, String mensaje, Usuario usuario) {

        Notificacion n = NotificacionFactory.crearNotificacion(tipo);
        n.enviar(usuario, mensaje);
        Logger.getInstance().log(tipo, mensaje);
        historial.put(clave, mensaje);
        clave = clave + 1;
    }

    public Map<Integer, String> getHistorial() {
        return historial;
    }

    public void enviarAMultiplesUsuarios(String tipo,  Map<Integer, Usuario> mapaUser, String mensaje) {
        Notificacion n = NotificacionFactory.crearNotificacion(tipo);
        n.enviarAll(mapaUser, mensaje);
        System.out.println("Se envió: " + mensaje);
        System.out.println("A los siguientes usuarios: " + mapaUser);
            }


}
