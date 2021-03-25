package ExceptionSample;

import java.util.Scanner;

public class AppRestaurante {
    public static void main(String[] args) throws DatoInvalidoException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPara ejemplificar el uso de exception handling, este programa\nsimulará un sistema para pedir una mesa y ordenar comida\nen un restaurante.\n");

        //Crear cliente
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente);
        System.out.println("Hola, " + cliente.getNombre());

        //Pedir una mesa
        System.out.println("Cantidad de personas:");
        try{
            int cantPersonas = Integer.parseInt(scanner.nextLine());
            if (cantPersonas <= 10) {
                cliente.setMesa(encontrarMesa(cantPersonas));
            }else{
                throw new RestauranteLlenoException("No hay mesas con capacidad suficiente.");
            }
        }catch (NumberFormatException e){
            throw new DatoInvalidoException("Ingrese una cantidad válida de personas.");
        }catch (RestauranteLlenoException e){
            System.out.println(e.getMessage());
        }

    }
    private static Mesa encontrarMesa(int cantPersonas) throws RestauranteLlenoException{

        ListaMesas mesas = new ListaMesas();
        mesas.anadirMesa(new Mesa(1,5));
        mesas.anadirMesa(new Mesa(2,8));
        mesas.anadirMesa(new Mesa(3,10));

        return mesas.buscarDesocupadas(cantPersonas);
    }
}