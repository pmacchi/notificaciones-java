public class UsuarioPremium implements Usuario {

    private String nombre;
    private String tipo;

    public UsuarioPremium(String nombre) {
        this.nombre = nombre;
        tipo = "premium";
    }

    @Override
    public void getNombre() {

    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
