import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int atsign = 0;
        boolean dot = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu correo electrónico");

        String email = input.nextLine();

        //String email = JOptionPane.showInputDialog("Introduce un correo electrónico");

        for (int i = 0; i<email.length(); i++)
        {
            if (email.charAt(i)=='@'){
                atsign++;
            }
            if (email.charAt(i)=='.'){
                dot = true;
            }
        }

        if (atsign == 1 && dot == true){

            System.out.println("El email introducido es válido");
        }
        else{
            System.out.println("El email introducido es erróneo");
        }
    }

}
