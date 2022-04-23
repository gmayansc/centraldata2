package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.*;
import edu.uoc.centraldata.dao.ClienteDAO;
import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.mysql.MySQLClienteDAO;
import edu.uoc.centraldata.modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class VentanaMenu {

    public static void iniciarVista() throws SQLException, DAOException {
        ArticuloControlador.cargarArticulos();
        ClienteControlador.cargarClientes();
        PedidoControlador.cargarPedidos();
        pintarMenu();
    }

    public static void pintarMenu() throws SQLException, DAOException {
        boolean salir = false;

        while (!salir) {
            System.out.println("=============================================");
            System.out.println("=============== TIENDA ONLINE ===============");
            System.out.println("=============================================\n");
            System.out.println("** INTRODUCIR EL NÚMERO DE LA OPCIÓN **\n");
            System.out.println("1. Gestionar Artículos");
            System.out.println("2. Gestionar Clientes");
            System.out.println("3. Gestionar Pedidos");
            System.out.println("4. Conexión de prueba con BBDD");
            System.out.println("5. Salir de la aplicación");

            Scanner entrada = new Scanner(System.in);

            int opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                case 1:
                    VentanaArticulos.pintarMenu();
                    break;
                case 2:
                    VentanaClientes.pintarMenu();
                    break;
                case 3:
                    VentanaPedidos.pintarMenu();
                    break;
                case 4:
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
                case 5:
                    salir = true;
                    break;
                default:
                    break;
            };
        }
    }
}
