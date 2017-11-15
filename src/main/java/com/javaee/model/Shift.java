/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oguzhan
 */
@Entity
@Table(name = "shift", catalog = "spdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shift.findAll", query = "SELECT s FROM Shift s")
    , @NamedQuery(name = "Shift.findByShitid", query = "SELECT s FROM Shift s WHERE s.shitid = :shitid")
    , @NamedQuery(name = "Shift.findByShiftName", query = "SELECT s FROM Shift s WHERE s.shiftName = :shiftName")
    , @NamedQuery(name = "Shift.findByShiftStart", query = "SELECT s FROM Shift s WHERE s.shiftStart = :shiftStart")
    , @NamedQuery(name = "Shift.findByShiftFinish", query = "SELECT s FROM Shift s WHERE s.shiftFinish = :shiftFinish")})
public class Shift implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shitid")
    private Integer shitid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "shiftName")
    private String shiftName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shiftStart")
    @Temporal(TemporalType.DATE)
    private Date shiftStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shiftFinish")
    @Temporal(TemporalType.DATE)
    private Date shiftFinish;

    public Shift() {
    }

    public Shift(Integer shitid) {
        this.shitid = shitid;
    }

    public Shift(Integer shitid, String shiftName, Date shiftStart, Date shiftFinish) {
        this.shitid = shitid;
        this.shiftName = shiftName;
        this.shiftStart = shiftStart;
        this.shiftFinish = shiftFinish;
    }

    public Integer getShitid() {
        return shitid;
    }

    public void setShitid(Integer shitid) {
        this.shitid = shitid;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public Date getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(Date shiftStart) {
        this.shiftStart = shiftStart;
    }

    public Date getShiftFinish() {
        return shiftFinish;
    }

    public void setShiftFinish(Date shiftFinish) {
        this.shiftFinish = shiftFinish;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shitid != null ? shitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shift)) {
            return false;
        }
        Shift other = (Shift) object;
        if ((this.shitid == null && other.shitid != null) || (this.shitid != null && !this.shitid.equals(other.shitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javaee.model.Shift[ shitid=" + shitid + " ]";
    }
    
}
