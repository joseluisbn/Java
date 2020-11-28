import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Creamos el fichero. El fichero se creará en el mismo directorio que el proyecto.

        File fichero = new File ("FicheroTexto.txt");
        FileWriter fw = new FileWriter(fichero);

        String cadena = "Prueba de texto con ficheros de texto";

        //Opción 1: Caracteres

        // Cadena transformada a caracteres sueltos

        char[] arrayCadena = cadena.toCharArray();

        //Recorremos el array

        for (int i = 0; i < arrayCadena.length; i++){

            fw.write(arrayCadena[i]);
        }

        fw.append('*');
        fw.close();
    }

}
