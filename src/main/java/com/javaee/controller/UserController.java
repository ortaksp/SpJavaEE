/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.LocationFacade;
import com.javaee.facade.OperationtypeFacade;
import com.javaee.facade.RoleFacade;
import com.javaee.facade.UserFacade;
import com.javaee.model.Location;
import com.javaee.model.Operationtype;
import com.javaee.model.Role;
import com.javaee.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */

@ManagedBean(name = "userController") 
@RequestScoped
public class UserController implements Serializable{

    private static final long serialVersionUID = 1L;

    
    @EJB
    private UserFacade userFacade;
    @EJB
    private OperationtypeFacade operationTypeFacade;    
    @EJB
    private LocationFacade locationFacade;
    @EJB
    private RoleFacade roleFacade;
    
    private User user;
    private List<User> users;
    private Operationtype operationType;
    private List<Operationtype> operationTypes;
    private Location location;
    private List<Location> locations;
    private Role role;
    private List<Role> roles;
    
    public void UserController() {
    }
    
    @PostConstruct
    public void init(){
        this.setUsers(userFacade.findAll());
        this.setOperationTypes(operationTypeFacade.findAll());
        this.setLocations(locationFacade.findAll());
        this.setRoles(roleFacade.findAll());
    }
    public void newUsers(){
        User user = new User();
    }
  
    public void addUser(){
        user.setLocationid(this.location);
        user.setOperationTypeid(this.operationType);
        user.setRoleid(this.role);
        userFacade.create(user);
        
    }

        public List<Operationtype> completeOperationType(String query) {
		List<Operationtype> resulList = new ArrayList<Operationtype>(); 
		for(Operationtype o : this.operationTypes) {
			String key = o.getOperationTypeName(); 
			if(key.toLowerCase().contains(query.toLowerCase())) {
				resulList.add(o);
			}
		}
		return resulList;
	}
        public List<Location> completeLocation(String query) {
		List<Location> resulList = new ArrayList<Location>(); 
		for(Location l : this.locations) {
			String key = l.getCountry(); 
			if(key.toLowerCase().contains(query.toLowerCase())) {
				resulList.add(l);
			}
		}
		return resulList;
	}

         public List<Role> completeRole(String query) {
		List<Role> resulList = new ArrayList<Role>(); 
		for(Role r : this.roles) {
			String key = r.getRoleName(); 
			if(key.toLowerCase().contains(query.toLowerCase())) {
				resulList.add(r);
			}
		}
		return resulList;
	}

    public List<User> getUsers() {
        return users;
    }
    

    public void setUsers(List<User> users) {
        
        this.users = userFacade.findAll();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Operationtype getOperationType() {
        return operationType;
    }

    public void setOperationType(Operationtype operationType) {
        this.operationType = operationType;
    }

    public List<Operationtype> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<Operationtype> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    
    
    
}
