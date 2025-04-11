package POLIMORFISMO.Ejercicio5;
//5.Se hace referencia a algunos de los diferentes ambientes 
//de la Universidad mediante las siguientes clases:

class Oficina {
    private int nroSillas, nroEscritorios, nroEstanterias;

    public Oficina(int sillas, int escritorios, int estanterias) {
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }
    //b)Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterias: " + nroEstanterias);
    }
    //c)Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles(int sillas, int escritorios, int estanterias) {
        return sillas + escritorios + estanterias;
    }

    public int cantidadMuebles() {
        return cantidadMuebles(nroSillas, nroEscritorios, nroEstanterias);
    }
}
class Aula {
    private String nombre;
    private int capacidad, nroPupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }
    //b)Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
    }
    //c)Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles(int pupitres) {
        return pupitres;
    }

    public int cantidadMuebles() {
        return cantidadMuebles(nroPupitres);
    }
}
class Laboratorio {
    private String nombre;
    private int capacidad, nroMesas, nroSillas;

    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }
    //b)Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }
    //c)Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles(int mesas, int sillas) {
        return mesas + sillas;
    }
    
    public int cantidadMuebles() {
        return cantidadMuebles(nroMesas, nroSillas);
    }
    
    public static void main(String[] args) {

        //a)Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
        
        Oficina ofi1 = new Oficina(8, 4, 4);
        Oficina ofi2 = new Oficina(10, 5, 3);

        Aula aula1 = new Aula("401", 20, 20);
        Aula aula2 = new Aula("502", 20, 20);

        Laboratorio lab = new Laboratorio("ESTADISTICA", 15, 10, 16);

        System.out.println("-----OFICINAS------");
        System.out.println("La Oficina tiene: " + ofi1.cantidadMuebles(6, 8, 3));
        System.out.println("--------------------------------");
        ofi2.mostrar();
        System.out.println("Total de los muebles: " + ofi2.cantidadMuebles());
        System.out.println("--------------------------------");
        System.out.println("------AULAS------");
        aula1.mostrar();
        System.out.println("Total de los muebles: " + aula1.cantidadMuebles());
        System.out.println("--------------------------------");
        aula2.mostrar();
        System.out.println("Total de los muebles: " + aula2.cantidadMuebles());
        System.out.println("--------------------------------");
        System.out.println("-----LABORATORIO------");
        lab.mostrar();
        System.out.println("Total de los muebles: " + lab.cantidadMuebles());
    }
}

