package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.modelo.*;

public class ClienteControlador {

    public static ListaDatos<Cliente> listaClientes = new ListaDatos();

    public static void cargarClientes() {
        Cliente cli = new ClienteEstandard("34233443K", "Juan", "Calle del Carmen, 23", "juan@uoc.edu", "ESTANDAR");
        Cliente cli2 = new ClienteEstandard("23433443K", "Laura", "Calle Barcelona, 233", "laura@uoc.edu", "ESTANDAR");
        Cliente cli3 = new ClientePremium("35634544R", "Sofia", "Calle de Serrano, 12", "sofia@uoc.edu", "PREMIUM");
        Cliente cli4 = new ClienteEstandard("0999088B", "Pedro", "Calle sin nombre, S/N", "pedro@uoc.edu", "ESTANDAR");
    }

    public static void anadirCliente(String NIF, String nombre, String domicilio, String email, String tipo) {
        
        if (tipo.equals("ESTANDAR")) {
            Cliente cli = new ClienteEstandard(NIF, nombre, domicilio, email, tipo);
            listaClientes.agregar(cli);
        } else if (tipo.equals("PREMIUM")) {
            Cliente cli2 = new ClientePremium(NIF, nombre, domicilio, email, tipo);
            listaClientes.agregar(cli2);
        }
    }
}

//existeCliente(Email: String): boolean
//añadirCliente(Nombre: String, Domicilio: String, NIF: String, Email: String, Tipo: String): void
//eliminarCliente(Cliente: Cliente): void
//mostrarClientes(Cliente: Cliente): void
//mostrarClientesEstandard(Cliente: Cliente): void
//mostrarClientesPremium(Cliente: Cliente): void
