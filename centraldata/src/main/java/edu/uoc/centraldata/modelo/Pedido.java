package edu.uoc.centraldata.modelo;

import java.time.LocalDate;

public class Pedido {
    
    public int Numero;
    public Cliente Cliente;
    public Articulo Articulo;
    public int Unidades;
    public LocalDate Fecha;
    public LocalDate Hora;
    public float PrecioFinal;
    public boolean Envio;

    public Pedido(int Numero, Cliente Cliente, Articulo Articulo, int Unidades, LocalDate Fecha, LocalDate Hora, float PrecioFinal, boolean Envio) {
        this.Numero = Numero;
        this.Cliente = Cliente;
        this.Articulo = Articulo;
        this.Unidades = Unidades;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.PrecioFinal = PrecioFinal;
        this.Envio = Envio;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
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

    public LocalDate getHora() {
        return Hora;
    }

    public void setHora(LocalDate Hora) {
        this.Hora = Hora;
    }

    public float getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(float PrecioFinal) {
        this.PrecioFinal = PrecioFinal;
    }

    public boolean isEnvio() {
        return Envio;
    }

    public void setEnvio(boolean Envio) {
        this.Envio = Envio;
    }

    @Override
    public String toString() {
        return "Pedido{" + "Numero=" + Numero + ", Cliente=" + Cliente + ", Articulo=" + Articulo + ", Unidades=" + Unidades + ", Fecha=" + Fecha + ", Hora=" + Hora + ", PrecioFinal=" + PrecioFinal + ", Envio=" + Envio + '}';
    }
    
    //public boolean pedidoEnviado();
    
    //public float precioEnvio();
    
}