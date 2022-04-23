package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.ClienteDAO;
import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.mysql.MySQLClienteDAO;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.vista.VentanaMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TiendaOnline {

    public static void main(String[] args) throws SQLException, DAOException {
        VentanaMenu.iniciarVista();
    }

}
