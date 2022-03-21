package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import edu.uoc.centraldata.modelo.*;
import java.util.Scanner;

public class VentanaMenu {

    public static void iniciarVista() {
        ArticuloControlador.cargarArticulos();
        pintarMenu();
    }

    public static void pintarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("=============================================");
            System.out.println("=============== TIENDA ONLINE ===============");
            System.out.println("=============================================\n");
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
                    salir = true;
                    break;
                default:
                    break;
            };
        }
    }
}
