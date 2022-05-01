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

    public static void eliminarPedido(Pedido ped) throws DAOException {
        HibernatePedidoDAO.eliminar(ped);
    }

    public static Pedido getPedido(int codigo) throws DAOException {
        Pedido ped = HibernatePedidoDAO.getPedido(codigo);
        if (ped == null) {
            return null;
        } else {
            return ped;
        }
    }

    public static void leerLista() {
        HibernatePedidoDAO.getAllPedidos();
    }

    public static void leerListaPedidosEnviados() {
        HibernatePedidoDAO.getPedidosEnviados();

    }

    public static void leerListaPedidosPendientes() {
        HibernatePedidoDAO.getPedidosPendientes();

    }

}
