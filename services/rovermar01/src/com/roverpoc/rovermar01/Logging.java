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
 * Logging generated by hbm2java
 */
@Entity
@Table(name="`logging`"
)

public class Logging  implements java.io.Serializable {

    private Integer id;


@Type(type="DateTime")
    private LocalDateTime dateTime;
    private String process;
    private String coreSystem;
    private String logDetails;

    public Logging() {
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

    

    @Column(name="`PROCESS`", length=65535)
    public String getProcess() {
        return this.process;
    }
    
    public void setProcess(String process) {
        this.process = process;
    }

    

    @Column(name="`core_system`", length=65535)
    public String getCoreSystem() {
        return this.coreSystem;
    }
    
    public void setCoreSystem(String coreSystem) {
        this.coreSystem = coreSystem;
    }

    

    @Column(name="`log_details`", length=65535)
    public String getLogDetails() {
        return this.logDetails;
    }
    
    public void setLogDetails(String logDetails) {
        this.logDetails = logDetails;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Logging) )
		    return false;

		 Logging that = (Logging) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

