import java.util.List;
import java.util.Map;

public interface Notificacion {

    void enviar(Usuario usuario, String mensaje);

    void enviarAll(List<Usuario> listAux, String mensaje);


}
