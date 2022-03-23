package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.modelo.*;

public class ClienteControlador {

    public static ListaClientes listaClientes = new ListaClientes();

    public static void cargarClientes() {
        Cliente cli = new ClienteEstandard("34233443K", "Juan", "Calle del Carmen, 23", "juan@uoc.edu", "ESTANDARD");
        Cliente cli2 = new ClienteEstandard("23433443K", "Laura", "Calle Barcelona, 233", "laura@uoc.edu", "ESTANDARD");
        Cliente cli3 = new ClientePremium("35634544R", "Sofia", "Calle de Serrano, 12", "sofia@uoc.edu", "PREMIUM");
        Cliente cli4 = new ClienteEstandard("0999088B", "Pedro", "Calle sin nombre, S/N", "pedro@uoc.edu", "ESTANDARD");
        listaClientes.agregar(cli);
        listaClientes.agregar(cli2);
        listaClientes.agregar(cli3);
        listaClientes.agregar(cli4);
    }

    public static void anadirCliente(String NIF, String nombre, String domicilio, String email, String tipo) {
        if (tipo.equals("ESTANDARD")) {
            Cliente cli = new ClienteEstandard(NIF, nombre, domicilio, email, tipo);
            listaClientes.agregar(cli);
        } else if (tipo.equals("PREMIUM")) {
            Cliente cli2 = new ClientePremium(NIF, nombre, domicilio, email, tipo);
            listaClientes.agregar(cli2);
        } else{
            
        }
    }

    public static void leerListaClientes() {
        for (int i = 0; i < listaClientes.getSize(); i++) {
            System.out.println(listaClientes.getAt(i).toString());

        }
    }

    public static void leerListaEstandard() {
        for (int i = 0; i < listaClientes.getSize(); i++) {
            if (listaClientes.getAt(i).getTipo().equals("ESTANDARD")) {
                System.out.println(listaClientes.getAt(i).toString());
            }
        }
    }

    public static void leerListaPremium() {
        for (int i = 0; i < listaClientes.getSize(); i++) {
            if (listaClientes.getAt(i).getTipo().equals("PREMIUM")) {
                System.out.println(listaClientes.getAt(i).toString());

            }
        }
    }
    
    public static void eliminarCliente(String email){
        listaClientes.borrarCliente(email);
    }
    
    public static Cliente getCliente(String email) {
        for (int i = 0; i < listaClientes.getSize(); i++) {
            Cliente cli = listaClientes.getAt(i);
            if (email.equals(cli.getEmail())) {
                return cli;
            }
        }
        return null;
    }
}

//existeCliente(Email: String): boolean
//añadirCliente(Nombre: String, Domicilio: String, NIF: String, Email: String, Tipo: String): void
//eliminarCliente(Cliente: Cliente): void
//mostrarClientes(Cliente: Cliente): void
//mostrarClientesEstandard(Cliente: Cliente): void
//mostrarClientesPremium(Cliente: Cliente): void
