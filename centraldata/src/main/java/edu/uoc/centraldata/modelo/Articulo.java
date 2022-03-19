package edu.uoc.centraldata.modelo;

public class Articulo {
	
    public String Codigo;
    public String Descripcion;
    public double Precio;
    public double GastosEnvio;
    public int Tiempo;
    
    public Articulo(){};

    public Articulo(String Codigo, String Descripcion, double Precio, double GastosEnvio, int Tiempo) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.GastosEnvio = GastosEnvio;
        this.Tiempo = Tiempo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
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