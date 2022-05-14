/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.hibernate;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.modelo.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author gerardmayans
 */
public class HibernateClienteDAO {

    public static void insertar(Cliente c) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(c);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void eliminar(Cliente c) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.find(Cliente.class, c.getIdCliente());
            em.remove(em.contains(c) ? c : em.merge(c));
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static Cliente getCliente(String email) {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String query = "SELECT p FROM Cliente p WHERE p.email = :email";

        TypedQuery<Cliente> tq = em.createQuery(query, Cliente.class);
        tq.setParameter("email", email);

        Cliente cli = null;

        try {
            cli = tq.getSingleResult();

            return cli;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public static List<Cliente> getAllClientes() {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Cliente p WHERE p.id IS NOT NULL";

        TypedQuery<Cliente> tq = em.createQuery(strQuery, Cliente.class);
        List<Cliente> clientes = null;

        try {
            clientes = tq.getResultList();
        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
        
        return clientes;
    }

    public static List<Cliente> getAllEstandard() {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Cliente p WHERE p.tipo IS 'ESTANDARD'";

        TypedQuery<Cliente> tq = em.createQuery(strQuery, Cliente.class);
        List<Cliente> clientes = null;

        try {
            clientes = tq.getResultList();

        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
        
        return clientes;
    }
   public static List<Cliente> getAllPremium() {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Cliente p WHERE p.tipo IS 'PREMIUM'";

        TypedQuery<Cliente> tq = em.createQuery(strQuery, Cliente.class);
        List<Cliente> clientes = null;

        try {
            clientes = tq.getResultList();


        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
        
        return clientes;
    }
}
