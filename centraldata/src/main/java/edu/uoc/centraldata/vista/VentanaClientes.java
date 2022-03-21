package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import edu.uoc.centraldata.modelo.*;
import static edu.uoc.centraldata.vista.VentanaArticulos.entrada;
import static edu.uoc.centraldata.vista.VentanaArticulos.menuAnadirArticulo;
import java.util.ArrayList;
import java.util.Scanner;

public class VentanaClientes extends VentanaMenu {

    static Scanner teclado = new Scanner(System.in);

    public static void pintarMenu() {

        boolean salir = false;
        while (!salir) {
            System.out.println("\n =========== GESTION DE CLIENTES ===========\n");
            System.out.println(" 1. Añadir un cliente");
            System.out.println(" 2. Eliminar un cliente");
            System.out.println(" 3. Mostrar los clientes");
            System.out.println(" 4. Mostrar los clientes estandard");
            System.out.println(" 5. Mostrar los clientes premium");
            System.out.println(" 6. Volver");

            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    menuAnadirCliente();
                    break;
                case 2:
                    break;
                case 3:
                    ArticuloControlador.leerLista();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }

    public static void menuAnadirCliente() {
        String nombre;
        String domicilio;
        String NIF;
        String email;
        String tipo;

        System.out.println("Nombre");
        nombre = teclado.nextLine();
        System.out.println("Domicilio");
        domicilio = teclado.nextLine();
        System.out.println("NIF");
        NIF = teclado.nextLine();
        System.out.println("Email");
        email = teclado.nextLine();
        System.out.println("Tipo (Introduce 'ESTANDAR' o 'PREMIUM')");
        tipo = teclado.nextLine();

     

//        for (int i = 0; i < listaCliente.size(); i++) {
//            if (Email.equals(Cliente.getEmail())) {
//                System.out.println("Este Cliente ya existe");
//                break;
//            } else {
//                listaCliente.add(new Cliente(Nombre, Domicilio, NIF, Email, Tipo));
//                break;
//            }
//        }
    }

}

//    public static Cliente Cliente;
//    public static ClienteEstandard ClienteEstandard;
//    public static ClientePremium ClientePremium;
//    public static ArrayList listaCliente;
//    
//    static Scanner teclado = new Scanner(System.in);
//    
//    @SuppressWarnings({"empty-statement", "null"})
//   
//    static int opcion = teclado.nextInt();
//            
//char pedirOpcion() {
//        String resp;
//        System.out.println("Elige una opción (1,2,3,4,5,6): ");
//        resp = teclado.nextLine();
//        if (resp.isEmpty()) {
//            resp = " ";
//        }
//        return resp.charAt(0);
//    }
//
//public static void pintarMenu(){
//            boolean salir = false;
//            char opcio;
//            do {
//        System.out.println("\n =========== GESTION DE ARTÍCULOS ===========\n");
//        System.out.println(" 1. Añadir un cliente");
//        System.out.println(" 2. Eliminar un cliente");
//        System.out.println(" 3. Mostrar los clientes");
//        System.out.println(" 4. Mostrar los clientes estandard");
//        System.out.println(" 5. Mostrar los clientes premium");
//        System.out.println(" 6. Volver");
//     
//         switch (opcion) {
//            case '1':
//                        String Nombre;
//                        String Domicilio;
//                        String NIF;
//                        String Email;
//                        boolean Tipo;
//                    System.out.println("Nombre");
//                        Nombre= teclado.nextLine();
//                    System.out.println("Domicilio");
//                        Domicilio=teclado.nextLine();
//                    System.out.println("NIF");
//                        NIF=teclado.nextLine();
//                    System.out.println("Email");
//                        Email=teclado.nextLine();
//                    System.out.println("Tipo");
//                        Tipo=teclado.nextBoolean();   
//                for (int i = 0; i < listaCliente.size(); i++) {
//                    if (Email.equals(Cliente.getEmail())) {
//                    System.out.println("Este Cliente ya existe");
//                            break;          
//                        }else{
//                            listaCliente.add(new Cliente(Nombre, Domicilio, NIF, Email, Tipo));
//                            break;
//                        }
//                    }
//                    break;
//                
//            case '2':
//                    System.out.println("Email");
//                        Email=teclado.nextLine();
//                for (int i = 0; i < listaCliente.size(); i++) {
//                    if (Email.equals(Cliente.getEmail())) {    
//                            listaCliente.remove(Cliente);
//                        }else{
//                    System.out.println("No existe el Cliente");
//                        }   
//                    }
//                break;
//                
//            case '3':
//                    System.out.println("Email");
//                        Email=teclado.nextLine();
//                for (int i = 0; i < listaCliente.size(); i++) {
//                    if (Email.equals(Cliente.getEmail())) {    
//                    System.out.println("Listado de Clientes (" + VentanaClientes.Cliente.getEmail() + "):");                                      
//                        }else{
//                    System.out.println("No hay Clientes");
//                        }   
//                    }
//                break;
//            
//            case '4':
//                    System.out.println("Email");
//                        Email=teclado.nextLine();
//                for (int i = 0; i < listaCliente.size(); i++) {
//                    if(Cliente.Tipo == false) {
//                    System.out.println("Listado de Clientes Estandard (" + VentanaClientes.Cliente.getEmail() + "):");                                      
//                        }else{
//                    System.out.println("No hay Clientes Estandard");
//                        }   
//                    }
//                break;
//                
//            case '5':
//                    System.out.println("Email");
//                        Email=teclado.nextLine();
//                for (int i = 0; i < listaCliente.size(); i++) {
//                    if(Cliente.Tipo == true) {
//                    System.out.println("Listado de Clientes Premium (" + VentanaClientes.Cliente.getEmail() + "):");                                      
//                        }else{
//                    System.out.println("No hay Clientes Premium");
//                        }   
//                    }
//                break;
//                      
//            case '6':
//                }
//                    } while (!salir);
//                }
//    }
