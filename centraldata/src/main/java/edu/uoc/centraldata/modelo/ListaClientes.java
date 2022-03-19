package edu.uoc.centraldata.modelo;

import java.util.ArrayList;

public class ListaClientes<T> extends ListaDatos<Cliente> {
    
    public Cliente Cliente;
            
    public ArrayList<T> listaCliente;
    
    private void inicializarValores() {
        listaCliente.add((T) new Cliente("José Luis García García", "Calle Guay 9 4A, Barcelona, 08001", "12345678B", "pepeluis@uoc.edu",false));   
        listaCliente.add((T) new Cliente("Mariano Rajoy Cantalapiedra", "Calle Lago 13 1A, Mendilorri", "87654321A", "marianito@gmail.com",true));
    }

    public boolean comprobarEmail(String Email) {
        boolean bol = false;
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente = (edu.uoc.centraldata.modelo.Cliente) listaCliente.get(i);
            if (Email.equals(Cliente.getEmail())) {
                bol= true;
            } else {
                bol= false;
            }
        }
        return bol;
    }

    public void agregarCliente(Cliente cliente) {
        if (comprobarEmail(Cliente.getEmail()) == true) {
            listaCliente.add((T)Cliente);
            System.out.print("El Cliente ha sido Creado");
        } else {
            System.out.print("Este Cliente ya existe");
        }

    }

    public void eliminarCliente(Cliente cliente) {
        if (comprobarEmail(Cliente.getEmail()) == true) {
            listaCliente.remove((T) Cliente);
            System.out.print("El Cliente ha sido Eliminado");
        } else {
            System.out.print("Este Cliente no existe");
        }

    }
    
    public void listarClientes() {
        if (comprobarEmail(Cliente.getEmail()) == true) {
            System.out.println("Listado de Clientes (" + this.Cliente.getEmail() + "):");
        } else {
            System.out.println("No existe el Cliente");
        }
        
    }
    
    public boolean comprobarTipo(boolean Tipo) {
        boolean bol = false;
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente = (edu.uoc.centraldata.modelo.Cliente) listaCliente.get(i);
        }
        return bol;
    }
    
    public void listarClientesEstandard() {
        if (comprobarTipo(Cliente.getTipo()) == false) {
            System.out.println("Listado de Clientes Estandard (" + this.Cliente.getEmail() + "):");
        } else {
            System.out.println("No existe el Cliente");
        }
        
    }
    
    public void listarClientesPremium() {
        if (comprobarTipo(Cliente.getTipo()) == true) {
            System.out.println("Listado de Clientes Premium (" + this.Cliente.getEmail() + "):");
        } else {
            System.out.println("No existe el Cliente");
        }
        
    }
    
}
