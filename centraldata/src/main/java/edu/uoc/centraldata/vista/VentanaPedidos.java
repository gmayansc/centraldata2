package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import java.time.LocalDate;
import java.time.LocalTime;

import edu.uoc.centraldata.modelo.*;
import java.util.Scanner;

public class VentanaPedidos extends VentanaMenu {

    static Scanner teclado = new Scanner(System.in);

    public static void pintarMenu() {
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
                    //menuEliminarPedido();
                    break;

//                case 3:
//                    
//                    System.out.println("Numero");
//                    Numero = teclado.nextLine();
//                    for (int i = 0; i < listaPedido.size(); i++) {
//                        if (Numero.equals(Pedido.getNumero())) {
//                            System.out.println("Listado de Pedidos (" + VentanaPedidos.Pedido.getNumero() + "):");
//                        } else {
//                            System.out.println("No hay Pedidos");
//                        }
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Numero");
//                    Numero = teclado.nextLine();
//                    for (int i = 0; i < listaPedido.size(); i++) {
//                        if (Pedido.Envio == false) {
//                            System.out.println("Listado de Pedidos Pendientes (" + VentanaPedidos.Pedido.getNumero() + "):");
//                        } else {
//                            System.out.println("No hay Pedidos Pendientes");
//                        }
//                    }
//                    break;
//
//                case '5':
//                    System.out.println("Numero");
//                    Numero = teclado.nextLine();
//                    for (int i = 0; i < listaPedido.size(); i++) {
//                        if (Pedido.Envio == true) {
//                            System.out.println("Listado de Pedidos Enviados (" + VentanaPedidos.Pedido.getNumero() + "):");
//                        } else {
//                            System.out.println("No hay Pedidos Enviados");
//                        }
//                    }
//                    break;
//
//                case '6':
            }
        } while (salir);
    }

    public static void menuCrearPedido() {
        int numero;
        String emailCliente;
        int codigoArticulo;
        int unidades;
        LocalDate fecha;
        LocalTime hora;
        double precioFinal;
        boolean envio = false;

        System.out.println("Número pedido:");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el mail del cliente:");
        emailCliente = teclado.nextLine();

        Cliente cli = ClienteControlador.getCliente(emailCliente);
        if (cli == null) {
            System.out.println("El cliente no existe y debes crearlo:");
            VentanaClientes.menuAnadirCliente();
            cli = ClienteControlador.getCliente(emailCliente);

        } else {
            System.out.println("Se ha encontrado un cliente con este email y se le asociará el pedido.");
            cli = ClienteControlador.getCliente(emailCliente);
        }

        System.out.println("Introduce el código del artículo");
        codigoArticulo = Integer.parseInt(teclado.nextLine());

        Articulo art = ArticuloControlador.getArticulo(codigoArticulo);
        if (art == null) {
            System.out.println("El artículo no existe y debes crearlo:");
            VentanaArticulos.menuAnadirArticulo();
            art = ArticuloControlador.getArticulo(codigoArticulo);
        } else {
            System.out.println("Se ha encontrado un articulo con este código y se le asociará el pedido.");
            art = ArticuloControlador.getArticulo(codigoArticulo);
        }
        System.out.println(art);
        System.out.println("¿Cuántas unidades?");
        unidades = Integer.parseInt(teclado.nextLine());
        fecha = LocalDate.now();
        hora = LocalTime.now();
        System.out.print("Se envia al controlador "+ " " + numero +" "+ cli +" "+ art +" "+ unidades +" "+ fecha +" " + hora);
        PedidoControlador.anadirPedido(numero, cli, art, unidades, fecha, hora);
    }

}

//    }
