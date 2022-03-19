package edu.uoc.centraldata.modelo;

import java.sql.Time;
import java.util.Date;

public class Pedido {
    
    public String Numero;
    public String Cliente;
    public String Articulo;
    public int Unidades;
    public String Fecha;
    public String Hora;
    public double PrecioFinal;
    public boolean Envio;

    public Pedido(String Numero, String Cliente, String Articulo, int Unidades, String Fecha, String Hora, double PrecioFinal, boolean Envio) {
        this.Numero = Numero;
        this.Cliente = Cliente;
        this.Articulo = Articulo;
        this.Unidades = Unidades;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.PrecioFinal = PrecioFinal;
        this.Envio = Envio;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public double getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(double PrecioFinal) {
        this.PrecioFinal = PrecioFinal;
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
        return "Pedido{" + "Numero=" + Numero + ", Cliente=" + Cliente + ", Articulo=" + Articulo + ", Unidades=" + Unidades + ", Fecha=" + Fecha + ", Hora=" + Hora + ", PrecioFinal=" + PrecioFinal + ", Envio=" + Envio + '}';
    }
    
}