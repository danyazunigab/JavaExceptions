package ExceptionSample;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Saludo
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPara ejemplificar el uso de exception handling, este programa\nsimulará un sistema para pedir una mesa y ordenar comida\nen un restaurante de Chillis.\n");
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Hola, " + nombreCliente);

        //Pedir una mesa
        System.out.println("Cantidad de personas:");
        try {
            int noPersonas = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Ingrese un numero valido de personas.");
            throw new DatoInvalidoException("Ingrese cantidad de personas valida.");
        }
    }
}
