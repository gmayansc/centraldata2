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
    
    
    
    
//
//    public boolean existeCliente(String Email) {
//        boolean bol = false;
//        for (int i = 0; i < listaCliente.size(); i++) {
//            Cliente = (edu.uoc.centraldata.modelo.Cliente) listaCliente.get(i);
//            if (Email.equals(Cliente.getEmail())) {
//                bol= true;
//            } else {
//                bol= false;
//            }
//        }
//        return bol;
//    }
//    
//    public boolean existeCliente(Cliente Cliente) {
//        throw new UnsupportedOperationException(""); 
//    }
//    
//    public void agregarCliente(Cliente Cliente) {
//        if (!this.existeCliente(Cliente)) {
//            this.listaCliente.add((T) Cliente);
//            System.out.println("El Cliente ha sido Creado");
//        } else {
//            System.out.println("Este Cliente ya existe");
//        }
//    }
//    
//    public void eliminarCliente(Cliente Cliente) {
//        if (existeCliente(Cliente.getEmail()) == true) {
//            this.listaCliente.remove((T) Cliente);
//            System.out.println("El Cliente ha sido Eliminado");
//        } else {
//            System.out.println("No existe el Cliente");
//        }
//    }
//     
//    public void listarClientes(Cliente Cliente) {
//        if (existeCliente(Cliente.getEmail()) == true) {
//            System.out.println("Listado de Clientes (" + this.Cliente.getEmail() + "):");
//        } else {
//            System.out.println("No existe el Cliente");
//        }    
//    }
//    
//    public boolean comprobarTipo(boolean Tipo) {
//        boolean bol = false;
//        for (int i = 0; i < listaCliente.size(); i++) {
//            Cliente = (edu.uoc.centraldata.modelo.Cliente) listaCliente.get(i);
//        }
//        return bol;
//    }
//    
//    public void listarClientesEstandard() {
//        if (comprobarTipo(Cliente.getTipo()) == false) {
//            System.out.println("Listado de Clientes Estandard (" + this.Cliente.getEmail() + "):");
//        } else {
//            System.out.println("No existe el Cliente");
//        }  
//    }
//    
//    public void listarClientesPremium() {
//        if (comprobarTipo(Cliente.getTipo()) == true) {
//            System.out.println("Listado de Clientes Premium (" + this.Cliente.getEmail() + "):");
//        } else {
//            System.out.println("No existe el Cliente");
//        }  
//    }
    
}
