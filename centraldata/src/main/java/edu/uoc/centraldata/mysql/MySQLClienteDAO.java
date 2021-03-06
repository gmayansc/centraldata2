/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.mysql;

import edu.uoc.centraldata.dao.ClienteDAO;
import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.modelo.ClienteEstandard;
import edu.uoc.centraldata.modelo.ClientePremium;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gerardmayans
 */
public class MySQLClienteDAO implements ClienteDAO {

    final String INSERT = "INSERT INTO edu.uoc.centraldata.Cliente(idCliente, nombre, domicilio, NIF, email, tipo) VALUES (?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE edu.uoc.centraldata.Cliente SET idCliente = ?, nombre = ?, domicilio = ?, NIF = ?, email = ?, tipo = ? WHERE email = ?";
    final String DELETE = "DELETE FROM edu.uoc.centraldata.Cliente WHERE email = ?";
    final String GETALL = "SELECT * FROM edu.uoc.centraldata.Cliente";
    final String GETONE = "SELECT * FROM edu.uoc.centraldata.Cliente WHERE email = ?";

    private Connection conn;

    public MySQLClienteDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Cliente c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, c.getNombre());
            stat.setString(2, c.getDomicilio());
            stat.setString(3, c.getNIF());
            stat.setString(4, c.getEmail());
            stat.setString(5, c.getTipo());
            stat.setFloat(6, c.calcAnual());
            stat.setFloat(7, c.descuentoEnv());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("Puede que no se haya guardado");
            };
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
    }

    @Override
    public void modificar(Cliente c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, c.getNombre());
            stat.setString(2, c.getDomicilio());
            stat.setString(3, c.getNIF());
            stat.setString(4, c.getEmail());
            stat.setString(5, c.getTipo());
            stat.setFloat(6, c.calcAnual());
            stat.setFloat(7, c.descuentoEnv());
        if (stat.executeUpdate() == 0) {
                throw new DAOException("Puede que no se haya guardado");
            };
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
    }
    
    @Override
    public void eliminar(Cliente c) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setString(1, c.getNombre());
            stat.setString(2, c.getDomicilio());
            stat.setString(3, c.getNIF());
            stat.setString(4, c.getEmail());
            stat.setString(5, c.getTipo());
            stat.setFloat(6, c.calcAnual());
            stat.setFloat(7, c.descuentoEnv());
        if (stat.executeUpdate() == 0) {
                throw new DAOException("Puede que no se haya guardado");
            };
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
    }
        
    private Cliente convertir(ResultSet rs) throws SQLException {
        String nombre = rs.getString("nombre");
        String domicilio = rs.getString("domicilio");
        String NIF = rs.getString("NIF");
        String email = rs.getString("email");
        String tipo = rs.getString("tipo");
        Float calcAnual = rs.getFloat("cuota_anual");
        Float descuento_envio = rs.getFloat("descuento_envio");
        Cliente cliente;
        if (tipo.equals("PREMIUM")) {
            cliente = new ClientePremium(NIF, nombre, domicilio, email, tipo);
        } else {
            cliente = new ClienteEstandard(NIF, nombre, domicilio, email, tipo);
        }
        cliente.setIdCliente(rs.getInt("id_cliente"));
        return cliente;
    }

    @Override
    public List<Cliente> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            stat.executeQuery();

            while (rs.next()) {
                cliente.add(convertir(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }

            }
        }
        return cliente;
    }

    @Override
    public Cliente obtener(Integer id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Cliente c = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setInt(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado este cliente");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
        return c;
    }

}
