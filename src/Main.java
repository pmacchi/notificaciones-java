import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        UserFactory userFactory = new UserFactory();
        userFactory.crearUsuario("normal", "Pablo");
        userFactory.crearUsuario("premium", "Pedro");
        userFactory.crearUsuario("normal", "Manuela");
        userFactory.crearUsuario("premium", "Josefina");
        userFactory.crearUsuario("normal", "Carlos");

        CentroDeNotificaciones cdf = CentroDeNotificaciones.getInstance();


        cdf.enviarAMultiplesUsuarios("sms", userFactory.todosLosUsuarios, "Hola Mundo", "premium");


    }
}