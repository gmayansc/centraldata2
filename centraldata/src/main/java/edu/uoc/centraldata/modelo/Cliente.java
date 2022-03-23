package edu.uoc.centraldata.modelo;

public abstract class Cliente {
    
    public String nombre;
    public String domicilio;
    public String NIF;
    public String email;
    public String tipo;
    
    public Cliente(){};

    public Cliente(String NIF, String Nombre, String Domicilio,  String Email, String Tipo) {
        this.nombre = Nombre;
        this.domicilio = Domicilio;
        this.NIF = NIF;
        this.email = Email;
        this.tipo = Tipo;
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

    //public float calcAnual();
    
    //public float descuentoEnv();
    
}  
