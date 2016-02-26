/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * DashboardCounts generated by hbm2java
 */
@Entity
@Table(name="`dashboard_counts`"
)

public class DashboardCounts  implements java.io.Serializable {

    private Integer id;


@Type(type="DateTime")
    private LocalDateTime dateTime;
    private String processDate;
    private String coreSystem;
    private String process;
    private Integer prodTotal;
    private Integer prodDups;
    private Integer prodUnique;
    private Integer prodOnly;
    private Integer inBoth;
    private Integer uatOnly;
    private Integer uatUnique;
    private Integer uatDups;
    private Integer uatTotal;

    public DashboardCounts() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", nullable=false, precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`date_time`")
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    

    @Column(name="`process_date`", length=65535)
    public String getProcessDate() {
        return this.processDate;
    }
    
    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    

    @Column(name="`core_system`", length=250)
    public String getCoreSystem() {
        return this.coreSystem;
    }
    
    public void setCoreSystem(String coreSystem) {
        this.coreSystem = coreSystem;
    }

    

    @Column(name="`process`", length=250)
    public String getProcess() {
        return this.process;
    }
    
    public void setProcess(String process) {
        this.process = process;
    }

    

    @Column(name="`prod_total`", precision=10)
    public Integer getProdTotal() {
        return this.prodTotal;
    }
    
    public void setProdTotal(Integer prodTotal) {
        this.prodTotal = prodTotal;
    }

    

    @Column(name="`prod_dups`", precision=10)
    public Integer getProdDups() {
        return this.prodDups;
    }
    
    public void setProdDups(Integer prodDups) {
        this.prodDups = prodDups;
    }

    

    @Column(name="`prod_unique`", precision=10)
    public Integer getProdUnique() {
        return this.prodUnique;
    }
    
    public void setProdUnique(Integer prodUnique) {
        this.prodUnique = prodUnique;
    }

    

    @Column(name="`prod_only`", precision=10)
    public Integer getProdOnly() {
        return this.prodOnly;
    }
    
    public void setProdOnly(Integer prodOnly) {
        this.prodOnly = prodOnly;
    }

    

    @Column(name="`in_both`", precision=10)
    public Integer getInBoth() {
        return this.inBoth;
    }
    
    public void setInBoth(Integer inBoth) {
        this.inBoth = inBoth;
    }

    

    @Column(name="`uat_only`", precision=10)
    public Integer getUatOnly() {
        return this.uatOnly;
    }
    
    public void setUatOnly(Integer uatOnly) {
        this.uatOnly = uatOnly;
    }

    

    @Column(name="`uat_unique`", precision=10)
    public Integer getUatUnique() {
        return this.uatUnique;
    }
    
    public void setUatUnique(Integer uatUnique) {
        this.uatUnique = uatUnique;
    }

    

    @Column(name="`uat_dups`", precision=10)
    public Integer getUatDups() {
        return this.uatDups;
    }
    
    public void setUatDups(Integer uatDups) {
        this.uatDups = uatDups;
    }

    

    @Column(name="`uat_total`", precision=10)
    public Integer getUatTotal() {
        return this.uatTotal;
    }
    
    public void setUatTotal(Integer uatTotal) {
        this.uatTotal = uatTotal;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof DashboardCounts) )
		    return false;

		 DashboardCounts that = (DashboardCounts) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

