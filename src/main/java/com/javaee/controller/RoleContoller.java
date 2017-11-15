/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.RoleFacade;
import com.javaee.model.Role;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */
@ManagedBean(name = "roleController")
@RequestScoped
public class RoleContoller {

    @EJB
    private RoleFacade roleFacade;
 
    private List<Role> roles;
    private Role role;


    
    @PostConstruct
    public void RoleController(){
        setRoles(roleFacade.findAll());
        this.role = new Role();
        System.out.println("role new oldu");
    }

    public void newRole(){
        System.out.println("New Role Button Aktif");
    }
    public void save(){
        roleFacade.create(role);
    }
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
