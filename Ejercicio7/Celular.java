package Ejercicio7;
//Crea un clase Celular con espacios para 20 aplicaciones
//o 1024MB de espacio
public class Celular {
    private String[] aplicaciones; 
    private int espacioDisponible, bateria, cantidadAplicaciones; 

    public Celular() 
    {
        this.aplicaciones = new String[20];  
        this.espacioDisponible = 1024;  
        this.bateria = 100;  
        this.cantidadAplicaciones = 0;  
    }

    public boolean InstalarNuevaAplicacion(String nombre, int tamaño) 
    {
        if (cantidadAplicaciones < 20 && espacioDisponible >= tamaño) 
        {
            aplicaciones[cantidadAplicaciones] = nombre;
            cantidadAplicaciones++;
            espacioDisponible -= tamaño;  
            System.out.println("Aplicacion " + nombre + " se instalo con exito.");
            return true;
        } else {
            System.out.println("Aplicacion no instalada. Falta espacio");
            return false;
        }
    }

    public void utilizarAplicacion(int minutosUso, int tamañoAplicacion) 
    {
        if (bateria <= 0) 
        {
            System.out.println("Apagado");
            return;
        }
        double porcentajeBateria = 0;
        if (tamañoAplicacion > 250) 
        {
            porcentajeBateria = 5;  
        } 
        else
            if (tamañoAplicacion > 100) 
            {
            porcentajeBateria = 2;  
            } 
            else {
            porcentajeBateria = 1;  
            }
        int bloquesDe10Minutos = minutosUso / 10;
        double consumoTotal = porcentajeBateria * bloquesDe10Minutos;

        bateria -= consumoTotal;
        if (bateria < 0) 
        {
            bateria = 0; 
        }
        System.out.println("Se uso la aplicacion durante " + minutosUso + " minutos.");
    }

    public void mostrarPorcentajedeBateriaRestante() {
        System.out.println("Bateria restante: " + bateria + "%");
    }
    
    public static void main(String[] args) {
        Celular celular = new Celular();
        
        System.out.println("------APLICACIONES---------");
        celular.InstalarNuevaAplicacion("Tik Tok", 900); 
        celular.InstalarNuevaAplicacion("Instagram", 622);
        celular.InstalarNuevaAplicacion("Canva", 50);

        System.out.println("---------------------------------");
        
        System.out.println("-----USO Y BATERIA-----");
        celular.utilizarAplicacion(30, 100); 
        celular.mostrarPorcentajedeBateriaRestante();  

        celular.utilizarAplicacion(60, 200); 
        celular.mostrarPorcentajedeBateriaRestante();  

        celular.utilizarAplicacion(100, 300); 
        celular.mostrarPorcentajedeBateriaRestante();  
    }
    
}

