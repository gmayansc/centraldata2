
package edu.uoc.centraldata.hibernate;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.modelo.ClienteEstandard;
import edu.uoc.centraldata.modelo.ClientePremium;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateDAOCliente {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void insertar(Cliente c) throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
            transaction.rollback();
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

    public void modificar(Cliente c) throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
            transaction.rollback();
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
    
    public void eliminar(Cliente c) throws DAOException{
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
            transaction.rollback();
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
        Session session = null;
        Transaction transaction = null;
        session = NewHibernateUtil.getSessionFactory().openSession();
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

    public List<Cliente> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        session = NewHibernateUtil.getSessionFactory().openSession();
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
            transaction.rollback();
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

    public Cliente obtener(Integer id) throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        session = NewHibernateUtil.getSessionFactory().openSession();
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
            transaction.rollback();
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
