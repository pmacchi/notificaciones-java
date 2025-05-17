import java.util.Map;

public interface Notificacion {

    void enviar(Usuario usuario, String mensaje);

    void enviarAll(Map<Integer,Usuario> mapaUser, String mensaje);
}
