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

    public Pedido(int codigo,  Cliente cli, Articulo art, int unidades, LocalDate Fecha, LocalTime Hora) {
        this.codigo = this.codigo;
        this.Cliente = Cliente;
        this.Articulo = Articulo;
        this.Unidades = Unidades;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.precioFinal = precioFinal(cli, art);
        this.Envio = Envio;
    }

    public double precioFinal(Cliente cli, Articulo art) {
        double precio = 0;
        double gastosEnvio = 0;
        
        if (cli.getTipo().equals("PREMIUM")) {
            gastosEnvio = art.getGastosEnvio() * 2.00;
        } else {
            gastosEnvio = art.getGastosEnvio();
        }
        
        precio = art.getPrecio() * this.Unidades + gastosEnvio;
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

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public boolean isEnvio() {
        return Envio;
    }

    public void setEnvio(boolean Envio) {
        this.Envio = Envio;
    }

    boolean getEnvio() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String toString() {
        return "Pedido{" + "Numero=" + codigo + ", Cliente=" + this.Cliente.getNombre() + ", Articulo=" + this.Articulo.getDescripcion() + ", Unidades=" + Unidades + ", Fecha=" + Fecha + ", Hora=" + Hora + ", PrecioFinal=" + precioFinal + ", Envio=" + Envio + '}';
    }

}
