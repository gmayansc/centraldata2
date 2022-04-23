
package edu.uoc.centraldata.hibernate;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.modelo.Articulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateDAOArticulo {

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
    
    public void insertar(Articulo c) throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            transaction = session.getTransaction();
            transaction.begin();
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
    
    public void modificar(Articulo c) throws DAOException{
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
                    transaction.rollback();
                }
            }
        }
    }

    public void eliminar(Articulo c) throws DAOException{
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
                    transaction.rollback();
                }
            }
        }
    }
    
    public List<Articulo> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        ResultSet rs = null;
        List<Articulo> articulo = new ArrayList<>();
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
                    transaction.rollback();
                }
            }
        }
        return articulo;
    }

    public Articulo obtener(Integer id) throws DAOException {
        PreparedStatement stat = null;
        Session session = null;
        Transaction transaction = null;
        ResultSet rs = null;
        Articulo c = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
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
                    transaction.rollback();
                }
            }
        }
        return c;
    }
    
}
