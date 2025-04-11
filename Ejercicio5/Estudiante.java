package Ejercicio5;
//5.Crea una clase Estudiante con nombre, nota_1,nota_2
public class Estudiante {
    public String nombre;
    public int nota_1;
    public int nota_2;

    public Estudiante(String nombre,int nota_1,int nota_2){
        this.nombre=nombre;
        this.nota_1=nota_1;
        this.nota_2=nota_2;
    }
    public double calcularPromedio(){
        return(nota_1+nota_2)/2;
    }
    public void VerificarAprobo(){
        if(calcularPromedio()>=6){
            System.out.println("EL ESTUDIANTE " + nombre + "APROBO");
        }
        else{
            System.out.println("EL ESTUDIANTE " + nombre + " REPROBO");
        }
    }
    public void mostrar(){
        System.out.println("Nombre: " + nombre + " nota_1: " + nota_1 + " nota_2: " + nota_2);
    }
    public static void main(String[] args) {
        Estudiante estudiante1= new Estudiante("Carlos Gutierrez ", 6, 6);
        Estudiante estudiante2= new Estudiante("Carolina Mamani ", 7, 8);
        Estudiante estudiante3= new Estudiante("Pedro Calle ", 2, 8);
        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();

        System.out.println("-----NOTAS--------");
        System.out.println(estudiante1.nombre + " : Promedio: " + estudiante1.calcularPromedio());
        estudiante1.VerificarAprobo();
        System.out.println(estudiante2.nombre + " : Promedio: " + estudiante2.calcularPromedio());
        estudiante2.VerificarAprobo();
        System.out.println(estudiante3.nombre + " : Promedio: " + estudiante3.calcularPromedio());
        estudiante3.VerificarAprobo();
    }
    
}

