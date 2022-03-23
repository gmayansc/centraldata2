package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.modelo.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PedidoControlador {

    public static ListaPedidos listaPedidos = new ListaPedidos();
    
    public static void anadirPedido(int numero,  Cliente cli, Articulo art, int unidades, LocalDate fecha, LocalTime hora) {

        //INSTANCIAMOS UN OBJETO ARTÍCULO
        Pedido ped = new Pedido(numero, cli, art, unidades, fecha, hora);
        listaPedidos.agregar(ped);

        System.out.println(ped.toString());
    }

}

//existePedido(Numero: int): boolean
//añadirPedido(Numero: int, Cliente: Cliente, Articulo: Articulo, Unidades: int, Fecha: LocalDate, Hora: LocalDate, PrecioFinal: float): void
//eliminarPedido(Pedido: Pedido): void
//mostrarPedido(Pedido: Pedido): void
//mostrarPedidoEnviado(Pedido: Pedido): void
//mostrarPedidoNoEnviado(Pedido: Pedido): void
