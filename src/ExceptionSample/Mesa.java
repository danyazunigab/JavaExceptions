package ExceptionSample;

public class Mesa {

    int id;
    int Capacidad;
    boolean Ocupada;

    public Mesa(int id,int Asientos){
        this.id = id;
        this.Capacidad = Asientos;
        this.Ocupada = false;
    }

    public int getID(){
        return this.id;
    }

    public void ocuparMesa(){
        this.Ocupada = true;
    }
}