public class Main {

    public static void main(String[] args) {

        try {
            int[] matriz = {1, 2, 3};

            System.out.println(matriz[5]);

        } catch (Exception e) {
            System.out.println("Matriz fuera de rango");
        }
    }
}
