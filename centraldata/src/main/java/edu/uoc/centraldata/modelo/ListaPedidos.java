package edu.uoc.centraldata.modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class ListaPedidos<T> extends ListaDatos<Pedido>{
    
    public Pedido Pedido;
    public Cliente Cliente;
    public Articulo Articulo;
            
    public ArrayList<T> listaPedido;
    
    private void inicializarValores() {
        listaPedido.add ((T) new Pedido("34", "pepeluis@uoc.edu", "1234", 1, "2022-03-19", "18:30", 1.65, false));
        listaPedido.add ((T) new Pedido("5", "marianito@gmail.com", "45", 4, "2022-02-28", "07:52", 11.04, true));
    }

public boolean existePedido(String Numero) {
        boolean bol = false;
        for (int i = 0; i < listaPedido.size(); i++) {
            Pedido = (edu.uoc.centraldata.modelo.Pedido) listaPedido.get(i);
            if (Numero.equals(Pedido.getNumero())) {
                bol= true;
            } else {
                bol= false;
            }
        }
        return bol;
    }
    
    public boolean existePedido(Pedido Pedido) {
        throw new UnsupportedOperationException(""); 
    }
    
    public void agregarPedido(Pedido Pedido) {
        if (!this.existePedido(Pedido)) {
            this.listaPedido.add((T) Pedido);
            System.out.println("El Pedido ha sido Creado");
        } else {
            System.out.println("Este Pedido ya existe");
        }
    }
    
    public void eliminarPedido(Pedido Pedido) {
        if (existePedido(Pedido.getNumero()) == true) {
            this.listaPedido.remove((T) Pedido);
            System.out.println("El Pedido ha sido Articulo");
        } else {
            System.out.println("No existe el Pedido");
        }
    }
     
    public void listarPedido(Pedido Pedido) {
        if (existePedido(Pedido.getNumero()) == true) {
            System.out.println("Listado de Pedidos (" + this.Pedido.getNumero() + "):");
        } else {
            System.out.println("No existe el Pedido");
        }    
    }
    
   public boolean comprobarEnvio(boolean Tipo) {
        boolean bol = false;
        for (int i = 0; i < listaPedido.size(); i++) {
            Pedido = (edu.uoc.centraldata.modelo.Pedido) listaPedido.get(i);
        }
        return bol;
    }
    
    public void listarPedidosPendientes() {
        if (comprobarEnvio(Pedido.getEnvio()) == false) {
            System.out.println("Listado de Pedidos Enviados (" + this.Pedido.getEnvio() + "):");
        } else {
            System.out.println("No existen Pedidos");
        } 
    }
    
    public void listarPedidosEnviados() {
        if (comprobarEnvio(Pedido.getEnvio()) == true) {
            System.out.println("Listado de Pedidos Enviados (" + this.Pedido.getEnvio() + "):");
        } else {
            System.out.println("No existen Pedidos");
        }    
    }
    
}
