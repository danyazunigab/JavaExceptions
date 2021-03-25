package ExceptionSample;

public class Mesa {

    int Capacidad;
    boolean Ocupada;

    public Mesa(int Asientos){
        this.Capacidad = Asientos;
        this.Ocupada = false;
    }

    public void ocuparMesa(){
        this.Ocupada = true;
    }

    public void desocuparMesa(){
        this.Ocupada = false;
    }
}
