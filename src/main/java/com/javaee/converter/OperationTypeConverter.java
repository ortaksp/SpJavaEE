/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.converter;

import com.javaee.facade.OperationtypeFacade;
import com.javaee.model.Operationtype;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Oguzhan
 */
@FacesConverter("operationTypeConverter")
public class OperationTypeConverter implements Converter{
    
    @EJB
    OperationtypeFacade operationTypeFacade;
 
    	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		if (value == null || value.trim().equals("")) {
            return null;
        } else {
            try {
            	String[] id = value.split("-");
            	value = id[0];
            	return operationTypeFacade.find(Integer.parseInt(value));                
            } catch(Exception exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid activity"));
            }
        }
 
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		
		if (value == null || value.equals("")) {
            return "";
        } else {
            return String.valueOf(((Operationtype) value).getOperationTypeid());
        }
	}
    
}
