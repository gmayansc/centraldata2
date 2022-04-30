package edu.uoc.centraldata.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public abstract class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    public int idCliente;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "domicilio")
    public String domicilio;

    @Column(name = "NIF")
    public String NIF;

    @Column(name = "email")
    public String email;

    @Column(name = "tipo")
    public String tipo;
    
    @OneToOne(mappedBy="Cliente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Pedido pedido;

    public Cliente() {
    }

    ;

    public Cliente(String NIF, String Nombre, String Domicilio, String Email, String Tipo) {
        this.nombre = Nombre;
        this.domicilio = Domicilio;
        this.NIF = NIF;
        this.email = Email;
        this.tipo = Tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.domicilio = Domicilio;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + nombre + ", Domicilio=" + domicilio + ", NIF=" + NIF + ", Email=" + email + ", Tipo=" + tipo + "}";
    }

    public abstract String tipoCliente();

    public abstract float calcAnual();

    public abstract float descuentoEnv();

}
