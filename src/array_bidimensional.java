public class Main {

    public static void main(String[] args) {

        //Definición del array bidimensional

        int [][] matriz = new int[5][5];

        // para recorrer un array bidimensional se utilizan dos bucles for, uno para cada dimensión

        for (int i=0; i<5;i++){
            System.out.println();
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j]+ " ");
            }
        }

        System.out.println(); //marcando espacio entre columnas

        //imprimiendo con for mejorado

        for (int[]fila:matriz){
            System.out.println();
            for (int col:fila){
                System.out.print(col + " ");
            }
        }
    }
}
