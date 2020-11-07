//Creación de clase.

public class Computadora {
    //Los atributos siempre tienen que ser privados
    private String nombre = "";
    private int hd = 0;
    private int memoria =0;

    //Creación de constructores. Siempre que creemos un objeto, esto va a tener los siguientes valores asignados.

    public Computadora(){
        nombre = "Alienware";
        hd = 1;
        memoria = 16;
    }

    //nuevo constructor

    public Computadora(int hd, int memoria){
        nombre = "HP Omen";
        this.memoria = memoria;
        this.hd = hd;
    }

    public String toString(){
        return "La computadora tiene las siguientes características: Nombre "+nombre+", hd"+hd+" y memoria "+memoria;
    }

}
