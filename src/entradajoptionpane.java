import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Para la entrada de datos utilizaremos la clase JOptionPane

        String texto = JOptionPane.showInputDialog("Introduce un texto");

        String numero = JOptionPane.showInputDialog("Introduce un número");

        int numeroint = Integer.parseInt(numero);

        System.out.println("Tu texto es " + texto + " y tu número es " + numeroint);
    }
}
