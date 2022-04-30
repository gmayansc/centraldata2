package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.dao.hibernate.HibernatePedidoDAO;
import edu.uoc.centraldata.modelo.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PedidoControlador {

    public static void anadirPedido(Cliente cli, Articulo art, int unidades, LocalDate fecha, LocalTime hora) throws DAOException {
        System.out.print("crear pedido");
        Pedido ped = new Pedido(cli, art, unidades, fecha, hora);
        HibernatePedidoDAO.insertar(ped);

        System.out.println(ped);
    }
    
     public static boolean existePedido(int num){
            return true;
     }

    /*public static void eliminarPedido(int codigo){
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
    
      */
}
