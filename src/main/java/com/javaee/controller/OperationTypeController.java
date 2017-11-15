/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.controller;

import com.javaee.facade.OperationtypeFacade;
import com.javaee.model.Operationtype;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oguzhan
 */
@ManagedBean(name = "operationTypeController")
@RequestScoped
public class OperationTypeController {

    @EJB
    private OperationtypeFacade operationTypeFacade;
 
    private List<Operationtype> operationTypes;
    private Operationtype operationType;

    public OperationTypeController() {
    }

    
    

    
    @PostConstruct
    public void OperationTypeController(){
        this.setOperationTypes(operationTypeFacade.findAll());
    }

    public List<Operationtype> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<Operationtype> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public Operationtype getOperationType() {
        return operationType;
    }

    public void setOperationType(Operationtype operationType) {
        this.operationType = operationType;
    }


    
}
