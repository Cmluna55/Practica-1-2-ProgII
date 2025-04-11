//3.Crea una clase Coche con marca,modelo y velocidad
package Ejercicio3;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;


    public Coche(String marca,String modelo,int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidad=velocidad;
    }
    public void acelerar(){
        velocidad=velocidad+10;
        System.out.println("------------------------------");
        System.out.println("La velocidad aumenta a: " + velocidad);
    }
    public void frenar(){
        velocidad=velocidad-5;
        System.out.println("------------------------------");
        System.out.println("La velocidad disminuyo a: " + velocidad);
    }
    public void mostrar(){
        System.out.println("Coche: " + marca + " modelo: " + modelo + " -velocidad: " + velocidad + " Km/h");
    }
    public static void main(String[] args) {
        Coche coche1=new Coche ("TOYOTA","HILUX",40);
        Coche coche2=new Coche ("ZUZUKI","TAYRON",85);

        coche1.mostrar();
        coche2.mostrar();
        System.out.println("------------------------------");
        System.out.println("velocidad tras acelerar: ");
        coche1.acelerar();
        coche2.acelerar();
        System.out.println("------------------------------");
        System.out.println("frenar: ");
        coche1.frenar();
        coche2.frenar();


        
    }
    

    
}
