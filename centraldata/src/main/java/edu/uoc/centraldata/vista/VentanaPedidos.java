package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import edu.uoc.centraldata.dao.DAOException;
import java.time.LocalDate;
import java.time.LocalTime;

import edu.uoc.centraldata.modelo.*;
import java.util.Scanner;

public class VentanaPedidos extends VentanaMenu {

    static Scanner teclado = new Scanner(System.in);

    public static void pintarMenu() throws DAOException {
        boolean salir = false;

        do {
            System.out.println("\n =========== GESTION DE PEDIDOS ===========\n");
            System.out.println(" 1. Crear un pedido");
            System.out.println(" 2. Eliminar un pedido");
            System.out.println(" 3. Mostrar los pedidos");
            System.out.println(" 4. Mostrar los pedidos pendientes");
            System.out.println(" 5. Mostrar los pedidos enviados");
            System.out.println(" 6. Volver");

            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    menuCrearPedido();
                    break;
                case 2:
                    menuEliminarPedido();
                    break;
                case 3:
                    PedidoControlador.leerLista();
                    break;
                case 4:
                    PedidoControlador.leerListaPedidosPendientes();
                    break;
                case 5:
                    PedidoControlador.leerListaPedidosEnviados();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        } while (salir);
    }

    public static void menuCrearPedido() throws DAOException {

        String emailCliente;
        int codigoArticulo;
        int unidades;
        LocalDate fecha;
        LocalTime hora;
        double precioFinal;
        boolean envio = false;
        Cliente cli;
        Articulo art;

        System.out.println("Introduce el mail del cliente:");
        emailCliente = teclado.nextLine();

        cli = ClienteControlador.buscar(emailCliente);

        if (cli == null) {
            System.out.println("El cliente no existe y debes crearlo:");
            VentanaClientes.menuAnadirCliente();
            cli = ClienteControlador.buscar(emailCliente);
        }

        System.out.println("Introduce el código del artículo");
        codigoArticulo = Integer.parseInt(teclado.nextLine());

        art = ArticuloControlador.getArticulo(codigoArticulo);

        if (art == null) {
            System.out.println("No se ha encontrado ningún artículo con este código.");
            System.out.println("Crea primero ese artículo.");
        } else {
            System.out.println("Articulo seleccionado : " + art.toString());
            System.out.println("¿Cuántas unidades?");
            unidades = Integer.parseInt(teclado.nextLine());
            fecha = LocalDate.now();
            hora = LocalTime.now();
            PedidoControlador.anadirPedido(cli, art, unidades, fecha, hora);
        }

    }

    public static void menuEliminarPedido() throws DAOException {
        int codigo;
        Pedido ped;

        System.out.println("\n =========== ELIMINAR PEDIDO ===========\n");
        System.out.println(" Introduce el código del pedido:");
        codigo = Integer.parseInt(teclado.nextLine());

        ped = PedidoControlador.getPedido(codigo);
        if (ped == null) {
            System.out.println("No existe ningún pedido con este identificador.");
        } else {
            PedidoControlador.eliminarPedido(ped);
        }
    }

    /*
    public static void menuMostrarPendientes() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n =========== PEDIDOS PENDIENTES ===========\n");
            System.out.println(" 1. Mostrar todos");
            System.out.println(" 2. Filtrar por cliente");
            System.out.println(" 3. Volver");

            int opcion = Integer.parseInt(teclado.nextLine());
            String emailCliente;
            Cliente cli;

            switch (opcion) {
                case 1:
                    PedidoControlador.leerListaPedidosPendientes();
                    break;
                case 2:

                    System.out.println("Introduce el email del cliente a filtrar:");
                    emailCliente = teclado.nextLine();
                    cli = ClienteControlador.getCliente(emailCliente);
                    PedidoControlador.leerListaPedidosPendientesFiltros(cli);
                    break;
                case 3:
                    salir = true;
                    break;
            }

        }
    }

    public static void menuMostrarEnviados() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n =========== PEDIDOS ENVIADOS ===========\n");
            System.out.println(" 1. Mostrar todos");
            System.out.println(" 2. Filtrar por cliente");
            System.out.println(" 3. Volver");

            int opcion = Integer.parseInt(teclado.nextLine());
            String emailCliente;
            Cliente cli;

            switch (opcion) {
                case 1:
                    PedidoControlador.leerListaPedidosEnviados();
                    break;
                case 2:

                    System.out.println("Introduce el email del cliente a filtrar:");
                    emailCliente = teclado.nextLine();
                    cli = ClienteControlador.getCliente(emailCliente);
                    PedidoControlador.leerListaPedidosEnviadosFiltro(cli);
                    break;
                case 3:
                    salir = true;
                    break;
            }

        }
    }*/
}
