package ExceptionSample;

//Lista simple
public class ListaMesas {
    static class Nodo{
        Mesa data;
        Nodo next;

        public Nodo(Mesa data){
            this.data = data;
            this.next = null;
        }
    }

    public Nodo head = null;
    public Nodo tail = null;

    public void anadirMesa(Mesa data){

        Nodo nuevoNodo = new Nodo(data);

        if(head == null){
            head = nuevoNodo;
        }else{
            tail.next = nuevoNodo;
        }
        tail = nuevoNodo;
    }
    public Mesa buscarDesocupadas(int cantPersonas) throws RestauranteLlenoException{
        Nodo actual = head;
        Mesa desocupada = null;

        if(head == null){
            System.out.println("Lista vacía");
        }
        try{
            while(actual != null){
                if((!actual.data.Ocupada) && (actual.data.Capacidad >= cantPersonas)){
                    actual.data.ocuparMesa();
                    System.out.println("Se ha encontrado una mesa.");
                    desocupada = actual.data;
                    break;
                }
                actual = actual.next;
            }
        }catch (Exception e){
            throw new RestauranteLlenoException("No se encontraron mesas disponibles.");
        }finally {
            return desocupada;
        }
    }
}