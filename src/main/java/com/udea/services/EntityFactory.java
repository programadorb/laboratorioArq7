/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import org.apache.log4j.Logger;


/**
 *
 * @author Andres
 */
public final class EntityFactory {
    
    private static EntityFactory instance;
    public static EntityFactory getInstance() {
        if (instance == null) {
            instance = new EntityFactory();
        }
        return instance;
    }
    
    private EntityManagerFactory mgr;
    
    public EntityManager getManager() {
        return getManager("laboratorioPU");
    }
    
    public EntityManager getManager(String unit) {
        if (mgr == null || !mgr.isOpen()) {
            
                mgr = Persistence.createEntityManagerFactory(unit);

        }
        /*
         StackTraceElement[] elements = Thread.currentThread().getStackTrace();

            for(int i=0; i<elements.length; i++) {
                System.out.println(elements[i]);
            }
        
        log.info("Creando EntityManager"); /**/
        return mgr.createEntityManager();
    }
    
    public boolean isOpen(){
        if (mgr != null)
            return mgr.isOpen();
        
        return false;
    }
    
    public void close() {
        if (mgr != null) {
            mgr.close();
        }
    }
    
}
