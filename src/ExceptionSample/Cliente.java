package ExceptionSample;

public class Cliente {
    String nombre;
    Mesa mesa;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.mesa = null;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
        System.out.println("Su mesa es la número: "+mesa.getID());
    }
}
