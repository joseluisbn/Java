import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Creamos el fichero. El fichero se creará en el mismo directorio que el proyecto.

        File fichero = new File ("FicheroTexto2.txt");
        FileWriter fw = new FileWriter(fichero);

        String [] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
        
        for (int i = 0; i < planetas.length; i++){

            fw.write(planetas[i] + "\n");
        }

        fw.append('*');
        fw.close();
    }

}
