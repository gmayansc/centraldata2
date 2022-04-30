package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.dao.hibernate.HibernateClienteDAO;
import edu.uoc.centraldata.modelo.*;

public class ClienteControlador {

    public static void anadirCliente(String NIF, String nombre, String domicilio, String email, String tipo) throws DAOException {
        if (tipo.equals("ESTANDARD")) {
            Cliente cli = new ClienteEstandard(NIF, nombre, domicilio, email, tipo);
            HibernateClienteDAO.insertar(cli);
        } else if (tipo.equals("PREMIUM")) {
            Cliente cli2 = new ClientePremium(NIF, nombre, domicilio, email, tipo);
            HibernateClienteDAO.insertar(cli2);
        } else {

        }
    }

    public static Cliente buscar(String email) {
        
         Cliente cli = HibernateClienteDAO.getCliente(email);
        
         if(cli != null){
             return cli;
         } else {
             return null;
         }

    }

    public static void eliminar(Cliente c) throws DAOException {
        HibernateClienteDAO.eliminar(c);
    }

    public static void leerListaClientes() {
        HibernateClienteDAO.getAllClientes();
    }

    public static void leerListaEstandard() {
        HibernateClienteDAO.getAllEstandard();
    }

    public static void leerListaPremium() {
        HibernateClienteDAO.getAllPremium();
    }
//
//    public static void anadirCliente(String NIF, String nombre, String domicilio, String email, String tipo) {
//        if (tipo.equals("ESTANDARD")) {
//            Cliente cli = new ClienteEstandard(NIF, nombre, domicilio, email, tipo);
//            listaClientes.agregar(cli);
//        } else if (tipo.equals("PREMIUM")) {
//            Cliente cli2 = new ClientePremium(NIF, nombre, domicilio, email, tipo);
//            listaClientes.agregar(cli2);
//        } else{
//            
//        }
//    }
//

//
//    public static void leerListaEstandard() {
//        for (int i = 0; i < listaClientes.getSize(); i++) {
//            if (listaClientes.getAt(i).getTipo().equals("ESTANDARD")) {
//                System.out.println(listaClientes.getAt(i).toString());
//            }
//        }
//    }
//
//    public static void leerListaPremium() {
//        for (int i = 0; i < listaClientes.getSize(); i++) {
//            if (listaClientes.getAt(i).getTipo().equals("PREMIUM")) {
//                System.out.println(listaClientes.getAt(i).toString());
//
//            }
//        }
//    }
//    
//    
//    public static Cliente getCliente(String email) {
//        for (int i = 0; i < listaClientes.getSize(); i++) {
//            Cliente cli = listaClientes.getAt(i);
//            if (email.equals(cli.getEmail())) {
//                return cli;
//            }
//        }
//        return null;
//    }
//
//    public static ListaClientes getListaClientes() {
//        return listaClientes;
//    }
//   
//    
}
