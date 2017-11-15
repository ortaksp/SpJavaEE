/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oguzhan
 */
@Entity
@Table(name = "operationtype", catalog = "spdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operationtype.findAll", query = "SELECT o FROM Operationtype o")
    , @NamedQuery(name = "Operationtype.findByOperationTypeid", query = "SELECT o FROM Operationtype o WHERE o.operationTypeid = :operationTypeid")
    , @NamedQuery(name = "Operationtype.findByOperationTypeName", query = "SELECT o FROM Operationtype o WHERE o.operationTypeName = :operationTypeName")
    , @NamedQuery(name = "Operationtype.findByWorkAmountMin", query = "SELECT o FROM Operationtype o WHERE o.workAmountMin = :workAmountMin")
    , @NamedQuery(name = "Operationtype.findByWorkAmountMax", query = "SELECT o FROM Operationtype o WHERE o.workAmountMax = :workAmountMax")
    , @NamedQuery(name = "Operationtype.findByStart", query = "SELECT o FROM Operationtype o WHERE o.start = :start")
    , @NamedQuery(name = "Operationtype.findByFinish", query = "SELECT o FROM Operationtype o WHERE o.finish = :finish")
    , @NamedQuery(name = "Operationtype.findByDuration", query = "SELECT o FROM Operationtype o WHERE o.duration = :duration")
    , @NamedQuery(name = "Operationtype.findByWednesdayid", query = "SELECT o FROM Operationtype o WHERE o.wednesdayid = :wednesdayid")})
public class Operationtype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "operationTypeid")
    private Integer operationTypeid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "operationTypeName")
    private String operationTypeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "workAmountMin")
    private int workAmountMin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "workAmountMax")
    private int workAmountMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start")
    @Temporal(TemporalType.DATE)
    private Date start;
    @Basic(optional = false)
    @NotNull
    @Column(name = "finish")
    @Temporal(TemporalType.DATE)
    private Date finish;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duration")
    @Temporal(TemporalType.DATE)
    private Date duration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wednesdayid")
    private int wednesdayid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operationTypeid", fetch = FetchType.LAZY)
    private Collection<User> userCollection;

    public Operationtype() {
    }

    public Operationtype(Integer operationTypeid) {
        this.operationTypeid = operationTypeid;
    }

    public Operationtype(Integer operationTypeid, String operationTypeName, int workAmountMin, int workAmountMax, Date start, Date finish, Date duration, int wednesdayid) {
        this.operationTypeid = operationTypeid;
        this.operationTypeName = operationTypeName;
        this.workAmountMin = workAmountMin;
        this.workAmountMax = workAmountMax;
        this.start = start;
        this.finish = finish;
        this.duration = duration;
        this.wednesdayid = wednesdayid;
    }

    public Integer getOperationTypeid() {
        return operationTypeid;
    }

    public void setOperationTypeid(Integer operationTypeid) {
        this.operationTypeid = operationTypeid;
    }

    public String getOperationTypeName() {
        return operationTypeName;
    }

    public void setOperationTypeName(String operationTypeName) {
        this.operationTypeName = operationTypeName;
    }

    public int getWorkAmountMin() {
        return workAmountMin;
    }

    public void setWorkAmountMin(int workAmountMin) {
        this.workAmountMin = workAmountMin;
    }

    public int getWorkAmountMax() {
        return workAmountMax;
    }

    public void setWorkAmountMax(int workAmountMax) {
        this.workAmountMax = workAmountMax;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public int getWednesdayid() {
        return wednesdayid;
    }

    public void setWednesdayid(int wednesdayid) {
        this.wednesdayid = wednesdayid;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationTypeid != null ? operationTypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operationtype)) {
            return false;
        }
        Operationtype other = (Operationtype) object;
        if ((this.operationTypeid == null && other.operationTypeid != null) || (this.operationTypeid != null && !this.operationTypeid.equals(other.operationTypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javaee.model.Operationtype[ operationTypeid=" + operationTypeid + " ]";
    }
    
}
