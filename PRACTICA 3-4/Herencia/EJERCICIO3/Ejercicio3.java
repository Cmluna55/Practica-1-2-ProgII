//3. Definir las clases:
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//b) Implementa las clases con sus constructores, datos por defecto y mostrar.
abstract class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected String fechaNac; // formato "dd/MM/yyyy"
    protected String sexo;

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }
    public int calcularEdad() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
            int añoNac = fechaNacimiento.getYear();
            int añoActual = LocalDate.now().getYear();
            return añoActual - añoNac;
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public abstract void mostrar();
}
class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso; 
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo, String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        System.out.println("***Nombre: " + nombre + " " + apellido);
        System.out.println("CI: " + ci);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fechaNac);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
        System.out.println("-------------------");
    }
}
class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo, String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        System.out.println("***Nombre: " + nombre + " " + apellido);
        System.out.println("CI: " + ci);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fechaNac);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("NIT: " + nit);
        System.out.println("Profesion: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("-------------------");
    }
}

// Clase principal
public class Ejercicio3 {
    public static void main(String[] args) {
        // Datos por defecto
        Estudiante estudiante1 = new Estudiante("123456", "Ana", "Perez", "70000001", "15/05/1995", "Femenino", "RU001", "10/02/2020", 6);
        Estudiante estudiante2 = new Estudiante("654321", "Juan", "Gomez", "70000002", "20/08/2000", "Masculino", "RU002", "05/03/2021", 4);
        Docente docente1 = new Docente("987654", "Carlos", "Gomez", "70000003", "12/12/1980", "Masculino", "NIT001", "Ingeniero", "Sistemas");
        Docente docente2 = new Docente("456789", "Maria", "Lopez", "70000004", "01/01/1975", "Femenino", "NIT002", "Licenciada", "Educación");

        System.out.println("\nDATOS REGISTRADOS-------------");
        estudiante1.mostrar();
        estudiante2.mostrar();
        docente1.mostrar();
        docente2.mostrar();

        //c)Mostrar los estudiantes mayores de 25 años.
        System.out.println("\nEstudiantes mayores de 25 años");
        Estudiante[] estudiantes = {estudiante1, estudiante2};
        for (Estudiante est : estudiantes) {
            if (est.calcularEdad() > 25) {
                est.mostrar();
            }
        }

        //d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y el mayor
        System.out.println("\nDocente Ingeniero/Masculino/Mayor");
        Docente[] docentes = {docente1, docente2};
        Docente docenteMayor = null;
        int maxEdad = -1;
        for (Docente doc : docentes) {
            if (doc.profesion.equalsIgnoreCase("Ingeniero") && doc.sexo.equalsIgnoreCase("Masculino")) {
                int edad = doc.calcularEdad();
                if (edad > maxEdad) {
                    maxEdad = edad;
                    docenteMayor = doc;
                }
            }
        }
        if (docenteMayor != null) {
            docenteMayor.mostrar();
        } else {
            System.out.println("No hay docente que cumpla los requisitos.");
        }

        // Mostrar a los estudiantes y docentes que tienen el mismo apellido
        System.out.println("\nMismo apellido");
        List<Persona> personas = new ArrayList<>();
        personas.add(estudiante1);
        personas.add(estudiante2);
        personas.add(docente1);
        personas.add(docente2);

        Map<String, List<Persona>> apellidosMap = new HashMap<>();
        for (Persona p : personas) {
            apellidosMap.computeIfAbsent(p.apellido, k -> new ArrayList<>()).add(p);
        }

        for (String apellido : apellidosMap.keySet()) {
            List<Persona> lista = apellidosMap.get(apellido);
            if (lista.size() > 1) {
                System.out.println("\nApellido: " + apellido);
                for (Persona p : lista) {
                    p.mostrar();
                }
            }
        }
    }
}