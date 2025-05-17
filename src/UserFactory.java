import java.util.HashMap;
import java.util.Map;

public class UserFactory {

    Map<Integer, Usuario> todosLosUsuarios = new HashMap<>();
    Map<Integer, Usuario> usuariosNormales = new HashMap<>();
    Map<Integer, Usuario> usuariosPremium = new HashMap<>();

    private Integer idNormal = 0;
    private Integer idPremium = 0;
    private Integer idGlobal = 0;

    public Usuario crearUsuario(String tipo, String nombre) {
        if (tipo.equals("normal")) {
            Usuario nuevo = new UsuarioNormal(nombre);

            idNormal = idNormal + 1;
            idGlobal++;
            usuariosNormales.put(idNormal, nuevo);
            todosLosUsuarios.put(idGlobal, nuevo);
            return nuevo;


        } else if (tipo.equals("premium")) {
            Usuario nuevo = new UsuarioPremium(nombre);

            idPremium = idPremium + 1;
            idGlobal++;
            usuariosPremium.put(idPremium, nuevo);
            todosLosUsuarios.put(idGlobal, nuevo);
            return nuevo;


        } else
        {
            System.out.println("ERROR DEL SISTEMA");
            return null;
        }
    }

    public Map<Integer, Usuario> getUsuariosPremium() {
        return usuariosPremium;
    }

    public Map<Integer, Usuario> getUsuariosNormales() {
        return usuariosNormales;
    }

    public Map<Integer, Usuario> getTodosLosUsuarios() {
        return todosLosUsuarios;
    }


}
