import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        UserFactory userFactory = new UserFactory();
        userFactory.crearUsuario("normal", "Pablo");
        userFactory.crearUsuario("premium", "Pedro");
        userFactory.crearUsuario("normal", "Manuela");
        userFactory.crearUsuario("premium", "Josefina");
        userFactory.crearUsuario("normal", "Carlos");


        System.out.println(userFactory.usuariosNormales);
        System.out.println(userFactory.usuariosPremium);
        System.out.println(userFactory.todosLosUsuarios);


        CentroDeNotificaciones cdf = CentroDeNotificaciones.getInstance();

        cdf.enviarAMultiplesUsuarios("sms", userFactory.todosLosUsuarios, "Hola a todos!");


    }
}