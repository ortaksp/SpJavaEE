/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oguzhan
 */
@Entity
@Table(name = "week", catalog = "spdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Week.findAll", query = "SELECT w FROM Week w")
    , @NamedQuery(name = "Week.findByWeekid", query = "SELECT w FROM Week w WHERE w.weekid = :weekid")
    , @NamedQuery(name = "Week.findByMonday", query = "SELECT w FROM Week w WHERE w.monday = :monday")
    , @NamedQuery(name = "Week.findByTuesday", query = "SELECT w FROM Week w WHERE w.tuesday = :tuesday")
    , @NamedQuery(name = "Week.findByWednesday", query = "SELECT w FROM Week w WHERE w.wednesday = :wednesday")
    , @NamedQuery(name = "Week.findByThursday", query = "SELECT w FROM Week w WHERE w.thursday = :thursday")
    , @NamedQuery(name = "Week.findByFriday", query = "SELECT w FROM Week w WHERE w.friday = :friday")
    , @NamedQuery(name = "Week.findBySaturday", query = "SELECT w FROM Week w WHERE w.saturday = :saturday")
    , @NamedQuery(name = "Week.findBySunday", query = "SELECT w FROM Week w WHERE w.sunday = :sunday")})
public class Week implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "weekid")
    private Integer weekid;
    @Size(max = 45)
    @Column(name = "monday")
    private String monday;
    @Size(max = 45)
    @Column(name = "tuesday")
    private String tuesday;
    @Size(max = 45)
    @Column(name = "wednesday")
    private String wednesday;
    @Size(max = 45)
    @Column(name = "thursday")
    private String thursday;
    @Size(max = 45)
    @Column(name = "friday")
    private String friday;
    @Size(max = 45)
    @Column(name = "saturday")
    private String saturday;
    @Size(max = 45)
    @Column(name = "sunday")
    private String sunday;

    public Week() {
    }

    public Week(Integer weekid) {
        this.weekid = weekid;
    }

    public Integer getWeekid() {
        return weekid;
    }

    public void setWeekid(Integer weekid) {
        this.weekid = weekid;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (weekid != null ? weekid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Week)) {
            return false;
        }
        Week other = (Week) object;
        if ((this.weekid == null && other.weekid != null) || (this.weekid != null && !this.weekid.equals(other.weekid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javaee.model.Week[ weekid=" + weekid + " ]";
    }
    
}
