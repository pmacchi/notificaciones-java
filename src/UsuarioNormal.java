public class UsuarioNormal implements Usuario  {

    private String nombre;
    private String tipo;



    public UsuarioNormal(String nombre) {
        this.nombre = nombre;
        tipo = "normal";

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
        return "UsuarioNormal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
