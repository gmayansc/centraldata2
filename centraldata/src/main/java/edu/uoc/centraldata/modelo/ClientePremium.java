package edu.uoc.centraldata.modelo;

public class ClientePremium extends Cliente {

    public ClientePremium(String NIF, String Nombre, String Domicilio, String Email, String Tipo) {
        super(NIF, Nombre, Domicilio, Email, Tipo);
    }

    @Override
    public String tipoCliente() {
        return this.tipo;
    }

    @Override
    public float calcAnual() {
        return 30;

    }

    @Override
    public float descuentoEnv() {
        return 20;
    }
}
