package Ejercicio1;
//Crea una clase Persona con nombre,edad y ciudad.
public class Persona {
    public  String nombre;
    public  int edad;
    public  String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrarSaludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String getNombre() {
        return nombre;
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pamela", 23, "La Paz");
        Persona persona2 = new Persona("Kevin", 15, "El Alto");
        Persona persona3 = new Persona("Julio", 22, "Las Lomas");

        persona1.mostrarSaludo();
        persona2.mostrarSaludo();
        persona3.mostrarSaludo();

        System.out.println("-----Verificamos si son mayores--------");
        System.out.println(persona1.getNombre() + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona2.getNombre() + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona3.getNombre() + " es mayor de edad: " + persona3.esMayorDeEdad());
    }
}