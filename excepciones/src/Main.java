import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el correo del usuario");
        String correo = teclado.next();
        char inicial = correo.charAt(0);
        try {
            if (!correo.contains("@")) {
                throw new ExcepcionSimbolo("Debe tener el símbolo @");
            }
            if (!correo.endsWith(".com") && !correo.endsWith(".es")) {
                throw new ExcepcionDominio("El correo debe terminar en .com o .es");
            }
            if (Character.isDigit(inicial)) {
                throw new ExcepcionInicio("El correo no puede empezar por número");
            }
        } catch (ExcepcionSimbolo | ExcepcionDominio | ExcepcionInicio c) {
            System.out.println("El correo no es correcto");
            System.err.println(c.getMessage());
        }


    }
}