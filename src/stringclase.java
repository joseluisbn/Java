public class Main {

    public static void main(String[] args) {

        //String en java no es un método primitivo, sino una clase

        String nombre = "Ernest Hemingway";

        //Métodos más usados

        //length() devuelve la longitud de una cadena de caracteres

        System.out.println("La longitud de la cadena nombre es " + nombre.length());

        //charAt(n) devuelve la posición de un carácter dentro de una cadena

        System.out.println(nombre.charAt(3));

        //substring(x,y) devuelve una subcadena dentro de la subcadena.

        System.out.println(nombre.substring(0,6));

        //equals(cadena): devuelve si dos cadenas son iguales o no. Devuelve true o false

        String nombre2 = "Pepe Viyuela";

        System.out.println(nombre.equals(nombre2));

    }
}
