## POO (*WIP*)

1. Abstracción
2. Encapsulación
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

### Polimorfismo

A partir de un objeto que pertenece a una clase madre, puedo tener objetos creados por clases hijas.


```java

```

### Clases abstractas

- Una clase abstracta no puede ser instanciada. Al menos uno de sus métodos es abstracto, es decir, vamos a tener la definición del método, pero no se va a decir cómo funciona.
- Sus niveles de acceso deben ser public o protected (nunca private).
- Cuando se usan clases abstractas, una clase no puede heredar de varias clases abstractas a la vez (al contrario de las interfaces).


```java
public abstract class FiguraGeometrica{
    protected double x;
    protected double y;
    
    public abstract double calculoArea(); // No se implementa nada.
}
```

Se pueden hacer constructores, pero deben tener el nivel de acceso de protected.

Las clases abstractas se unan cuando se desea definir una abstracción que englobe objetos de distintos tipos y queremos utilizar el polimorfismo.

Para implementar los métodos abstractos en una clase hija, utilizamos *@Override* (sobreescritura de método).


```java
public class Triangulo extends Figura {
    
    @Override
    public double calculoArea() {
    // Implementación
    }
}
```

### Modificadores de acceso (¿Explicar en encapsulamiento?)

Ya lo vimos en las funciones.

- ***Public***: Puede ser utilizado desde cualquier clase y posición dentro de la aplicación.
- ***Private***: Se puede utilizar únicamente dentro de la clase en la que se ha declarado.
- ***Protected***: Puede utilizarse tanto dentro de la propia clase como las clases hijas, en caso de herencia.

Por defecto (buena práctica), todos los atributos de una clase se declaran como privados. Para poder modificarlos, utilizamos los getters y los setters.

## Bibliografía / Webgrafía
