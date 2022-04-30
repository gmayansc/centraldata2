package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.modelo.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PedidoControlador {

    public static ListaPedidos listaPedidos = new ListaPedidos();
    //public static ListaClientes listaClientes = ClienteControlador.listaClientes;
    public static ListaArticulos listaArticulos = ArticuloControlador.listaArticulos;

    public static void cargarPedidos() {

//
//        Pedido ped = new Pedido(0001, listaClientes.getAt(0), listaArticulos.getAt(0), 2, LocalDate.now(), LocalTime.now());
//        Pedido ped2 = new Pedido(0002, listaClientes.getAt(1), listaArticulos.getAt(2), 2, LocalDate.now(), LocalTime.now());
//        Pedido ped3 = new Pedido(0003, listaClientes.getAt(2), listaArticulos.getAt(2), 2, LocalDate.now(), LocalTime.now());
//        Pedido ped4 = new Pedido(0004, listaClientes.getAt(2), listaArticulos.getAt(3), 2, LocalDate.now(), LocalTime.now());

//        ped2.setEnvio(true);
//        listaPedidos.agregar(ped);
//        listaPedidos.agregar(ped2);
//        listaPedidos.agregar(ped3);
//        listaPedidos.agregar(ped4);
    }

    public static void anadirPedido(int numero, Cliente cli, Articulo art, int unidades, LocalDate fecha, LocalTime hora) {
        System.out.print("crear pedido");
        Pedido ped = new Pedido(numero, cli, art, unidades, fecha, hora);
        listaPedidos.agregar(ped);

        System.out.println(ped);
    }

    public static void eliminarPedido(int codigo){
        listaPedidos.borrarPedido(codigo);
    }

    public static void leerListaPedidos() {
        for (int i = 0; i < listaPedidos.getSize(); i++) {
            System.out.println(listaPedidos.getAt(i).toString());
        }
    }

    public static void leerListaPedidosEnviados() {
        for (int i = 0; i < listaPedidos.getSize(); i++) {
            if (listaPedidos.getAt(i).getEnvio() == true) {
                System.out.println(listaPedidos.getAt(i).toString());
            }
        }
    }

    public static void leerListaPedidosPendientes() {
        for (int i = 0; i < listaPedidos.getSize(); i++) {
            if (listaPedidos.getAt(i).getEnvio() == false) {
                System.out.println(listaPedidos.getAt(i).toString());
            }
        }
    }

    public static void leerListaPedidosEnviadosFiltro(Cliente cli) {
        for (int i = 0; i < listaPedidos.getSize(); i++) {
            if (listaPedidos.getAt(i).getEnvio() == true) {
                if (listaPedidos.getAt(i).getCliente() == cli) {
                    System.out.println(listaPedidos.getAt(i).toString());
                }
            }
        }
    }

    public static void leerListaPedidosPendientesFiltros(Cliente cli) {
        for (int i = 0; i < listaPedidos.getSize(); i++) {
            if (listaPedidos.getAt(i).getEnvio() == false) {
                if (listaPedidos.getAt(i).getCliente() == cli) {
                    System.out.println(listaPedidos.getAt(i).toString());
                }
            }
        }
    }
    
        public static boolean existePedido(int num){
            return listaPedidos.existePedido(num);
        }
}
