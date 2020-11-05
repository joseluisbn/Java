public class Main {

    public static void main(String[] args) {

        //varias formas de declarar un array

        int [] matriz1 = new int[3];

        matriz1[0] = 3;
        matriz1[1] = 2;
        matriz1[2] = 1;

        int [] matriz2 = {3, 2, 1};

        //Imprimimos una posición de la matriz
        System.out.println(matriz1[1]);

        //Para imprimir todas las posiciones se utiliza el bucle for

        for(int i=0;i< matriz1.length;i++){
            System.out.println(matriz1[i]);
        }

    }

}
