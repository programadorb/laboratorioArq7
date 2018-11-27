package com.udea.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.udea.model.Clima;


@Stateless
@LocalBean
public class ClimaEJB {

    @PersistenceContext(unitName = "laboratorioPU")
    private EntityManager em;    


    
    public Clima getById(Long id) {
        return em.find(Clima.class, id);
    }

    public List<Clima> getAll() {
        return em.createQuery("select c from Clima c").getResultList();
    }

    public void registrarClima(Clima clima) {

        System.out.println("va a registar el clima");
        System.out.println("la infro del clima que llega es : ");
        System.out.println(clima);
        System.out.println(clima.getCiudad());

        
        
        em.persist(clima);
        em.flush();
    }

    
    public void actualizarClima(Clima clima) {
        
        System.out.println("va acualizar el clima");
        System.out.println("la info del clima que llega es : ");
        System.out.println(clima);
        System.out.println(clima.getCiudad());
        em.merge(clima);
        System.out.println("terminar el clima");
    }
}