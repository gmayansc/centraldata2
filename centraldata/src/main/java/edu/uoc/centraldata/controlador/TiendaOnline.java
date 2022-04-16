package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.ClienteDAO;
import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.dao.mysql.MySQLClienteDAO;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.vista.VentanaMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TiendaOnline {

    public static void main(String[] args) throws SQLException, DAOException {
        //VentanaMenu.iniciarVista();
        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "root");
            ClienteDAO dao = new MySQLClienteDAO(conn);
            Cliente c = dao.obtener(1);
                System.out.println(c.toString());
        } finally {
            if (conn != null) {
                conn.close();
            }

        }
    }

}
