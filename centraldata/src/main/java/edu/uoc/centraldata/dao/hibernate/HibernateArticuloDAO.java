/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.hibernate;

import edu.uoc.centraldata.dao.DAOException;

import edu.uoc.centraldata.modelo.Articulo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author gerardmayans
 */
public class HibernateArticuloDAO {

    public static void insertar(Articulo a) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(a);
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

    public static void eliminar(Articulo a) throws DAOException {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.remove(em.contains(a) ? a : em.merge(a)); //DEBEMOS HACER ESTA COMPROBACIÓN
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

    public static Articulo getArticulo(int id) {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String query = "SELECT p FROM Articulo p WHERE p.id = :id";

        TypedQuery<Articulo> tq = em.createQuery(query, Articulo.class);
        tq.setParameter("id", id);

        Articulo art = null;

        try {
            art = tq.getSingleResult();

            return art;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public static List<Articulo> getAllArticulos() {
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        String strQuery = "SELECT p FROM Articulo p WHERE p.id IS NOT NULL";

        TypedQuery<Articulo> tq = em.createQuery(strQuery, Articulo.class);
        List<Articulo> articulos = null;

        try {
        	articulos = tq.getResultList();

        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            em.close();
        }
        
        return articulos;
    }
    

}
