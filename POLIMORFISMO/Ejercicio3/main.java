package POLIMORFISMO.Ejercicio3;
//3.Un restaurante organiza a su personal mediante las siguientes clases:
public class main {
    public static void main(String[] args) {
        // a) Instanciar 1 Cocinero, 2 Meseros y 2 Administrativos
        Cocinero cocinero = new Cocinero("Mario", 1000, 5, 90);

        Mesero m1 = new Mesero("Perla", 1200, 2, 80, 500);
        Mesero m2 = new Mesero("Carlos", 8500, 1, 50, 300);

        Administrativo admi1 = new Administrativo("Carolina gomez", 1300, "Gerente");
        Administrativo admi2 = new Administrativo("Richard Silva", 1250, "Contador");

        // b) Mostrar sueldo total
        System.out.println("== Sueldos Totales ==");
        System.out.println(cocinero.nombre + " (Cocinero): Bs." + cocinero.SueldoTotal());
        System.out.println(m1.nombre + " (Mesero): Bs." + m1.SueldoTotal());
        System.out.println(m2.nombre + " (Mesero): Bs." + m2.SueldoTotal());
        System.out.println(admi1.nombre + " (Administrativo): Bs." + admi1.SueldoTotal());
        System.out.println(admi2.nombre + " (Administrativo): Bs." + admi2.SueldoTotal());
        System.out.println("--------------------------------------------");
        //c) Mostrar empleados con sueldoMes igual a X
        int X = 1250;
        System.out.println("\nEmpleados con sueldoMes igual a Bs." + X);

        if (cocinero.SueldoMesiguala(X)) {
            System.out.println(cocinero.nombre + " (Cocinero)");
        }

        if (m1.SueldoMesiguala(X)) {
            System.out.println(m1.nombre + " (Mesero)");
        }

        if (m2.SueldoMesiguala(X)) {
            System.out.println(m2.nombre + " (Mesero)");
        }

        if (admi1.SueldoMesiguala(X)) {
            System.out.println(admi1.nombre + " (Administrativo)");
        }

        if (admi2.SueldoMesiguala(X)) {
            System.out.println(admi2.nombre + " (Administrativo)");
        }
    }
}