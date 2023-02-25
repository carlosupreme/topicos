package Entidades;

public class Sesion {

    public static User user = new User();

    public static void login(User user) {
        Sesion.user = user;
    }

    public static void logout() {
        Sesion.user = new User();
    }
}
