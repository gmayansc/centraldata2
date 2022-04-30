package edu.uoc.centraldata.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    public int Codigo;

    @Column(name = "descripcion")
    public String Descripcion;
    @Column(name = "precio")
    public double Precio;
    @Column(name = "envio")
    public double GastosEnvio;
    @Column(name = "tiempo")
    public int Tiempo;
    
    /*@Column(name="articulos_asd")
    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL)
    private Pedido pedido;*/

    public Articulo() {
    }

    ;

    public Articulo(String Descripcion, double Precio, double GastosEnvio, int Tiempo) {
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.GastosEnvio = GastosEnvio;
        this.Tiempo = Tiempo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public double getGastosEnvio() {
        return GastosEnvio;
    }

    public void setGastosEnvio(float GastosEnvio) {
        this.GastosEnvio = GastosEnvio;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    @Override
    public String toString() {
        return "Articulo{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", Precio=" + Precio + ", GastosEnvio=" + GastosEnvio + ", Tiempo=" + Tiempo + '}';
    }

}
