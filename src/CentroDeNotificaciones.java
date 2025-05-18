import java.util.*;
import java.util.function.DoubleToIntFunction;

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

    public void enviarAMultiplesUsuarios(String tipo,  Map<Integer, Usuario> mapaUser, String mensaje, String tipoUsuario) {
        Notificacion n = NotificacionFactory.crearNotificacion(tipo);
        Logger lo = Logger.getInstance();
        BuscadorUsuarios bu = new BuscadorUsuarios();
        bu.setMapaAIterar(mapaUser, tipoUsuario );
        n.enviarAll(bu.getListaAux(), mensaje);

        lo.log(mensaje,tipo);

             }

    public void enviarUsuarios ( Map<Integer, Usuario> mapaUserNormal, String tipoDeUsuario) {


    }




}
