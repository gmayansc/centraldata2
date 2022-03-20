
package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import edu.uoc.centraldata.modelo.*;
import java.util.Scanner;

public class VentanaMenu {
    
    public static ListaDatos<Articulo> listArticulos = new ListaDatos();
    
    public static void iniciarVista(){
        pintarMenu();
        //ListaDatos.cargaDatos();
    }
    
    public static void pintarMenu(){
        System.out.println("\n\n=======================================");
        System.out.println("=========== TIENDA ONLINE =============");
        System.out.println("=======================================");
        System.out.println("** INTRODUCIR EL NÚMERO DE LA OPCIÓN **\n");
        System.out.println("1. Gestionar Artículos");
        System.out.println("2. Gestionar Clientes");
        System.out.println("3. Gestionar Pedidos");
        System.out.println("4. Salir de la aplicación");
        
        Scanner entrada = new Scanner(System.in);
        
        int opcionMenu = entrada.nextInt();
        
        switch (opcionMenu) {
            case 1:
                VentanaArticulos.pintarMenu();
                break;
            case 2: 
                VentanaClientes.pintarMenu();
                break;
            case 3:
                VentanaClientes.pintarMenu();
                break;
            case 4:
                break;
            default:
                break;
        };    
    } 
    
    
}
