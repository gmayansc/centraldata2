package edu.uoc.centraldata.modelo;

public class ClienteEstandard extends Cliente{
	
    public ClienteEstandard(String Nombre, String Domicilio, String NIF, String Email, boolean Tipo) {
        super(Nombre, Domicilio, NIF, Email, Tipo);
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getDomicilio() {
        return Domicilio;
    }

    @Override
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    @Override
    public String getNIF() {
        return NIF;
    }

    @Override
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public boolean getTipo() {
        return Tipo;
    }

    @Override
    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }
 
}
