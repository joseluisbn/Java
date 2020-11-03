import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Para la entrada de datos utilizaremos la clase Scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un texto");

        String texto = input.nextLine();

        System.out.println("Introduce un número");

        int numero = input.nextInt();

        System.out.println("Tu texto es " + texto + " y tu número es " + numero);

    }
}
