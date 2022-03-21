package edu.uoc.centraldata.modelo;

public abstract class Cliente {
    
    public String Nombre;
    public String Domicilio;
    public String NIF;
    public String Email;
    public String Tipo;
    
    public Cliente(){};

    public Cliente(String NIF, String Nombre, String Domicilio,  String Email, String Tipo) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.NIF = NIF;
        this.Email = Email;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", NIF=" + NIF + ", Email=" + Email + ", Tipo=" + Tipo + '}';
    }
    
      boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
      
      private boolean comprobarTipo(boolean tipo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //public float calcAnual();
    
    //public float descuentoEnv();
    
}  
