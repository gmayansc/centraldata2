/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.mysql;

import edu.uoc.centraldata.dao.PedidoDAO;
import edu.uoc.centraldata.modelo.Pedido;
import edu.uoc.centraldata.dao.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLPedidoDAO implements PedidoDAO{
    
    final String INSERT = "INSERT INTO edu.uoc.centraldata.Pedido(codigo, Cliente, Articulo, Unidades, Fecha, Hora, precioFinal, Envio) VALUES (?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE edu.uoc.centraldata.Pedido SET codigo = ?, Cliente = ?, Articulo = ?, Unidades = ?, Fecha = ?, Hora = ?, precioFinal = ?, Envio = ? WHERE codigo = ?";
    final String DELETE = "DELETE FROM edu.uoc.centraldata.Pedido WHERE codigo = ?";
    final String GETALL = "SELECT * FROM edu.uoc.centraldata.Pedido";
    final String GETONE = "SELECT * FROM edu.uoc.centraldata.Pedido WHERE codigo = ?";

    private Connection conn;

    public MySQLPedidoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Pedido c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
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
    public void modificar(Pedido c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
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
    public void eliminar(Pedido c) throws DAOException {
                PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
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
    public List<Pedido> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Pedido> pedido = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            stat.executeQuery();
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
        return pedido;
    }
    
    @Override
    public Pedido obtener(Integer id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Pedido c = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setInt(1, id);
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
