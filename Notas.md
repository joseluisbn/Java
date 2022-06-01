## POO

1. Abstracción
2. Encapsulamiento
3. Polimorfismo
4. Herencia

Método constructor: es un método especial que se encarga de dar un estado inicial al objeto.

- Constructor vacío.
- Constructor con parámetros. *this*

Crear objeto (instanciar clase)


### Modularización

Dividir un programa en fragmentos o módulos (clases). Por ejemplo:

Cuando tenemos un programa divido en clases, siempre hay una clase principal, que es donde comienza la ejecución del programa. En Java es el método main.

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }

}
```

### Encapsulación

La funcionalidad de una clase solamente se hace desde la propia clase. Con el modificador de acceso private, podemos modificar los valores de la variable desde dentro de la clase, pero no desde fuera. Al encapsularlo, no es visible desde fuera de la clase.

Aquellas características comunes, que tengan que encapsularse:

```java
public class Bicicleta {
    private int ruedas;
    private int largo;
    private int ancho;
}
```

Entonces, si ya no podemos acceder a la propiedad desde fuera de la clase (puesto que no está visible), ¿cómo podemos ver sus atributos? A través de los métodos. A través de ellos, las clases podrán interactuar entre sí.


#### Getters y setters

Al tener las propiedades encapsuladas, para acceder a ellos desde fuera de la clase empleamos los métodos get y set (getters y setters).

- *Getters* o captadores: Se encarga de captar o proporcionar el valor de una propiedad.

Volviendo a nuestra bicicleta:

```java
// Dentro de la clase GETTER
public int getRuedas(){
    return ruedas;
};

// Fuera de la clase

System.out.println(getRuedas())
```

- *Setters* o definidores: Se encarga de definir o establecer el valor de una propiedad.

```java
// SETTER (no devuelve dato)
public void setColor(){
    color = "verde";
}
```

Por convención, los getters y los setters siempre van o antes de los métodos por defecto o después de los constructores.

### Herencia

Este mecanismo permite reutilizar clases. La nueva clase extiende la funcionalidad de una clase existente. De este modo no es necesario reescribir el código asociado a la nueva clase.

La nueva clase se denomina **subclase**, puede tener atributos y métodos propios, que no existían en la clase original. A su vez, los atributos que heredan de la clase original (esta clase original se denomina **superclase**).

Imaginemos una clase hijo, que hereda de la clase madre.

```java
public class Hijo extends Madre{
super(id, apellido);
this.nombre = nombre;
this.altura = altura;
}
```

### Modificadores de acceso

Ya lo vimos en las funciones.

- **Private**
- **Public**
- **Protected**
