import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Definición del array
        String [] instrumentos = new String[5];

        //Introducción de datos con JOptionPane

        for (int i=0; i< instrumentos.length;i++){
            instrumentos[i]= JOptionPane.showInputDialog("Introduce el instrumento " + (i+1));
        }

        //Recorrido con bucle for
        for (int i=0; i<instrumentos.length; i++) {

            System.out.println(i+1 + ". " + instrumentos[i]);
        }

        //for each o bucle for mejorado

        for (String i:instrumentos){
            System.out.println(i);
        }
    }
}
