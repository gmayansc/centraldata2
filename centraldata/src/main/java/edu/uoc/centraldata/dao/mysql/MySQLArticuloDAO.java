/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.mysql;

import edu.uoc.centraldata.dao.ArticuloDAO;
import edu.uoc.centraldata.modelo.Articulo;
import edu.uoc.centraldata.dao.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLArticuloDAO implements ArticuloDAO {

    final String INSERT = "INSERT INTO edu.uoc.centraldata.Articulo(Codigo, Descripcion, Precio, GastosEnvio, Tiempo) VALUES (?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE edu.uoc.centraldata.Articulo SET Codigo = ?, Descripcion = ?, Precio = ?, GastosEnvio = ?, Tiempo = ? WHERE Codigo = ?";
    final String DELETE = "DELETE FROM edu.uoc.centraldata.Articulo WHERE Codigo = ?";
    final String GETALL = "SELECT * FROM edu.uoc.centraldata.Articulo";
    final String GETONE = "SELECT * FROM edu.uoc.centraldata.Articulo WHERE Codigo = ?";

    private Connection conn;

    public MySQLArticuloDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Articulo c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setInt(1, c.getCodigo());
            stat.setString(2, c.getDescripcion());
            stat.setDouble(3, c.getPrecio());
            stat.setDouble(4, c.getGastosEnvio());
            stat.setInt(5, c.getTiempo());
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
    public void modificar(Articulo c) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setInt(1, c.getCodigo());
            stat.setString(2, c.getDescripcion());
            stat.setDouble(3, c.getPrecio());
            stat.setDouble(4, c.getGastosEnvio());
            stat.setInt(5, c.getTiempo());
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
    public void eliminar(Articulo c) throws DAOException{
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, c.getCodigo());
            stat.setString(2, c.getDescripcion());
            stat.setDouble(3, c.getPrecio());
            stat.setDouble(4, c.getGastosEnvio());
            stat.setInt(5, c.getTiempo());
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
    public List<Articulo> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Articulo> articulo = new ArrayList<>();
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
        return articulo;
    }

    @Override
    public Articulo obtener(Integer id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Articulo c = null;
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
