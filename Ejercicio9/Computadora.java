package Ejercicio9;
//9.Realizar la abstraccion de una Computadora
public class Computadora {
    private String componentes[];
    private int nroComp;
    private boolean estado;

    public Computadora(){
        this.estado=false;
        this.componentes=new String[15];
        this.nroComp=4;
        this.componentes[0]="CPU";
        this.componentes[1]="Disco duro";
        this.componentes[2]="Ram";
        this.componentes[3]="Monitor";
        this.componentes[4]="Camara";
    }
    public void mostrarComponentes(){
        if(estado){
            for(int i=0; i<=nroComp; i++){
                System.out.println("COMPONENTE NRO: " + (i) + ": " + componentes[i]);
            }
        }else{
            System.out.println("APAGADO, no se puede mostrar los componentes");
        }
    }
    public void Encender(){
        this.estado=true;
        System.out.println("PRENDIDA");
    }
    public void Apagar(){
        this.estado=false;
        System.out.println("APAGADO");
    }
    public static void main(String[] args) {
        Computadora compu1 =new Computadora();
        compu1.mostrarComponentes();
        compu1.Encender();
        compu1.mostrarComponentes();

    }
    
}
