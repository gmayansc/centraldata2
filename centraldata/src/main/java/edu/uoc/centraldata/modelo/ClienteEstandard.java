package edu.uoc.centraldata.modelo;

import javax.persistence.Entity;

@Entity
public class ClienteEstandard extends Cliente {

    public ClienteEstandard(String NIF, String Nombre, String Domicilio, String Email, String Tipo) {
        super(NIF, Nombre, Domicilio, Email, Tipo);
    }
    
    public ClienteEstandard(){};

    @Override
    public String tipoCliente() {
        return this.tipo;
    }

    @Override
    public float calcAnual() {
        return 0;

    }

    @Override
    public float descuentoEnv() {
        return 0;
    }
}
