/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.ShiftFacade;
import com.javaee.model.Shift;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */
@ManagedBean(name = "shiftController")
@RequestScoped
public class ShiftController {

    @EJB
    private ShiftFacade shiftFacade;
 
    private List<Shift> shifts;
    private Shift shift;

    public ShiftController() {
    }

  

    
    @PostConstruct
    public void ShiftController(){
        this.setShifts(shiftFacade.findAll());
                }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

}
