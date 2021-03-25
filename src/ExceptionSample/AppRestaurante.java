package ExceptionSample;

import java.util.Scanner;

public class AppRestaurante {
    public static void main(String[] args) throws DatoInvalidoException{
        //Saludo
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPara ejemplificar el uso de exception handling, este programa\nsimulará un sistema para pedir una mesa y ordenar comida\nen un restaurante.\n");
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Hola, " + nombreCliente);

        //Pedir una mesa
        System.out.println("Cantidad de personas:");
        try{
            int cantPersonas = Integer.parseInt(scanner.nextLine());
            if (cantPersonas <= 10) {
                encontrarMesa(cantPersonas);
            }
        }catch (NumberFormatException e){
            throw new DatoInvalidoException("Ingrese una cantidad válida de personas.");
        }catch (RestauranteLlenoException e){
            System.out.println("No hay mesas disponibles.");
        }
    }
    private static void encontrarMesa(int cantPersonas) throws RestauranteLlenoException{
        ListaMesas mesas = new ListaMesas();
        mesas.anadirMesa(new Mesa(5));
        mesas.anadirMesa(new Mesa(8));
        mesas.anadirMesa(new Mesa(10));
        mesas.buscarDesocupadas(cantPersonas);
    }
}