package POLIMORFISMO.Ejercicio7;
//7.Se hace referencia a algunos animales mediante las siguientes clases:
public class Animales {
    public static void main(String[] args) {
        //a)Instanciar 1 Perro, 1 Gato y 1 Pájaro.
        Perro perro = new Perro("BOBO", 3, "DOBERMAN");
        Gato gato = new Gato("MIMI", "NEGRO");
        Pajaro pajaro = new Pajaro("BIBI", "CANARIO");
        //b)Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
        System.out.println("------------------------------------------");

        System.out.println("-----SONIDOS DE LOS ANIMALES---");
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
        
        System.out.println("------------------------------------------");

        System.out.println("--------SONIDOS SOBRECARGA----------");
        perro.hacerSonido("FELIZ");
        gato.hacerSonido("TRISTE");
        pajaro.hacerSonido("TARDE");
        //c)Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
        System.out.println("---------MOVIMIENTOS----------");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }   
}
class Perro {
    String nombre, raza;
    int edad;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void hacerSonido(String estado) {
        if (estado.equalsIgnoreCase("enojado")) {
            System.out.println(nombre + " gruñe: Grrrr...");
        } 
        else 
            if (estado.equalsIgnoreCase("feliz")) {
                System.out.println(nombre + " ladra feliz: Guau guau guau!");
            } 
            else {
                hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta corriendo.");
    }
}
class Gato {
    String nombre, color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    public void hacerSonido(String estado) {
        if (estado.equalsIgnoreCase("enojado")) {
            System.out.println(nombre + " dice: Mmmmmmm!");
        } 
        else 
            if (estado.equalsIgnoreCase("contento")) {
                System.out.println(nombre + " ronronea: Purrr...");
            } 
            else {
                hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta rrascando.");
    }
}
class Pajaro {
    String nombre, tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void hacerSonido(String momento) {
        if (momento.equalsIgnoreCase("mañana")) {
            System.out.println(nombre + " canta: Lallalala!");
        } 
        else {
            hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta volando.");
    }
}
    
