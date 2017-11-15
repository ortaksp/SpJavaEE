/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.LocationFacade;
import com.javaee.model.Location;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */
@ManagedBean(name = "locationController")
@RequestScoped
public class LocationController {

    @EJB
    private LocationFacade locationFacade;
 
    private List<Location> locations;
    private Location location;

    

    
    @PostConstruct
    public void LocationController(){
        this.setLocations(locationFacade.findAll());
    }


    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
  
    
    
}
