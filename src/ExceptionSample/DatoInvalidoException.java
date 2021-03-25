package ExceptionSample;

public class DatoInvalidoException extends Exception{
    public DatoInvalidoException{
    }
    public DatoInvalidoException(String mensaje){
        super(mensaje);
    }
}
