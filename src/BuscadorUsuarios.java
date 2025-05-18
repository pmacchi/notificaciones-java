import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BuscadorUsuarios {

   private Map<Integer, Usuario> mapaAIterar;

   private List<Usuario> listaAux=new ArrayList<Usuario>();



    public void setMapaAIterar(Map<Integer, Usuario> mapaAIterar, String tipoUsuario) {
        for (Integer i : mapaAIterar.keySet()) {
            Usuario u = mapaAIterar.get(i);

            if (u.getTipo().equals(tipoUsuario)) {
                System.out.println("El usuario: " + u + " es de categoría " + tipoUsuario + " agregado a la lista de envío.");
                listaAux.add(u);
                };
        }
    }

    public List<Usuario> getListaAux() {
        return listaAux;

    }
}
