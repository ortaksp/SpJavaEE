/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.ShiftFacade;
import com.javaee.facade.WeekFacade;
import com.javaee.model.Shift;
import com.javaee.model.Week;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */
@ManagedBean(name = "weekController")
@RequestScoped
public class WeekController {

    @EJB
    private WeekFacade weekFacade;
 
    private List<Week> weeks;
    private Week week;

    public WeekController() {
    }

    
    
    @PostConstruct
    public void WeekController(){
        this.setWeeks(weekFacade.findAll());
        }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }
    
    

}
