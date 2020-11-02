public class Main {

    public static void main(String[] args) {

        //Declaramos la variable
        int a = 5;

        //Definimos el bucle while

        while (a == 5)
        {
            System.out.println("Esto es un bucle infinito");
        }

            /*Como a siempre va a ser igual a 5, el bucle no se terminará nunca
             y la consola no parará de imprimir texto.

            Como ejemplo para comprobar su comportamiento, es válido, pero a nivel de programa
            es un grave error de desarrollo, ya que una de las condiciones de la programación es que tiene que ser finito.
            Si cambiásemos el valor de la variable a, el bucle no se ejecutaría y el programa se detendría.
             */
    }

}
