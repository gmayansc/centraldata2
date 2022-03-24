package edu.uoc.centraldata.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {

    public int codigo;
    public Cliente Cliente;
    public Articulo Articulo;
    public int Unidades;
    public LocalDate Fecha;
    public LocalTime Hora;
    public double precioFinal;
    public boolean Envio;

    public Pedido(int cod, Cliente cli, Articulo art, int unidades, LocalDate Fecha, LocalTime Hora) {
        this.codigo = cod;
        this.Cliente = cli;
        this.Articulo = art;
        this.Unidades = unidades;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Envio = false;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public double getPrecioFinal() {
        double precio = 0;
        double gastosEnvio = 0;

        if (this.Cliente.getTipo().equals("PREMIUM")) {
            gastosEnvio = this.Articulo.getGastosEnvio() * 0.8;
        } else {
            gastosEnvio = this.Articulo.getGastosEnvio();
        }

        precio = this.Articulo.getPrecio() * this.Unidades + gastosEnvio;
        return precio;
    }
    public double getSubtotal() {
        double precio = 0;
        double gastosEnvio = 0;

 
        gastosEnvio = this.Articulo.getGastosEnvio();

        precio = this.Articulo.getPrecio() * this.Unidades + gastosEnvio;
        return precio;
    }
    public int getNumero() {
        return codigo;
    }

    public void setNumero(int numero) {
        this.codigo = numero;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Articulo getArticulo() {
        return Articulo;
    }

    public void setArticulo(Articulo Articulo) {
        this.Articulo = Articulo;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHora() {
        return Hora;
    }

    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }


    public boolean isEnvio() {
        return Envio;
    }

    public void setEnvio(boolean Envio) {
        this.Envio = Envio;
    }

    public boolean getEnvio() {
        return this.Envio;
    }

    @Override
    public String toString() {

        return "\n\nPEDIDO nº " + this.codigo + "\n"
                + "Cliente          = " + this.Cliente.getNombre() + "\n"
                + "Tipo             = " + this.Cliente.getTipo() + "\n"
                + "Fecha del pedido = " + this.getFecha() + "\n"
                + "Hora del pedido  = " + this.getHora() + "\n"
                + "---------------------------\n"
                + "Producto         = " + this.Articulo.getDescripcion() + "\n"
                + "Cantidad         = " + this.Unidades + "\n"
                + "Precio producto  = " + this.Articulo.getPrecio() + "\n"
                + "Gastos de Envío  = " + this.Articulo.getGastosEnvio() + "\n"
                + "---------------------------\n"
                + "Subtotal     = " + this.getSubtotal() + "\n"
                + "---------------------------\n"
                + "TOTAL     = " + this.getPrecioFinal() + "EUR\n";

    }

}
