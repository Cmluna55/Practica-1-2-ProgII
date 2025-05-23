//5. Definir las siguientes clases:
//a) Implementa las clases con sus constructores, getters y setters.
class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int añosAntigüedad;
    
    public Empleado(String nombre, String apellido, double salarioBase, int añosAntigüedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntigüedad = añosAntigüedad;
    }
    
    public double calcularSalario() {
        double bonoAntigüedad = salarioBase * (0.05 * añosAntigüedad);
        return salarioBase + bonoAntigüedad;
    }
    
    public void mostrar() {
        System.out.println("***Nombre: " + nombre + " " + apellido);
        System.out.println("Salario base: Bs." + salarioBase);
        System.out.println("Años de antigüedad: " + añosAntigüedad);
        System.out.printf("Salario total: Bs.%.2f%n", calcularSalario());
    }
}
class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;
    
    public Gerente(String nombre, String apellido, double salarioBase, int añosAntigüedad, String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, añosAntigüedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        return salario + bonoGerencial;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono gerencial: Bs." + bonoGerencial);
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }
}
class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;
    
    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntigüedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntigüedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double pagoHorasExtras = horasExtras * 15;
        return salario + pagoHorasExtras;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
        System.out.println("Horas extras: " + horasExtras);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
public class Ejercicio5 {
    public static void main(String[] args) {
        //b)Crea instancias de Gerente y Desarrollador y muestra su salario calculado.
        Gerente gerente1 = new Gerente("Andres", "Lopez", 5000, 5, "TI", 1200);
        Gerente gerente2 = new Gerente("Julia", "Herrera", 6000, 10, "Finanzas", 800);

        Desarrollador desarrollador1 = new Desarrollador("Kevin", "Luna", 3200, 3, "Python", 8);
        Desarrollador desarrollador2 = new Desarrollador("Camila", "Cruz", 3400, 4, "Java", 11);
        
        //Salarios calculados:
        System.out.println("\n---Salarios Calculados:");
        gerente1.mostrar();
        gerente2.mostrar();
        desarrollador1.mostrar();
        desarrollador2.mostrar();
        
        //c)Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
        Gerente[] gerentes = {gerente1, gerente2};
        System.out.println("\n-----Gerentes con bono gerencial mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
            }
        }
        
        // d)Muestra todos los desarrolladores que trabajan más de 10 horas extras.
        Desarrollador[] desarrolladores = {desarrollador1, desarrollador2};
        System.out.println("\n------Desarrolladores que trabajan más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
            }
        }
    }
}