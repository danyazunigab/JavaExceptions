package ExceptionSample;

public class RestauranteLlenoException extends Exception{
    public RestauranteLlenoException(){
    }
    public RestauranteLlenoException(String mensaje){
        super(mensaje);
    }
}
