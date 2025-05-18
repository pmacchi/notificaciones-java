public class Logger {

    private static Logger instance;

    private Logger () {};

    public static Logger getInstance() {
        if ( instance == null ) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String mensaje, String tipo) {
        System.out.println("Se envió mediante [" + tipo.toUpperCase() + "] el siguiente mensaje: " + mensaje);
    };
}
