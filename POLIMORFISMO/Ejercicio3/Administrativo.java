package POLIMORFISMO.Ejercicio3;

public class Administrativo {
    public String nombre;
    public int sueldoMes;
    public String cargo;

    public Administrativo(String nombre, int sueldoMes,String cargo){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
        this.cargo=cargo;
    }
    public int SueldoTotal(){
        return sueldoMes;
    }
    public boolean SueldoMesiguala(int x){
        return sueldoMes == x;
    }   
    
}
