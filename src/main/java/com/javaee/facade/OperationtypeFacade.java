/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.facade;

import com.javaee.model.Operationtype;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Oguzhan
 */
@Stateless
public class OperationtypeFacade extends AbstractFacade<Operationtype> {

    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "osy_javaee_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperationtypeFacade() {
        super(Operationtype.class);
    }
    
}
