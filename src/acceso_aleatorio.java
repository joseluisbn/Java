import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {

        File f = new File("libros.dat");

        //El constructor recibe dos parámetros: el fichero y el modo de acceso al mismo

        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");

            String [] titulo = {"Hyperion", "Dune", "Pórtico"};
            Double precio [] = {19.95, 15.95, 12.95};
            String [] autor = {"Dan Simmons", "Frank Herbert", "Frederik Pohl"};

            //definimos el buffer para almacenar el fichero

            StringBuffer sb = null;

            for (int i = 0; i < titulo.length; i++){

                raf.write(i+1);
                sb = new StringBuffer(titulo[i]);
                sb.setLength(10);
                raf.writeChars(sb.toString());
                raf.writeChars(autor[i]);
                raf.writeDouble(precio[i]);

            }

            raf.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
