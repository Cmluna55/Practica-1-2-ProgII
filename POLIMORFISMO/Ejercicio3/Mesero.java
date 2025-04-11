package POLIMORFISMO.Ejercicio3;

public class Mesero {
    public String nombre;
    public int sueldoMes;
    public int horasExtra;
    public float sueldoHora;
    public float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
        this.horasExtra=horasExtra;
        this.sueldoHora=sueldoHora;
        this.propina=propina;
    }
    //b)Sobrecargar el método SueldoTotal para mostrar el sueldo total, 
    //sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
    public int SueldoTotal(){
        return sueldoMes+(int)(horasExtra*sueldoHora+propina);
    }
    public boolean SueldoMesiguala(int x){
        return sueldoMes == x;
    }   
}
