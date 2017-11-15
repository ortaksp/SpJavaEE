/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.facade;

import com.javaee.model.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Oguzhan
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "osy_javaee_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
     public User userLoginCre(String userName, String password){
                User user = null;
    	        Query query = getEntityManager().createNamedQuery("User.findByUserNameAndPassword")
		.setParameter("userName", userName)
                .setParameter("password", password);
		try {
			user = (User) query.getSingleResult();
		} catch (Exception e) {
			// getSingleResult throws NoResultException in case there is no user in DB
			// ignore exception and return NULL for user instead
		}
		return user;
    }
    
     public boolean userLoginControl(String userName, String password){
         try{
         User u = (User) em.createNamedQuery("User.findByUserNameAndPassword", User.class)
         .setParameter("userName", userName)
         .setParameter("password", password)
         .getSingleResult();
         if(u != null){
             return true;
         } return false;
         }
         catch(Exception e)
         {
                 return false;
         }
         
     }
}