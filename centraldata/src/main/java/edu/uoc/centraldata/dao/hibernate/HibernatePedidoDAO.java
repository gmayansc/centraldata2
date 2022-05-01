/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.hibernate;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.modelo.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author gerardmayans
 */
public class HibernatePedidoDAO {
    public static void insertar(Pedido p) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(p);
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

    public static void eliminar(Pedido p) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.find(Cliente.class, p.getCodigo());
            em.remove(em.contains(p) ? p : em.merge(p));
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

    
    public static Pedido getPedido(int id) {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String query = "SELECT p FROM Pedido p WHERE p.id = :id";

        TypedQuery<Pedido> tq = em.createQuery(query, Pedido.class);
        tq.setParameter("id", id);

        Pedido ped = null;

        try {
            ped = tq.getSingleResult();

            return ped;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

 
    public static void getAllPedidos() {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Pedido p WHERE p.id IS NOT NULL";

        TypedQuery<Pedido> tq = em.createQuery(strQuery, Pedido.class);
        List<Pedido> pedidos;

        try {
            pedidos = tq.getResultList();

            pedidos.forEach(ped -> System.out.println(ped.toString()));

        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
    }
    
    public static void getPedidosEnviados(){
                EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Pedido p WHERE p.envio = 1";

        TypedQuery<Pedido> tq = em.createQuery(strQuery, Pedido.class);
        List<Pedido> pedidos;

        try {
            pedidos = tq.getResultList();

            pedidos.forEach(ped -> System.out.println(ped.toString()));

        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
    }
    
    public static void getPedidosPendientes(){
                EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Pedido p WHERE p.envio = 0";

        TypedQuery<Pedido> tq = em.createQuery(strQuery, Pedido.class);
        List<Pedido> pedidos;

        try {
            pedidos = tq.getResultList();

            pedidos.forEach(ped -> System.out.println(ped.toString()));

        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
    }
}
