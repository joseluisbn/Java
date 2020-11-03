import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Generamos el número aleatorio con el método random

        int adivina = (int)(Math.random()*100);

        Scanner input = new Scanner(System.in);

        // Declaramos el número que introducirá posteriormente el usuario y los intentos

        int numero = 0;
        int intentos = 0;

        //Creamos el bucle while

        while(adivina!=numero){
            intentos++;
            System.out.println("Introduce un número");

            numero = input.nextInt();

            if(numero<adivina){
                System.out.println("Más alto");
            }
            else if(numero>adivina){
                System.out.println("Más bajo");
            }
        }

        System.out.println("¡Acertaste! Solo te ha costado " + intentos + " intentos");

        //Scanner input = new Scanner();

    }

}
