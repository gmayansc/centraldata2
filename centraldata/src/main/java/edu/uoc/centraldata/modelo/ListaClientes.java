package edu.uoc.centraldata.modelo;

import java.util.ArrayList;

public class ListaClientes extends ListaDatos<Cliente> {
        
    @Override
    public void agregar(Cliente cli) {
        if (!existeCliente(cli.getEmail())) {
            this.lista.add(cli);
        } else {
            System.out.println("Este cliente ya está registrado");
        }
    }

    public void borrarCliente(String email) {
        Cliente cli = getCliente(email);
        if (existeCliente(cli.getEmail())) {
            this.lista.remove(cli);
        } else{
            System.out.println("El cliente no está registrado y, por tanto, no se puede borrar.");
        }
    }

    public boolean existeCliente(String clienteEmail) {
        Cliente cli = getCliente(clienteEmail);
        if (cli != null) {
        for (int i = 0; i < this.lista.size(); i++) {
            Cliente cli2 = this.lista.get(i);
            if (cli2.getEmail().equals(cli.getEmail())) {
                return true;
            }
        }
        }
        return false;
    }

    public Cliente getCliente(String email) {
        for (int i = 0; i < this.lista.size(); i++) {
            Cliente cli = this.lista.get(i);
            if (email.equals(cli.getEmail())) {
                return cli;
            }
        }
        return null;
    }    
    
}
