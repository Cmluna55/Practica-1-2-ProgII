package POLIMORFISMO.Ejercicio1;
//1.Sea la clase VideoJuego

public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
//sobrecargar 2 veces el constructor
    public VideoJuego(String nombre,String plataforma){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=2;
    }
    public VideoJuego(String nombre,String plataforma, int cantitadJugadores){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=cantitadJugadores;   
    }
//Implementar metodo mostrar()
    public void mostrar(){
        System.out.println("Nombre: " + nombre + "\nPlataforma: " + plataforma + "\nJugadores: " + cantidadJugadores);
    }
//Sobrecargar metodo AgregarJugadores
    public void AgregarJugadores(){
        this.cantidadJugadores=cantidadJugadores+1;
    }
    public void AgregarJugadores(int Jugadores){
        this.cantidadJugadores=cantidadJugadores+Jugadores;
    }
    public static void main(String[] args) {
        //Instanciar al menos 2 videojuegos
        VideoJuego vj1=new VideoJuego("Mortal Kombat", "Play Station");
        vj1.mostrar();
        vj1.AgregarJugadores();
        vj1.mostrar();
        System.out.println("---------------------------------------------");
        VideoJuego vj2=new VideoJuego("Tekken", "Play Station",4);
        vj2.mostrar();
        vj2.AgregarJugadores(2);
        vj2.mostrar();

    }
}
