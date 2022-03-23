package edu.uoc.centraldata.vista;
import edu.uoc.centraldata.controlador.*;
import java.util.Scanner;

public class VentanaClientes extends VentanaMenu {

    static Scanner teclado = new Scanner(System.in);

    public static void pintarMenu() {

        boolean salir = false;
        while (!salir) {
            System.out.println("\n =========== GESTION DE CLIENTES ===========\n");
            System.out.println(" 1. Añadir un cliente");
            System.out.println(" 2. Eliminar un cliente");
            System.out.println(" 3. Mostrar todos los clientes");
            System.out.println(" 4. Mostrar los clientes estandard");
            System.out.println(" 5. Mostrar los clientes premium");
            System.out.println(" 6. Volver");

            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    menuAnadirCliente();
                    break;
                case 2:
                    menuEliminarCliente();
                    break;
                case 3:
                    ClienteControlador.leerListaClientes();
                    break;
                case 4:
                    ClienteControlador.leerListaEstandard();
                    break;
                case 5:
                    ClienteControlador.leerListaPremium();
                    break;
                case 6:
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
        System.out.println("Tipo (Introduce 'ESTANDARD' o 'PREMIUM')");
        tipo = teclado.nextLine();
        while (!(tipo.equals("ESTANDARD") || tipo.equals("PREMIUM"))) {
            System.out.println("**TIPO INCORRECTO**");
            System.out.println("Tipo (Introduce 'ESTANDARD' o 'PREMIUM')");
            tipo = teclado.nextLine();
        }
        ClienteControlador.anadirCliente(NIF, nombre, domicilio, email, tipo);
    }
        public static void menuEliminarCliente() {
        String email;


        System.out.println("Introduce el mail del cliente a eliminar:");
        email = teclado.nextLine();
        ClienteControlador.eliminarCliente(email);
    }

}

