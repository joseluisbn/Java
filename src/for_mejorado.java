public class Main {

    public static void main(String[] args) {

        //Definición del array
        String [] instrumentos = new String[5];

        instrumentos[0] = "Piano";
        instrumentos[1] = "Viola";
        instrumentos[2] = "Oboe";
        instrumentos[3] = "Saxo";
        instrumentos[4] = "Erhu";

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
