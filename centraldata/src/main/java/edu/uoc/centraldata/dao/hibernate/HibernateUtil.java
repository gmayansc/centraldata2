/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uoc.centraldata.dao.hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gerardmayans
 */
public class HibernateUtil {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if (ENTITY_MANAGER_FACTORY == null){
            ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("centraldata");
        }
        return ENTITY_MANAGER_FACTORY;
    }
    
}
