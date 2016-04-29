/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.valleycargo.facade;

import edu.valleycargo.entity.Vehiculos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PRACTICAS
 */
@Stateless
public class VehiculosFacade extends AbstractFacade<Vehiculos> {

    @PersistenceContext(unitName = "fernandaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculosFacade() {
        super(Vehiculos.class);
    }
    
}
