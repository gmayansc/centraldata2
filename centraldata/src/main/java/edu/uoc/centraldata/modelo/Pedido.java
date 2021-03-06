package edu.uoc.centraldata.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    public int codigo;
    
    
    @JoinColumn(name="id_cliente")
    @OneToOne(fetch = FetchType.LAZY)
    public Cliente Cliente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido")
    public Articulo articulo;
    
    @Column(name = "unidades")
    public int Unidades;
    
    @Column(name = "fecha")
    public LocalDate Fecha;
    
    @Column(name = "hora")
    public LocalTime Hora;
    
    @Column(name = "precio_final")
    public double precioFinal;
    
    @Column(name = "envio")
    public boolean Envio;

    public Pedido(Cliente cli, Articulo art, int unidades, LocalDate Fecha, LocalTime Hora) {
        this.Cliente = cli;
        this.articulo = art;
        this.Unidades = unidades;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Envio = false;
    }
    
    public Pedido(){};

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    /*public double getPrecioFinal() {
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
    }*/

    public void setNumero(int numero) {
        this.codigo = numero;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

   /* public Articulo getArticulo() {
        return Articulo;
    }

    public void setArticulo(Articulo Articulo) {
        this.Articulo = Articulo;
    }*/

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
        return "Pedido{" + "codigo=" + codigo + ", Cliente=" + Cliente + ", articulofalso="  + ", Unidades=" + Unidades + ", Fecha=" + Fecha + ", Hora=" + Hora + ", precioFinal=" + precioFinal + ", Envio=" + Envio + '}';
    }

   

}
